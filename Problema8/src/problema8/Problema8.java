package problema8;

import java.util.Scanner;


public class Problema8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, cubo, cuarta;

        System.out.println("---- Determinar cubo y cuarta de un número-----");
        
        do {
            System.out.print("\nIngrese un número: ");
            num = scanner.nextDouble();
            
            cubo = Math.pow(num, 3);
            cuarta = Math.pow(num, 4);
            
            System.out.println((int)num + " ^ 3 = " + (int)cubo);
            System.out.println((int)num + " ^ 4 = " + (int)cuarta);
            
            scanner.nextLine();
            // 2 ^ 3 = 8
            // 2 ^ 4 = 16
            
            
            System.out.print("\nDesea ingresar otro número S / N ");
            
        } while ("s".equals(scanner.nextLine().toLowerCase()));
    }
    
}
