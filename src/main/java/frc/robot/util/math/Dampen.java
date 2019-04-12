package frc.robot.util.math;

// This class stores values for x = 0.0-1.0 for the function y = 2^(8x - 8).
// This removes the need to calculate these same values 50x per second,
// which is a time costly operation.
public class Dampen{

    private static final double[] values = new double[101];

    public static double lookup(double value){
        return values[(int)(value * 100)];
    }

    static{
        values[0] = 0.00390625;
        values[1] = 0.0041289767209428925;
        values[2] = 0.0043644028830946095;
        values[3] = 0.004613252583709104;
        values[4] = 0.004876291206646922;
        values[5] = 0.00515432777645662;
        values[6] = 0.005448217446681273;
        values[7] = 0.0057588641300433665;
        values[8] = 0.006087223278597654;
        values[9] = 0.006434304822402914;
        values[10] = 0.006801176275750969;
        values[11] = 0.0071889660205068364;
        values[12] = 0.007598866776658481;
        values[13] = 0.00803213927075052;
        values[14] = 0.00849011611348483;
        values[15] = 0.008974205898414337;
        values[16] = 0.009485897534336304;
        values[17] = 0.010026764824710191;
        values[18] = 0.010598471308184932;
        values[19] = 0.011202775375123647;
        values[20] = 0.011841535675862483;
        values[21] = 0.012516716837337842;
        values[22] = 0.013230395505664485;
        values[23] = 0.013984766733249568;
        values[24] = 0.014782150730087436;
        values[25] = 0.015625;
        values[26] = 0.01651590688377157;
        values[27] = 0.017457611532378438;
        values[28] = 0.018453010334836414;
        values[29] = 0.01950516482658769;
        values[30] = 0.02061731110582648;
        values[31] = 0.02179286978672509;
        values[32] = 0.023035456520173466;
        values[33] = 0.02434889311439063;
        values[34] = 0.02573721928961167;
        values[35] = 0.027204705103003875;
        values[36] = 0.028755864082027346;
        values[37] = 0.030395467106633923;
        values[38] = 0.03212855708300208;
        values[39] = 0.03396046445393932;
        values[40] = 0.03589682359365735;
        values[41] = 0.0379435901373452;
        values[42] = 0.04010705929884074;
        values[43] = 0.04239388523273973;
        values[44] = 0.04481110150049459;
        values[45] = 0.04736614270344993;
        values[46] = 0.05006686734935137;
        values[47] = 0.05292158202265794;
        values[48] = 0.05593906693299827;
        values[49] = 0.05912860292034974;
        values[50] = 0.0625;
        values[51] = 0.06606362753508628;
        values[52] = 0.06983044612951375;
        values[53] = 0.07381204133934566;
        values[54] = 0.07802065930635076;
        values[55] = 0.08246924442330592;
        values[56] = 0.08717147914690036;
        values[57] = 0.0921418260806938;
        values[58] = 0.09739557245756246;
        values[59] = 0.10294887715844663;
        values[60] = 0.1088188204120155;
        values[61] = 0.11502345632810938;
        values[62] = 0.12158186842653569;
        values[63] = 0.12851422833200832;
        values[64] = 0.13584185781575728;
        values[65] = 0.1435872943746294;
        values[66] = 0.15177436054938087;
        values[67] = 0.16042823719536306;
        values[68] = 0.16957554093095903;
        values[69] = 0.17924440600197836;
        values[70] = 0.18946457081379972;
        values[71] = 0.20026746939740547;
        values[72] = 0.21168632809063176;
        values[73] = 0.22375626773199309;
        values[74] = 0.23651441168139897;
        values[75] = 0.25;
        values[76] = 0.2642545101403451;
        values[77] = 0.279321784518055;
        values[78] = 0.29524816535738263;
        values[79] = 0.312082637225403;
        values[80] = 0.32987697769322366;
        values[81] = 0.34868591658760145;
        values[82] = 0.3685673043227752;
        values[83] = 0.38958228983024984;
        values[84] = 0.4117955086337865;
        values[85] = 0.435275281648062;
        values[86] = 0.46009382531243753;
        values[87] = 0.48632747370614277;
        values[88] = 0.5140569133280333;
        values[89] = 0.5433674312630291;
        values[90] = 0.5743491774985175;
        values[91] = 0.6070974421975235;
        values[92] = 0.6417129487814522;
        values[93] = 0.6783021637238361;
        values[94] = 0.7169776240079134;
        values[95] = 0.7578582832551989;
        values[96] = 0.8010698775896219;
        values[97] = 0.846745312362527;
        values[98] = 0.8950250709279723;
        values[99] = 0.9460576467255959;
        values[100] = 1.0;
    }

}