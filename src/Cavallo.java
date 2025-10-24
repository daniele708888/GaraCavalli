public class Cavallo {
    private String nome;
    private int posizione;

    public Cavallo(String nome) {
        this.nome = nome;
        this.posizione = 0;
    }

    public void avanza(int metri) {
        posizione += metri;
    }

    public int getPosizione() {
        return posizione;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + posizione + " m)";
    }
}
