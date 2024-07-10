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
// class controller untuk mengatur yang akan ditampilkan pada class view
public class StudentController {
    // objek model
    // objek view 
    private Student model;
    private StudentView view;
    //method untuk memanggil model dan view
    public StudentController (Student model, StudentView view){
        this.model = model ;
        this.view = view;
    }
    public void setStudentName(String name){
    model.setName((name));
    }    
    public void setStudentRollNum(String rollNo){
        model.setRollNo(rollNo);
    }  
    public String getStudentRollNum(){
        return model.getRollNo();
    }
    public String getStudentName(){
        return model.getName();
    }
    // method menampilkan data  
    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    } 
    
     
      
    
}
