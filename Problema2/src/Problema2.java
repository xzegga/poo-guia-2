import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        final double COSTO_ZONA_1 = 11.0;
        final double COSTO_ZONA_2 = 10.0;
        final double COSTO_ZONA_3 = 12.0;
        final double COSTO_ZONA_4 = 24.0;
        final double COSTO_ZONA_5 = 27.0;
        final double PESO_MAXIMO = 5000.0; // 5 kg en gramos

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en gramos: ");
        double peso = sc.nextDouble();

        if (peso > PESO_MAXIMO) {
            System.out.println("Lo lamentamos, por el momento no podemos transportar paquetes con un peso superior a 5 kg.");
        } else {
            System.out.println("Seleccione la zona de destino:");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");

            int zona = sc.nextInt();

            double costo = 0.0;

            switch (zona) {
                case 1:
                    costo = peso * COSTO_ZONA_1;
                    break;
                case 2:
                    costo = peso * COSTO_ZONA_2;
                    break;
                case 3:
                    costo = peso * COSTO_ZONA_3;
                    break;
                case 4:
                    costo = peso * COSTO_ZONA_4;
                    break;
                case 5:
                    costo = peso * COSTO_ZONA_5;
                    break;
                default:
                    System.out.println("Zona inválida, porfavor ingrese una zona válida");
                    return;
            }

            System.out.printf("El costo de envío es de $%.2f\n", costo);
        }

        sc.close();
    }
}

