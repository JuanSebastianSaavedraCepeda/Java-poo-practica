
package pruebaestudiante;

import java.util.Scanner;
public class PruebaEstudiante {

   
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);
        
        int total =0;
        int contadorCalificaciones = 0; // inicializa # de calificaciones introducidas


 // fase de procesamiento
// pide entrada y lee calificación del usuario
 System.out.print("Escriba la calificacion o -1 para terminar: ");
 int calificacion = entrada.nextInt();

 // itera hasta recibir el valor centinela del usuario
 while (calificacion != -1)
 {
 total = total + calificacion; // suma calificacion al total
contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador

 // pide entrada y lee la siguiente calificación del usuario
 System.out.print("Escriba la calificacion o -1 para terminar: ");
 calificacion = entrada.nextInt();
 {

 // fase de terminación
 // si el usuario introdujo al menos una calificación...
 if (contadorCalificaciones != 0)
 {
 // usa número con punto decimal para calcular promedio de calificaciones
 double promedio = (double) total / contadorCalificaciones;

 // muestra total y promedio (con dos dígitos de precisión)
 System.out.printf("%nEl total de las %d calificaciones introducidas es %d%n",
 contadorCalificaciones, total);
 System.out.printf("El promedio de la clase es %.2f%n", promedio);
 }
 else // no se introdujeron calificaciones, por lo que se muestra el mensaje apropiado
 System.out.println("No se introdujeron calificaciones");
        
 }
 }
    }
}
 
    

