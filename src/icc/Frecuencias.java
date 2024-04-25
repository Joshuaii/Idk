package icc;

import java.util.Random;

public class Frecuencias{
    
    /**
     * Programa que calcula la frecuencia de los números
     * de un hiperdado de 50 caras del 1 al 50, siendo
     * aleatorios, con un total de 10,000 lanzamientos.
     */
    public static void calcularFrecuencias(){
	
	Random generador = new Random();
	int[] arreglo = new int[10000];
	int apariciones = 0;
	int conteo = 0;
	int lanzamientos = 0;
	int caras = 0;

	// Simulando tiradas de un hiperdado de 50 caras del 1 al 50.
	while(lanzamientos < 10000){
	    caras = generador.nextInt(50) + 1;
	    arreglo[lanzamientos] = caras;
	    lanzamientos++;
	}

	System.out.println("\t||PROGRAMA 1||");
	System.out.println("Cara\tSalida");

	// Frecuencia.
	for(int número = 1; número <= 50; número++){
	    for(int i = 0; i < arreglo.length; i++){
		if(número == arreglo[i]){
		    apariciones ++;
		}
	    }
	    System.out.format("%d\t %d%n", número, apariciones);

	    // Suma de las frecuencias almacenadas.
	    conteo += apariciones;
	    apariciones = 0;
	}
	System.out.format("La suma de las frecuencias es = %d%n", conteo);
	System.out.println();
    }
}
