/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketkereta;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author YUMMY
 */
@Entity
public class KeretaTiket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nama_Kereta;
    private String Waktu_Keberangkatan;
    private String Tujuan;

    /**
     * @return the Nama_Kereta
     */
    public String getNama_Kereta() {
        return Nama_Kereta;
    }

    /**
     * @param Nama_Kereta the Nama_Kereta to set
     */
    public void setNama_Kereta(String Nama_Kereta) {
        this.Nama_Kereta = Nama_Kereta;
    }

    /**
     * @return the Waktu_Keberangkatan
     */
    public String getWaktu_Keberangkatan() {
        return Waktu_Keberangkatan;
    }

    /**
     * @param Waktu_Keberangkatan the Waktu_Keberangkatan to set
     */
    public void setWaktu_Keberangkatan(String Waktu_Keberangkatan) {
        this.Waktu_Keberangkatan = Waktu_Keberangkatan;
    }

    /**
     * @return the Tujuan
     */
    public String getTujuan() {
        return Tujuan;
    }

    /**
     * @param Tujuan the Tujuan to set
     */
    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}  

    
            