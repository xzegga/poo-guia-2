
import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadMayoresA100 = 0;
        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int sumaPositivos = 0;
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                if (numero > 100) {
                    cantidadMayoresA100++;
                }
                if (numero < 0) {
                    cantidadNegativos++;
                }
                if (numero > 0) {
                    cantidadPositivos++;
                    sumaPositivos += numero;
                }
            }
        } while (numero != 0);

        System.out.println("\nCantidad de números mayores a 100: " + cantidadMayoresA100);
        System.out.println("Cantidad de números negativos: " + cantidadNegativos);

        if (cantidadPositivos == 0) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            double promedioPositivos = (double) sumaPositivos / cantidadPositivos;
            System.out.printf("Promedio de los números positivos: %.2f", promedioPositivos);
        }

        System.out.println("\n\n----------- Fin del programa -------------");
    }
}
