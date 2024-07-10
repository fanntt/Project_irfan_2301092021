/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_26042024;

/**
 *
 * @author LAB-MM
 */
public class AbstractExample {
  public static void main(String[]args)
  {
      Circle circle = new Circle();
      Square square = new Square();
      circle.setR(10);
      square.setS(10);
      System.out.println("Name ="+circle.getName());
      System.out.println("Area ="+circle.getArea());
      System.out.println("Name ="+square.getName());
      System.out.println("Area ="+square.getArea());
  }
}
