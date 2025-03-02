/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fanntt_14062024.db;

import fanntt_14062024.model.Buku;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BukuDb {
     public void insert(Buku buku) throws Exception {
        DBHelper db = new DBHelper();
        String query = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getTahunTerbit());
        ps.executeUpdate();
    }
    
    public void update(Buku buku) throws Exception {
        DBHelper db = new DBHelper();
        String query = "update buku set kodebuku=?, judulbuku=?, "
                + " pengarang=?,tahunterbit=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getTahunTerbit());
        ps.executeUpdate();
    }
    
    public void delete(String kodebuku) throws Exception{
        DBHelper db = new DBHelper();
        String query = "delete from buku where kodebuku=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, kodebuku);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String kodebuku) throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from buku where kodebuku=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, kodebuku);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            buku= new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahunTerbit(rs.getString(4));
        }
        return buku;
    }
    
    public List<Buku> getAllBuku()  throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from buku";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        List<Buku> list = new ArrayList();
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
          buku= new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahunTerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}
