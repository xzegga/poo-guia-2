
package problema5;

public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Imprimiendo números del 1 al 50 excepto el 25");
        
        for (int i = 1; i <= 50; i++) {
            if (i != 25) {                               
                String next = i != 50 ? ", " : ".";                                
                System.out.print(i + next);                
            } else {
                // Reservamos el lugar del número 25
                // pero no lo imprimimos.
                System.out.print("--");
            }
            
            // Imprime salto de linea cada 5 números
            if (i % 5 == 0) {
                System.out.println("");            
            }
        }
        
        System.out.println("\n------ Fin del programa ---------");
    }

}
