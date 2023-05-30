/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class ModelPerpus extends AbstractTableModel {
List <Perpus> p_s;
 
    
    public ModelPerpus(List<Perpus>p_s){
    this.p_s = p_s;
    }
            
    @Override 
    public int getRowCount() {
       return p_s.size();
    }

    @Override
    public int getColumnCount() {
       return 7;
    }
    
    public String getColumnName(int column){
    switch(column){
    case 0 :
    return "id";
    case 1 :
    return "judul";
    case 2 :
    return "genre";
    case 3 :
    return "penulis";
     case 4 :
    return "penerbit";
    case 5 :
    return "lokasi";
    case 6 :
    return "stock";
    default :
    return null;}
    }

    @Override
    public Object getValueAt(int row, int column) {
       switch(column){
    case 0 :
    return p_s.get(row).getId();
    case 1 :
    return p_s.get(row).getJudul();
    case 2 :
    return p_s.get(row).getGenre();
    case 3 :
     return p_s.get(row).getPenulis();
     case 4 :
     return p_s.get(row).getPenerbit();
    case 5 :
    return p_s.get(row).getLokasi();
    case 6 :
    return p_s.get(row).getStock();
    default :
    return null;}
    }
    
}
