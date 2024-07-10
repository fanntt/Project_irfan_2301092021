/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_17052024;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LAB-MM
 */
public class ArrrayExceptionExample {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        try{
        System.out.println("Masukkan ukuran array =");
        int uk=input.nextInt();
        int[] nilai=new int[uk];
        for(int i=0;i<uk;i++)
        {
            System.out.println("nilai Array Indeks ke"+i+" = ");
            nilai[i]=input.nextInt();
        }
        System.out.println("indeks array yang ditampilkan = ");
        int index=input.nextInt();
        System.out.println("nilai indeks ke="+index+" = "+nilai[index]);
        }   
    
    catch(InputMismatchException e)
    {
        System.out.println("data input tidak sesuai dengan tipe");
    }
    catch(NegativeArraySizeException e)
    {
        System.out.println("Ukuran array tidak bolehj negatif");
    }
    catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("indeks yang diinput di luar indeks array");
            }
        finally {
            System.out.println("Blok Exception berakhir");
        }
}
}