public class SalaMaquines extends Sala {
    private int numMaquines;

    // CONSTRUCTORS

    public SalaMaquines(int numMaquines, int numPis, String idSala, int aforamentMaxim) {
        this.numPis = numPis;
        this.idSala = idSala;
        this.aforamentMaxim = aforamentMaxim;
        this.numMaquines = numMaquines;
    }

    // GETTERS & SETTERS

    public int getNumMaquines() {
        return numMaquines;
    }

    public void setNumMaquines(int numMaquines) {
        this.numMaquines = numMaquines;
    }
}
