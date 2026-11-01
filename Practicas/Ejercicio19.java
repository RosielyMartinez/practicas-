import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int P1, P2, P3, P4;

        System.out.print("Ingresa los cuatro palitos: ");
        P1 = entrada.nextInt();
        P2 = entrada.nextInt();
        P3 = entrada.nextInt();
        P4 = entrada.nextInt();

        if (P1 < 1 || P1 > 100 || P2 < 1 || P2 > 100 ||
            P3 < 1 || P3 > 100 || P4 < 1 || P4 > 100) {

            System.out.println("Error: los numeros deben estar entre 1 y 100.");

        } else if ((P1 == P2 && P1 == P3) ||
                   (P1 == P2 && P1 == P4) ||
                   (P1 == P3 && P1 == P4) ||
                   (P2 == P3 && P2 == P4)) {

            System.out.println(1);

        } else {
            System.out.println(0);
        }

        entrada.close();
    }
}