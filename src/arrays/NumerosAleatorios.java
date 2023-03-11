package arrays;

import java.util.Random;
import java.util.Scanner;

/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
* armazene-os num vetor e ao final mostre os números e os seus sucessores*/
public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int [] numeros = new int [20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        System.out.print("Números aleatórios: ");
        for ( int numero: numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nNúmeros sucessores aleatórios: ");
        for ( int numero: numeros) {
            System.out.print((numero + 1) + " ");
        }

    }
}
