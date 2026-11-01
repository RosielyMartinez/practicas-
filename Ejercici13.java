
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A, B, C, D, X1, X2;

        System.out.print("Ingresa el valor de A: ");
        A = entrada.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        B = entrada.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        C = entrada.nextDouble();

        if (A == 0) {
            System.out.println("Error: A no puede ser cero.");
        } else {
            D = B * B - 4 * A * C;

            if (D >= 0) {
                X1 = (-B + Math.sqrt(D)) / (2 * A);
                X2 = (-B - Math.sqrt(D)) / (2 * A);

                System.out.println("Primera solucion: " + X1);
                System.out.println("Segunda solucion: " + X2);
            } else {
                System.out.println("Las soluciones son imaginarias.");
            }
        }

        entrada.close();
    }
}
