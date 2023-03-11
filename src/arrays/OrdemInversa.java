package arrays;
/*CRIE UM VETOR DE 6 NÚMEROS INTEIROS E MOSTRE-OS NA ORDEM INVERSA*/
public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {0, 1, 2, 3, 4, 5};

        int i;

        System.out.println("Vetor na ordem inversa: ");

        for (i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
}
