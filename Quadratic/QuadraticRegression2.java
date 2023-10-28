public class QuadraticRegression2 extends DataB {
    public QuadraticRegression2(double x3, double y3) {
        super(x3, y3);

    }

    public static void main(String[] args) {

        DataB.datos2();
        metodoo();

    }
    public static void metodoo() {
        int columnas = 4;
        double x = 0, x2= 0, x3= 0,x4=0, x2pory= 0, xpory= 0, y= 0;
        for (DataB elemento : datosxy) {
            x += elemento.x3;
            x2 += elemento.x3 * elemento.x3;
            x3 += elemento.x3 *elemento.x3 * elemento.x3;
            x4 += elemento.x3 *elemento.x3 * elemento.x3* elemento.x3;
            x2pory +=(elemento.x3*elemento.x3)* elemento.y3 ;
            xpory += elemento.y3*(elemento.x3);
            y += elemento.y3;
        }
        double[][] matrizinicial = new double[3][columnas];


        matrizinicial[0][0] = x4;
        matrizinicial[0][1] = x3;
        matrizinicial[0][2] = x2;
        matrizinicial[1][0] = x3;
        matrizinicial[1][1] = x2;
        matrizinicial[1][2] = x;
        matrizinicial[2][0] = x2;
        matrizinicial[2][1] = x;
        matrizinicial[2][2] = datosxy.size();

        matrizinicial[0][3] = x2pory;
        matrizinicial[1][3] = xpory;
        matrizinicial[2][3] = y;



        mostrarMatriz(matrizinicial);

        matrizinicial=GaussJordan.EliminacionGauss(matrizinicial);
        mostrarMatriz(matrizinicial);
        double primerdato = matrizinicial[0][3];
        double segundodato = matrizinicial[1][3];
        double tercerdato = matrizinicial[2][3];
        System.out.println("La ecuacion cuadratica es: y =  "+primerdato +"  x^2+  "+segundodato+"  x+ "+tercerdato );

        ///prediccion

        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +5*5+segundodato+5+tercerdato) );
        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +6*6+segundodato+6+tercerdato) );
        System.out.println("La ecuacion cuadratica es: y =  "+(primerdato +7*7+segundodato+7+tercerdato) );



    }


    public static void mostrarMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }


}

