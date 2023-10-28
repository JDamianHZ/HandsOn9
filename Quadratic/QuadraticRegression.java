public class QuadraticRegression extends DataB {
    public QuadraticRegression(double x3, double y3) {
        super(x3, y3);

    }

    public static void main(String[] args) {

        DataB.datos2();
        metodo1();

    }

    public static void metodo1() {
        double sumax = 0, sumay = 0, sumaxpx = 0, sumax3 = 0, sumax4 = 0,sumaxpy = 0,sumax2y=0;
        int size= datosxy.size();
        //suma de de x
        for (DataB elemto : datosxy) {
            sumax += elemto.x3;
        }
        //sumay
        for (DataB elemto2 : datosxy) {
            sumay += elemto2.y3;
        }

        //suma x2
        for (DataB elemto3 : datosxy) {
            sumaxpx += (elemto3.x3 * elemto3.x3);
        }
        //suma x3
        for (DataB elemto4 : datosxy) {
            sumax3 += (elemto4.x3 * elemto4.x3 * elemto4.x3);
        }
        //suma x4
        for (DataB elemto5 : datosxy) {
            sumax4 += (elemto5.x3 * elemto5.x3 * elemto5.x3*elemto5.x3);
        }
        //suma x*y
        for (DataB elemto6 : datosxy) {
            sumaxpy += (elemto6.x3*elemto6.y3 );
        }
        //sumax2y
        for (DataB elemto7 : datosxy) {
            sumax2y += ((elemto7.x3* elemto7.x3)* elemto7.y3 );
        }


        double primerdato = (size * sumax2y - sumaxpx * sumay) / (size * sumax4 - sumaxpx * sumaxpx);
        double segundodato = (size * sumaxpy - sumax * sumay) / (size * sumaxpx - sumax * sumax);
        double tercerdato = (sumay -primerdato  * sumaxpx -segundodato * sumax)/size;
        System.out.println("La ecuacion cuadratica es: y =  "+primerdato +"  x^2+  "+segundodato+"  x+ "+tercerdato );

        ///prediccion

        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +5*5+segundodato+5+tercerdato) );
        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +6*6+segundodato+6+tercerdato) );
        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +7*7+segundodato+7+tercerdato) );

    }
}
