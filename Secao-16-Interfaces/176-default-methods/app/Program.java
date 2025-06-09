package app;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.println("--- Testando BrazilInterestService (usa default method) ---");
        // A taxa de juros do Brasil é 2% ao mês (0.02)
        InterestService is_br = new BrazilInterestService(0.02);
        double payment_br = is_br.payment(amount, months);
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment_br));

        System.out.println("\n--- Testando UsaInterestService (sobrescreve o método) ---");
        // A taxa de juros dos EUA é 1% ao mês (0.01) e usa juros simples
        InterestService is_usa = new UsaInterestService(0.01);
        double payment_usa = is_usa.payment(amount, months);
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment_usa));



        sc.close();
    }
}
