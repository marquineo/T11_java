package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    static int factorial(int r) {
        switch (r) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return r * factorial(r - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fct;
        System.out.println("¿De que número quieres saber el factorial?");
        fct = sc.nextInt();
        System.out.println(factorial(fct));
    }
}