package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    static int rellenotriangulo(int a, int i) {
        if (a == i || a == 1) {
            return 1;
        } else if (a == 1) {
            return 1;
        } else {
            return rellenotriangulo(a - 1, i - 1) + rellenotriangulo(a - 1, i);
        }
    }

    public static void main(String[] args) {
        int filas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la altura del triángulo: ");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int b = i; b <= filas; b++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print(rellenotriangulo(a, i));
                System.out.print(" ");

            }
            System.out.println("");
        }
    }
}