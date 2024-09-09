/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

/**
 *
 * @author Karol
 */
public class Square extends Figure{
    double lado;
    public Square(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calculateArea() {
        return lado*lado;
    }

    @Override
    public double calculatePerimeter() {
        return 4*lado;
    }
    
}
