package Projeto4;
/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento. */
public class Projeto4 {
    public static void main (String[]args){
        
        Double paisHabitantesA = 80000.00;
        Double paisHabitantesB = 200000.00;
        Double taxaDeCrescimentoAnualA = 1.03;
        Double taxaDeCrescimentoAnualB = 1.015;
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


    }
    
}
