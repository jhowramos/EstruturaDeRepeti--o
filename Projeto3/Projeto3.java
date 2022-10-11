package Projeto3;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */



public class Projeto3 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome maior que 3 caracteres");
        String nome = ler.nextLine();
        while(nome.length()<3){
            System.out.println("Digite um nome maior que 3 caracteres");
            nome = ler.nextLine();
        }
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();
        while(idade > 150 || idade < 0){
            System.out.println("Digite sua idade novamente:");
            idade = ler.nextInt();
        }
        System.out.println("Digite seu salário:");
        double salario = ler.nextDouble();
        while(salario <= 0){
            System.out.println("Digite seu salário novamente:");
            salario = ler.nextDouble();
        }
        System.out.println("Digite seu sexo: 'f' ou 'm'");
        char sexo = ler.next().charAt(0);
        while(sexo != 'm' && sexo != 'f'){
            System.out.println("Digite seu sexo novamente:");
            sexo = ler.next().charAt(0);
        }
        System.out.println("Digite seu estado civil: 's', 'c', 'v', 'd': ");
        char estadoCivil = ler.next().charAt(0);
        while(estadoCivil != 's' && sexo != 'c'&& sexo != 'v'&& sexo != 'd'){
            System.out.println("Digite seu estado civil novamente: 's', 'c', 'v', 'd'");
            estadoCivil = ler.next().charAt(0);

    }
    ler.close();
    }
}