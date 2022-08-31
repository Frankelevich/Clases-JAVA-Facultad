package Ejercicios_LAB2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero= s.nextInt();

        System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));
    }
}
