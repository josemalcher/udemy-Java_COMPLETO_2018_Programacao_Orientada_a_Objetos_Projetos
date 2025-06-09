package devices;

import services.Printer;
import services.Scanner;


/**
 * Esta é a solução. A classe pode herdar de UMA classe (reuso) e implementar
 * VÁRIAS interfaces (cumprir vários contratos).
 *
 * 1. 'extends Device': Reutiliza a implementação/atributos de Device (ter um serialNumber).
 * 2. 'implements Scanner, Printer': Cumpre os contratos de Scanner e Printer.
 *
 * Não há ambiguidade aqui, pois as interfaces apenas definem "o que" a classe
 * deve fazer, não "como". A responsabilidade de implementar os métodos 'scan' e
 * 'print' é TOTALMENTE da classe ComboDevice.
 */
public class ComboDevice extends Device implements Printer, Scanner {


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ComboDevice processando documento: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("ComboDevice imprimindo: " + doc);
    }

    @Override
    public String scan() {
        return "ComboDevice: conteúdo escaneado.";
    }
}
