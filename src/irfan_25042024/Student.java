/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_25042024;

/**
 *
 * @author Lab-J2-01
 */
public class Student extends person{
    public Student(){
        
        super( "Ali", "UK" );
         System.out.println("Student:Constructor");
    }
  @Override 
  public String getName(){
  System.out.println("Student getName()");
  return name; 
 }
}
