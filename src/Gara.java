import java.util.ArrayList;

public class Gara {
    private ArrayList<Cavallo> cavalli;
    private int lunghezza;
    private boolean finita;

    public Gara(int lunghezza, ArrayList<Cavallo> cavalli) {
        this.lunghezza = lunghezza;
        this.cavalli = cavalli;
        this.finita = false;
    }

    public void start() {
        int ciclo = 0;

        while (!finita) {
            ciclo++;
            System.out.println("\n--- Ciclo " + ciclo + " ---");

            for (Cavallo c : cavalli) {
                c.avanza(5); // Tutti avanzano di 5 metri
                System.out.println(c.getNome() + " è a " + c.getPosizione() + " metri.");

                if (c.getPosizione() >= lunghezza) {
                    finita = true;
                }
            }
        }

        mostraRisultati();
    }

    private void mostraRisultati() {
        System.out.println("\n🏁 La gara è finita! Risultati finali:");

        int max = 0;
        for (Cavallo c : cavalli) {
            if (c.getPosizione() > max) {
                max = c.getPosizione();
            }
        }

        for (Cavallo c : cavalli) {
            if (c.getPosizione() >= lunghezza && c.getPosizione() == max) {
                System.out.println("🥇 Vincitore: " + c.getNome());
            }
        }
    }
}

