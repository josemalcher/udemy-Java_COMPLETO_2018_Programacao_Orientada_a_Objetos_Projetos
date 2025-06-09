package devices;

public class PrinterDevice extends Device{


    public PrinterDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processando documento: " + doc);
    }
    public void print(String doc) {
        System.out.println("Imprimindo: " + doc);
    }
}
