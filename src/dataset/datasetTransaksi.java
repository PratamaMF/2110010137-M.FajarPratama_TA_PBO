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
public class datasetTransaksi {
    
    private ArrayList<Integer> id_transaksi;
    private ArrayList<Integer> id_jual;
    private ArrayList<Integer> id_beli;
    private ArrayList<String> tgl_transaksi;
    private ArrayList<String> tot_harga_beli;
    private ArrayList<String> status;
    
    public datasetTransaksi(){
    id_transaksi = new ArrayList<Integer>();
    id_jual = new ArrayList<Integer>();
    id_beli = new ArrayList<Integer>();
    tgl_transaksi = new ArrayList<String>();
    tot_harga_beli = new ArrayList<String>();
    status = new ArrayList<String>();
    };
    
    public void insertIdtransaksi(Integer isi){
        this.id_transaksi.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdtransaksi(){
        return this.id_transaksi;
    }
    //
    
    public void insertIdjual(Integer isi){
        this.id_jual.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjual(){
        return this.id_jual;
    }
    //
    
    public void insertIdbeli(Integer isi){
        this.id_beli.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdbeli(){
        return this.id_beli;
    }
    //
 
    public void insertTgltransaksi(String isi){
        this.tgl_transaksi.add(isi);
    }
    
    public ArrayList<String> getRecordTgltransaksi(){
        return this.tgl_transaksi;
    }
    //
    
    public void insertTothargabeli(String isi){
        this.tot_harga_beli.add(isi);
    }
    
    public ArrayList<String> getRecordTothargabeli(){
        return this.tot_harga_beli;
    }
    //
    public void insertStatus(String isi){
        this.status.add(isi);
    }
    
    public ArrayList<String> getRecordStatus(){
        return this.status;
    }
}
