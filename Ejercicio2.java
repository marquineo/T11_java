package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    static int fibonacci(int f) {
        switch (f) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(f - 1) + fibonacci(f - 2);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cero = 0;
        System.out.println("Dame un número de secuencias: ");
        for (int i = sc.nextInt(); i > cero; cero++) {
            System.out.print(fibonacci(cero) + ", ");
        }

    }

}
