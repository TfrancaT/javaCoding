package aula1080;

import java.util.Scanner;

public class par_impar {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int checkNumber;
    
        System.out.println("Digite um número: ");
        checkNumber = sc.nextInt();
            if(checkNumber % 2 == 0) {
                System.out.println("Esse é um número par: " + checkNumber);
            } else {
                System.out.println("É impar: " + checkNumber);
            }     
    }
}
