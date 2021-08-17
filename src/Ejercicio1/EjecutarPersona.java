package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjecutarPersona {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Digite el número de personas a agendar");
        int n = imput.nextInt();
        Persona per[] = new Persona[n];

        for(int i = 0; i < per.length; i++){

            System.out.println("Digite el nombre de la Presona");
            imput.nextLine();
            String nombre = imput.nextLine();
            System.out.println("Digite el numero de telefono");
            int numero = imput.nextInt();

            per[i] = new Persona(nombre, numero);
        }

        System.out.println("Digite el nombre de la persona a buscar");
        imput.nextLine();
        boolean a = true;
        String nom = imput.nextLine();
        for (int i = 0; i < per.length; i++){
            String m = per[i].getNombre();
            if(m.contains(nom)){
                System.out.println(per[i].mostrarDatos());
            }else{
                a = false;}
            }
        if(a == false){
            System.out.println("El nombre no fue encontrado");
        }



    }
}
