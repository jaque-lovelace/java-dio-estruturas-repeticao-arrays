package dio.bancopan.java.loops;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número
* inteiro entre 1 a 10*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("De qual número você deseja saber a tabuada: ");
        int numero = s.nextInt();

        for (int i = 1; i <= 10 ; i++) {

            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }
        s.close();
    }
}
