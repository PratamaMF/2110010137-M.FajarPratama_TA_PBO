/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class datasetPembelian {
    
    private ArrayList<Integer> id_beli;
    private ArrayList<Integer> id_barang;
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> tgl_beli;
    private ArrayList<String> harga;
    private ArrayList<String> jml_beli;
    
    public datasetPembelian(){
    id_beli = new ArrayList<Integer>();
    id_barang = new ArrayList<Integer>();
    id_jenis = new ArrayList<Integer>();
    tgl_beli = new ArrayList<String>();
    harga = new ArrayList<String>();
    jml_beli = new ArrayList<String>();
    };
    
    public void insertIdbeli(Integer isi){
        this.id_beli.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdbeli(){
        return this.id_beli;
    }
    //
    
    public void insertIdbarang(Integer isi){
        this.id_barang.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdbarang(){
        return this.id_barang;
    }
    //
    
    public void insertIdjenis(Integer isi){
        this.id_jenis.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjenis(){
        return this.id_jenis;
    }
    //
    
    public void insertTglbeli(String isi){
        this.tgl_beli.add(isi);
    }
    
    public ArrayList<String> getRecordTglbeli(){
        return this.tgl_beli;
    }
    //
    public void insertHarga(String isi){
        this.harga.add(isi);
    }
    
    public ArrayList<String> getRecordHarga(){
        return this.harga;
    }
    //
    
    public void insertJmlbeli(String isi){
        this.jml_beli.add(isi);
    }
    
    public ArrayList<String> getRecordJmlbeli(){
        return this.jml_beli;
    }
}
