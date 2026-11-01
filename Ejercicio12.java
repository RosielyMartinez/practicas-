
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, mayor;

        System.out.print("Ingresa el valor de A: ");
        A = teclado.nextInt();

        System.out.print("Ingresa el valor de B: ");
        B = teclado.nextInt();

        System.out.print("Ingresa el valor de C: ");
        C = teclado.nextInt();

        System.out.print("Ingresa el valor de D: ");
        D = teclado.nextInt();

        if (A == B || A == C || A == D ||
            B == C || B == D || C == D) {

            System.out.println("Error: los numeros deben ser diferentes.");

        } else {

            mayor = A;

            if (B > mayor) {
                mayor = B;
            }

            if (C > mayor) {
                mayor = C;
            }

            if (D > mayor) {
                mayor = D;
            }

            System.out.println("El numero mas grande es: " + mayor);
        }

        teclado.close();
    }
}
