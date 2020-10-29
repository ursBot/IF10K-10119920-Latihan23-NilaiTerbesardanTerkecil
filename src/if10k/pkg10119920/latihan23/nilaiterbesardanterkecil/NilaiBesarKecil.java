/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1011k.pkg10119920.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class NilaiBesarKecil {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama;
        int banyak, i, min, max, array[];
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyak = input.nextInt();
        array = new int[banyak];
        
        for(i = 0; i < banyak; i++) {
          System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = " );
          array[i] = input.nextInt();
        }
        max = array[0];        
        min = array[0];

        for(i = 0; i < banyak; i++) {
          if (array[i] > max){
            max = array[i];
          }
          else if(array[i] < min){
              min = array[i];  
            }  
        }
        
        System.out.println();
        System.out.println("====Hasil Nilai Mahasiswa====");

        for(i = 0; i < banyak; i++) {
          System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + array[i] );
          
        }        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);        
        
        System.out.println("\nPetugas : " + nama);
    }
    
}
