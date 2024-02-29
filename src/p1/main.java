package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src//p1//judete_in.txt"));
            String line;
            int numLines = 0;
            while ((line = reader.readLine()) != null) {
                numLines++;
            }
            String[] judete = new String[numLines];
            reader.close();
            reader = new BufferedReader(new FileReader("src//p1//judete_in.txt"));
            int index = 0;
            while ((line = reader.readLine()) != null) {
                judete[index++] = line;
            }
            reader.close();

            Arrays.sort(judete);

            System.out.println("Județele ordonate:");
            for (String judet : judete) {
                System.out.println(judet);
            }

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("\nIntroduceti județul de căutat: ");
            String judetCautat = scanner.nextLine();
            int pozitie = Arrays.binarySearch(judete, judetCautat);

            if (pozitie >= 0) {
                System.out.println("Județul " + judetCautat + " se află pe poziția " + (pozitie + 1) + " în lista ordonată.");
            } else {
                System.out.println("Județul " + judetCautat + " nu a fost găsit în lista ordonată.");
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fișier: " + e.getMessage());
        }
    }
}