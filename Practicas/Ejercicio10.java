import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = entrada.nextInt();

        // Math.abs() convierte el número a positivo para facilitar el conteo de dígitos
        int absNum = Math.abs(num);

        if (absNum >= 0 && absNum <= 9) {
            System.out.println("El número " + num + " tiene 1 dígito.");
        } else if (absNum >= 10 && absNum <= 99) {
            System.out.println("El número " + num + " tiene 2 dígitos.");
        } else if (absNum >= 100 && absNum <= 999) {
            System.out.println("El número " + num + " tiene 3 dígitos.");
        } else {
            System.out.println("El número " + num + " tiene más de 3 dígitos.");
        }

        entrada.close();
    }
}