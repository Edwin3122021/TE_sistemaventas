
package com.emergentes.dao;

import com.emergentes.modelo.Vendedor;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAOimplementacion extends ConexionDB implements VendedorDAO{

    @Override
    public void insert(Vendedor vendedor) throws Exception {
    
    try{
         this.conectar();
         String sql = "INSERT INTO vendedor(apellido_paterno,apellido_materno,nombres,cargo,fecha_ingreso) values (?,?,?,?,?)";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setString(1, vendedor.getApellido_paterno());
         ps.setString(2, vendedor.getApellido_materno());
         ps.setString(3, vendedor.getNombres());
         ps.setString(4, vendedor.getCargo());
         ps.setString(5, vendedor.getFecha_ingreso());
         
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
    }

    @Override
    public void update(Vendedor vendedor) throws Exception {
    
      try{
         this.conectar();
         String sql = "UPDATE vendedor SET apellido_paterno = ?, apellido_materno = ?, nombres = ?, cargo = ?, fecha_ingreso = ? WHERE id_vendedor = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setString(1, vendedor.getApellido_paterno());
         ps.setString(2, vendedor.getApellido_materno());
         ps.setString(3, vendedor.getNombres());
         ps.setString(4, vendedor.getCargo());
         ps.setString(5, vendedor.getFecha_ingreso());
         ps.setInt(6, vendedor.getId_vendedor());
         
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public void delete(int id_vendedor) throws Exception {
    
        
     try{
         this.conectar();
         String sql = "DELETE FROM vendedor WHERE id_vendedor=?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setInt(1,id_vendedor);
         ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public Vendedor getById(int id_vendedor) throws Exception {
     Vendedor ven = new Vendedor();
     try{
         this.conectar();
         String sql = "SELECT * FROM vendedor WHERE id_vendedor = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ps.setInt(1,id_vendedor);
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
         ven.setId_vendedor(rs.getInt("id_vendedor"));
         ven.setApellido_paterno(rs.getString("apellido_paterno"));
         ven.setApellido_materno(rs.getString("apellido_materno"));
         ven.setNombres(rs.getString("nombres"));
         ven.setCargo(rs.getString("cargo"));
         ven.setFecha_ingreso(rs.getString("fecha_ingreso"));
         }
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
      return ven;
    }

    @Override
    public List<Vendedor> getAll() throws Exception {
     List<Vendedor> lista = null;   
     try{
         this.conectar();
         String sql = "SELECT * FROM vendedor";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
         lista = new ArrayList<Vendedor>();
         
         while(rs.next()){
            Vendedor v = new Vendedor();
            v.setId_vendedor(rs.getInt("id_vendedor"));
            v.setApellido_paterno(rs.getString("apellido_paterno"));
            v.setApellido_materno(rs.getString("apellido_materno"));
            v.setNombres(rs.getString("nombres"));
            v.setCargo(rs.getString("cargo"));
            v.setFecha_ingreso(rs.getString("fecha_ingreso"));
            lista.add(v);
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
