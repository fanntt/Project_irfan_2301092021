
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_latihanmodul6;

import java.util.Scanner;

/**Hitung pangkat sebuah nilai berdasarkan angka dan nilai pangkatnya. Buat tiga versi 
 * dari program ini menggunakan while loop, do-while dan for-loop.
 *
 * @author IRFAN ARIA PUTRA 
 *         2301092021
 *         matkul PBO
 *         MI 1C
 */
public class no4perpangkatanmodul6 {
    public static void main (String[]args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("pilihan 1= loopfor");
        System.out.println("pilihan 2= loopwhile");
        System.out.println("pilihan 3= loopdowhile");    
        System.out.println("silahkan masukkan pilihan=");
        int pil = sc.nextInt();
        switch(pil)
        {//menggunakan prosedur tanpa parameter
            case 1:loopfor();
            case 2:loopwhile();
            case 3:loopdowhile();
        }
    }
        static void loopfor()
        { // menggunakan loopfor
             int angka =1;
             for (int i=1;i<=100;i++)
            {
            System.out.println(i*angka);
            angka++;
            }
        }
        static void loopwhile()
        {  // ,emggunakan loopwhile
            int i=1;
            int angka =1;
            while(i<=100)
            {
            System.out.println(i*angka);
            i++;
            angka++;
            }
        }
        
        static void loopdowhile()
        {   //menggunakan loopdowhile
            int i=1;
            int angka =1;
            do{
            System.out.println(i*angka);
            i++;
            angka++;
            }while(i<=100);
        }
        
    }

