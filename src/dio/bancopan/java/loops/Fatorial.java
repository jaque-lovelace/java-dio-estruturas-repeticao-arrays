package dio.bancopan.java.loops;

import java.util.Scanner;

/*Faça um  programa que calcule o fatorial de um número inteiro dado pela entrada do usuario*/
public class Fatorial {

    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);

        System.out.println("Entre com um número para calcular o fatorial: ");
        int numero = s.nextInt();

        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;

        }
        System.out.println(numero + "! = " + fatorial);



    }
}
