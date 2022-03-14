package pkg7.mayorpromedio;

/*Se tienen dos vectores V1 y V2 ambos de tamaño N de números enteros, 
escriba un algoritmo que lea estos dos vectores y luego imprima el vector 
que tenga mayor promedio*/
import java.util.Scanner;

public class Operaciones {

    int[] Vector1;
    int[] Vector2;

    public Operaciones(int[] Vector1, int[] Vector2) {
        this.Vector1 = Vector1;
        this.Vector2 = Vector2;
    }

    public void LlenarVectores() {
        System.out.println("Ingresa los numeros del vetor 1");
        for (int i = 0; i < Vector1.length; i++) {
            Vector1[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Ingresa los numeros del vetor 2");
        for (int i = 0; i < Vector2.length; i++) {
            Vector2[i] = new Scanner(System.in).nextInt();
        }
    }

    public double Promedio() {
        double acumulador1 = 0;
        double acumulador2 = 0;
        double promedioMayor = 0;
        for (int i = 0; i < Vector1.length; i++) {

            acumulador1 = acumulador1 + Vector1[i];
        }
        double promedio1 = acumulador1 / Vector1.length;
        for (int i = 0; i < Vector2.length; i++) {

            acumulador2 = acumulador2 + Vector2[i];
        }
        double promedio2 = acumulador2 / Vector2.length;

        if (promedio2 > promedio1) {
            promedioMayor = promedio2;
        } else if (promedio2 < promedio1) {
            promedioMayor = promedio1;
        }
        return promedioMayor;
    }
}
