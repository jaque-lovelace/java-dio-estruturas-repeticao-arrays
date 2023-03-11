package dio.bancopan.java.loops;

import java.util.Scanner;

/* faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e
o segundo representando a sua idade, pare o programa inserindo o valor 0 no campo nome*/
public class NomeIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o nome e idade do aluno (ou 0 para sair):");

        while (true) {

            nome = entrada.next();

            if (nome.equals("0")) {
                break;
            }

            idade = entrada.nextInt();

            System.out.println("Aluno: " + nome + ", Idade: " + idade);
            System.out.println("Digite o nome e idade do próximo aluno (ou 0 para sair):");
        }

        System.out.println("Programa encerrado.");


    }

}