package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        System.out.println("Dame el numero de filas: ");
        filas = sc.nextInt();
        for (int i = 1; i <= filas; i++) {
            if (i == 1 || i == filas) {
                for (int m = 1; m <= 4; m++) {
                    System.out.print("*");
                    
                }System.out.println("");
            } else {
                System.out.println("*");
            }

        }
        

    }

}
/*
        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 4) {
                for (int m = 1; m <= 4; m++) {
                    System.out.print("*");
                    
                }System.out.println("");
            } else {
                System.out.println("*");
            }

        }
*/