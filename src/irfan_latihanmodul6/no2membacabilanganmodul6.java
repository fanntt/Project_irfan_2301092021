
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_latihanmodul6;

/** soal 
 * Ambil sebuah angka sebagai input dari user, dan outputnya berupa kata yang sesuai 
   dengan angka. Angka yang dimasukkan antara 1-10. Jika user memasukkan nilai yang 
   tidak sesuai berikan output “Invalid number”. 
   1. Gunakan statement if-else untuk menyelesaikan 
   2. Gunakan statement switch untuk menyelesaikan
 *
 * @author Irfan Aria Putra
 *         NIM 2301092021
 *         MI 1C 
 *         Matkul PBO Praktek
 */ import java.util.Scanner;
public class no2membacabilanganmodul6 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("silahkan masukkan nilai=");
        int nilai = sc.nextInt();
        switch(nilai)//menggunakan switch case
        {
            case 1 :  {System.out.println("satu");}break;
            case 2 :  {System.out.println("dua");}break;
            case 3 :  {System.out.println("tiga");}break;
            case 4 :  {System.out.println("empat");}break;
            case 5 :  {System.out.println("lima");}break;
            case 6 :  {System.out.println("enam");}break;
            case 7 :  {System.out.println("tujuh");}break;
            case 8 :  {System.out.println("delapan");}break;
            case 9 :  {System.out.println("sembilan");}break;
            case 10 : {System.out.println("sepuluh");}break;
            default : {System.out.println("Angka Tidak Valid");}
        }
    }
}
