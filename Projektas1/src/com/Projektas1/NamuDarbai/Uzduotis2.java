package com.Projektas1.NamuDarbai;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti,
 * tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko.
 * Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
 */

public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Įveskite kiek skaičių norėsite įvesti: ");
        int masyvoIlgis = getCorrectValue(sc);
        int[] skaiciai = new int[masyvoIlgis];
        for (int i = 0; i < masyvoIlgis ; i++){
            System.out.print("Įveskite " + (i+1) + " skaičių masyve: ");
            skaiciai[i] = getCorrectValue(sc);
        }

        String skaiciuSeka = "";                // bus atspausdinami didesni nei 100 skaičiai.
        for (int i = 0; i < masyvoIlgis ; i++){
            if (skaiciai[i] > 100){
                skaiciuSeka += skaiciai[i] + " ";
            }
        }
        if (skaiciuSeka == ""){
            System.out.println("Nei vienas skaičius nebuvo didesnis už 100.");
        }
        else
        {
            System.out.println("Skaičiai didesni už 100: " + skaiciuSeka);
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
