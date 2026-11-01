import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double distancia, precioTotal;
        int dias;

        System.out.print("Ingresa la distancia a recorrer en km: ");
        distancia = entrada.nextDouble();

        System.out.print("Ingresa el numero de dias de estancia: ");
        dias = entrada.nextInt();

        precioTotal = distancia * 150;

        if (distancia > 800 && dias > 7) {
            precioTotal = precioTotal * 0.70;
        }

        System.out.println("El precio del boleto de ida y vuelta es: $" + precioTotal);

        entrada.close();
    }
}