package Projeto5;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
Valide a entrada e permita repetir a operação.
 */
public class Projeto5 {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite a quantidade de Habitantes A: ");
        Double paisHabitantesA = ler.nextDouble();
        System.out.println("Digite a quantidade de Habitantes B: ");
        Double paisHabitantesB = ler.nextDouble();
        System.out.println("Digite a taxa de crescimento A: ");
        Double taxaDeCrescimentoAnualA = ler.nextDouble();
        System.out.println("Digite a taxa de crescimento B: ");
        Double taxaDeCrescimentoAnualB = ler.nextDouble();
        int anos = 0;
        while(paisHabitantesA < paisHabitantesB){
            //System.out.println("#### Populações no ano "+ anos);
            //System.out.println("Habitantes de A: "+ paisHabitantesA);
            //System.out.println("Habitantes de B: "+ paisHabitantesB);
            anos += 1;
            paisHabitantesA = paisHabitantesA * taxaDeCrescimentoAnualA;
            paisHabitantesB *= taxaDeCrescimentoAnualB;
        }
        System.out.println("#### Populações no ano "+ anos);
        System.out.println("Habitantes de A: "+ paisHabitantesA.intValue());
        System.out.println("Habitantes de B: "+ paisHabitantesB.intValue());
        ler.close();

    }
    
}
