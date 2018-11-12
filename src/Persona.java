import java.util.ArrayList;

public abstract class Persona {
    protected String nom;
    protected String cognom1;
    protected String cognom2;
    protected String DNI;

    public Persona(String nom, String cognom1, String cognom2, String DNI) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Nom = " + nom + System.lineSeparator()  +
                "Cognoms ='" + cognom1 + " " + cognom2 + System.lineSeparator() +
                "DNI =" + DNI + ".";
    }

}
