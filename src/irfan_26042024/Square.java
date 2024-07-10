/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_26042024;

/**
 *
 * @author LAB-MM
 */
public class Square extends Shape{
    private int s;
    public Square (){
    
    }
    public String getName()
    {
     return"Square";
       
    }
    public int getS()
    {
        return s;
    }
    public void setS(int s)
    {
        this.s=s;
    }
    public double getArea()
    {
        return s*s;
    }
}
