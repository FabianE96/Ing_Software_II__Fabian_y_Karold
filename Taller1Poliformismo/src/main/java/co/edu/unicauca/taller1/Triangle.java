/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

/**
 *
 * @author Karol
 */
public class Triangle extends Figure{
    double base, altura;
    public Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculateArea() {
       return (base*altura)/2;
    }

    @Override
    public double calculatePerimeter() {
        return 3*base;
    }
    
}
