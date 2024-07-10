/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_25042024;

/**
 *
 * @author Lab-J2-01
 */
public class PolimorfisExample {
    public static void printInformation( person p ){ 
         System.out.println("Name        ="+p.getName());
         System.out.println("Name        ="+p.getAddress());
    }
    public static void main (String[]args)
    {
        Student studentObject= new Student();
        Employee employeeObject= new Employee();
        printInformation(studentObject);
        printInformation(employeeObject);
    }
}
