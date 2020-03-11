package com.Projektas1.NamuDarbai;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0.
 * Pabaigoje turi būti atvaizduojama įvestų skaičių suma.
 * Skaičiavimas turi būti atliekamas kitame metode.
 */

public class Uzduotis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = 1;

        while (inputNumber != 0){
            System.out.print("Įveskite skaičių: ");
            inputNumber = getCorrectValue(sc);


        }


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
