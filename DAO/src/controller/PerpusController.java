/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import model.*;
import model.ModelPerpus;
import view.*;
import DAOImplements.*;
/**
 *
 * @author Lab Informatika
 */
public class PerpusController {
    Perpustakaan pustaka;
    PerpusDAOImplements dataImpl;
    List<Perpus>p_s;
    
    public PerpusController(Perpustakaan pustaka){
    this.pustaka = pustaka;
    dataImpl = new PerpusDAOImplements();
    p_s = dataImpl.getAll();}
    
    public void isiTabel(){
    p_s = dataImpl.getAll();
    ModelPerpus mp = new ModelPerpus(p_s);
    pustaka.getTablePerpus().setModel(mp);}
    
    public void insert(){
    Perpus ps = new Perpus();
    ps.setJudul(pustaka.getPerpustakaanJudul().getText());}
    
}
