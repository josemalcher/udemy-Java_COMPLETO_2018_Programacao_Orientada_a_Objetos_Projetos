package app;

import devices.ComboDevice;
import devices.PrinterDevice;
import devices.ScannerDevice;
import services.Printer;

public class Program {
    public static void main(String[] args) {

        System.out.println("--- DEMONSTRAÇÃO DO PROBLEMA (CLASSES SEPARADAS) ---");

        PrinterDevice p = new PrinterDevice("1080");
        p.processDoc("Minha Carta");
        p.print("Minha Carta");

        System.out.println();

        ScannerDevice s = new ScannerDevice("2003");
        s.processDoc("Meu Email");
        System.out.println("Resultado do Scan: " + s.scan());

        System.out.println("\n--- DEMONSTRAÇÃO DA SOLUÇÃO (COMBO DEVICE) ---");

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("Meu Relatório");
        c.print("Meu Relatório");
        System.out.println("Resultado do Scan: " + c.scan());





    }
}
