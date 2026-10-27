import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Pedir el número
        System.out.print("Ingresa un número entero: ");
        
        // 2. Leerlo como entero (int)
        int numero = entrada.nextInt();

        // 3. Mostrar el resultado
        System.out.println("Ingresaste el número entero: " + numero);

        entrada.close();
    }
}