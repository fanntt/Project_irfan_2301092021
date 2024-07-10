/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_16052024;

import irfan_26042024.*;
/**
 *
 * @author Lab-J2-01
 */import java.util.Scanner;
public class PersegiPanjangRelationExample {
    public static void main(String[]Args)
    {              
        PersegiPanjang persegipanjang1 = new PersegiPanjang(20,10);
        PersegiPanjang persegipanjang2 = new PersegiPanjang(10,20);
        
        PersegiPanjangRelation persegipanjang = new PersegiPanjang(1);
        
        System.out.println("Persegi 1 Luas      ="+persegipanjang1.getLuas());
        System.out.println("Persegi 2 Luas      ="+persegipanjang2.getLuas());
        System.out.println("Persegi 1 Keliling  ="+persegipanjang1.getKeliling());
        System.out.println("Persegi 2 Keliling  ="+persegipanjang2.getKeliling());
        
        System.out.println(persegipanjang.isGreater(persegipanjang1, persegipanjang2));
        System.out.println(persegipanjang.isLess(persegipanjang1, persegipanjang2));
        System.out.println(persegipanjang.isEqual(persegipanjang1, persegipanjang2));
    }

}
