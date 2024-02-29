package p1;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class main {
    public static void afisare(String []judete)
    {
        for(int i = 0; i< judete.length; i++)
        {
            System.out.println(judete[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int i = 0;
        String nume_fis = "\\src\\p1\\judete_in.txt";
        Scanner in = new Scanner(nume_fis);
        String[] judete = new String [70];
        while(in.hasNext())
        {
            judete[i] = in.toString();
            i = i + 1;
        }
        Arrays.sort(judete);
        Scanner scanner = new Scanner(System.in);
        String judet_cautat;
        System.out.print("Dati judetul: ");
        judet_cautat = scanner.toString();
        System.out.println();
        int poz = Arrays.binarySearch(judete, judet_cautat);
        System.out.println("Judetul cautat se afla pe pozitia: " + poz);
    }
}
