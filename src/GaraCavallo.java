import java.util.ArrayList;
import java.util.Scanner;

public class GaraCavallo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inserimento lunghezza pista
        System.out.print("Inserisci la lunghezza del percorso (in metri): ");
        int lunghezza = input.nextInt();
        input.nextLine(); // Pulisce il buffer

        // Inserimento nomi cavalli
        ArrayList<Cavallo> cavalli = new ArrayList<>();
        System.out.println("\nInserisci i nomi dei 5 cavalli:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nome del cavallo " + i + ": ");
            String nome = input.nextLine();
            cavalli.add(new Cavallo(nome));
        }

        // Avvio della gara
        Gara gara = new Gara(lunghezza, cavalli);
        gara.start();

        input.close();
    }
}