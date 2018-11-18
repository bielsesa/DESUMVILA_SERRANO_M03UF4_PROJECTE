import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Monitor extends Persona implements  ClasseDirigida{
    private int numMonitor;
    private double sou;
    private GregorianCalendar dataContractacio;
    private GregorianCalendar dataAcomiadament;
    private String descClaseMaq;
    private String descClasePisc;
    private String descClaseDir;
    private ArrayList<Servei> llistaServeisM;

    // CONSTRUCTORS

    public Monitor(String nom, String cognom1, String cognom2, int numMonitor, double sou,
                   GregorianCalendar dataContractacio, GregorianCalendar dataAcomiadament) {
        super(nom, cognom1, cognom2);
        this.numMonitor = numMonitor;
        this.sou = sou;
        this.dataContractacio = dataContractacio;
        this.dataAcomiadament = dataAcomiadament;
    }

    public Monitor(String nom, String cognom1, String cognom2, String DNI, int numMonitor, double sou, GregorianCalendar dataContractacio, GregorianCalendar dataAcomiadament) {
        super(nom, cognom1, cognom2, DNI);
        this.numMonitor = numMonitor;
        this.sou = sou;
        this.dataContractacio = new GregorianCalendar(); // Genera la data del moment en el que es crea l'objecte.
        this.dataAcomiadament = null; // En principi, quan es crea l'objecte encara no se sap la data d'acomiadament.
    }

    // METHODS

    @Override
    public String toString() {
        return "Informació monitor num." + numMonitor + ":" +
                super.toString();
    }

    @Override
    public void plaClasseMaquina() {
        System.out.println(descClaseMaq);
    }

    @Override
    public void plaClassePiscina() {
        System.out.println(descClasePisc);
    }

    @Override
    public void plaClasseDirigida() {
        System.out.println(descClaseDir);
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

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public String getDescClaseMaq() {
        return descClaseMaq;
    }

    public void setDescClaseMaq(String descClaseMaq) {
        this.descClaseMaq = descClaseMaq;
    }

    public String getDescClasePisc() {
        return descClasePisc;
    }

    public void setDescClasePisc(String descClasePisc) {
        this.descClasePisc = descClasePisc;
    }

    public String getDescClaseDir() {
        return descClaseDir;
    }

    public void setDescClaseDir(String descClaseDir) {
        this.descClaseDir = descClaseDir;
    }
}
