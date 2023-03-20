package problema9;

import java.util.Scanner;

public class Problema9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de ventas a registrar: ");
        int n = input.nextInt();

        int menor500 = 0, entre500y900 = 0, mayor900 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el monto de la venta " + i + ": $");
            double venta = input.nextDouble();

            if (venta <= 500) {
                menor500++;
            } else if (venta > 500 && venta < 900) {
                entre500y900++;
            } else if (venta >= 900) {
                mayor900++;
            }
        }

        System.out.println("Cantidad de ventas de $500 o menos: " + menor500);
        System.out.println("Cantidad de ventas mayores a $500 pero menores a $900: " + entre500y900);
        System.out.println("Cantidad de ventas de $900 o más: " + mayor900);
    }

}
