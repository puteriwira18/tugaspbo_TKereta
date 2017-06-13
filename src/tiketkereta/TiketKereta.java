/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketkereta;

import java.io.Serializable;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author YUMMY
 */
public class TiketKereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
/**
 *
 * @author YUMMY
 */
 KeretaTiket entityObjk =new KeretaTiket();
        QueryTKereta tambah = new QueryTKereta();
        Scanner input=new Scanner(System.in);
        String nama_kereta,jwb = null,waktu_keberangkatan,tujuan;
        long id = 0;
        
        System.out.println("SELAMAT DATANG INPUT DATA KERETA API KU");
        System.out.println("Apakah anda ingin menambah data ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        System.out.println("SILAHKAN ISI DATA :");
        System.out.print("Nama Kereta :");nama_kereta = input.nextLine();
        System.out.print("Waktu Keberangkatan :");waktu_keberangkatan=input.nextLine();
        System.out.print("Tujuan :");tujuan = input.nextLine();
        entityObjk.setNama_Kereta(nama_kereta);
        entityObjk.setWaktu_Keberangkatan(waktu_keberangkatan);
        entityObjk.setTujuan(tujuan);
        tambah.Add(entityObjk);
        }
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah/di hapus kan ?\n"
                + "jawab lanjut : untuk rubah "
                + "\n jawab ok : untuk hapus");
               
        jwb=input.nextLine();
        
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama_kereta = input.nextLine();
            System.out.print("Alamat :");waktu_keberangkatan = input.nextLine();
            System.out.print("Tujuan :");tujuan = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama_kereta,waktu_keberangkatan,tujuan);
            tambah.Show();
            
        }else if(jwb.equals("ok")){
            tambah.Show();
            System.out.print("Masukan ID :");id=input.nextLong();
            tambah.hapus(id);
            tambah.Show();
       
        
        }
        
    
        
    }
    }
    
