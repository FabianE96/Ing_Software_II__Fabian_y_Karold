/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Karol
 */
public class SquareTest {
    
/*    @Test
    void testCreate(){
        Square square = new Square(2.0);
        assertEquals(4.0, square.calculateArea(), "El área debe ser 4.0 para un lado de 2.0");
    }

    @Test

    void testCalculate(){
        Square square = new Square(2.0);
        assertEquals(8.0, square.calculatePerimeter());
    }*/
    
     @Test
    void testCalculateArea() {
        Square square = new Square(3.0);
        assertEquals(9.0, square.calculateArea(), "El área debe ser 9.0 para un lado de 3.0");
    }
    
    @Test
    void testCalculatePerimeter() {
        Square square = new Square(2.0);
        assertEquals(8.0, square.calculatePerimeter(), "El perímetro debe ser 8.0 para un lado de 2.0");
    }
}
