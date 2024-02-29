package p1;
import java.util.*;

public class main {
    public static void main(String[] args) {

        int i = 0;
        String nume_fis = "\\src\\p1\\judete_in.txt";
        Scanner in = new Scanner(nume_fis);
        String[] judete = new String [41];

        while(in.hasNext())
        {
            judete[i] = in.nextLine();
            i = i + 1;
        }

        Arrays.sort(judete,0,i-1);

        Scanner scanner = new Scanner(System.in);
        String judet_cautat;
        System.out.print("Dati judetul: ");
        judet_cautat = scanner.toString();

        System.out.println();
        int poz = Arrays.binarySearch(judete, judet_cautat);
        System.out.println("Judetul cautat se afla pe pozitia: " + poz);

    }
}
