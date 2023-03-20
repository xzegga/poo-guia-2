package problema3;

import java.util.Scanner;

public class Problema3 {

    public static void main(String args[]) {
        double total;
        int numero;

        int i = 1;
        Scanner leer = new Scanner(System.in);
        while (i <= 10) {
            System.out.print("\nIngrese  el  número de llantas que desea comprar: ");
            numero = leer.nextInt();

            if (numero < 4) {
                total = numero * 70.00;
            } else {
                total = numero * 50.00;
            }

            System.out.println("\nPor la compra de " + numero + " llantas el total a pagar es: $" + total + " dólares");
            i++;

        }

    }

}
