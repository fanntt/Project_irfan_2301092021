/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_26042024;

/**
 *
 * @author LAB-MM
 */

public class Circle extends Shape{
    private int r;
    @Override
    public String getName()
    {
        return "Circle";
        
    }
    public Circle()
    {
                
    }
    public int getR()
    {
        return r;
    }
    public void setR(int r)
    {
        this.r = r;
    }
    @Override
    public double getArea()
    {
        double l=r*r*3.14;
        return l;
    }
}
