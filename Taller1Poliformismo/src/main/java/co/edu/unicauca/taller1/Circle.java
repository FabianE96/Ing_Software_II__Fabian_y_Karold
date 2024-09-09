package co.edu.unicauca.taller1;

public class Circle extends Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    //Para calcular el area de un circulo: A = Pi*R^2
    public double calculateArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
