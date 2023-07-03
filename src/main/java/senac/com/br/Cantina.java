package senac.com.br;

import java.util.Scanner;

public class Cantina {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int fome, dinheiro;
        System.out.println("Voce está com fome?" +
                "/n1- Sim"+
                "/n2- Não");
        fome = entrada.nextInt();
        System.out.println("tem dinheiro" +
                "/n1- Sim" +
                "/n2- Não");
        dinheiro = entrada.nextInt();
        if (fome == 1 && dinheiro == 1){
            System.out.println("Vá para cantina!");
        } else if (fome == 1 && dinheiro == 2){
            System.out.println("Trabalhar que é bom nada.");
        } else if (fome == 2 && dinheiro == 1){
            System.out.println("Guarde o dinheiro");
        } else if (fome == 2 && dinheiro == 2){
            System.out.println("Vá caçar oque fazer.");

    }

}
}
