  import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, E, F, G, H, I, J, D, M;

        System.out.print("Ingresa el año: ");
        A = entrada.nextInt();

        if (A < 1583 || A > 9999) {
            System.out.println("Error: año no válido.");
        } else {
            B = A / 100 + 1;
            C = 3 * B / 4 - 12;
            E = A % 19 + 1;
            F = (8 * B + 5) / 25 - (5 + C);
            G = 5 * A / 4 - (C + 10);
            H = (11 * E + 20 + F) % 30;

            if (H == 25 && E > 11) {
                H++;
            }

            if (H == 24) {
                H++;
            }

            I = 44 - H;

            if (I < 21) {
                I += 30;
            }

            J = I + 7 - ((G + I) % 7);

            if (J > 31) {
                D = J - 31;
                M = 4;
            } else {
                D = J;
                M = 3;
            }

            System.out.println(D + " " + M);
        }

        entrada.close();
    }
}