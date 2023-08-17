package exercicios;

import java.util.Scanner;

public class e17p148 {
    
    public static void main(String[] args){
        int canal = 0, a1, a2, a3, a4, i, total = 0;
        i = 0;
        a1 = 0;//canal 4
        a2 = 0;//canal 5
        a3 = 0;//canal 7
        a4 = 0;//canal 12
        
        Scanner console;
        console = new Scanner(System.in);
        
        while(i <= 0){
            System.out.println("Qual é o canal que esta sendo assistido? ");
            System.out.println(" 4  5  7  12 ");
            System.out.println("Ou precione 0 para sair");
            canal = console.nextInt();
            
                switch (canal) {
                    case 4:
                        a1++;
                        total++;
                        break;
                    case 5:
                        a2++;
                        total++;
                        break;
                    case 7:
                        a3++;
                        total++;
                        break;
                    case 12:
                        a4++;
                        total++;
                        break;
                    case 0:
                        i++;
                        break;
                    default:
                        break;
                }
        }
        System.out.println("Total de votos: " + total);
        System.out.println("A porcentagem do canal 4 é: " + (float)(a1/total) * 100 + "%%");
        System.out.println("A porcentagem do canal 5 é: " + (float)(a2/total) * 100 + "%%");
        System.out.println("A porcentagem do canal 7 é: " + (float)(a3/total) * 100 + "%%");
        System.out.println("A porcentagem do canal 12 é: " + (float)(a4/total) * 100 + "%%");
    }
}