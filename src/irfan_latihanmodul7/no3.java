package irfan_latihanmodul7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Irfan Aria Putra
2301092021
Manajamen Informatika 1C
*/

public class no3{
    public static void main(String[] args) {
        String[][] n = {
            {"Fahmi Rinaldi", "083123219431", "Lubuk Alung"},
            {"Muhammad Narya Nardiansyah", "082212754203", "Bukittinggi"},
            {"Aulia Nofika", "087712427532", "Padang Panjang"}
        };

        for (String[] entry : n) {
            System.out.println("Nama        : " + entry[0]);
            System.out.println("No.Telp.    : " + entry[1]);
            System.out.println("Alamat      : " + entry[2]);
            System.out.println();
        }
    }
}