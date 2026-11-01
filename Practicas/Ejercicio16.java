import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A1, B1, C1, A2, B2, C2;

        System.out.print("Ingresa las dimensiones del primer prisma: ");
        A1 = entrada.nextInt();
        B1 = entrada.nextInt();
        C1 = entrada.nextInt();

        System.out.print("Ingresa las dimensiones del segundo prisma: ");
        A2 = entrada.nextInt();
        B2 = entrada.nextInt();
        C2 = entrada.nextInt();

        if (A1 < 1 || A1 > 100 || B1 < 1 || B1 > 100 ||
            C1 < 1 || C1 > 100 || A2 < 1 || A2 > 100 ||
            B2 < 1 || B2 > 100 || C2 < 1 || C2 > 100) {

            System.out.println("Error: los numeros deben estar entre 1 y 100.");

        } else if (
            (A1 == A2 && B1 == B2 && C1 == C2) ||
            (A1 == A2 && B1 == C2 && C1 == B2) ||
            (A1 == B2 && B1 == A2 && C1 == C2) ||
            (A1 == B2 && B1 == C2 && C1 == A2) ||
            (A1 == C2 && B1 == A2 && C1 == B2) ||
            (A1 == C2 && B1 == B2 && C1 == A2)) {

            System.out.println(1);

        } else {
            System.out.println(0);
        }

        entrada.close();
    }
}