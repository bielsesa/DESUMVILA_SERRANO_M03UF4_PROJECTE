import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuari extends Persona {
    private int numUsuari;
    private GregorianCalendar dataAlta;
    private GregorianCalendar dataBaixa;
    private ArrayList<Servei> llistaServeisU;

    // CONSTRUCTORS
    public Usuari(String nom, String cognom1, String cognom2, String DNI, int numUsuari) {
        super(nom, cognom1, cognom2, DNI);
        this.numUsuari = numUsuari;
        dataAlta = new GregorianCalendar(); // Crea la data d'alta amb la data en la que s'instancia l'objecte
        dataBaixa = null; // Quan es crea l'usuari encara no sabem la data exacta en la que es donara de baixa.
        llistaServeisU = new ArrayList<>(); // Es crea la llista de serveis que tindra l'usuari, però s'afegiran mes tard.
    }

    // GETTERS & SETTERS
    public int getNumUsuari() {
        return numUsuari;
    }

    public void setNumUsuari(int numUsuari) {
        this.numUsuari = numUsuari;
    }

    public GregorianCalendar getDataAlta() {
        return dataAlta;
    }

    public ArrayList<Servei> getLlistaServeisU() {
        return llistaServeisU;
    }

    public GregorianCalendar getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(GregorianCalendar dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    // METHODS
    @Override
    public String toString() {
        return "Informació usuari num." + numUsuari + ":" +
                super.toString();
    }

    public void afegirServeiU (Servei s) {
        llistaServeisU.add(s);
    }
}
