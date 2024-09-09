package co.edu.unicauca.taller1;

import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Square(2.0); //lado
        Figure fig3 = new Triangle(2.0, 4.0); //base y altura
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        for (Figure fig : figures) {
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
            System.out.println(" ");
        }

    }
}