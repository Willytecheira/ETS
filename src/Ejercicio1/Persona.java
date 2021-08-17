package Ejercicio1;

public class Persona {

    private String nombre;
    private int numero;



    public Persona(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    public String mostrarDatos(){
        return "El nombre de la persona es: " + this.nombre + "\nEl numero de telefono es: " + this.numero;
    }
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
