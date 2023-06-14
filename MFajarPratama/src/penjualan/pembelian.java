/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class pembelian {
    private int id_beli;
    private int id_barang;
    private int id_jenis;
    private String tgl_beli;
    private String harga;
    private String jml_beli;
    
    
    //Constructor
    public pembelian(int id_beli, int id_barang, int id_jenis, String tgl_beli, String harga, String jml_beli){
        this.id_beli = id_beli;
        this.id_barang = id_barang;
        this.id_jenis = id_jenis;
        this.tgl_beli = tgl_beli;
        this.harga = harga;
        this.jml_beli = jml_beli;
    }
    
    //Getter and Setter id_beli
    public int getIdBeli(){
        return id_beli;
    }
    
    public void setIdBeli(int id_beli){
        this.id_beli = id_beli;
    }
    
    //Getter and Setter id_barang
    public int getIdBarang(){
        return id_barang;
    }
    
    public void setIdBarang(int id_barang){
        this.id_barang = id_barang;
    }
    
    //Getter and Setter id_jenis
    public int getIdJenis(){
        return id_jenis;
    }
    
    public void setIdJenis(int id_jenis){
        this.id_jenis = id_jenis;
    }
    
    //Getter and Setter tgl_beli
    public String getTglBeli(){
        return tgl_beli;
    }
    
    public void setTglBeli(String tgl_beli){
        this.tgl_beli = tgl_beli;
    }
    
    //Getter and Setter harga
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
    
    //Getter and Setter jml_beli
    public String getJmlBeli(){
        return jml_beli;
    }
    
    public void setJmlBeli(String jml_beli){
        this.jml_beli = jml_beli;
    }
    
}
