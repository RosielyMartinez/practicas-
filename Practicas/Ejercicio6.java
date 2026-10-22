import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un año: ");
        int anio = entrada.nextInt();

        // Condición lógica para año bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " SÍ es bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

        entrada.close();
    }
}