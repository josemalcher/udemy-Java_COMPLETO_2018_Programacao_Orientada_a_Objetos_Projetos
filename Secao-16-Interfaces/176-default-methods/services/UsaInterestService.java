package services;

public class UsaInterestService implements InterestService{
    private final double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    // A classe sobrescreve (overrides) a implementação padrão.
    // Quando payment() for chamado em um objeto UsaInterestService,
    // ESTA versão será executada, e não a da interface.
    @Override
    public double payment(double amount, int months) {
        // Implementação customizada com juros simples
        return amount + (amount * interestRate * months);
    }
}
