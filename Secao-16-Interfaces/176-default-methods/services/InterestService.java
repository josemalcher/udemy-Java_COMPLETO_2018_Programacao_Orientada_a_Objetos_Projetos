package services;

import java.security.InvalidParameterException;

/**
 * Esta interface define o contrato para um serviço de cálculo de juros.
 * A partir do Java 8, ela pode conter não apenas assinaturas de métodos
 * abstratos, mas também métodos com uma implementação padrão (default).
 */
public interface InterestService {

    /**
     * Este é um método abstrato normal. Toda classe que implementar
     * InterestService SERÁ OBRIGADA a fornecer uma implementação para ele.
     * @return a taxa de juros (ex: 0.02 para 2%).
     */
    double getInterestRate();


    /**
     * Este é um DEFAULT METHOD.
     * Ele já contém uma implementação padrão que será usada por qualquer
     * classe que implemente a interface, a menos que a classe decida
     * sobrescrevê-lo (criar sua própria versão).
     * <p>
     * VANTAGEM: Se no futuro precisarmos adicionar este método 'payment',
     * as classes que já existiam e implementavam 'InterestService' não
     * quebrarão. Elas simplesmente herdarão esta implementação padrão.
     *
     * @param amount O valor sobre o qual os juros serão calculados.
     * @param months A quantidade de meses.
     * @return O valor total a ser pago após a aplicação de juros compostos.
     */
    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        // A implementação padrão usa juros compostos.
        return amount * Math.pow(1.0 + getInterestRate(), months);
    }

}
