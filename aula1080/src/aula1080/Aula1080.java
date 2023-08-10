package aula1080;

import java.util.Scanner;

public class Aula1080 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        String nameUser;
        int ageUser;
        double noteUser;
        
        System.out.println("Seu nome: ");
        nameUser = sc1.next();
        System.out.println("Sua idade: ");
        ageUser = sc1.nextInt();
        System.out.println("Sua nota: ");
        noteUser = sc1.nextDouble();

        
        System.out.print("------------------\n");
        System.out.println("Nome: " + nameUser);
        System.out.println("Idade: " + ageUser);
        System.out.println("Nota: " + noteUser);
        System.out.print("------------------\n");
    }
    
}
