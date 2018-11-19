import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuari extends Persona {
    private int numUsuari;
    private double quotaTotal = 0;
    private GregorianCalendar dataAlta;
    private GregorianCalendar dataBaixa;
    private ArrayList<Servei> llistaServeisU;
    private boolean alta; // Això ens indicarà si l'usuari està donat o no de alta.
    // Ho utilitzem perquè sempre guardarem les dades dels usuaris creats, de manera que si un usuari es dóna de baixa
    // però després vol tornar, ja tindrem les seves dades.

    // CONSTRUCTORS

    public Usuari(String nom, String cognom1, String cognom2, String DNI, int numUsuari) {
        super(nom, cognom1, cognom2, DNI);
        this.numUsuari = numUsuari;
        dataAlta = new GregorianCalendar(); // Crea la data d'alta amb la data en la que s'instancia l'objecte
        dataBaixa = null; // Quan es crea l'usuari encara no sabem la data exacta en la que es donara de baixa.
        llistaServeisU = new ArrayList<>(); // Es crea la llista de serveis que tindra l'usuari, però s'afegiran mes tard.
        alta = true; // En principi, quan es crea un usuari es perquè es dóna de alta al gimnàs.
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

    private void obtenirCuota () {
        for (int i = 0; i < llistaServeisU.size(); i++) {
            quotaTotal += (llistaServeisU.get(i)).getQuotaServei();
        }
    }

    public void donarAltaoBaixa (boolean aob) {
        alta = aob;
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

    public double getQuotaTotal() {
        return quotaTotal;
    }
}
