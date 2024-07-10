/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_30052024.controller;

import irfan_30052024.view.FormMahasiswa;
import irfan_30052024.model.Mahasiswa;

/**
 *
 * @author Lab-J2-01
 */
public class MahasiswaController {
    FormMahasiswa formMahasiswa;
    Mahasiswa mahasiswa;
    
    public MahasiswaController(FormMahasiswa formMahasiswa)
    {
        this.formMahasiswa = formMahasiswa;
    }
    public void cancel (){
        formMahasiswa.getTxtNoBP().setText(" ");
        formMahasiswa.getTxtNama().setText(" ");
        formMahasiswa.getTxtAlamat().setText(" ");
        formMahasiswa.getTxtTglLahir().setText(" ");
        isiJenisKelamin();
    }
    public void isiJenisKelamin(){
        formMahasiswa.getCboJK().removeAllItems();
        formMahasiswa.getCboJK().addItem("L");
        formMahasiswa.getCboJK().addItem("P");
    }
}
