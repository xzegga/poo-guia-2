package problema6;

import java.util.Scanner;

public class Problema6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un número " + i + " de 100 enteros: ");
            int num = scanner.nextInt();

            if (num % 3 == 0) {
                suma += num;
            }
        }

        System.out.println("La suma de los números múltiplos de 3 es: " + suma);
    }

}
