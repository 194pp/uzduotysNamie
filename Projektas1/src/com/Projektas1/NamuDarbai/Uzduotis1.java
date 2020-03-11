package com.Projektas1.NamuDarbai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite skaičių: ");
        int skaicius = getCorrectValue(sc);
        if(skaicius%2==0){
            System.out.println("Skaičius " + skaicius + " yra lyginis!");
        }
        else System.out.println("Skaičius " + skaicius + " yra nelyginis!");
        
    }
    private static int getCorrectValue(Scanner scanner) {
        while (true) {
            try {
                int result = scanner.nextInt();
                return result;
            } catch (InputMismatchException e) {
                System.out.print("Blogai įvestą skaičių pakartokite: ");
                scanner.nextLine();
            }
        }
    }
}
