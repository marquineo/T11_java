package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    static int cuadrado(int h, int v) {
        if (v == 1 || h == 1) {
            return 1;
        } else {
            return cuadrado(h - 1, v) + cuadrado(h, v - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas columnas quieres? ");
        int col = sc.nextInt();
        System.out.println("¿Cuantas filas quieres? ");
        int fila = sc.nextInt();
        for (int i = 1; i <= fila; i++) {
            System.out.println("");
            for (int m = 1; m <= col; m++) {
                System.out.print(cuadrado(m,i) + "\t");
            }
        }
    }
}