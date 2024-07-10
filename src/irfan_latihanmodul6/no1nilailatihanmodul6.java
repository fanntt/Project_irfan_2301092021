
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_latihanmodul6;

/**soal
 *Ambil tiga nilai ujian dari user dan hitung nilai rata-rata dari nilai tersebut. Berikan 
  output rata-rata dari tiga ujian. Berikan juga smiley face pada output jika nilai rata-rata 
  lebih besar atau sama dengan 60, selain itu beri output :-(. 
  Gunakan JOptionPane untuk mendapat input dari user dan output hasilnya.
 * @author Irfan Aria Putra
 *         NIM 2301092021
 *         MI 1C 9
 *         Matkul PBO Praktek
 */
import javax.swing.JOptionPane;
public class no1nilailatihanmodul6 {
    public static void main(String[]args)
    {
        int a=0;
        int b=0;
        int c=0;
        int rata=0;
        
        String input1="";
        String input2="";
        String input3="";
        String hasil="";
        String senyum="";
        
        input1=JOptionPane.showInputDialog("nilai1=");
        input2=JOptionPane.showInputDialog("nilai2=");
        input3=JOptionPane.showInputDialog("nilai3=");
        
        a=Integer.parseInt(input1);
        b=Integer.parseInt(input2);
        c=Integer.parseInt(input3);
        rata=(a+b+c)/3;
        
        if (rata>60)
        {
           senyum=":D";
        }
        else {
           senyum=":-(";
        }
        hasil +=(hasil)+("Menghitung Rata-rata")+"\n";
        hasil +="\n";
        hasil +="nilai 1="+Integer.toString(a)+"\n";
        hasil +="nilai 2="+Integer.toString(b)+"\n";
        hasil +="nilai 3="+Integer.toString(c)+"\n";
        
        hasil +="\n";
        hasil +="Hasil Rata-rata="+Integer.toString(rata)+"\n";
        JOptionPane.showMessageDialog(null,hasil+"ekspresi"+""+senyum);
    }
}

