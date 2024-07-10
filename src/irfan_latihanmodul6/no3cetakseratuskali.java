/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_latihanmodul6;

/**soal
 * Buat sebuah program yang mencetak nama Anda selama seratus kali. Buat tiga versi 
 * program ini menggunakan while loop, do while dan for-loop.
 *
 * @author Irfan Aria Putra
 *         NIM 2301092021
 *         MI 1C 
 *         Matkul PBO Praktek
 */
import java.util.Scanner;
public class no3cetakseratuskali {
    public static void main (String[]args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("pilihan 1= loopfor");
        System.out.println("pilihan 2= loopwhile");
        System.out.println("pilihan 3= loopdowhile");    
        System.out.println("silahkan masukkan pilihan=");
        int pil = sc.nextInt();
        switch(pil)
        {
            case 1:loopfor();
            case 2:loopwhile();
            case 3:loopdowhile();
        }
    }
     static void loopfor ()
     { // menggunakan loopfor
        String nama="irfan";
        for (int i=0;i<=100;i++)
        {
            System.out.println(i+nama);
        }
     }
     static void loopwhile()
     { //menggunakan loopwhile
          String nama="irfan";
          int i=0;
        while (i<=100)
        {
            System.out.println(i+nama);
            i++;
        }
     }
      static void loopdowhile()
     { //menggunakan loopdowhile
          String nama="irfan";
          int i=0;
        do{
            System.out.println(i+nama);
            i++;
        }while(i<=100);
     }
}