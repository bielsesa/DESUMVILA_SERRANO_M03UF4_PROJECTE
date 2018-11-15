public class SalaPiscina extends Sala {
    private int numMetresLlarg;
    private int numMetresProf;
    private boolean esInterior;

    // CONSTRUCTORS

    public SalaPiscina(int numMetresLlarg, int numMetresProf, int numPis, String idSala, int aforamentMaxim) {
        this.numPis = numPis;
        this.idSala = idSala;
        this.aforamentMaxim = aforamentMaxim;
        this.numMetresLlarg = numMetresLlarg;
        this.numMetresProf = numMetresProf;
        // L'usuari haura d'especificar (posteriorment a la creació) amb setters si la piscina es interior o exterior.
        esInterior =  false;
    }

    // METHODS

    @Override
    public String toString() {
        String salaPiscina = "Número de metres de llarg: " + numMetresLlarg + System.lineSeparator() +
                "Número de metres de profunditat: " + numMetresProf + System.lineSeparator()
                , tipusPiscina = "";
        if (esInterior)
            tipusPiscina = "Aquesta piscina és interior.";
        else if (!esInterior)
            tipusPiscina = "Aquesta piscina és exterior.";
        else
            tipusPiscina = "No s'ha indicat si aquesta piscina és interior o exterior.";

        return super.toString() + salaPiscina + tipusPiscina;
    }

    // GETTERS & SETTERS

    public int getNumMetresLlarg() {
        return numMetresLlarg;
    }

    public void setNumMetresLlarg(int numMetresLlarg) {
        this.numMetresLlarg = numMetresLlarg;
    }

    public int getNumMetresProf() {
        return numMetresProf;
    }

    public void setNumMetresProf(int numMetresProf) {
        this.numMetresProf = numMetresProf;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }
}
