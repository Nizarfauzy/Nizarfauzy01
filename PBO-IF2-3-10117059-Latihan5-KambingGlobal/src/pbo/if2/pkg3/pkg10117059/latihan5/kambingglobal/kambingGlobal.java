/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan5.kambingglobal;

/**
 *
 * @author 
 * 
 * NAMA: Nizar Fauzy Ryamizard
 * Kelas: IF-2
 * Nim : 10117059
 * Deskripsi Program: Program ini berisi Menampilkan Jumlah kambing setelah 
 * ditambahkan
 */
public class kambingGlobal {

    /**
     * @param args the command line arguments
     */
    // variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing() {
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args)
    {
        kambingGlobal kambingSusu = new kambingGlobal();
        // menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah satu kambing
        kambingSusu.tambahKambing();
        
        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}