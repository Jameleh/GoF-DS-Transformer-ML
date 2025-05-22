public abstract class Pessoa {

    private float income;

    public abstract float calculateTax();

    public abstract String description();

    public String taxReport() {
        return "Imposto para " + description() + ": " + calculateTax() + ".";
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
}
