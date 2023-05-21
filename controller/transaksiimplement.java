/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class transaksiimplement {
    
    public int urutanDb(){
        Connection conn = (Connection) koneksi.getConnection();
        int jml=0;
        try{
        String sql = "select count(*) as urutan from penjualan";
        Statement rs= (Statement) conn.createStatement();
        ResultSet count = rs.executeQuery(sql);
        while(count.next()){
            jml= count.getInt("urutan");
            }
        rs.close();
        count.close();
        }catch (Exception e){
            e.printStackTrace();
            }
        return ++jml;
    }
    
    public ArrayList<String> viewKdNvl() throws SQLException{
        ArrayList<String> viewNamaNvl = new ArrayList();
        try{
        Statement kt = koneksi.getConnection().createStatement();
        ResultSet rsKb = kt.executeQuery("select kode_novel, nama_novel from novel");
        while(rsKb.next()){
            viewNamaNvl.add(rsKb.getString("kode_novel")+ "  - " + (rsKb.getString("nama_novel")));
            }
        }catch (Exception e){
        e.printStackTrace();
           }
        return viewNamaNvl;
    }
    public ArrayList<String> viewIdPlg() throws SQLException{
        ArrayList<String> viewNamaPlg = new ArrayList();
        try{
        Statement kt = koneksi.getConnection().createStatement();
        ResultSet rsKb = kt.executeQuery("select id_pelanggan, nama from pelanggan");
        while(rsKb.next()){
            viewNamaPlg.add(rsKb.getString("id_pelanggan") + " - " + (rsKb.getString("nama")));
            }
        }catch (Exception e){
        e.printStackTrace();
           }
        return viewNamaPlg;
    }
    
}
