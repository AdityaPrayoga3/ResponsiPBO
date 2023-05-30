/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import java.util.*;
import model.*;
import model.Perpus;
/**
 *
 * @author Lab Informatika
 */
public interface PerpusDAO<Perpus> {
    public void insert(Perpus p_s);
    public void update(Perpus p_s);
    public void delete(int id);
    List<Perpus>getAll();
}
