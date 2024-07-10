/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.Mahasiswa;

/**
 *
 * @author Lab-J2-01
 */
public class Buku {
    private String KodeBuku;
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private int tahun;

    public Buku() {
    }

    public Buku(String KodeBuku, String Judul, String Pengarang, String Penerbit, int tahun) {
        this.KodeBuku = KodeBuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.tahun = tahun;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public int getTahun() {
        return tahun;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
}

