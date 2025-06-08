package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

/**
 * Serviço responsável por processar o contrato.
 * Esta é a classe que aplica a Inversão de Controle.
 */
public class ContractService {

    // 1. A classe AGORA DEPENDE DA INTERFACE, e não de uma classe concreta.
    private OnLinePaymentService onLinePaymentService;


    /**
     * 2. INJEÇÃO DE DEPENDÊNCIA via construtor.
     * O ContractService não sabe e não se importa qual é o serviço de pagamento
     * (Paypal, Stripe, etc.). Ele apenas recebe um objeto que SEGUE o contrato
     * da interface OnlinePaymentService e o utiliza.
     */
    public ContractService(OnLinePaymentService onLinePaymentService) {
        this.onLinePaymentService = onLinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            // Calcula o valor base da parcela + juros daquele mês
            double updatedQuota = basicQuota + onLinePaymentService.interest(basicQuota, i);

            // Calcula o valor final da parcela com a taxa de pagamento
            double fullQuota = updatedQuota + onLinePaymentService.paymentFee(updatedQuota);

            // Calcula a data de vencimento da parcela
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // Adiciona a parcela pronta na lista de parcelas do contrato
            contract.addInstallment(new Installment(dueDate, fullQuota));
        }
    }
}
