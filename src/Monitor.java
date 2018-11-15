import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Monitor extends Persona{
    private int numMonitor;
    private GregorianCalendar dataContractacio;
    private GregorianCalendar dataAcomiadament;
    private ArrayList<Servei> llistaServeisM;

    // CONSTRUCTORS

    public Monitor(String nom, String cognom1, String cognom2, String DNI, int numMonitor) {
        super(nom, cognom1, cognom2, DNI);
        this.numMonitor = numMonitor;
        dataContractacio = new GregorianCalendar(); // Genera la data del moment en el que es crea l'objecte.
        dataAcomiadament = null; // En principi, quan es crea l'objecte encara no se sap la data d'acomiadament.
    }

    // METHODS

    @Override
    public String toString() {
        return "Informació monitor num." + numMonitor + ":" +
                super.toString();
    }

    public void afegirServeiM (Servei s) {
        llistaServeisM.add(s);
    }

    // GETTERS & SETTERS

    public int getNumMonitor() {
        return numMonitor;
    }

    public void setNumMonitor(int numMonitor) {
        this.numMonitor = numMonitor;
    }

    public GregorianCalendar getDataContractacio() {
        return dataContractacio;
    }

    public GregorianCalendar getDataAcomiadament() {
        return dataAcomiadament;
    }

    public void setDataAcomiadament(GregorianCalendar dataAcomiadament) {
        this.dataAcomiadament = dataAcomiadament;
    }

    public ArrayList<Servei> getLlistaServeisM() {
        return llistaServeisM;
    }

}
