package ejercicios;
import java.util.*;
public class Ejercicio4_IPM {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.print("Escriba un nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrayPuntuacion.length; i++) {
            arrayPuntuacion[i] = 35 + random.nextInt(66);
        }

        int maxPuntuacion = arrayPuntuacion[0];
        int minPuntuacion = arrayPuntuacion[0];
        int indiceMax = 0;
        int indiceMin = 0;
        int sumaPuntos = arrayPuntuacion[0];

        for (int i = 1; i < arrayPuntuacion.length; i++) {
        	sumaPuntos += arrayPuntuacion[i];

            if (arrayPuntuacion[i] > maxPuntuacion) {
            	maxPuntuacion = arrayPuntuacion[i];
                indiceMax = i;
            }

            if (arrayPuntuacion[i] < minPuntuacion) {
            	minPuntuacion = arrayPuntuacion[i];
                indiceMin = i;
            }
        }

        double media = (double) sumaPuntos / arrayPuntuacion.length;

        System.out.println("El equipo ganador es: " + arrayNombres[indiceMax] + " con " + maxPuntuacion + " puntos");
        System.out.println("El último equipo clasificado es: " + arrayNombres[indiceMin] + " con " + minPuntuacion + " puntos");
        System.out.println("Puntuación media de todos los equipos: " + media);

        scanner.close();
    }

}


