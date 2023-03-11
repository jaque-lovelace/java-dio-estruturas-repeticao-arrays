package dio.bancopan.java.loops;

import java.util.Scanner;

/*faça um programa que leia 5 números e informe o maior, o menor e a média*/
public class NotaMedia {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = s.nextInt();
            soma += numero;

            maior = (numero > maior) ? numero : maior;
            menor = (numero < menor) ? numero : menor;

        }

        media = (double) soma / 5;

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média dos números é " + media);

        s.close();
    }

}

