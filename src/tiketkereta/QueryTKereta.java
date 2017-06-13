/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketkereta;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author YUMMY
 */
public class QueryTKereta {

   public void Add (Object object){
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TiketKeretaPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
    public void update(long id,String nama_pelanggan,String alamat_pelanggan, Object nama_kereta, Object waktu_keberangkatan, Object tujuan){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TiketKeretaPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE KeretaTiket e SET e.Nama_Kereta=?1,e.Waktu_Keberangkatan=?2 ,e.Tujuan=?3"
                + "2WHERE e.id=?4",KeretaTiket.class)
                .setParameter(1, nama_kereta)
                .setParameter(2, waktu_keberangkatan)
                .setParameter(3, tujuan)
                
                .setParameter(4,id)
                .executeUpdate();       
        em.getTransaction().commit();
  }
    
    
public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TelurAsinPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM KeretaTiket e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
}
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TelurAsinPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM KeretaTiket e");
        List<KeretaTiket> result = query.getResultList();
        for (KeretaTiket e : result) {
                 System.out.println( "ID KERETA :" + e.getId()+ "\n NAMA :"+ e.getNama_Kereta()+ "\n Waktu Berangkat :"+ e.getWaktu_Keberangkatan() + "\n TUJUAN :" + e.getTujuan());   
        }
    }

    void update(long id, String nama_kereta, String waktu_keberangkatan, String tujuan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

