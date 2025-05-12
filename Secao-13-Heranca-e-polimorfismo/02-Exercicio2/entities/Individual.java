package entities;

public class Individual extends TaxPayer{

    private Double helthExpenditures;

    public Individual(String name, Double anualIncome, Double helthExpenditures) {
        super(name, anualIncome);
        this.helthExpenditures = helthExpenditures;
    }

    public Double getHelthExpenditures() {
        return helthExpenditures;
    }

    public void setHelthExpenditures(Double helthExpenditures) {
        this.helthExpenditures = helthExpenditures;
    }

    @Override
    public double tax() {

        //double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        double basicTax;
        if (getAnualIncome() < 20000.0) {
            basicTax = getAnualIncome() * 0.15;
        }
        else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHelthExpenditures() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
