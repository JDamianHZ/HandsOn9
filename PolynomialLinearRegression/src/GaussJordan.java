public class GaussJordan {



    //se agregan los 10
    // System.out.println( "Se agregan 0 y 1");
    public static double [][] gauss(double [][] MpT) {


        double[][] matriId = new double[MpT.length][MpT.length];
        for (int i = 0; i < MpT.length; i++) {
            matriId[i][i] = 1.0;
        }
        double[][] matrizCompleta = new double[MpT.length][MpT.length * 2];
        for (int i = 0; i < MpT.length; i++) {
            for (int j = 0; j < MpT.length; j++) {
                matrizCompleta[i][j] = MpT[i][j];
                matrizCompleta[i][j + MpT.length] = matriId[i][j];

            }
        }
        //System.out.println();
        //mostrarMatriz(matrizCompleta);

        for (int i = 0; i < matrizCompleta.length; i++) {
            double pivote = matrizCompleta[i][i];
            for (int j = 0; j < matrizCompleta.length * 2; j++) {

                matrizCompleta[i][j] /= pivote;
            }
            for (int k = 0; k < matrizCompleta.length; k++) {
                if (k != i) {
                    double fac = matrizCompleta[k][i];
                    for (int j = 0; j < matrizCompleta.length * 2; j++) {
                        matrizCompleta[k][j] -= fac * matrizCompleta[i][j];
                    }

                }

            }

        }
        System.out.println();
        double[][] Resultado1 = new double[MpT.length][MpT.length];

        //mostrarMatriz(matrizCompleta);
        for (int i = 0; i < MpT.length; i++) {
            for (int j = 0; j < MpT.length; j++) {
                Resultado1[i][j] = matrizCompleta[i][j + MpT.length];


            }
        }
        return Resultado1;
    }

    public static  double[][] EliminacionGauss(double [][] matrizinicial){

        for (int i=0;i< matrizinicial.length;i++){
            double pivote = matrizinicial[i][i];

            for (int j=0;j< matrizinicial[0].length;j++) {
                matrizinicial[i][j] /= pivote;
            }
            for (int j=0;j< matrizinicial.length;j++){
                double factor=matrizinicial[j][i];
                if (j != i) {
                    for (int k=0;k< matrizinicial[0].length;k++){
                        matrizinicial[j][k]-=factor* matrizinicial[i][k];


                    }

                }
            }
        }
        return matrizinicial;
    }
}
