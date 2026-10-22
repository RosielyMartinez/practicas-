import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura de datos por teclado
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        double horas = entrada.nextDouble();

        System.out.print("Ingrese la tarifa por hora normal: ");
        double tarifa = entrada.nextDouble();

        // 2. Cálculo del salario semanal bruto
        double salarioSemanalBruto = 0;

        if (horas <= 35) {
            salarioSemanalBruto = horas * tarifa;
        } else {
            double horasNormales = 35;
            double horasExtras = horas - 35;
            salarioSemanalBruto = (horasNormales * tarifa) + (horasExtras * tarifa * 1.5);
        }

        // 3. Proyección a sueldo mensual para el cálculo de impuestos
        double sueldoMensual = salarioSemanalBruto * 4;
        double impuestosMensuales = 0;

        if (sueldoMensual <= 10000) {
            impuestosMensuales = 0;
        } else if (sueldoMensual <= 12200) { // 10,000 + 2,200
            impuestosMensuales = (sueldoMensual - 10000) * 0.20;
        } else {
            double excedente = sueldoMensual - 12200;
            impuestosMensuales = (2200 * 0.20) + (excedente * 0.30);
        }

        // 4. Cálculo del neto mensual y semanal
        double sueldoNetoMensual = sueldoMensual - impuestosMensuales;
        double salarioNetoSemanal = sueldoNetoMensual / 4;

        // 5. Resultados en pantalla
        System.out.println("\n--- REPORTE DE NÓMINA ---");
        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario bruto semanal: $" + salarioSemanalBruto);
        System.out.println("Sueldo mensual estimado: $" + sueldoMensual);
        System.out.println("Impuestos mensuales aplicados: $" + impuestosMensuales);
        System.out.println("Salario neto semanal: $" + salarioNetoSemanal);

        entrada.close();
    }
}