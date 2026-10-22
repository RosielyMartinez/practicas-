import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, CENTRAL;

        System.out.println("Escribe A, B y C:");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        if (A > B) {
            if (B > C) {
                CENTRAL = B;
            } else {
                if (A > C) {
                    CENTRAL = C;
                } else {
                    CENTRAL = A;
                }
            }
        } else {
            if (A > C) {
                CENTRAL = A;
            } else {
                if (B > C) {
                    CENTRAL = C;
                } else {
                    CENTRAL = B;
                }
            }
        }

        System.out.println("El numero central es: " + CENTRAL);
        entrada.close();
    }
}