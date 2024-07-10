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

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        int terbesar = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            try {
                String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
                angka[i] = Integer.parseInt(input);
                if (angka[i] > terbesar) {
                    terbesar = angka[i];
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid, silakan masukkan nomor yang benar.");
                i--; // Mengulangi input untuk nomor yang sama
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + terbesar);
    }
}
