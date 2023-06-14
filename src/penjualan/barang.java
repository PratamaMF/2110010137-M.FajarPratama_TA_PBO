/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class barang {
    private int id_jenis;
    private int id_barang;
    private String nama_barang;
    private String cpu;
    private String grafik;
    private String hdd;
    
    
    //Constructor
    public barang(int id_jenis, int id_barang, String nama_barang, String cpu, String grafik, String hdd){
        this.id_jenis = id_jenis;
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.cpu = cpu;
        this.grafik = grafik;
        this.hdd = hdd;
    }
    
    //Getter and Setter id_jenis
    public int getIdJenis(){
        return id_jenis;
    }
    
    public void setIdJenis(int id_jenis){
        this.id_jenis = id_jenis;
    }
    
    //Getter and Setter id_barang
    public int getIdBarang(){
        return id_barang;
    }
    
    public void setIdbarang(int id_barang){
        this.id_barang = id_barang;
    }
    
    //Getter and Setter nama_barang
    public String getNamaBarang(){
        return nama_barang;
    }
    
    public void setNamaBarang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    
    //Getter and Setter cpu
    public String getCpu(){
        return cpu;
    }
    
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    
    //Getter and Setter grafik
    public String getGrafik(){
        return grafik;
    }
    
    public void setMm(String mm){
        this.grafik = grafik;
    }
    
    //Getter and Setter hdd
    public String getHdd(){
        return hdd;
    }
    
    public void setHdd(String hdd){
        this.hdd = hdd;
    }
    
}
