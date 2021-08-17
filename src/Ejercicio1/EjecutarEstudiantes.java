package Ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EjecutarEstudiantes {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();

        System.out.println("Digite el la cantidad de estudiantes");
        int num = imput.nextInt();
        for(int i = 0; i < num; i++){
        System.out.println("Digite el numero del estudiante");
        int numero = imput.nextInt();
        System.out.println("Digite el nombre del estudiante");
        imput.nextLine();
        String nombre = imput.nextLine();
        System.out.println("Digite el promedio del estudiante");
        float media = imput.nextFloat();

        Estudiantes estudiante = new Estudiantes(numero, nombre, media);
        listaEstudiantes.add(estudiante);}

        Collections.sort(listaEstudiantes);

        for (int i = (listaEstudiantes.size() - 1); i >= 0 ;i --){
            System.out.println(listaEstudiantes.get(i).mostarEstudiantes());
        }

    }
}
