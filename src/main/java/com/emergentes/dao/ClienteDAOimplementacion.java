
package com.emergentes.dao;

import com.emergentes.modelo.Cliente;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOimplementacion extends ConexionDB implements ClienteDAO{

    @Override
    public void insert(Cliente cliente) throws Exception {
     try{
         this.conectar();
         PreparedStatement ps = this.conn.prepareStatement("INSERT INTO cliente(carnet,apellido_paterno,apellido_materno,nombres,direcion,telefono,fecha_nacimiento) values (?,?,?,?,?,?,?) ");
         ps.setString(1, cliente.getCarnet());
         ps.setString(2, cliente.getApellido_paterno());
         ps.setString(3, cliente.getApellido_materno());
         ps.setString(4, cliente.getNombres());
         ps.setString(5, cliente.getDireccion());
         ps.setString(6, cliente.getTelefono());
         ps.setString(7, cliente.getFecha_nacimiento());
       
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }
     

    @Override
    public void update(Cliente cliente) throws Exception {
       
        try{
         this.conectar();
         PreparedStatement ps = this.conn.prepareStatement("UPDATE cliente SET carnet = ?, apellido_paterno = ?, apellido_materno = ?, nombres = ?, direccion = ?, telefono = ?, fecha_nacimiento = ? WHERE id_cliente = ?");
         ps.setString(1, cliente.getCarnet());
         ps.setString(2, cliente.getApellido_paterno());
         ps.setString(3, cliente.getApellido_materno());
         ps.setString(4, cliente.getNombres());
         ps.setString(5, cliente.getDireccion());
         ps.setString(6, cliente.getTelefono());
         ps.setString(7, cliente.getFecha_nacimiento());
         ps.setInt(8, cliente.getId_cliente());
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
        
        
    }

    @Override
    public void delete(int id_cliente) throws Exception {
       
        try{
         this.conectar();
         PreparedStatement ps = this.conn.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?"); 
         
            ps.setInt(1, id_cliente);
            ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
    }

    @Override
    public Cliente getById(int id_cliente) throws Exception {
       Cliente cli = new Cliente();
        try{
         this.conectar();
         
         PreparedStatement ps = this.conn.prepareStatement("SELECT *FROM cliente WHERE id_cliente = ?"); 
         
            ps.setInt(1, id_cliente);
            ResultSet rs =ps.executeQuery();
            if (rs.next()){
            cli.setId_cliente(rs.getInt("id_cliente"));
            cli.setCarnet(rs.getString("carnet"));
            cli.setApellido_paterno(rs.getString("apellido_paterno"));
            cli.setApellido_materno(rs.getString("apellido_materno"));
            cli.setNombres(rs.getString("nombres"));
            cli.setDireccion(rs.getString("direccion"));
            cli.setTelefono(rs.getString("telefono"));
            cli.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
            }
       
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        return cli;
    }

    @Override
    public List<Cliente> getAll() throws Exception {
        List<Cliente> lista = null;
        try{
         this.conectar();
         
         PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM cliente"); 
         ResultSet rs = ps.executeQuery();
         lista = new ArrayList<Cliente>();
         while (rs.next())
           {
            
            Cliente cli = new Cliente();
            cli.setId_cliente(rs.getInt("id_cliente"));
            cli.setCarnet(rs.getString("carnet"));
            cli.setApellido_paterno(rs.getString("apellido_paterno"));
            cli.setApellido_materno(rs.getString("apellido_materno"));
            cli.setNombres(rs.getString("nombres"));
            cli.setDireccion(rs.getString("direccion"));
            cli.setTelefono(rs.getString("telefono"));
            cli.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
             
            lista.add(cli);
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
