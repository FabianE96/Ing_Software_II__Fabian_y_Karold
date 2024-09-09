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
public class TriangleTest {
    @Test
    void testCreate() {
        Triangle triangle = new Triangle(2.0, 4.0);
        assertEquals(2.0, triangle.base, "La base debe ser 2.0");
        assertEquals(4.0, triangle.altura, "La altura debe ser 4.0");
    }

    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle(2.0, 4.0);
        assertEquals(4.0, triangle.calculateArea(), "El área debe ser 4.0 para una base de 2.0 y una altura de 4.0");
    }

    @Test
    void testCalculatePerimeter() {
        Triangle triangle = new Triangle(2.0, 4.0);
        assertEquals(6.0, triangle.calculatePerimeter(), "El perímetro debe ser 6.0 para una base de 2.0");
    }
}