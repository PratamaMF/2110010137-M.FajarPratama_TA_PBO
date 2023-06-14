/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class transaksi {
    private int id_transaksi;
    private int id_jual;
    private int id_beli;
    private String tgl_transaksi;
    private String tot_harga_beli;
    private String status;
    
    
    //Constructor
    public transaksi(int id_transaksi, int id_jual, int id_beli, String tgl_transaksi, String tot_harga_beli, String status){
        this.id_transaksi = id_transaksi;
        this.id_jual = id_jual;
        this.id_beli = id_beli;
        this.tgl_transaksi = tgl_transaksi;
        this.tot_harga_beli = tot_harga_beli;
        this.status = status;
    }
    
    //Getter and Setter for id_transaksi
    public int getIdTransaksi(){
        return id_transaksi;
    }
    
    public void setIdTransaksi(int id_transaksi){
        this.id_transaksi = id_transaksi;
    }
    
    //Getter and Setter for id_jual
    public int getIdJual(){
        return id_jual;
    }
    
    public void setIdJual(int id_jual){
        this.id_jual = id_jual;
    }
    
    //Getter and Setter for id_beli
    public int getIdBeli(){
        return id_beli;
    }
    
    public void setIdBeli(int id_beli){
        this.id_beli = id_beli;
    }
    
    //Getter and Setter for tgl_transaksi
    public String getTglTransaksi(){
        return tgl_transaksi;
    }
    
    public void setTglTransaksi(String tgl_transaksi){
        this.tgl_transaksi = tgl_transaksi;
    }
    
    //Getter and Setter for tot_harga_beli
    public String getTotHargaBeli(){
        return tot_harga_beli;
    }
    
    public void setTotHargaBeli(String tot_harga_beli){
        this.tot_harga_beli = tot_harga_beli;
    }
    
    //Getter and Setter for status
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
}
