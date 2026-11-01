import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double calificacion;

        System.out.print("Ingresa la calificacion: ");
        calificacion = entrada.nextDouble();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Error: calificacion no valida.");
        } else if (calificacion < 6) {
            System.out.println("Reprobatoria");
        } else {
            System.out.println("Aprobatoria");
        }

        entrada.close();
    }
}