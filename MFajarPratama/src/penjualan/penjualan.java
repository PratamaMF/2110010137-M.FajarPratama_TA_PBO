/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Asus
 */
public class penjualan {
    private int id_jual;
    private int id_konsumen;
    private String tgl_jual;
    private String jml_jual;
    private String harga_jual;
   
    
    //Constructor
    public penjualan(int id_jual, int id_konsumen, String tgl_jual, String jml_jual, String harga_jual){
        this.id_jual = id_jual;
        this.id_konsumen = id_konsumen;
        this.tgl_jual = tgl_jual;
        this.jml_jual = jml_jual;
        this.harga_jual = harga_jual;
    }
    
    //Getter and Setter for id_jual
    public int getIdJual(){
        return id_jual;
    }
    
    public void setIdJual(int id_jual){
        this.id_jual = id_jual;
    }
    
    //Getter and Setter for id_konsumen
    public int getIdKonsumen(){
        return id_konsumen;
    }
    
    public void setIdKonsumen(int id_konsumen){
        this.id_konsumen = id_konsumen;
    }
    
    //Getter and Setter for tgl_jual
    public String getTglJual(){
        return tgl_jual;
    }
    
    public void setTglJual(String tgl_jual){
        this.tgl_jual = tgl_jual;
    }
    
    //Getter and Setter for jml_jual
    public String getJmlJual(){
        return jml_jual;
    }
    
    public void setJmlJual(String jml_jual){
        this.jml_jual= jml_jual;
    }
    
    //Getter and Setter for harga_jual
    public String getHargaJual(){
        return harga_jual;
    }
    
    public void setHargaJual(String harga_jual){
        this.harga_jual = harga_jual;
    }
    
}
