package frc.robot.systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.util.Input;
import frc.robot.util.ValueMap;

// This is the system that handles climbing. This involves
// the correct control of the four vertical pistons that
// raise the robot onto level 2.
public class ClimbSystem extends RobotSystem {

    private DoubleSolenoid frontLift;
    private DoubleSolenoid rearLift;
    private int stepCounter;

    public void init(){
        frontLift = new DoubleSolenoid(4, ValueMap.FRONT_LIFT_FORWARD, ValueMap.FRONT_LIFT_REVERSE);
        rearLift = new DoubleSolenoid(4, ValueMap.REAR_LIFT_FORWARD, ValueMap.REAR_LIFT_REVERSE);
    }

    public void disabledPeriodic(){
        frontLift.set(Value.kOff);
        rearLift.set(Value.kOff);
        stepCounter = 0;
    }

    public void enabledPeriodic(){
        if(stepCounter >= 5) {
            stepCounter = 0;
            frontLift.set(Value.kOff);
            frontLift.set(Value.kOff);
        }

        if(Input.getRawButtonPressed(ValueMap.NEXT_CLIMB_STEP)){
            if(stepCounter >= 3){
                stepCounter++;
                stepCounter = 0;
            }
            stepCounter++;

            switch(stepCounter){
                case 0:
                    break;
                case 1:
                    frontLift.set(Value.kForward);
                    break;
                case 2:
                    rearLift.set(Value.kForward);
                    frontLift.set(Value.kReverse);
                    break;
                case 3:
                    rearLift.set(Value.kReverse);
                    break;
            }
        }
    }

    public void alwaysPeriodic(){}
}