package Ejercicios_LAB2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=  new Random();

        boolean salir=false;
        int x=r.nextInt(101);
        int num;
        int i=0;
        System.out.println("\t\tEncontrar un numero aleatorio entre 1 y 100");
        while (!salir){

            System.out.println("Introduzca un numero entre el 1 y el 100: ");
            num=s.nextInt();
            if (num>0 && num<101) {
                if (x == num) {
                    System.out.println("Felicitaciones! El numero era " + x);
                    salir = true;
                } else {
                    if (x < num) {
                        System.out.println("El numero es menor al que escribio.");
                        i++;
                    } else {
                        System.out.println("El numero es mayor al que escribio.");
                        i++;
                    }
                }
            }else{
                System.out.println("El numero debe estar entre el 1 y el 100.\n\n");
            }
        }
        System.out.println("Intentos realizados: "+i);
    }
}
