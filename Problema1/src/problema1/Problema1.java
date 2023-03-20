
package problema1;

import java.util.Scanner;

/**
 *
 * @author Carito
 */
public class Problema1 {

    public static void main(String[] args) {
        
        //Definir objeto tipo "Scanner"
        Scanner lector = new Scanner(System.in);
        // Definamos las variables
        
        double salarioneto,costohoras, pagoDoble,pagoNormal,costodoble;
        int horasNormales, horasExtras;
        String nombreEmpl;
        boolean salir=false;
        
        
        
        
        //Solicitando datos al usuario
        do{
        System.out.println("CAPTURA DE DATOS DEL EMPLEADO");
        System.out.println("Ingrese nombre del Empleado:  " );
        nombreEmpl = lector.nextLine();
        System.out.println("Ingrese las horas trabajadas por el Empleado:  " );
        horasNormales= lector.nextInt();
         // resetear Scanner
            lector.nextLine();
        System.out.println("Ingrese el costo de las horas:  " );
        costohoras= lector.nextDouble();
        
        //Proceso para determinar 
            if(horasNormales<=44){
                 pagoNormal= horasNormales * costohoras;
          
        //salida de datos horas normales
        
           System.out.println("=============================");
           System.out.println("\nNombre Empleado: " + nombreEmpl); 
           System.out.println("\nHoras Trabajadas: " + horasNormales);
           System.out.println("\nCosto Horas Trabajadas: $" + costohoras);
           System.out.println("\nTotal a Pagar: $" + pagoNormal);
            }
        
           else{
            
             horasExtras= horasNormales - 44;
             pagoNormal= 44* costohoras;
             costodoble = costohoras * 2;
             pagoDoble = horasExtras * costodoble;
             salarioneto = pagoNormal + pagoDoble;
        
               System.out.println("=============================");
               System.out.println("\nNombre Empleado: " + nombreEmpl); 
               System.out.println("\nHoras Trabajadas Normales: 44");
               System.out.println("\nHoras Trabajadas Extras: " + horasExtras);
               System.out.println("\nCosto Horas Trabajadas Normales: $" + costohoras);
               System.out.println("\nCosto Horas Extras: $" + costodoble);
               System.out.println("\nTotal Horas Trabajadas Normales: $" + pagoNormal);
               System.out.println("\nTotal Horas Extras: $" + pagoDoble);
               System.out.println("\nTotal a Pagar: $" + salarioneto);
               
        }
   
        // resetear Scanner
            lector.nextLine();
            
        String respuesta;
            System.out.println("¿Desea Cerrar el Sistema? (S/N)");
            respuesta = lector.next().toLowerCase().trim();

            if (respuesta.charAt(0) == 's') {
                salir=true;
            }  
          // resetear Scanner
            lector.nextLine();   
            
                        
        }while(!salir);
        System.out.println("=========FIN DE PROGRAMA======== ");
        }   
    
    
}
