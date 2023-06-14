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
public class datasetPenjualan {
    private ArrayList<Integer> id_jual;
    private ArrayList<Integer> id_konsumen;
    private ArrayList<String> tgl_beli;
    private ArrayList<String> jml_beli;
    private ArrayList<String> harga_jual;
    
    public datasetPenjualan(){
    id_jual = new ArrayList<Integer>();
    id_konsumen = new ArrayList<Integer>();
    tgl_beli = new ArrayList<String>();
    jml_beli = new ArrayList<String>();
    harga_jual = new ArrayList<String>();
    };
    
    public void insertIdjual(Integer isi){
        this.id_jual.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjual(){
        return this.id_jual;
    }
    //
    
    public void insertIdkonsumen(Integer isi){
        this.id_konsumen.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdkonsumen(){
        return this.id_konsumen;
    }
    //
 
    
    public void insertTglbeli(String isi){
        this.tgl_beli.add(isi);
    }
    
    public ArrayList<String> getRecordTglbeli(){
        return this.tgl_beli;
    }
    //
    
    public void insertJmlbeli(String isi){
        this.jml_beli.add(isi);
    }
    
    public ArrayList<String> getRecordJmlbeli(){
        return this.jml_beli;
    }
    //
    public void insertHargajual(String isi){
        this.harga_jual.add(isi);
    }
    
    public ArrayList<String> getRecordHargajual(){
        return this.harga_jual;
    }
}
