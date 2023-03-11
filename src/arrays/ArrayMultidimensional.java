package arrays;

import java.util.Random;

/*Gere e imprima uma matriz M 4X5 com valores aleatórios entre 0 - 9*/
public class ArrayMultidimensional {
    public static void main(String[] args) {

        Random ramndom = new Random();
        
        int [][] M = new int [4][5];

        for (int i = 0; i < M.length ; i++) { // percorre a matriz toda pelas colunas
            for (int j = 0; j < M[i].length; j++) { //percorre as linhas pelas linhas
                M[i][j] = ramndom.nextInt(9);
            }
            
        }
        for ( int [] linha : M ) {
            for ( int coluna: linha ) {
                System.out.print(coluna + " ");
                
            }
            System.out.println();
        }
    }
}
