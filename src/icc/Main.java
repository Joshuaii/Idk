package icc;

// import icc.Estadísticas;
// import icc.Frecuencias
    ;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){

	// Manda a llamar el programa número uno.
	Frecuencias.calcularFrecuencias();

	// Esta es una parte de la implementación del programa dos.
	Scanner sc = new Scanner(System.in);
        System.out.println("\t||PROGRAMA 2||");
        System.out.print("Dame el número de datos a ingresar: ");
        int tamaño = sc.nextInt();

        double arregloN[] = new double[tamaño];

        for (int i = 0; i < arregloN.length; i++) {
            System.out.format("Dame el valor número [%d] : ", i + 1);
            double valor = sc.nextDouble();
            arregloN[i] = valor;
        }

        Estadísticas estadísticas = new Estadísticas();
        double media = estadísticas.calcularMedia(arregloN);
        double varianza = estadísticas.calcularVarianza(arregloN, media);

        System.out.println("La media es: " + media);
        System.out.println("La varianza es: " + varianza);
    }
}
