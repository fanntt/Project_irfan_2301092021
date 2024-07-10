/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_17052024;

/**
 *
 * @author LAB-MM
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class PembagianKosong {
   
     public static int bagi(int a,int b)throws ArithmeticException
        {
            if (b==0)
            
                throw new ArithmeticException("tidak boleh pembagian nol");
            return a/b;
        }
    public static void main(String []args){
    int xa;
    int ya;
    
    
    try {
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan nilai 1");
    xa = input.nextInt();
    System.out.println("masukkan nilai 2");
    ya = input.nextInt();
    int result = xa/ya;
    System.out.println("hasil="+result);
    }
    catch (ArithmeticException e)
    {
            System.out.println("pesan error :"+e);
    }
    catch( InputMismatchException e)
    {
            System.out.println("nilai yang diinputkan salah");
    }
    catch(Exception e){
        System.out.println("pengecualian lain "+e.getMessage());
    }
    finally{  
            System.out.println("Program Exception Berakhir");
            }
    }
}
