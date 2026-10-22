import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, x;

        System.out.print("Ingresa el valor de a: ");
        a = entrada.nextDouble();

        System.out.print("Ingresa el valor de b: ");
        b = entrada.nextDouble();

        if (a != 0) {
            x = -b / a;
            System.out.println("La solución es x = " + x);
        } else {
            if (b != 0) {
                System.out.println("Solución imposible");
            } else {
                System.out.println("Solución indeterminada");
            }
        }

        entrada.close();
    }
}