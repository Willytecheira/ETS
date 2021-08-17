package Ejercicio1;

public class Estudiantes implements Comparable <Estudiantes>{
    private int numero;
    private String nombre;
    private float media;

    public Estudiantes(int numero, String nombre, float media){
        this.numero = numero;
        this.nombre = nombre;
        this.media = media;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public float getMedia() {
        return media;
    }

    public String mostarEstudiantes(){
        return "El numero del estudiante es: "+getNumero()+"\nEl nombre del estudiante es: "+getNombre()+"\nEl promedio es: "+getMedia();
    }

    @Override
    public int compareTo(Estudiantes e) {
        if(e.getMedia()>media){
            return - 1;
        }else if(e.getMedia()>media){
            return 0;
        }else{
            return 1;
        }
    }
}
