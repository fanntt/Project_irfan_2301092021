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
 *          Manajemen Informatika 1C
 */
// class untuk mendemonstraikan MVC
public class MVCExample {
    public static void main (String[]args){
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view); 
         
        controller.updateView();// menampilkan data  
        controller.setStudentRollNum("0058724435"); // mengubah data nomor id
        controller.updateView();// menampilkan data yang telah diubah 
        controller.setStudentName("Fahmi"); // mengubah data nama
        controller.updateView();// menampilkan data yang telah diubah 
    }
    // mengisi data 
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Irfan");
        student.setRollNo("2301092021");
        return student;
    }
}
