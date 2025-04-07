package ejercicios;
import java.util.*;
import java.io.*;
public class Ejercicio3_IPM {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el nombre del archivo: ");
	        String nombreArchivo = scanner.nextLine();
	        
	        File documento = new File(nombreArchivo);
	        if (!documento.exists()) {
	            System.out.println("El archivo no existe.");
	            return;
	        }

	        try (Scanner leerFichero = new Scanner(documento)) {
	            int contarPalabras = 0;
	            int contarCaracteres = 0;
	            
	            while (leerFichero.hasNext()) {
	                String word = leerFichero.next();
	                contarPalabras++;
	                contarCaracteres += word.length();
	            }
	            
	            double totalPalabra = (contarPalabras == 0) ? 0 : (double) contarCaracteres / contarPalabras;
	            
	            System.out.println("Número de palabras: " + contarPalabras);
	            System.out.println("Número de caracteres (sin espacios): " + contarCaracteres);
	            System.out.printf("Longitud media de palabra: %.2f\n", totalPalabra);
	        } catch (IOException e) {
	            System.out.println("Error al leer el archivo.");
	        }
	    }

	}


