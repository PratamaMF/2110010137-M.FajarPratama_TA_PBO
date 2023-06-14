/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class jenis {
    private int id_jenis;
    private String nama_jenis;
    
    //Constructor
    public jenis(int id_jenis, String nama_jenis){
        this.id_jenis = id_jenis;
        this.nama_jenis = nama_jenis;
    }
    
    
    //Getter and Setter for id_jenis
    public int getIdJenis(){
        return id_jenis;
    }
    public void setIdJenis(int id_jenis){
        this.id_jenis = id_jenis;
    }
    
    //Getter and Setter for nama_jenis
    public String getNamaJenis(){
        return nama_jenis;
    }
    public void setNamaJenis(String id_jenis){
        this.nama_jenis = nama_jenis;
    }
}
