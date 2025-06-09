package entities;


import entities.enums.Color;

/**
 * A CLASSE CONCRETA que herda o reuso e cumpre o contrato.
 * 1. 'extends AbstractShape': Ela REUTILIZA a lógica de 'color' (Herança).
 * 2. Por consequência, ela também cumpre o contrato 'Shape'.
 * 3. Ela é obrigada a fornecer a implementação específica do método 'area()'
 * para um círculo.
 */
public class Circle extends AbstractShape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
