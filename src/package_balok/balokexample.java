/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_balok;

/**
 *
 * @author LAB-MM
 */import java.util.Scanner;
public class balokexample {
    public static void main (String[]args)
    {  
        Scanner in= new Scanner(System.in);
        int n;
        System.out.print("Masukkan Jumlah Balok=");
        n=in.nextInt();
        if(n<1){
            System.out.println("jumlah balok tidak diinputkan");
        }
        else{
        for(int i=0;i<n;i++)
        {
        System.out.print("Masukkan Panjang =");
        int panjang=in.nextInt();
        System.out.print("Masukkan Lebar =");
        int lebar=in.nextInt();
        System.out.print("Masukkan Tinggi =");
        int tinggi=in.nextInt();
        balok balok1 = new balok(panjang,lebar,tinggi);
        int lp=balok1.getLuasPermukaan(panjang, lebar, tinggi);
        int v=balok1.getVolume(panjang,lebar,tinggi);
        System.out.println("luas permukaan="+lp);
        System.out.println("volume ="+v);
        }  
        }
    }
}
