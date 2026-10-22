import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = entrada.nextDouble();

        // Si el residuo al dividir entre 1 es 0, no tiene decimales
        if (numero % 1 == 0) {
            System.out.println("El número NO tiene parte fraccionaria (es un número entero).");
        } else {
            System.out.println("El número SÍ tiene parte fraccionaria.");
        }

        entrada.close();
    }
}