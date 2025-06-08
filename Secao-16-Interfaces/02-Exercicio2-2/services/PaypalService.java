package services;

public class PaypalService implements OnLinePaymentService{
    private static final double FEE_PERCENTAGE = 0.02; // 2%
    private static final double MONTHLY_INTEREST = 0.01; // 1%


    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int months) {
        // Juros simples: valor * taxa * quantidade_de_meses
        return amount * MONTHLY_INTEREST * months;
    }
}
