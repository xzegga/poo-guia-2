
import java.util.Scanner;

public class Problema10 {

    public static void main(String[] args) {
        double a, b, c;
        double discriminante, raizDiscriminante;
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Extrayendo las raices de una ecuación cuadrátcia ----_");

        // Leyendo los valores de a, b y c
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();

        if (a == 0) {
            /* 
                La ecuación se reduce a una ecuación lineal 
                de la forma bx + c = 0 
            */
            if (b == 0) {
                System.out.println("La ecuación es degenerada");
            } else {
                double root = -c / b;
                System.out.printf("La raíz es: %.2f", root);
            }
            
        } else {
            
            discriminante = b * b - 4 * a * c;

            // Calculando la raiz cuadrada.
            raizDiscriminante = Math.sqrt(Math.abs(discriminante));
            
            if (discriminante > 0) {

                double x1 = (-b + raizDiscriminante) / (2 * a);
                double x2 = (-b - raizDiscriminante) / (2 * a);

                System.out.printf("Las raíces son x1 = %.2f y x2 = %.2f", x1, x2);

            } else if (discriminante == 0) {

                double x = -b / (2 * a);
                System.out.println("La única raíz es x = " + x);

            } else {
                
                // La raiz de un número negativo no es un número real 
                // en estos casos se puede decir que no tiene solucion. 
                System.out.println("No hay raices reales para los números proporcionados.");
                
            }
        }

        System.out.println("\n---------- Fin del Programa ------------");
    }
}
