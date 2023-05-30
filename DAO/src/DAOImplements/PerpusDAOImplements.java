/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;
import DAOs.*;
import java.util.List;
import java.sql.*;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import model.*;
import koneksi.Connector;
/**
 *
 * @author Lab Informatika
 */
public  class PerpusDAOImplements  implements PerpusDAO{
Connection con;

private static String select="select * FROM dataperpus";
private static String insert="insert into dataperpus(`id`, `judul`, `genre`, `penulis`, `penerbit`, `lokasi`, `stock`) VALUES (NULL, '?', '?', '?', '?', '?', '?')";
private static String update="update dataperpus set `judul` = '?', `genre` = '?', `penulis` = '?', `penerbit` = '?', `lokasi` = '?', `stock` = '?' WHERE `id` = ?";
private static String delete="DELETE FROM `dataperpus` WHERE `id` = ?";

public PerpusDAOImplements(){
con = Connector.connection();
}

    public void insert(Perpus p_s) {
        PreparedStatement statement = null;
        try{
        statement = con.prepareStatement(insert, RETURN_GENERATED_KEYS);
        statement.setString(1, p_s.getJudul());
        statement.setString(2, p_s.getGenre());
        statement.setString(3, p_s.getPenulis());
        statement.setString(4, p_s.getPenerbit());
        statement.setString(5, p_s.getLokasi());
        statement.setInt(6, p_s.getStock());
        statement.executeUpdate();
        ResultSet rs  = statement.getGeneratedKeys();
        while(rs.next()){
        p_s.getId();}
        }catch(SQLException ex){
        ex.printStackTrace();}
        finally{
    try{
    statement.close();}
    catch(SQLException ex){ex.printStackTrace();}
    }
    }

    public void update(Perpus p_s) {
         PreparedStatement statement = null;
        try{
        statement = con.prepareStatement(update);
        statement.setString(1, p_s.getJudul());
        statement.setString(2, p_s.getGenre());
        statement.setString(3, p_s.getPenulis());
        statement.setString(4, p_s.getPenerbit());
        statement.setString(5, p_s.getLokasi());
        statement.setInt(6, p_s.getStock());
        statement.setInt(7, p_s.getId());
        statement.executeUpdate();
        }catch(SQLException ex){
        ex.printStackTrace();}
        finally{
    try{
    statement.close();}
    catch(SQLException ex){ex.printStackTrace();}
    }
    }

    @Override
    public void delete(int id) {
         PreparedStatement statement = null;
        try{
        statement = con.prepareStatement(delete);
        statement.setInt(1,id);
        statement.executeUpdate();
        }catch(SQLException ex){
        ex.printStackTrace();}
        finally{
    try{
    statement.close();}
    catch(SQLException ex){ex.printStackTrace();}
    }
    }

    /**
     *
     * @return
     */
    public List<Perpus>getAll() {
       List<Perpus>p_s=null; 
       try{
        p_s = new ArrayList<Perpus>();
        Statement st =con.createStatement();
        ResultSet rs = st.executeQuery(select);
       while(rs.next()){
       Perpus ps= new Perpus();
       ps.setId(rs.getInt("id"));
       ps.setJudul(rs.getString("judul"));
       ps.setGenre(rs.getString("genre"));
       ps.setPenulis(rs.getString("penulis"));
       ps.setPenerbit(rs.getString("penerbit"));
       ps.setLokasi(rs.getString("lokasi"));
       ps.setStock(rs.getInt("stock"));
       p_s.add(ps);
       }
        }catch(SQLException ex){
       Logger.getLogger(PerpusDAO.class.getName()).log(Level.SEVERE, null, ex);}
    return p_s;}

    @Override
    public void insert(Object p_s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object p_s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
