import java.util.ArrayList;

public class DataB{
    double a,b,c,d,e,x,x2, y,x3,y3, xa,xb,ya,a1,b1,c1,e1;


    public static ArrayList<DataB> datosxy = new ArrayList<>();

    public DataB (double a,double b, double c,double d,double e){
        this.a =a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;

    }


    public DataB (double a,double b, double c,double e){
        this.a =a;
        this.b=b;
        this.c=c;
        this.e=e;

    }
  /*
    public DataB (int x11, int y11){
       this.x11 =x11;
       this.y11 =y11;

    }
*/


    public DataB(double x3, double y3){
        this.x3=x3;
        this.y3=y3;
    }

    public DataB(double xa,double xb, double ya){
        this.xa =xa;
        this.xb=xb;
        this.ya=ya;

    }


    public static DataB datos2(){
        datosxy.add(new DataB(-3,7.5));
        datosxy.add(new DataB(-2,3.0));
        datosxy.add(new DataB(-1,0.5));
        datosxy.add(new DataB(0,1.0));
        datosxy.add(new DataB(1,3.0));
        datosxy.add(new DataB(2,6.0));
        datosxy.add(new DataB(3,14.0));
        return null;

    }

    public double getX3(){ return x3;}
    public double getY3(){return y3;}

    public static DataB datospolinomial(){
        datosxy.add(new DataB(108,95));
        datosxy.add(new DataB(115,96));
        datosxy.add(new DataB(106,95));
        datosxy.add(new DataB(97,97));
        datosxy.add(new DataB(95,93));
        datosxy.add(new DataB(91,94));
        datosxy.add(new DataB(97,95));
        datosxy.add(new DataB(83,93));
        datosxy.add(new DataB(83,92));
        datosxy.add(new DataB(78,86));
        datosxy.add(new DataB(54,73));
        datosxy.add(new DataB(67,80));
        datosxy.add(new DataB(56,65));
        datosxy.add(new DataB(53,69));
        datosxy.add(new DataB(61,77));
        datosxy.add(new DataB(115,96));
        datosxy.add(new DataB(81,87));
        datosxy.add(new DataB(78,89));
        datosxy.add(new DataB(30,60));
        datosxy.add(new DataB(45,63));
        datosxy.add(new DataB(99,95));
        datosxy.add(new DataB(32,61));
        datosxy.add(new DataB(25,55));
        datosxy.add(new DataB(28,56));
        datosxy.add(new DataB(90,94));
        datosxy.add(new DataB(89,93));
        return null;



    }

    public static DataB datos(){
        datosxy.add(new DataB(1, 5));
        datosxy.add(new DataB(2, 10));
        datosxy.add(new DataB(3, 15));
        datosxy.add(new DataB(4, 20));
        datosxy.add(new DataB(5, 25));
        datosxy.add(new DataB(6, 30));
        datosxy.add(new DataB(7, 35));
        datosxy.add(new DataB(8, 40));
        datosxy.add(new DataB(9, 45));
        return null;
    }





   /* public  static DataB datos(){
        datosxy.add(new DataB(165349.2, 0, 192261.83));
        datosxy.add(new DataB(162597.7, 0, 191792.06));
        datosxy.add(new DataB(153441.51, 0, 191050.39));
        datosxy.add(new DataB(144372.41, 0, 182901.99));
        datosxy.add(new DataB(142107.34, 0, 166187.94));
        datosxy.add(new DataB(131876.9, 0, 156991.12));
        datosxy.add(new DataB(134615.46, 0, 156122.51));
        datosxy.add(new DataB(130298.13, 0, 155752.6));
        datosxy.add(new DataB(120542.52, 0, 152211.77));
        datosxy.add(new DataB(123334.88, 0, 149759.96));
        datosxy.add(new DataB(101913.08, 0, 146121.95));
        datosxy.add(new DataB(100671.96, 0, 144259.4));
        datosxy.add(new DataB(93863.75, 0, 141585.52));
        datosxy.add(new DataB(91992.39, 0, 134307.35));
        datosxy.add(new DataB(119943.24, 0, 132602.65));
        datosxy.add(new DataB(114523.61, 0, 129917.04));
        datosxy.add(new DataB(78013.11, 0, 126992.93));
        datosxy.add(new DataB(94657.16, 0, 125370.37));
        datosxy.add(new DataB(91749.16, 0, 124266.9));
        datosxy.add(new DataB(86419.7, 0, 122776.86));
        datosxy.add(new DataB(76253.86, 0, 118474.03));
        datosxy.add(new DataB(78389.47, 0, 111313.02));
        datosxy.add(new DataB(73994.56, 0, 110352.25));
        datosxy.add(new DataB(67532.53, 0, 108733.99));
        datosxy.add(new DataB(77044.01, 0, 108552.04));
        datosxy.add(new DataB(64664.71, 0, 107404.34));
        datosxy.add(new DataB(75328.87, 0, 105733.54));
        datosxy.add(new DataB(72107.6, 0, 105008.31));
        datosxy.add(new DataB(66051.52, 0, 103282.38));
        datosxy.add(new DataB(65605.48, 0, 101004.64));
        datosxy.add(new DataB(61994.48, 0, 99937.59));
        datosxy.add(new DataB(61136.38, 0, 97483.56));
        datosxy.add(new DataB(63408.86, 0, 97427.84));
        datosxy.add(new DataB(55493.95, 0, 96778.92));
        datosxy.add(new DataB(46426.07, 0, 96712.8));
        datosxy.add(new DataB(46014.02, 0, 96479.51));
        datosxy.add(new DataB(28663.76, 0, 90708.19));
        datosxy.add(new DataB(44069.95, 0, 89949.14));
        datosxy.add(new DataB(20229.59, 0, 81229.06));
        datosxy.add(new DataB(38558.51, 0, 81005.76));
        datosxy.add(new DataB(28754.33, 0, 78239.91));
        datosxy.add(new DataB(27892.92, 0, 77798.83));
        datosxy.add(new DataB(23640.93, 0, 71498.49));
        datosxy.add(new DataB(15505.73, 0, 69758.98));
        datosxy.add(new DataB(22177.74, 0, 65200.33));
        datosxy.add(new DataB(1000.23, 0, 64926.08));
        datosxy.add(new DataB(1315.46, 0, 49490.75));
        datosxy.add(new DataB(0, 0, 42559.73));
        datosxy.add(new DataB(542.05, 0, 35673.41));
        datosxy.add(new DataB(0, 0, 14681.4));

        return null;
    }

*/


//administacion y profit
/*
    public static DataB dato1s(){
        datosxy.add(new DataB(1,165349.2, 136897.8, 471784.1, 192261.83));
        datosxy.add(new DataB(1,162597.7, 151377.59, 443898.53, 191792.06));
        datosxy.add(new DataB(1,153441.51, 101145.55, 407934.54, 191050.39));
        datosxy.add(new DataB(1,144372.41, 118671.85, 383199.62, 182901.99));
        datosxy.add(new DataB(1,142107.34, 91391.77, 366168.42, 166187.94));
        datosxy.add(new DataB(1,131876.9, 99814.71, 362861.36, 156991.12));
        datosxy.add(new DataB(1,134615.46, 147198.87, 127716.82, 156122.51));
        datosxy.add(new DataB(1,130298.13, 145530.06, 323876.68, 155752.6));
        datosxy.add(new DataB(1,120542.52, 148718.95, 311613.29, 152211.77));
        datosxy.add(new DataB(1,123334.88, 108679.17, 304981.62, 149759.96));
        datosxy.add(new DataB(1,101913.08, 110594.11, 229160.95, 146121.95));
        datosxy.add(new DataB(1,100671.96, 91790.61, 249744.55, 144259.4));
        datosxy.add(new DataB(1,93863.75, 127320.38, 249839.44, 141585.52));
        datosxy.add(new DataB(1,91992.39, 135495.07, 252664.93, 134307.35));
        datosxy.add(new DataB(1,119943.24, 156547.42, 256512.92, 132602.65));
        datosxy.add(new DataB(1,114523.61, 122616.84, 261776.23, 129917.04));
        datosxy.add(new DataB(1,78013.11, 121597.55, 264346.06, 126992.93));
        datosxy.add(new DataB(1,94657.16, 145077.58, 282574.31, 125370.37));
        datosxy.add(new DataB(1,91749.16, 114175.79, 294919.57, 124266.9));
        datosxy.add(new DataB(1,86419.7, 153514.11, 0, 122776.86));
        datosxy.add(new DataB(1,76253.86, 113867.3, 298664.47, 118474.03));
        datosxy.add(new DataB(1,78389.47, 153773.43, 299737.29, 111313.02));
        datosxy.add(new DataB(1,73994.56, 122782.75, 303319.26, 110352.25));
        datosxy.add(new DataB(1,67532.53, 105751.03, 304768.73, 108733.99));
        datosxy.add(new DataB(1,77044.01, 99281.34, 140574.81, 108552.04));
        datosxy.add(new DataB(1,64664.71, 139553.16, 137962.62, 107404.34));
        datosxy.add(new DataB(1,75328.87, 144135.98, 134050.07, 105733.54));
        datosxy.add(new DataB(1,72107.6, 127864.55, 353183.81, 105008.31));
        datosxy.add(new DataB(1,66051.52, 182645.56, 118148.2, 103282.38));
        datosxy.add(new DataB(1,65605.48, 153032.06, 107138.38, 101004.64));
        datosxy.add(new DataB(1,61994.48, 115641.28, 91131.24, 99937.59));
        datosxy.add(new DataB(1,61136.38, 152701.92, 88218.23, 97483.56));
        datosxy.add(new DataB(1,63408.86, 129219.61, 46085.25, 97427.84));
        datosxy.add(new DataB(1,55493.95, 103057.49, 214634.81, 96778.92));
        datosxy.add(new DataB(1,46426.07, 157693.92, 210797.67, 96712.8));
        datosxy.add(new DataB(1,46014.02, 85047.44, 205517.64, 96479.51));
        datosxy.add(new DataB(1,28663.76, 127056.21, 201126.82, 90708.19));
        datosxy.add(new DataB(1,44069.95, 51283.14, 197029.42, 89949.14));
        datosxy.add(new DataB(1,20229.59, 65947.93, 185265.1, 81229.06));
        datosxy.add(new DataB(1,38558.51, 82982.09, 174999.3, 81005.76));
        datosxy.add(new DataB(1,28754.33, 118546.05, 172795.67, 78239.91));
        datosxy.add(new DataB(1,27892.92, 84710.77, 164470.71, 77798.83));
        datosxy.add(new DataB(1,23640.93, 96189.63, 148001.11, 71498.49));
        datosxy.add(new DataB(1,15505.73, 127382.3, 35534.17, 69758.98));
        datosxy.add(new DataB(1,22177.74, 154806.14, 28334.72, 65200.33));
        datosxy.add(new DataB(1,1000.23, 124153.04, 1903.93, 64926.08));
        datosxy.add(new DataB(1,1315.46, 115816.21, 297114.46, 49490.75));
        datosxy.add(new DataB(1,0, 135426.92, 0, 42559.73));
        datosxy.add(new DataB(1,542.05, 51743.15, 0, 35673.41));
        datosxy.add(new DataB(1,0, 116983.8, 45173.06, 14681.4));

        return null;
    }

*/

    public static DataB dato1s(){

        datosxy.add(new DataB(1, 1, 2, 3));
        datosxy.add(new DataB(1, 2, 4, 6));
        datosxy.add(new DataB(1, 3, 6, 9));
        datosxy.add(new DataB(1, 4, 8, 12));
        datosxy.add(new DataB(1, 5, 10, 15));
        datosxy.add(new DataB(1, 6, 12, 18));
        datosxy.add(new DataB(1, 7, 14, 21));
        datosxy.add(new DataB(1, 8, 16, 24));
        datosxy.add(new DataB(1, 9, 18, 27));
        datosxy.add(new DataB(1, 10, 20, 30));
        datosxy.add(new DataB(1, 11, 22, 33));
        datosxy.add(new DataB(1, 12, 24, 36));
        datosxy.add(new DataB(1, 13, 26, 39));
        datosxy.add(new DataB(1, 14, 28, 42));
        datosxy.add(new DataB(1, 15, 30, 45));
        datosxy.add(new DataB(1, 16, 32, 48));
        datosxy.add(new DataB(1, 17, 34, 51));


        return null;
    }


    public double getY() {
        return y;
    }
    public double getX(){
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getE1() {
        return e1;
    }
    //    ArrayList<Integer> datosX = new ArrayList<>(Arrays.asList(23, 26, 30, 34, 43, 48, 52, 57, 58));
//  ArrayList<Integer> datosY = new ArrayList<>(Arrays.asList(651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518));


}
