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
public class datasetJenis {
    
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> nama_jenis;
    
    public datasetJenis(){
    id_jenis = new ArrayList<Integer>();
    nama_jenis  = new ArrayList<String>();
    };//Kontruktor
    
    public void insertIdjenis(Integer isi){
        this.id_jenis.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjenis(){
        return this.id_jenis;
    }
    //
    
    public void insertNamajenis(String isi){
        this.nama_jenis.add(isi);
    }
    
    public ArrayList<String> getRecordNamajenis(){
        return this.nama_jenis;
    }
}
