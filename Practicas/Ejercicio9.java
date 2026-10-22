import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número comprendido entre 1 y 10: ");
        int num = entrada.nextInt();

        // 1. Validar si está en el rango válido (1 a 10 inclusive)
        if (num >= 1 && num <= 10) {
            
            // 2. Evaluar si es par o impar
            if (num % 2 == 0) {
                System.out.println("El número " + num + " es par.");
            } else {
                System.out.println("El número " + num + " es impar.");
            }

        } else {
            System.out.println("Error: El número está fuera del rango válido (debe ser entre 1 y 10).");
        }

        entrada.close();
    }
}