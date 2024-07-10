/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.model;

import irfan_31052024.Mahasiswa.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab-J2-01
 */
public class BukuDao {
     private List<Buku> data = new ArrayList<Buku>();
    
    public BukuDao()
    {
        data.add(new Buku("248532","Interstellar","Christoper Nolan","Greenbook.id",2005));
        data.add(new Buku("064832","Pemrogaman OOP","John Nasution","Gramedia Pustaka Utama",1998));
        data.add(new Buku("120643","Consetellation","James Bond","Erlangga",2001));
    }
    
    public void insert(Buku m)
    {
        data.add(m);
    }
    
    public void update(int index, Buku m)
    {
        data.set(index, m);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Buku getMahasiswa(int index)
    {
        return data.get(index);
    }

    public List<Buku> getAllBuku() 
    {
        return data;
    }
    
    
}
