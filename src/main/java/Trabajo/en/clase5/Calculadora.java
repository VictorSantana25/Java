package Trabajo.en.clase5;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opc;
        do {
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    sumar(scanner);
                    break;
                case 2:
                    restar(scanner);
                    break;
                case 3:
                    multiplicar(scanner);
                    break;
                case 4:
                    dividir(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opc != 5);

        scanner.close();
    }

    public static void sumar(Scanner scanner) {
        try {
            System.out.print("Ingrese el primer número: ");
            double var1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double var2 = scanner.nextDouble();
            double resultado = var1 + var2;
            System.out.println("El resultado de la suma es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese números válidos.");
        }
    }
    public static void restar(Scanner scanner) {
        try {
            System.out.print("Ingrese el primer número: ");
            double var1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double var2 = scanner.nextDouble();
            double resultado = var1 - var2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese números válidos.");
        }
    }
    public static void multiplicar(Scanner scanner) {
        try {
            System.out.print("Ingrese el primer número: ");
            double var1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double var2 = scanner.nextDouble();
            double resultado = var1 * var2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Ingrese números válidos.");
            scanner.nextLine(); // Limpiar el buffer
        }
    }
    public static void dividir(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo: ");
            double var1 = scanner.nextDouble();
            System.out.print("Ingrese el divisor: ");
            double var2 = scanner.nextDouble();

            if (var2 == 0) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                double resultado = var1 / var2;
                System.out.println("El resultado de la división es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese números válidos.");
        }
    }
}