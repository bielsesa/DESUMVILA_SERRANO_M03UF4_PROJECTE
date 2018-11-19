public class ServeiClasseDirigida extends Servei {
    private Classe nomClasse;

    // CONSTRUCTORS

    public ServeiClasseDirigida(Classe nomClasse) {
        this.quotaServei = 30.;
        this.nomServei = "Classe de" + nomClasse;
        this.nomClasse = nomClasse;
    }

    // METHODS

    @Override
    public void anunciServei() {
        System.out.println("Apunta't a les nostres classes dirigides! Tens una gran quantitat d'opcions," +
                "entre elles " + Classe.Aerobic + ", " + Classe.Ioga + " o " + Classe.Steps + ".");
    }

    // GETTERS & SETTERS

    public Classe getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(Classe nomClasse) {
        this.nomClasse = nomClasse;
    }
}
