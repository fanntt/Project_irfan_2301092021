/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_latihanmodul7;

/*
Irfan Aria Putra
2301092021
Manajamen Informatika 1C
*/

public class no1 {
    
    public static void main(String[]args){
        String days[]={"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"};
        // Menggunakan Foor Loop
        System.out.println(" Menggunakan Foor Loop");
        for (int i=0;i<days.length;i++)
        {
            System.out.println(days[i]);
        }
        System.out.println("");
        
        System.out.println("Menggunakan While Loop");
        //Menggunakan while-loop
        int j=0;
        while(j<days.length)
        {
            System.out.println(days[j]);
            j++;
        }
        
        //Menggunakan Do-while-loop
        System.out.println("\nMenggunakan Do-While Loop");
        int k=0;
        do {
        System.out.println(days[k]);
        k++;
    }while(k<days.length);
    
   }
    
}
