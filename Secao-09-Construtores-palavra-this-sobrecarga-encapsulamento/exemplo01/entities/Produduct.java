package entities;

public class Produduct {
    private String name;
    private double price;

    public Produduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
