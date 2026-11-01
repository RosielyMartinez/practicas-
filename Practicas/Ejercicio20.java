import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N, P, antes, despues;

        System.out.print("Ingresa el valor de N: ");
        N = entrada.nextInt();

        System.out.print("Ingresa el valor de P: ");
        P = entrada.nextInt();

        if (N < 1 || N > 3 || P < 0 || P > 1000000000) {
            System.out.println("Error: valores no validos.");
        } else {
            antes = (N - P - 1) % 3;
            despues = (N + P - 1) % 3;

            if (antes < 0) {
                antes = antes + 3;
            }

            antes = antes + 1;
            despues = despues + 1;

            System.out.println(antes + " " + despues);
        }

        entrada.close();
    }
}