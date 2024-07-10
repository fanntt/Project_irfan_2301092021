/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_16052024;

import irfan_26042024.*;

/**
 *
 * @author Lab-J2-01
 */
public class PersegiPanjang implements PersegiPanjangRelation{
 private double p;
 private double l;
 private int pil;
 
 
 public PersegiPanjang(int pil)
 { 
     this.pil=pil;
 }
 public PersegiPanjang(double p, double l ){
  this.p = p; 
  this.l = l; 
  
 } 
 public double getLuas(){ 
   double luas = p*l ;
   return luas;
 }
 public double getKeliling ()
 {
     double keliling = (2*p)+(2*l);
     return keliling;
 }
 @Override
 public boolean isGreater( Object a, Object b ){ 
     boolean hasil = false;
  if (pil==1){
  double aLen = ((PersegiPanjang)a).getLuas();
  double bLen = ((PersegiPanjang)b).getLuas();
  hasil= aLen > bLen;  
  }
  if (pil==2){
  double aLen = ((PersegiPanjang)a).getKeliling();
  double bLen = ((PersegiPanjang)b).getKeliling(); 
  hasil= aLen > bLen;
      } 
     return hasil;
}
 @Override
 public boolean isLess( Object a, Object b){
     boolean hasil = false;
 if (pil==1){
  double aLen = ((PersegiPanjang)a).getLuas();
  double bLen = ((PersegiPanjang)b).getLuas();
  hasil = aLen < bLen;  
  }
 else if (pil==2){
  double aLen = ((PersegiPanjang)a).getKeliling();
  double bLen = ((PersegiPanjang)b).getKeliling(); 
  return aLen < bLen;
      } 
     return hasil;
 }
 @Override
 public boolean isEqual( Object a, Object b){
     boolean hasil = false;
    if (pil==1){
  double aLen = ((PersegiPanjang)a).getLuas();
  double bLen = ((PersegiPanjang)b).getLuas();
  hasil= aLen == bLen;  
  }
    else if (pil==2){
  double aLen = ((PersegiPanjang)a).getKeliling();
  double bLen = ((PersegiPanjang)b).getKeliling(); 
  hasil= aLen == bLen;
      } 
  return hasil;
 }   
}
