package aula1080;

import java.util.Scanner;

public class calculatorOption {
    public static void main(String[] args) {
        
        int numberUser, userOption, numberA;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numberUser = sc.nextInt();
        System.out.println("Qual operação deseja?");
        System.out.println("(1) - Soma; (2) - Subtração; (3) - Multiplicação; (4) - Divisão");
        userOption = sc.nextInt();
        
            switch(userOption){
                case 1:
                    System.out.println("Soma:");
                    System.out.println("Informe o segundo número: ");
                    numberA = sc.nextInt();
                    System.out.println("Resultado: " + (numberUser + numberA));
                    break;
                case 2:
                    System.out.println("Subtração:");
                    System.out.println("Informe o segundo número: ");
                    numberA = sc.nextInt();
                    System.out.println("Resultado: " + (numberUser - numberA));
                    break;
                case 3:
                    System.out.println("Multiplicação:");
                    System.out.println("Informe o segundo número: ");
                    numberA = sc.nextInt();
                    System.out.println("Resultado: " + (numberUser * numberA));
                    break;
                case 4:
                    System.out.println("Divisão:");
                    System.out.println("Informe o segundo número: ");
                    numberA = sc.nextInt();
                    System.out.println("Resultado: " + (numberUser / numberA));
                    break;
                    
            }
    }
}
