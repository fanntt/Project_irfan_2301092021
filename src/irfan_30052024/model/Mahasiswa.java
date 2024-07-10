/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_30052024.model;

/**
 *
 * @author Lab-J2-01
 */
public class Mahasiswa {
    private String NoBP;
    private String Nama;
    private String Alamat;
    private String JK;
    private String TglLahir;
    
    public Mahasiswa(){
    }

    public Mahasiswa(String NoBP, String Nama, String Alamat, String JK, String TglLahir) {
        this.NoBP = NoBP;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.JK = JK;
        this.TglLahir = TglLahir;
    }

    public String getNoBP() {
        return NoBP;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getJK() {
        return JK;
    }

    public String getTglLahir() {
        return TglLahir;
    }

    public void setNoBP(String NoBP) {
        this.NoBP = NoBP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public void setTglLahir(String TglLahir) {
        this.TglLahir = TglLahir;
    }
                
}
