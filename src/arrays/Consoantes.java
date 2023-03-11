package arrays;

import java.util.Scanner;

/*faça um programa que leia um vetor de 6 caracteres
e diga qunatas consoantes foram lidas. Imprima as consoantes*/
public class Consoantes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char [] consoante = new char[6];
        int letrasConsoantes = 0;

        System.out.println("Entre com a letra desejada");
        for (int i = 0; i < consoante.length; i++) {
            char letra = s.next().charAt(0);

            if (!(letra == 'a' || letra == 'e' || letra ==  'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra ==  'I' || letra == 'O' || letra == 'U'))
            {
                consoante[i] = letra;
                letrasConsoantes++;
            }


        }
        System.out.println("Foram lidas " + letrasConsoantes + " consoantes:");
        for (int i = 0; i < consoante.length; i++) {
            if (consoante[i] != '\u0000'){
                System.out.print(consoante[i] + " ");
            }

        }




    }
}
