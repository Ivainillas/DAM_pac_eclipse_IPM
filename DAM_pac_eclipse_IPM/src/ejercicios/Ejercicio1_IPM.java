package ejercicios;
import java.util.*;
public class Ejercicio1_IPM {
	 
	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, 
             int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {

		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditor�a ya que no ha terminado los proyectos acordados");
			return false;
		}

		double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

		if (gastoPersonal > 20000) {
			System.out.println("No ha pasado la auditor�a ya que el gasto en personal es de " + gastoPersonal 
					+ " y excede el l�mite mensual de 20.000 euros");
			return false;
		}

		if (presupuestoEmpresa > 100000) {
			System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado de " + presupuestoEmpresa 
					+ " excede el l�mite establecido en 100.000 euros");
			return false;
		}

		System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
		return true;
	}

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el salario del jefe: ");
	        double salarioJefe = scanner.nextDouble();
	        
	        System.out.print("Ingrese el salario del encargado: ");
	        double salarioEncargado = scanner.nextDouble();
	        
	        System.out.print("Ingrese el salario de los oficinistas: ");
	        double salarioOficinistas = scanner.nextDouble();
	        
	        System.out.print("Ingrese el n�mero de oficinistas: ");
	        int numeroOficinistas = scanner.nextInt();
	        
	        System.out.print("�Los proyectos han sido terminados? Indica (true/false): ");
	        boolean proyectosTerminados = scanner.nextBoolean();
	        
	        System.out.print("Ingrese el presupuesto de la empresa: ");
	        double presupuestoEmpresa = scanner.nextDouble();
	        
	        boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
	        System.out.println("Resultado de la auditor�a: " + (resultado ? "Apto" : "No apto"));
	        
	        scanner.close();
	    }
	}
