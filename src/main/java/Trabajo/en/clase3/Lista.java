package Trabajo.en.clase3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        System.out.println("Por favor, ingresa 8 palabras:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine();
            palabras.add(palabra);
        }

        System.out.println("\nLista de palabras ingresadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.length() > 5) {
                contador++;
            }
        }
        System.out.println("\nNúmero de palabras con más de 5 letras: " + contador);

        scanner.close();
    }
}