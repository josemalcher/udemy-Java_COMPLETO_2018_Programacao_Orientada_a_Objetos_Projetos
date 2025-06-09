package devices;

public abstract class Device {
    public String serialNumber;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Método que será herdado.
    public abstract void processDoc(String doc);
}
