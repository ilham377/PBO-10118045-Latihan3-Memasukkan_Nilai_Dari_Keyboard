/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan3memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Memasukkan Nilai Dari Keyboard
 */
public class PBO10118045Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Memasukkan nama anda: ");
        Scanner Scanner = new Scanner (System.in);
        
        String nama = Scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
