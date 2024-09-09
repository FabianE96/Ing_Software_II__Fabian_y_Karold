package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
   /* @Test
    void testCreate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }

    @Test

    void testCalculate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
    }*/
    @Test
    void testCreate() {
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius(), "El radio debe ser 2.0");
    }
    
     @Test
    void testCalculateArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4.0, circle.calculateArea(), "El área debe ser 4*PI para un radio de 2.0");
    }
    
    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle(2.0);
        assertEquals(2.0 * Math.PI * 2.0, circle.calculatePerimeter(), "El perímetro debe ser 4*PI para un radio de 2.0");
    }

}