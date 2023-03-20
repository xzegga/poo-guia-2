package problema7;

public class Alumno {

    private String nombre;
    private String calificacion;
    private double promedio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double prom) {
        this.promedio = prom;
    }

    public void setCalificacion(String cal) {
        this.calificacion = cal;
    }

    public void mostrarAlumno() {
        System.out.println("\n------------------------------------------------");
        System.out.println("\nNombre: \t" + this.nombre);
        System.out.printf("Promedio: \t%.2f \t\t", this.promedio);
        System.out.println("\nCalificación:\t" + "\"" + this.calificacion + "\"");
    }
}
