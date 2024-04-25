package icc;

public class Estadísticas {

    /**
     * Programa que calcula la media de datos
     * proporcionados por el usuario.
     * @param arregloN Conjunto de valores.
     * @return La media del conjunto de valores.
     */
    public double calcularMedia(double[] arregloN) {
        double suma = 0;
        for (int j = 0; j < arregloN.length - 1; j += 2) {
            suma += arregloN[j] + arregloN[j + 1];
        }
        if (arregloN.length % 2 != 0) {
            suma += arregloN[arregloN.length - 1];
        }
        if (arregloN.length != 0) {
            double media = suma / arregloN.length;
            return media;
        } else {
            System.out.println("No hay datos que analizar :(");
            return 0;
        }
    }

    /**
     * Programa que calcula la varianza de datos
     * proporcionados por el usuario.
     * @param arregloN Conjunto de valores.
     * @param media La media del conjunto de valores.
     * @return La varianza de los datos dados.
     */
    public double calcularVarianza(double[] arregloN, double media) {
        double varianza = 0;
        for (int k = 0; k < arregloN.length; k++) {
            varianza += (Math.pow((arregloN[k] - media), 2)) / arregloN.length;
        }
        return varianza;
    }
}
