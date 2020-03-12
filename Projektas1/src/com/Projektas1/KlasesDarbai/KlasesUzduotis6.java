package com.Projektas1.KlasesDarbai;

import java.util.List;
import java.util.Scanner;

public class KlasesUzduotis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> galimiVeiksmai = List.of('/', '+', '-', '*');

        System.out.print("Įveskite veiksmą: ");
        String veiksmas = patikra(sc);
        arKlaida(veiksmas);
        String[] veiksmasSplit = veiksmas.split(" ");
        if (veiksmasSplit.length != 3) arKlaida("klaida");
        if (veiksmasSplit[1].length() != 1) arKlaida("klaida");
        if (galimiVeiksmai.contains(veiksmasSplit[1])) arKlaida("klaida");
        if (veiksmasSplit[1] == "/"){
            if (veiksmasSplit[2] == "0") arKlaida("klaida");
        }





    }

    public static String patikra(Scanner sc){
        String veiksmas = sc.nextLine();
        int veiksmuSkaicius = 0;
        List<Character> galimaIvestis = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '/', '+', '-', '*');
        char[] simboliai = new char[veiksmas.length()];

        for (int i = 0; i < veiksmas.length(); i++) {
            simboliai[i] = veiksmas.charAt(i);
            if (!galimaIvestis.contains(simboliai[i]))
                return "klaida";
            if (simboliai[i] == '/' || simboliai[i] == '+' || simboliai[i] == '-' || simboliai[i] == '*'){
                veiksmuSkaicius++;
                if (veiksmuSkaicius > 1) return "klaida";
            }
        }
        return veiksmas;
    }
    public static void arKlaida(String textas){
        if (textas == "klaida") {
            System.out.println("Įvesties klaida!");
        }
    }
    public static int plius(int pirmas, int antras){
        return pirmas + antras;
    }
    public static int minus(int pirmas, int antras){
        return pirmas - antras;
    }
    public static int daugint(int pirmas, int antras){
        return pirmas * antras;
    }
    public static int dalint(int pirmas, int antras){
        return pirmas / antras;
    }
}
