import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la calificación alfabética (A, B, C, D, E, F): ");
        // Leemos el texto, lo convertimos a mayúsculas y tomamos el primer carácter
        char letra = entrada.next().toUpperCase().charAt(0);

        int calificacionNumerica = 0;
        boolean letraValida = true;

        switch (letra) {
            case 'A':
                calificacionNumerica = 4;
                break;
            case 'B':
                calificacionNumerica = 5;
                break;
            case 'C':
                calificacionNumerica = 6;
                break;
            case 'D':
                calificacionNumerica = 7;
                break;
            case 'E':
                calificacionNumerica = 8;
                break;
            case 'F':
                calificacionNumerica = 9;
                break;
            default:
                letraValida = false;
                System.out.println("Error: Calificación alfabética no válida (debe ser de A a F).");
                break;
        }

        if (letraValida) {
            System.out.println("La calificación numérica correspondiente es: " + calificacionNumerica);
        }

        entrada.close();
    }
}