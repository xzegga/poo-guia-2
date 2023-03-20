
package problema7;

import java.util.Scanner;


public class Problema7 {       
    
    private static String getCalificacion(double promedio){
        if(promedio < 5) return "NM";
        if(promedio >= 6 && promedio <= 8) return "B";
        if(promedio > 8 && promedio <= 9) return "MB";        
        return "E";
    }
    
    public static void main(String[] args) {
        final int total = 20;
        double suma;   

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==============================================================");
        System.out.println("== Programa para cálculo de los promedios de 20 estudiantes ==");
        
        for (int i = 1; i <= total; i += 1) {           
            Alumno alumno = new Alumno();
            
            System.out.print("\n\nIngrese el nombre del estudiante " + i + " / 20: ");            
            alumno.setNombre(scanner.nextLine());           
                                   
            System.out.println("\nIntroduzca las notas por cada uno de los 5 parciales");
            
            // Lectura de notas por cada parcial
            suma = 0;
            for(int n = 1; n <= 5; n += 1) {
                System.out.print("Nota parciao No " + n + ": ");
                suma += scanner.nextDouble();                
            }
                        
            scanner.nextLine();
            
            // Calculando promedio y extrayendo la calificación
            alumno.setPromedio(suma / 5);
            alumno.setCalificacion(getCalificacion(suma / 5));
            
            alumno.mostrarAlumno();                        
        }
        
        System.out.println("\n\n================= FIN DEL PROGRAM =======================");
        
    }
    
}
