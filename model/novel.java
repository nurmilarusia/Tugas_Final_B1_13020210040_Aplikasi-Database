/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class novel {
    private String kode_novel;
    private String nama_novel;
    private int stok_novel;
    private double harga_novel;
    String jml = String.valueOf(stok_novel);
    String hrg = String.valueOf(harga_novel);
        public String getkodeNovel(){
            return kode_novel;
        }
        public void setkodeNovel(String kode_novel){
            this.kode_novel = kode_novel;
        }
        public String getNamaNovel(){
            return nama_novel;
        }
        public void setNamaNovel(String namaNovel){
            this.nama_novel = namaNovel;
        }
        public String getJumlah(){
            return jml;
        }
        public void setJumlah(String jml){
            this.jml = jml;
        }
         public String getHarga(){
            return hrg;
        }
        public void setHarga(String hrg){
            this.hrg = hrg;
        }
    
    
}
