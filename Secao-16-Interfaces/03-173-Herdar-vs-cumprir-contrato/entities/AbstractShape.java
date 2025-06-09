package entities;

import entities.enums.Color;



/**
 * A CLASSE ABSTRATA fornece o CÓDIGO REUTILIZÁVEL.
 * * 1. Ela "assina o contrato" ao fazer 'implements Shape'.
 * 2. Ela não é obrigada a implementar o método 'area()' porque é abstrata.
 * Ela deixa essa responsabilidade para as suas subclasses concretas.
 * 3. Ela implementa a lógica comum a todas as formas: ter uma cor.
 * Isso evita a repetição de código nas classes Circle e Rectangle.
 */
public abstract class AbstractShape implements Shape{

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // O método area() continua abstrato, pois cada forma o calcula de um jeito.
    // A implementação é delegada para as classes filhas.
    @Override
    public abstract double area();

}
