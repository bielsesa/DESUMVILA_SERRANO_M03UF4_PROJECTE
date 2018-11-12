public class SalaPolivalent extends Sala {
    private Classe nomClasse;

    // CONSTRUCTORS

    public SalaPolivalent(Classe nomClasse, int numPis, String idSala, int aforamentMaxim) {
        this.numPis = numPis;
        this.idSala = idSala;
        this.aforamentMaxim = aforamentMaxim;
        this.nomClasse = nomClasse;
    }

    // GETTERS & SETTERS

    public Classe getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(Classe nomClasse) {
        this.nomClasse = nomClasse;
    }
}
