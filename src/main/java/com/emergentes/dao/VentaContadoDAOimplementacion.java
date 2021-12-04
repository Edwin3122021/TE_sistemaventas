
package com.emergentes.dao;

import com.emergentes.modelo.VentaContado;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentaContadoDAOimplementacion extends ConexionDB implements VentaContadoDAO{

    @Override
    public void insert(VentaContado ventacontado) throws Exception {
    
     try{
         this.conectar();
         String sql = "INSERT INTO venta_contado(id_vendedor, id_cliente, id_automovil, precio, fecha) values (?,?,?,?,?)";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         
         ps.setInt(1, ventacontado.getId_vendedor());
         ps.setInt(2, ventacontado.getId_cliente());
         ps.setInt(3, ventacontado.getId_automovil());
         ps.setFloat(4, ventacontado.getPrecio());
         ps.setString(5, ventacontado.getFecha());
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
        
    }

    @Override
    public void update(VentaContado ventacontado) throws Exception {
       
    try{
         this.conectar();
         String sql = "UPDATE venta_contado SET id_vendedor = ?, id_cliente = ?, id_automovil = ?, precio = ?, fecha = ? WHERE id_venta = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         ps.setInt(1, ventacontado.getId_vendedor());
         ps.setInt(2, ventacontado.getId_cliente());
         ps.setInt(3, ventacontado.getId_automovil());
         ps.setFloat(4, ventacontado.getPrecio());
         ps.setString(5, ventacontado.getFecha());
         ps.setInt(6, ventacontado.getId_venta());
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public void delete(int id_venta) throws Exception {
    
    try{
         this.conectar();
         String sql = "DELETE  FROM venta_contado  WHERE id_venta = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         ps.setInt(1, id_venta);
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public VentaContado getById(int id_venta) throws Exception {
        
    VentaContado vc = new VentaContado();
    try{
         this.conectar();
         String sql = "SELECT * FROM venta_contado  WHERE id_venta = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         ps.setInt(1, id_venta);
         ResultSet rs = ps.executeQuery();
         
         if (rs.next()){
            vc.setId_venta(rs.getInt("id_venta"));
            vc.setId_vendedor(rs.getInt("id_vendedor"));
            
            vc.setId_cliente(rs.getInt("id_cliente"));
            vc.setId_automovil(rs.getInt("id_automovil"));
            vc.setPrecio(rs.getFloat("precio"));
            vc.setFecha(rs.getString("fecha"));
             
         }
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    return vc;
    }

    @Override
    public List<VentaContado> getAll() throws Exception {
      List<VentaContado> lista = null;
        try{
         this.conectar();
         String sql = "SELECT vendedor.id_vendedor, vendedor.nombres,automovil.marca,cliente.nombres,venta_contado.precio, venta_contado.fecha FROM vendedor ";
                sql +="INNER JOIN venta_contado ON vendedor.id_vendedor=venta_contado.id_vendedor";
                sql +="INNER JOIN cliente ON venta_contado.id_cliente=cliente.id_cliente";
                sql +="              INNER JOIN automovil ON venta_contado.id_automovil=automovil.id_automovil;";
         PreparedStatement ps = this.conn.prepareStatement(sql);
        
         ResultSet rs = ps.executeQuery();
         lista = new ArrayList<VentaContado>();
         while (rs.next()){
             VentaContado vc = new VentaContado();
            vc.setId_venta(rs.getInt("id_venta"));
            vc.setId_vendedor(rs.getInt("id_vendedor"));
            
            vc.setId_cliente(rs.getInt("id_cliente"));
             vc.setId_automovil(rs.getInt("id_automovil"));
            vc.setPrecio(rs.getFloat("precio"));
            vc.setFecha(rs.getString("fecha"));
            vc.setVendedor(rs.getString("vendedor"));
            vc.setAutomovil(rs.getString("automovil"));
            vc.setCliente(rs.getString("cliente"));
          
         
            lista.add(vc);
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
