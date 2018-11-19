public class ServeiMaquina extends Servei {

    // CONSTRUCTORS

    public ServeiMaquina() {
        this.quotaServei = 35.;
        this.nomServei = "Servei de màquines";
    }

    // GETTERS & SETTERS

    @Override
    public void anunciServei() {
        System.out.println("Si vols un lloc perfecte per entrenar el teu cos i ànima, possa a prova els teus músculs" +
                "a la nostra sal");
    }
}
