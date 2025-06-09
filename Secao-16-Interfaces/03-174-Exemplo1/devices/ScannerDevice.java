package devices;

public class ScannerDevice extends Device{
    public ScannerDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processando documento: " + doc);
    }

    public String scan() {
        return "Conteúdo escaneado.";
    }
}
