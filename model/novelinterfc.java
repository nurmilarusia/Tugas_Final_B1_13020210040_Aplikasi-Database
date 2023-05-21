/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.List;
import model.novel;

/**
 *
 * @author User
 */
public interface novelinterfc {
    novel insert(novel o) throws SQLException;
    void update(novel o) throws SQLException;
    void delete(String kode_novel) throws SQLException;
    List getAll() throws SQLException;
    
}
