public class GestorFinances {
    private double liquidBancari = 0;
    private double totalIngresos;
    private double totalDespeses;
    private double costAigua;
    private double costElectricitat;
    private double costComunicacions;
    private double costGas;

    // METHODS

    private void calculLiquidBancari () {
        liquidBancari = 0;
    }

    private void calculIngresos () {
        totalIngresos = 0;
    }

    private void calculDespeses () {
        totalDespeses = 0;
    }

    // GETTERS & SETTERS

    public double getCostAigua() {
        return costAigua;
    }

    public void setCostAigua(double costAigua) {
        this.costAigua = costAigua;
    }

    public double getCostElectricitat() {
        return costElectricitat;
    }

    public void setCostElectricitat(double costElectricitat) {
        this.costElectricitat = costElectricitat;
    }

    public double getCostComunicacions() {
        return costComunicacions;
    }

    public void setCostComunicacions(double costComunicacions) {
        this.costComunicacions = costComunicacions;
    }

    public double getCostGas() {
        return costGas;
    }

    public void setCostGas(double costGas) {
        this.costGas = costGas;
    }

    public double getLiquidBancari() {
        return liquidBancari;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public double getTotalDespeses() {
        return totalDespeses;
    }
}
