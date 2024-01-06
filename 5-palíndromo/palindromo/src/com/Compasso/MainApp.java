package com.Compasso;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra que deseja para vereficar se é um palíndromo:");
        String entrada = scanner.nextLine();

        if(PalindromoChecker.verificarPalindromo(entrada)){
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }  
        scanner.close(); 
    }
}

