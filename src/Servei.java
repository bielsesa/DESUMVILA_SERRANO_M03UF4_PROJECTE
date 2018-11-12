import java.util.ArrayList;

public abstract class Servei {
    private double quotaTotal = 0;
    private ArrayList<Usuari> llistaUsuaris;
    private ArrayList<Monitor> llistaMonitors;
    protected String nomServei;
    protected double quotaServei;

    // GETTERS & SETTERS

    public double getQuotaTotal() {
        return quotaTotal;
    }

    public ArrayList<Usuari> getLlistaUsuaris() {
        return llistaUsuaris;
    }

    public ArrayList<Monitor> getLlistaMonitors() {
        return llistaMonitors;
    }

    public String getNomServei() {
        return nomServei;
    }

    public void setNomServei(String nomServei) {
        this.nomServei = nomServei;
    }

    public double getQuotaServei() {
        return quotaServei;
    }

    public void setQuotaServei(double quotaServei) {
        this.quotaServei = quotaServei;
    }

    // METHODS
    @Override
    public String toString() {
        return "Servei: " + nomServei + System.lineSeparator() +
                "Quota servei: " + quotaServei + System.lineSeparator() +
                "Usuaris apuntats a aquest servei: " + llistaUsuaris + System.lineSeparator() +
                "Llista de monitors que donen aquest servei: " + llistaMonitors + System.lineSeparator();
    }

    public void afegirUsuari (Usuari u) { llistaUsuaris.add(u); }

    public void afegirMonitor (Monitor m) { llistaMonitors.add(m); }

    private void obtenirCuota () { quotaTotal += quotaServei; }
}
