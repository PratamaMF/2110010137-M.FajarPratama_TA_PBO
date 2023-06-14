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
public class datasetBarang {
    
    private ArrayList<Integer> id_jenis;
    private ArrayList<Integer> id_barang;
    private ArrayList<String> nama_barang;
    private ArrayList<String> cpu;
    private ArrayList<String> grafik;
    private ArrayList<String> hdd;
    
    //konstruktor
    public datasetBarang(){
        id_jenis = new ArrayList<Integer>();
        id_barang = new ArrayList<Integer>();
        nama_barang = new ArrayList<String>();
        cpu = new ArrayList<String>();
        grafik = new ArrayList<String>();
        hdd = new ArrayList<String>();
    };
    
    public void insertIdjenis(Integer isi){
        this.id_jenis.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjenis(){
        return this.id_jenis;
    }
    //
    
    public void insertIdbarang(Integer isi){
        this.id_barang.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdbarang(){
        return this.id_barang;
    }
    //
    
    public void insertNamabarang(String isi){
        this.nama_barang.add(isi);
    }
    
    public ArrayList<String> getRecordNamabarang(){
        return this.nama_barang;
    }
    //
    
    public void insertCpu(String isi){
        this.cpu.add(isi);
    }
    
    public ArrayList<String> getRecordCpu(){
        return this.cpu;
    }
    //
    
    public void insertGrafik(String isi){
        this.grafik.add(isi);
    }
    
    public ArrayList<String> getRecordGrafik(){
        return this.grafik;
    }
    //
    
    public void insertHdd(String isi){
        this.hdd.add(isi);
    }
    
    public ArrayList<String> getRecordHdd(){
        return this.hdd;
    }
    
}
