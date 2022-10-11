package Projeto2;

import java.util.Scanner;

public class Projeto2 {
/*
     * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
     * senha igual ao nome do usuário,
     * mostrando uma mensagem de erro e voltando a pedir as informações.
     */
    public static void main(String[] args) {
        String usuario = "";
        String senha = "";

        do {
            System.out.println("Digite um usuário: ");
            Scanner ler = new Scanner(System.in);
            usuario = ler.nextLine();
            System.out.println("Digite uma senha: ");
            senha = ler.nextLine();

        if (!usuario.equals(senha)) {
        break;
        } else {
        System.out.println("Usuario e Senha nao podem ser iguais ");
        }
        } while (usuario.equals(senha));
        }}