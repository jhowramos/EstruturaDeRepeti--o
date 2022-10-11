package Projeto1;

import java.util.Scanner;

public class Projeto1 {
    public static void main (String[] args){
        int nota = -1;
        while(nota<0 || nota>10){
            System.out.println("Digite uma nota de 0 a 10:");
            Scanner ler = new Scanner (System.in);
            int nota1 = ler.nextInt();
            if(nota1>=0 && nota1<=10){
                break;
            }
        }

    }
}
