package p2;

import java.io.*;
import java.util.Random;

class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public int numarCuvinte() {
        return vers.split("\\s+").length;
    }

    public int numarVocale() {
        return (int) vers.chars().filter(c -> "aeiouăAEIOUĂ".indexOf(c) != -1).count();
    }

    public String formatVers() {
        StringBuilder sb = new StringBuilder();
        sb.append(vers);
        sb.append(" (").append(numarCuvinte()).append(" cuvinte, ").append(numarVocale()).append(" vocale)");

        Random rand = new Random();
        if (rand.nextDouble() < 0.1) {
            sb.append(" *");
        }

        return sb.toString();
    }

    public String versInitial() {
        return vers;
    }

    public String versMajuscule() {
        return vers.toUpperCase();
    }
}

public class mainapp {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src//p2//cantec_in.txt"));
            String line;
            Vers[] versuri = new Vers[100];
            int index = 0;
            while ((line = reader.readLine()) != null) {
                versuri[index++] = new Vers(line);
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("src//p2//cantec_out.txt"));
            for (int i = 0; i < index; i++) {
                String formattedLine = versuri[i].formatVers();
                writer.write(formattedLine);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Eroare la citire/scriere: " + e.getMessage());
        }
    }
}