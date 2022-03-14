package pkg7.mayorpromedio;

import java.util.Scanner;

/*Se tienen dos vectores V1 y V2 ambos de tamaño N de números enteros, 
escriba un algoritmo que lea estos dos vectores y luego imprima el vector 
que tenga mayor promedio*/
public class MayorPromedio {

    public static void main(String[] args) {
        System.out.println("Cuantos numeros tendra el vector 1?");
        int TamanoVector1 = new Scanner(System.in).nextInt();
        System.out.println("Cuantos numeros tendra el vector 2?");
        int TamanoVector2 = new Scanner(System.in).nextInt();

        int[] Vector1 = new int[TamanoVector1];
        int[] Vector2 = new int[TamanoVector2];

        Operaciones objOperaciones = new Operaciones(Vector1, Vector2);
        objOperaciones.LlenarVectores();
        System.out.println("El mayor promedio es: " + objOperaciones.Promedio());

    }

}
