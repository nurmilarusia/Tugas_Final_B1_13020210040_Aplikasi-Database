/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.novel;
import model.novelinterfc;

/**
 *
 * @author User
 */
public class novelimplement implements novelinterfc {

    @Override
    public novel insert(novel o) throws SQLException {
        PreparedStatement st=koneksi.getConnection().prepareStatement
                ("INSERT into novel values(?,?,?,?)");
        st.setString(1, o.getkodeNovel());
        st.setString(2, o.getNamaNovel());
        st.setString(3, o.getJumlah()+ "");
        st.setString(4, o.getHarga()+ "");
        st.executeUpdate();
        return o;
       }

    @Override
    public void update(novel o) throws SQLException {
         PreparedStatement st=koneksi.getConnection().prepareStatement
                ("UPDATE novel set nama_novel=?, jumlah=? , harga=? where kode_novel=?");
        st.setString(1, o.getNamaNovel());
        st.setString(2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.setString(4, o.getkodeNovel());
        st.executeUpdate();
        }

    @Override
    public void delete(String kode_novel) throws SQLException {
        PreparedStatement st=koneksi.getConnection().prepareStatement
                ("delete from novel where kode_novel=?");
        st.setString(1, kode_novel);
        st.executeUpdate();
        }

    @Override
    public List getAll() throws SQLException {
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from novel");
        List<novel> list = new ArrayList<novel>();
        while(rs.next()){
        novel nvl = new novel();
        nvl.setkodeNovel(rs.getString("kode_novel"));
        nvl.setNamaNovel(rs.getString("nama_novel"));
        nvl.setJumlah(rs.getString("jumlah"));
        nvl.setHarga(rs.getString("harga"));
        list.add(nvl);
        }
        return list;
       }
    
}
