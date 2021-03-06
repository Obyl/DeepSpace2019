package frc.robot.util;

// Make code more readable by turning hard-coded numbers into variable names.
public class ValueMap{

    // Mappings for Xbox One Controller.
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int SELECT = 7;
    public static final int START = 8;
    public static final int LEFT_JOYSTICK_X = 0;
    public static final int LEFT_JOYSTICK_Y = 1;
    public static final int LEFT_TRIGGER = 2;
    public static final int RIGHT_TRIGGER = 3;
    public static final int RIGHT_JOYSTICK_X = 4;
    public static final int RIGHT_JOYSTICK_Y = 5;

    // Joystick POV mappings.
    public static final int POV_UP = 0;
    public static final int POV_DOWN = 180;
    public static final int POV_LEFT = 270;
    public static final int POV_RIGHT = 90;

    // Button mappings.
    public static final int ZERO_ENCODER = A;
    public static final int TOGGLE_HATCH_MANIPULATOR = B;
    public static final int SLOWER_TURNING = Y;
    public static final int TOGGLE_HATCH_LIFTER = RIGHT_BUMPER;
    public static final int NEXT_CLIMB_STEP = LEFT_BUMPER;
    public static final int GOTO_ELEVATOR_TOP = SELECT;

    // Joystick axis.
    public static final int DRIVE_LEFT_RIGHT = LEFT_JOYSTICK_X;
    public static final int DRIVE_FRONT_BACK = LEFT_JOYSTICK_Y;
    public static final int CARGO_INTAKE_OUT = LEFT_TRIGGER;
    public static final int CARGO_INTAKE_IN = RIGHT_TRIGGER;
    public static final int CARGO_INTAKE_SLIDE = RIGHT_JOYSTICK_Y;

    // Joystick POV.
    public static final int RAISE_ELEVATOR = POV_UP;
    public static final int LOWER_ELEVATOR = POV_DOWN;
    public static final int STOP_ELEVATOR_1 = POV_LEFT;
    public static final int STOP_ELEVATOR_2 = POV_RIGHT;

    // PWM ports.
    public static final int FRONT_LEFT_MOTOR_PORT = 3;
    public static final int FRONT_RIGHT_MOTOR_PORT = 4;
    public static final int REAR_LEFT_MOTOR_PORT = 2;
    public static final int REAR_RIGHT_MOTOR_PORT = 1;
    public static final int CARGO_INTAKE_ROLLER = 0;

    // CAN bus ids.
    public static final int CARGO_LEFT_SHOOTER = 17;
    public static final int CARGO_RIGHT_SHOOTER = 16;
    public static final int ELEVATOR = 27;
    public static final int CARGO_LEFT_SLIDE = 14;
    public static final int CARGO_RIGHT_SLIDE = 13;

    // Pneumatics.
    public static final int COMPRESSOR_PORT = 0;
    public static final int HATCH_MANIP_PORT = 4;
    public static final int HATCH_LIFTER_PORT = 5;
    public static final int FRONT_LIFT_FORWARD = 7;
    public static final int FRONT_LIFT_REVERSE = 2;
    public static final int REAR_LIFT_FORWARD = 3;
    public static final int REAR_LIFT_REVERSE = 6;
}