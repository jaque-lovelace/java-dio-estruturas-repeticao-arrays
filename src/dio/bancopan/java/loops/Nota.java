package dio.bancopan.java.loops;

import java.util.Scanner;
/*Faça um programa que rceba uma nota entre zero e dez e mostre uma mensagme caso o
valor seja inválido e continue pedindo até que o usuário infome um valor válido*/
public class Nota {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float nota;

        do {
            System.out.print("Informe a nota (entre 0 e 10): ");
            nota = entrada.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            } else {
                System.out.printf("Nota informada: %.1f\n", nota);
            }
        } while (nota < 0 || nota > 10);

        entrada.close();
    }
}
