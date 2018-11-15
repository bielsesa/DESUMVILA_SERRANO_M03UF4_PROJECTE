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
        System.out.println("");
    }

    // GETTERS & SETTERS

    public Classe getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(Classe nomClasse) {
        this.nomClasse = nomClasse;
    }

}
