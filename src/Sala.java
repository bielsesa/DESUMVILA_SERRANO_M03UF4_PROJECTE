import java.util.ArrayList;

public abstract class Sala {
    protected int numPis;
    protected String idSala;
    protected int aforamentMaxim;
    protected ArrayList<Material> material;

    // GETTERS & SETTERS
    public int getNumPis() {
        return numPis;
    }

    public void setNumPis(int numPis) {
        this.numPis = numPis;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public int getAforamentMaxim() {
        return aforamentMaxim;
    }

    public void setAforamentMaxim(int aforamentMaxim) {
        this.aforamentMaxim = aforamentMaxim;
    }

    // METHODS
    @Override
    public String toString() {
        return "Sala: " + idSala + System.lineSeparator() +
                "Pis: " + numPis + System.lineSeparator() +
                "Aforament màxim: " + aforamentMaxim + System.lineSeparator();
    }
}
