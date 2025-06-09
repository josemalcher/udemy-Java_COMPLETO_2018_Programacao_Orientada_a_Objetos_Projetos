package app;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {
    public static void main(String[] args) {


        // Demonstração do Polimorfismo.
        // Podemos nos referir a objetos concretos (Circle, Rectangle)
        // pela sua forma mais genérica (Shape ou AbstractShape).

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.RED, 3.0, 4.0);

        System.out.println("Circle color: "     + s1.getColor());
        System.out.println("Circle area: "      + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: "  + s2.getColor());
        System.out.println("Rectangle area: "   + String.format("%.2f", s2.area()));

    }
}
