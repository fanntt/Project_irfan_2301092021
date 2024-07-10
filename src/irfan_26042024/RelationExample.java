/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_26042024;

/**
 *
 * @author LAB-MM
 */
public class RelationExample {
    public static void main(String[]Args)
    {
        Line line1 = new Line(1,5,1,4);
        Line line2 = new Line(2,5,1,4);
        
        Relation line = new Line();
        System.out.println("Line 1="+line1.getLength());
        System.out.println("Line 2="+line2.getLength());
        System.out.println(line.isGreater(line1, line2));
        System.out.println(line.isLess(line1, line2));
        System.out.println(line.isEqual(line1, line2));
    }
}
