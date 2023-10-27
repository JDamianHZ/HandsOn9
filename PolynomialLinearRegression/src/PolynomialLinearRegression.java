public class PolynomialLinearRegression extends DataB{
    public PolynomialLinearRegression (double x3,double y3){
        super(x3,y3);}


    public static void main(String[]args){

        DataB.datospolinomial();
        metodo();

    }

    public static void metodo(){
        //cuadratico
        // int columnas = 3;
        //lineal
        // int columnas = 2;
        //cubico
        int columnas=4;

        double x = 0, x2= 0, x3= 0,x4=0,x5=0,x6=0,x3pory=0, x2pory= 0, xpory= 0, y= 0;
        for (DataB elemento : datosxy) {
            x += elemento.x3;
            x2 += elemento.x3 * elemento.x3;
            x3 += elemento.x3 *elemento.x3 * elemento.x3;
            x4 += elemento.x3 *elemento.x3 * elemento.x3* elemento.x3;
            x5+= elemento.x3*elemento.x3 *elemento.x3 * elemento.x3* elemento.x3;
            x6+= elemento.x3*elemento.x3*elemento.x3 *elemento.x3 * elemento.x3* elemento.x3;

            x3pory+=(elemento.x3*elemento.x3*elemento.x3)*elemento.y3;
            x2pory +=(elemento.x3*elemento.x3)* elemento.y3 ;
            xpory += elemento.y3*(elemento.x3);
            y += elemento.y3;
        }

        //  cuadratica

        //    double[][] matrizinicial = new double[3][columnas];
/*
            matrizinicial[0][0] = x4;
            matrizinicial[0][1] = x3;
            matrizinicial[0][2] = x2;
            matrizinicial[1][0] = x3;
            matrizinicial[1][1] = x2;
            matrizinicial[1][2] = x;
            matrizinicial[2][0] = x2;
            matrizinicial[2][1] = x;
            matrizinicial[2][2] = datosxy.size();

*/

//lineal
/*
            double[][] matrizinicial={
                    {x2,x},
                    {x,datosxy.size()}

            };

*/


        //cubico

        double[][] matrizinicial={
                {x6,x5,x4,x3},
                {x5,x4,x3,x2},
                {x4,x3,x2,x},
                {x3,x2,x,datosxy.size()}

        };

        double[][] matrizy = new double[4][columnas];
/*
        //cuadratico

            matrizy[0][0]=x2pory;
            matrizy[1][0]=xpory;
            matrizy[2][0]=y;
*/
/*
  //lineal
        matrizy[0][0]=xpory;
        matrizy[1][0]=y;

*/
        //cubico

        matrizy[0][0]=x3pory;
        matrizy[1][0]=x2pory;
        matrizy[2][0]=xpory;
        matrizy[3][0]=y;




// sacar transpuesta
        double[][] Trans = new double[matrizinicial[0].length][matrizinicial.length];
        for (int i = 0; i < matrizinicial[0].length; i++) {
            for (int j = 0; j < matrizinicial.length; j++) {
                Trans[j][i]=matrizinicial[i][j];
            }



        }
        // System.out.println();
        // System.out.println("Transpuesta");
        // mostrarMatriz(Trans);

        //multiplicar transpuesta por la matriz
        double[][] MpT=new double[matrizinicial.length][matrizy[0].length];
        for (int i = 0; i < matrizinicial.length; i++) {
            for (int j = 0; j < matrizy[0].length; j++) {
                double v=0;
                for (int k=0; k< matrizinicial[0].length;k++){

                    v+=Trans[i][k]*matrizinicial[k][j];
                }
                MpT[i][j]=v;
            }

        }
        //System.out.println();
        //mostrarMatriz(MpT);

        double [][] Resultado1= GaussJordan.gauss(MpT);
        //mostrarMatriz(Resultado1);

        double[][] resultado = new double[columnas][1];
        for (int i = 0; i < matrizinicial[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < matrizinicial.length; j++) {
                sum += Trans[i][j] * matrizy[j][0];
            }
            resultado[i][0] = sum;
        }
        System.out.println("Matriz de multiplicacion");
        //mostrarMatriz(resultado);



        double[][] resultado3 = new double [columnas][1];
        for (int i=0; i < Resultado1.length;i++){
            for (int j=0;j< resultado[0].length;j++){
                double suma = 0;
                for (int k=0; k< Resultado1[0].length; k++){
                    suma+= Resultado1[i][k]*resultado[k][j];


                }
                resultado3[i][j]=suma;

            }

        }
        //System.out.println();
        //  System.out.println("Multiplicacion de inversa por transpuesta resultado");
        //  mostrarMatriz(resultado3);













        if (columnas==4){
//cubicubico
            double  b3=resultado3[0][0];
            double b2=resultado3[1][0];
            double b1=resultado3[2][0];
            double b0=resultado3[3][0];


            System.out.println("La ecuacion cubica es: y =  "+b0 +"+"+b1+"x  + "+b2+"x^2"+b3+"x^3" );

            System.out.println("Predicciones: ");
            System.out.println("La ecuacion cubica es: y =  "+(b0 +b1+8+b2+8*8+b3+8*8*8) );
            System.out.println("La ecuacion cubica es: y =  "+(b0 +b1+4+b2+4*4+b3+4*4*4) );
            System.out.println("La ecuacion cubica es: y =  "+(b0 +b1+3+b2+3*3+b3+3*3*3) );

        } else if (columnas==3) {
            // cuadratico
            double  b2=resultado3[0][0];
            double b1=resultado3[1][0];
            double b0=resultado3[2][0];



            System.out.println("La ecuacion cuadratica es: y =  "+b2 +"  x+  "+b1+"  x^2+ "+b0 );

            System.out.println("Predicciones: ");
            System.out.println("La ecuacion cuadratica es: y =  "+(b0 +b1+8+b2+8*8) );
            System.out.println("La ecuacion cuadratica es: y =  "+(b0 +b1+4+b2+4*4) );
            System.out.println("La ecuacion cuadratica es: y =  "+(b0 +b1+3+b2+3*3) );

        } else if (columnas==2) {
            //lineal


            double  b1=resultado3[0][0];
            double b0=resultado3[1][0];
            System.out.println("La ecuacion lineal es: y =  "+b1 +"  x+  "+b0);
            System.out.println("Predicciones: ");
            System.out.println("La ecuacion lineal es: y =  "+(b1 +8+b0) );
            System.out.println("La ecuacion lineal es: y =  "+(b1 +4+b0) );
            System.out.println("La ecuacion leineal es: y =  "+(b1 +3+b0) );
        }

    }
    public static void mostrarMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
