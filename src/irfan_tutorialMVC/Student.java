/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_tutorialMVC;

/**
 * Tugas Tutorial MVC (Model-View-Controller)
 *  
 * @author  Irfan Aria Putra 
 *          2301092021
 *    /**      Manajemen Informatika 1C
 */
// membuat class student sebagai model
public class Student {
    // buat variabel 
    private String rollNo;
    private String Name;
    // getter
    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return Name;
    }
    // setter
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
  
}
