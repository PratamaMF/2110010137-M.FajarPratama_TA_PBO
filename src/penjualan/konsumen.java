/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class konsumen {
    private int id_konsumen;
    private String nama;
    private String alamat;
    private String telp;
    
    
    //Constructor
    public konsumen(int id_konsumen, String nama, String alamat, String telp){
        this.id_konsumen = id_konsumen;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
    }
    
    //Getter and Setter for id_konsumen
    public int getIdKonsumen(){
        return id_konsumen;
    }
    
    public void setIdKonsumen(int id_konsumen){
        this.id_konsumen = id_konsumen;
    }
    
    //Getter and Setter for nama
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //Getter and Setter for alamat
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    //Getter and Setter for telp
    public String getTelp(){
        return telp;
    }
    
    public void setTelp(String telp){
        this.telp = telp;
    }
    
}
