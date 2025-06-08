package app;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnLinePaymentService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Entre com o numero de parcelas");
        int months = sc.nextInt();

        /*
         * PONTO-CHAVE DA INVERSÃO DE CONTROLE E INJEÇÃO DE DEPENDÊNCIA
         *
         * O programa principal (aqui) tem o CONTROLE. Ele decide qual
         * implementação específica será usada.
         */
        // OnLinePaymentService paymentService = new PaypalService();

        // INGETA essa dependencia no seviço de contrato
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, months);

        System.out.println("Parcelas:");
        // Imprime o resultado final
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
