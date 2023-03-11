package dio.bancopan.java.loops;

import java.util.Scanner;

/*faça um programa que peça N numeros inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números ímpares*/
public class ParEImpar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int quantNumeros, numero, pares = 0, impares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = s.nextInt();

        for (int i = 0; i < quantNumeros; i++) {
            System.out.println("Digite um número inteiro: ");
            numero = s.nextInt();

            if(numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }

        }
        System.out.println(pares + " número(s) são/é pare(s) e " + impares + " número(s) é/são ímpare(s).");
        s.close();
    }
}
