import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double N, raiz;

        System.out.print("Ingresa un numero: ");
        N = entrada.nextDouble();

        if (N >= 0) {
            raiz = Math.pow(N, 0.5);
            System.out.println("La raiz cuadrada es: " + raiz);
        } else {
            System.out.println("No hay solución real");
        }

        entrada.close();
    }
}