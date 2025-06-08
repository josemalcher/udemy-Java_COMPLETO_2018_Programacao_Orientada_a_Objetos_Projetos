package services;

/**
 * A INTERFACE que define o CONTRATO para um serviço de pagamento online.
 * Qualquer classe que queira atuar como um serviço de pagamento DEVE implementar
 * esses dois métodos. Isso permite o baixo acoplamento.
 */
public interface OnLinePaymentService {

    // Taxa de pagamento (ex: 2%)
    double paymentFee(double amount);

    // Juros mensais (ex: 1% ao mês)
    double interest(double amount, int months);

}
