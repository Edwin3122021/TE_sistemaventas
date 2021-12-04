
package com.emergentes.dao;

import com.emergentes.modelo.Automovil;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AutomovilDAOimplementacion extends ConexionDB implements AutomovilDAO{

    @Override
    public void insert(Automovil automovil) throws Exception {
     
     try{
         this.conectar();
         String sql = "INSERT INTO automovil(num_motor,modelo,marca,color) values (?,?,?,?)";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setString(1, automovil.getNum_motor());
         ps.setString(2, automovil.getModelo());
         ps.setString(3, automovil.getMarca());
         ps.setString(4, automovil.getColor());
        
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
    }

    @Override
    public void update(Automovil automovil) throws Exception {
    
    try{
         this.conectar();
         String sql = "UPDATE automovil SET num_motor = ?, modelo = ?, marca = ?, color = ? WHERE id_automovil = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setString(1, automovil.getNum_motor());
         ps.setString(2, automovil.getModelo());
         ps.setString(3, automovil.getMarca());
         ps.setString(4, automovil.getColor());
         ps.setInt(5, automovil.getId_automovil());
         ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public void delete(int id_automovil) throws Exception {
    
    try{
         this.conectar();
         String sql = "DELETE FROM automovil WHERE id_automovil=?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setInt(1,id_automovil);
         ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
    }

    @Override
    public Automovil getById(int id_automovil) throws Exception {
     Automovil auto = new Automovil();
     try{
         this.conectar();
         String sql = "SELECT * FROM automovil WHERE id_automovil = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setInt(1,id_automovil);
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
         auto.setId_automovil(rs.getInt("id_automovil"));
         auto.setNum_motor(rs.getString("num_motor"));
         auto.setModelo(rs.getString("modelo"));
         auto.setMarca(rs.getString("marca"));
         auto.setColor(rs.getString("color"));
         }
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    
  return auto;
    }

    @Override
    public List<Automovil> getAll() throws Exception {
       List<Automovil> lista = null;
     try{
         this.conectar();
         String sql = "SELECT * FROM automovil";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
         lista = new ArrayList<Automovil>();
         
         while(rs.next()){
            Automovil a = new Automovil();
            a.setId_automovil(rs.getInt("id_automovil"));
            a.setNum_motor(rs.getString("num_motor"));
            a.setModelo(rs.getString("modelo"));
            a.setMarca(rs.getString("marca"));
            a.setColor(rs.getString("color"));
            lista.add(a);
         }
        rs.close();
        ps.close();
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
     return lista;
    }
    
}
    

