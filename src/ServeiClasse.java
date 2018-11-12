public class ServeiClasse extends Servei {
    private Classe nomClasse;

    // GETTERS & SETTERS
    public Classe getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(Classe nomClasse) {
        this.nomClasse = nomClasse;
    }

    // CONSTRUCTORS
    public ServeiClasse(Classe nomClasse) {
        this.quotaServei = 30.;
        this.nomServei = "Classe de" + nomClasse;
        this.nomClasse = nomClasse;
    }
}
