package com.Projektas1.KlasesDarbai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileCars {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("cars.txt"))){
            String line;
            double bestCarAvg = 0;
            String pavadinimas;
            while ((line = bf.readLine()) != null){
                String[] elements = line.split(" ");
                double average = KlasesUzduotis5.average(Double.parseDouble(elements[1]), Double.parseDouble(elements[2]));
                if (bestCarAvg == 0 || bestCarAvg > average){
                    bestCarAvg = average;
                    pavadinimas = elements[0];
                }
                System.out.println(elements [0] + " " + average);
                //System.out.println(line);
            }
            //System.out.println("Optimaliausias automobilis " + pavadinimas + " " + bestCarAvg);
        } catch (IOException e){
            System.out.println("Failo Nuskaityti nepavyko");
        }
    }
}
