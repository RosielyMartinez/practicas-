import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alumnos, i;
        double peso;
        int menos40 = 0, entre40y50 = 0;
        int entre50y60 = 0, mas60 = 0;

        System.out.print("Ingresa la cantidad de alumnos: ");
        alumnos = entrada.nextInt();

        for (i = 1; i <= alumnos; i++) {
            System.out.print("Ingresa el peso del alumno " + i + " en kg: ");
            peso = entrada.nextDouble();

            if (peso < 40) {
                menos40++;
            } else if (peso <= 50) {
                entre40y50++;
            } else if (peso < 60) {
                entre50y60++;
            } else {
                mas60++;
            }
        }

        System.out.println("\nEstadistica de pesos:");
        System.out.println("Alumnos de menos de 40 kg: " + menos40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de mas de 50 y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos de 60 kg o mas: " + mas60);

        entrada.close();
    }
}