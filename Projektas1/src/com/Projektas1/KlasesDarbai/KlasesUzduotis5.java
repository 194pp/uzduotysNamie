package com.Projektas1.KlasesDarbai;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Antanas nusprendė nusipirkti naują automobilį ir jam svarbus rodiklis yra kuro sąnaudos.
 * Padėkite Antanui ir realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100 km.
 * Programa turi paprašyti Antano įvesti nuvažiuotus km ir kuro sąnaudas.
 * Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo. Vidurkio skaičiavimas vykdomas kitame metode.
 * Programa negali sustoti jei Antanas per klaidą įves tekstą, ji tu vėl prašyti pakartoti įvedimą.
 * Programa baigia darbą kai vidurkis apskaičiuotas sėkmingai.
 */

public class KlasesUzduotis5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KlasesUzduotis5 klasesUzduotis5 = new KlasesUzduotis5();
        System.out.print("Iveskite nuvaziuota atstuma:");
        double atstumas = klasesUzduotis5.getValue(sc);
        System.out.print("Ivesk kuro sanaudas:");
        double sanaudos = klasesUzduotis5.getValue(sc);
        System.out.println("Vidurkis yra :" + klasesUzduotis5.average(atstumas, sanaudos));

    }

    private double average(double nuvaziuotasAtstumas, double kuroSanaudos){
        return (kuroSanaudos * 100)/nuvaziuotasAtstumas;
    }

    private double getValue(Scanner sc){
        Double value = null;
        while(value!=null){
            try{
                value = sc.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Neteisinga reiksme, pakartoti");
                sc.nextLine();
            }
        }
    }
}
