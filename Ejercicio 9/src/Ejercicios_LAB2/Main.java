package Ejercicios_LAB2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int peso;
        System.out.println("Indique el genero de la persona (H/M): ");
        String genero= s.nextLine();
        while (!genero.equals("H") && !genero.equals("M") && !genero.equals("h") && !genero.equals("m")){
            System.out.println("Respuesta incorrecta. Intente nuevamente.\n\n");
            System.out.println("Indique el genero de la persona (H/M): ");
            genero= s.nextLine();
        }
        System.out.println("Ahora indique la altura (en centimetros): ");
        int altura=s.nextInt();
        while (altura<0||altura>200){
            System.out.println("Altura incorrecta.");
            System.out.println("Indique la altura (en centimetros): ");
            altura=s.nextInt();
        }

        if (genero=="H"||genero=="h"){
            peso=altura-110;
        }else{
            peso=altura-120;
        }
        System.out.println("El peso ideal de una persona que mide "+altura+" será de "+peso+"kg.");

    }
}
