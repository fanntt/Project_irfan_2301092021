/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_balok;

/**
 *
 * @author LAB-MM
 */
public class balok {
    private int Panjang;
    private int Lebar;
    private int Tinggi;
    private int Volume;
    private int LuasPermukaan;
    private static int BanyakBalok;
     
     public balok(int panjang,int lebar,int tinggi){
             
     }
     public int getPanjang()
     {
        return Panjang;
     }
     public void setPanjang(int panjang)
     {
         this.Panjang = panjang;
     }
     public int getLebar()
     {
         return Lebar;
     }
     public void setLebar(int lebar)
     {
         this.Lebar = lebar;
     }
     public int getTinggi()
     {
         return Tinggi;
     }
     public void setTinggi(int tinggi)
     {
         this.Tinggi = tinggi;
     }
     public int getVolume(int Panjang,int Lebar,int Tinggi)
     {
         int volume=Panjang*Lebar*Tinggi;
         return volume;
     }
     public int getLuasPermukaan(int Panjang, int Lebar,int Tinggi)
     {   
         int luaspermukaan=2*((Panjang+Lebar)+(Panjang+Tinggi)+(Lebar+Tinggi));
         return luaspermukaan;
     }
     public void set(int panjang, int tinggi,int lebar)
     {
         getPanjang();
         getLebar();
         getTinggi();
     }
     public void print()
     {
       
     }
     public void hasil(int Panjang,int Lebar,int Tinggi)
     {
         System.out.println("Volume ="+getVolume(Panjang, Lebar, Tinggi));
         System.out.println("Luas Permukaan ="+getLuasPermukaan(Panjang,Lebar,Tinggi));
     }
}
