package frc.robot.util.math;

//This class stores values for x = 0.0-1.0 for the function y = 2^(4x - 4).
//This removes the need to calculate these same values 50x per second,
//which is a time costly operation.
public class Dampen{

    private static final double[] values = new double[101];

    public static double lookup(double value){
        return values[(int)(value * 100)];
    }

    static{
        values[0] = 0.0625;
        values[1] = 0.06425711416600416;
        values[2] = 0.06606362753508628;
        values[3] = 0.06792092890787864;
        values[4] = 0.06983044612951375;
        values[5] = 0.0717936471873147;
        values[6] = 0.07381204133934566;
        values[7] = 0.07588718027469044;
        values[8] = 0.07802065930635074;
        values[9] = 0.0802141185976815;
        values[10] = 0.08246924442330589;
        values[11] = 0.08478777046547949;
        values[12] = 0.08717147914690034;
        values[13] = 0.0896222030009892;
        values[14] = 0.09214182608069382;
        values[15] = 0.09473228540689989;
        values[16] = 0.09739557245756249;
        values[17] = 0.10013373469870276;
        values[18] = 0.10294887715844663;
        values[19] = 0.10584316404531588;
        values[20] = 0.1088188204120155;
        values[21] = 0.11187813386599654;
        values[22] = 0.11502345632810938;
        values[23] = 0.11825720584069949;
        values[24] = 0.12158186842653569;
        values[25] = 0.125;
        values[26] = 0.12851422833200832;
        values[27] = 0.13212725507017256;
        values[28] = 0.13584185781575728;
        values[29] = 0.1396608922590275;
        values[30] = 0.1435872943746294;
        values[31] = 0.14762408267869132;
        values[32] = 0.15177436054938087;
        values[33] = 0.1560413186127015;
        values[34] = 0.16042823719536306;
        values[35] = 0.16493848884661177;
        values[36] = 0.16957554093095897;
        values[37] = 0.17434295829380067;
        values[38] = 0.1792444060019784;
        values[39] = 0.18428365216138765;
        values[40] = 0.18946457081379978;
        values[41] = 0.19479114491512492;
        values[42] = 0.20026746939740547;
        values[43] = 0.20589775431689325;
        values[44] = 0.21168632809063176;
        values[45] = 0.217637640824031;
        values[46] = 0.22375626773199309;
        values[47] = 0.23004691265621877;
        values[48] = 0.23651441168139897;
        values[49] = 0.24316373685307138;
        values[50] = 0.25;
        values[51] = 0.25702845666401664;
        values[52] = 0.2642545101403451;
        values[53] = 0.27168371563151456;
        values[54] = 0.279321784518055;
        values[55] = 0.2871745887492588;
        values[56] = 0.29524816535738263;
        values[57] = 0.3035487210987617;
        values[58] = 0.31208263722540297;
        values[59] = 0.320856474390726;
        values[60] = 0.32987697769322355;
        values[61] = 0.33915108186191795;
        values[62] = 0.34868591658760134;
        values[63] = 0.3584888120039568;
        values[64] = 0.3685673043227753;
        values[65] = 0.37892914162759955;
        values[66] = 0.38958228983024995;
        values[67] = 0.40053493879481106;
        values[68] = 0.4117955086337866;
        values[69] = 0.4233726561812635;
        values[70] = 0.435275281648062;
        values[71] = 0.44751253546398617;
        values[72] = 0.46009382531243753;
        values[73] = 0.47302882336279795;
        values[74] = 0.48632747370614277;
        values[75] = 0.5;
        values[76] = 0.5140569133280333;
        values[77] = 0.5285090202806902;
        values[78] = 0.5433674312630291;
        values[79] = 0.55864356903611;
        values[80] = 0.5743491774985175;
        values[81] = 0.5904963307147653;
        values[82] = 0.6070974421975234;
        values[83] = 0.6241652744508059;
        values[84] = 0.641712948781452;
        values[85] = 0.6597539553864471;
        values[86] = 0.6783021637238359;
        values[87] = 0.6973718331752027;
        values[88] = 0.7169776240079136;
        values[89] = 0.7371346086455506;
        values[90] = 0.7578582832551991;
        values[91] = 0.7791645796604999;
        values[92] = 0.8010698775896221;
        values[93] = 0.8235910172675732;
        values[94] = 0.846745312362527;
        values[95] = 0.870550563296124;
        values[96] = 0.8950250709279723;
        values[97] = 0.9201876506248751;
        values[98] = 0.9460576467255959;
        values[99] = 0.9726549474122855;
        values[100] = 1.0;
    }

}