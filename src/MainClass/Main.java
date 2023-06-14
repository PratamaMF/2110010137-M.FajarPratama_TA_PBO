/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;
import penjualan.*;
import dataset.*;
import forms.frameUtama;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*// Create Object From Class Konsumen
            //START Class Konsumen
            //INPUT
            konsumen data= new konsumen(111, "Utuh", "Banjarmasin", "087811112222");
            //OUTPUT
            System.out.println("DATA KONSUMEN");
            System.out.println("=======================");
            System.out.println("ID : " +data.getIdKonsumen());
            System.out.println("Nama : " +data.getNama());
            System.out.println("Alamat " +data.getAlamat());
            System.out.println("No Telp : " +data.getTelp());
            System.out.println("");
            System.out.println("");
            //END Class Konsumen
            
        //Create Object From Class Jenis
            //START Class Jenis
            //INPUT
            jenis jenis= new jenis(111, "Laptop Asus");
            //OUTPUT
            System.out.println("DATA BARANG");
            System.out.println("=======================");
            System.out.println("Jenis : " +jenis.getNamaJenis());
            //END Class Jenis
            
        //Create Object From Class Barang
            //START Class Barang
            //INPUT
            barang barang = new barang(01, 4, "TUF GAMING F15", "Intel i5 Gen10th", "NVIDIA GTX 1650", "SSD 500 GB");
            //OUTPUT
            System.out.println("ID : " +barang.getIdBarang());
            System.out.println("Nama  : " +barang.getNamaBarang());
            System.out.println("Processor : " +barang.getCpu());
            System.out.println("VGA : " +barang.getGrafik());
            System.out.println("Storage : " +barang.getHdd());
            System.out.println("");
            System.out.println("");
            //END Class Barang
            
        //Create Object From Class Pembelian
            //START Class Pembelian
            //INPUT
            pembelian pembelian = new pembelian(1, 4, 111, "17-05-2023", "13.000.000", "1" );
            //OUTPUT
            System.out.println("DETAIL PEMBELIAN");
            System.out.println("==================");
            System.out.println("ID Pembelian : " +pembelian.getIdBeli());
            System.out.println("ID Barang : " +pembelian.getIdBarang());
            System.out.println("Tanggal Pembelian : " +pembelian.getTglBeli());
            System.out.println("Jumlah Pembelian : " +pembelian.getJmlBeli());
            System.out.println("Harga : " +pembelian.getHarga());
            System.out.println("");
            System.out.println("");
            //END Class Pembelian
            
        //Create Object From Class Penjualan
            //START Class Penjualan
            //INPUT
            penjualan penjualan = new penjualan(1, 111, "17-05-2023", "1", "13.000.000" );
            //OUTPUT
            System.out.println("DETAIL PENJUALAN");
            System.out.println("==================");
            System.out.println("ID Penjualan : " +penjualan.getIdJual());
            System.out.println("ID Konsumen : " +penjualan.getIdKonsumen());
            System.out.println("Tanggal Pembelian : " +penjualan.getTglJual());
            System.out.println("Jumlah Pembelian : " +penjualan.getJmlJual());
            System.out.println("Harga : " +penjualan.getHargaJual());
            System.out.println("");
            System.out.println("");
            //END Class Penjualan
            
        //Create Object From Class Transaksi
            //START Class Penjualan
            //INPUT
            transaksi transaksi = new transaksi(1, 1, 1, "17-05-2023", "13.000.000", "LUNAS" );
            //OUTPUT
            System.out.println("DETAIL TRANSAKSI");
            System.out.println("==================");
            System.out.println("ID Transaksi: " +transaksi.getIdTransaksi());
            System.out.println("ID Jual : " +transaksi.getIdJual());
            System.out.println("ID Beli : " +transaksi.getIdJual());
            System.out.println("Tanggal Transaksi : " +transaksi.getTglTransaksi());
            System.out.println("Total Harga : " +transaksi.getTotHargaBeli());
            System.out.println("Status : " +transaksi.getStatus());
            System.out.println("");
            System.out.println("");
            //END Class Penjualan*/
        
        frameUtama myFrame = new frameUtama();//Create Object myFrame
        
        myFrame.setVisible(true);

    }
    
}
