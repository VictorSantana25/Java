package Trabajo.en.clase2;

import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a tu calculadora.");
        System.out.println("Ingrese el primer número: ");
        double var1 = scanner.nextDouble();

        System.out.println("A continuación, ingrese el segundo número: ");
        double var2 = scanner.nextDouble();

        System.out.println("Seleccione la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("");
        int opc = scanner.nextInt();

        double resultado = 0;

        switch (opc) {
            case 1:
                resultado = var1 + var2;
                break;
            case 2:
                resultado = var1 - var2;
                break;
            case 3:
                resultado = var1 * var2;
                break;
            case 4:
                if (var2 != 0) {
                    resultado = var1 / var2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
