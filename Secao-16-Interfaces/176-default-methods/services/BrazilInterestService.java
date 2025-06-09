package services;


/**
 * Esta classe implementa o contrato.
 * Ela é OBRIGADA a implementar getInterestRate(), mas pode ESCOLHER
 * se quer usar o 'payment()' padrão ou criar o seu próprio.
 * Neste caso, ela usará o padrão.
 */
public class BrazilInterestService implements InterestService{

    private final double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
    // Nenhum método payment() foi escrito aqui. Isso significa que, ao chamar
    // payment() em um objeto BrazilInterestService, a implementação DEFAULT
    // da interface será executada.
}
