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
public class datasetKonsumen {
    
    private ArrayList<Integer> id_konsumen;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    
    public datasetKonsumen(){
    id_konsumen = new ArrayList<Integer>();
    nama = new ArrayList<String>();
    alamat = new ArrayList<String>();
    telp = new ArrayList<String>();
    };
    
    public void insertIdkonsumen(Integer isi){
        this.id_konsumen.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdkonsumen(){
        return this.id_konsumen;
    }
    //
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    //
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
        return this.alamat;
    }
    //
    
    public void insertTelp(String isi){
        this.telp.add(isi);
    }
    
    public ArrayList<String> getRecordTelp(){
        return this.telp;
    }
}
