package practica2;

import java.util.Scanner;

/**
 * Orograma para calcular la nota  de un estudiante.
 * Permite ingresar notas, comprobar su validez, calcular la nota final y determinar si el estudiante aprobó o no.
 * 
 * @author Ivo Uría
 * @version 1.0
 * @since 30/03/2024
 */
public class notas {

    /** Variables para almacenar las notas y acumulados
		*/
  
	double primeranota, segundanota, terceranota;
    double acu1, acu2, acu3, def;

    // Scanner para recibir entrada del usuario
    Scanner entrada = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante.
     * Las notas son ingresadas por el usuario y almacenadas en las variables correspondientes.
     * 
     * 	@param uf1 Nota primera unidad
		@param uf2 Nota segunda unidad
		@param uf3 Nota tercera unidad
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante:");

        System.out.print("Ingrese nota 1: ");
        primeranota = entrada.nextDouble();
        System.out.print("Ingrese nota 2: "); // prueba de commit
        segundanota = entrada.nextDouble();

        System.out.print("Ingrese nota 3: "); 
        
        terceranota = entrada.nextDouble();
    }

    /**
     * Método para comprobar la validez de las notas 
     * Imprime un mensaje indicando si cada nota está dentro del rango válido, entre 0 y 10
     * 
     * @throws IlegalArgumentException si alguna de las notas no está dentro del rango válido
     */
    public void comprobacion() {
        if (primeranota > 10) {
            System.out.println("Nota 1 no válida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (segundanota > 10) {
            System.out.println("Nota 2 no válida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (terceranota > 10) {
            System.out.println("Nota 3 no válida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método para calcular la nota definitiva del estudiante.
     * Calcula las notas de cada uf de acuerdo a los porcentajes establecidos y luego las suma para obtener la nota final.
     * 
     * @return nota final del estudiante.
     */
    public void Calculonotas() {
        acu1 = primeranota * 0.35;
        acu2 = segundanota * 0.35;
        acu3 = terceranota * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Método para mostrar las notas y la nota definitiva del estudiante.
     * 
     *  Muestra por pantalla las notas introducidas, las notas calculadas según los porcentajes y la nota final.
     *  
     *  @return nota definitiva del estudiante
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + primeranota);
        System.out.println("Nota 2 = " + segundanota);
        System.out.println("Nota 3 = " + terceranota);

        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);

        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Método para determinar si el estudiante aprobó o no.
     * Imprime "aprobado" si la nota final está entre 5 y 10, de lo contrario imprime "suspendido".
     * 
     * @return Un mensaje indicando si el estudiante aprobó o suspendió
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Método principal que crea una instancia de la clase notas y ejecuta los métodos para ingresar notas, calcular y mostrar la nota final, y determinar si el estudiante aprobó.
     * @param args 
     */
    public static void main(String[] args) {
        notas fc = new notas();

        fc.IngresaNotas();

        fc.comprobacion();

        fc.Calculonotas();

        fc.Mostrar();

        fc.aprobado();
    }
}
