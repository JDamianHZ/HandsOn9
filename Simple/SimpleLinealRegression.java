import java.util.ArrayList;

public class SimpleLinealRegression extends DataB {
    /*
    //a,b,ya
        public SimpleLinealRegression(double xa,double xb, double ya){
            super(xa,xb,ya);

        }
        */
    public SimpleLinealRegression(double x3,double y3){
        super(x3,y3);}


    //cambia todos los xa,ya o xa,ya
    public static void main(String[]args){

        DataB.datos();
        metodo();

    }





    public static void metodo(){



        System.out.println(datosxy.size());
        double sumax=0, sumay=0, multiplicacionxy=0, sumaxPy=0,xcuadrada=0,sumacuadra=0,M=0,B=0;
        ArrayList<Double> MXY = new ArrayList<>();
        ArrayList<Double> xC = new ArrayList<>();
        //sumar x
        for (DataB elemento: datosxy){
            sumax+=elemento.x3;

        }
        System.out.println("La suma de x es: "+ sumax);
        //sumary
        for (DataB elemento2: datosxy){
            sumay+=elemento2.y3;
        }
        System.out.println("La suma de y: "+ sumay);
        //x*y
        for (DataB elemento3 : datosxy) {
            multiplicacionxy = elemento3.xa * elemento3.y3;
            MXY.add(multiplicacionxy);
        }

        System.out.println("El resultado de x por y es: " + MXY);






        //suma xy
        for (DataB elemento2: datosxy){
            sumaxPy+= elemento2.x3 * elemento2.y3;
        }
        System.out.println("Suma de multiplicacion: "+ sumaxPy);
        //x^2
        for (DataB elemento4 : datosxy) {
            xcuadrada = elemento4.x3 * elemento4.x3;
            xC.add(xcuadrada);
        }

        System.out.println("El resultado de x cuadrada: " + xC);
        //sumax^2
        for (Double elemento5: xC){
            sumacuadra+=elemento5;

        }
        System.out.println("Suma de los cuadrados: "+ sumacuadra);

        //Calcular M

        for (int i=0;i<xC.size();i++){
            M=((sumaxPy)-(((sumax)*sumay))/xC.size())/((sumacuadra)-(sumax*sumax)/xC.size());
        }
        System.out.println("El valor de M es:"+M);
        for (int i=0;i<xC.size();i++) {
            B=(sumay/xC.size())-M*(sumax/xC.size());
        }
        System.out.println("El valor de B es: "+ B);

        System.out.println("Y= "+M+"x + "+B);
        System.out.println("X=59,60,61");
        System.out.println("Resultado Y="+(M*559+B));
        System.out.println("Resultado Y="+(M*60+B));
        System.out.println("Resultado Y="+(M*61+B));

    }
}












