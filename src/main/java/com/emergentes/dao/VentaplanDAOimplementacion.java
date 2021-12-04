
package com.emergentes.dao;

import com.emergentes.modelo.Ventaplan;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentaplanDAOimplementacion extends ConexionDB implements VentaplanDAO{

    @Override
    public void insert(Ventaplan ventaplan) throws Exception {
    
     try{
         this.conectar();
         PreparedStatement ps = this.conn.prepareStatement("INSERT INTO venta_plan(id_vendedor, id_automovil, id_cliente, total, monto_cuota, fecha_adjudicacion) values (?,?,?,?,?,?)");
        
         ps.setInt(1, ventaplan.getId_vendedor());
         ps.setInt(2, ventaplan.getId_automovil());
         ps.setInt(3, ventaplan.getId_cliente());
         ps.setFloat(4, ventaplan.getTotal());
         ps.setFloat(5, ventaplan.getMonto_cuota());
         ps.setDate(6, ventaplan.getFecha_adjudicacion());
        
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public void update(Ventaplan ventaplan) throws Exception {
    
        try{
         this.conectar();
         PreparedStatement ps = this.conn.prepareStatement("UPDATE venta_plan SET id_vendedor = ?, id_automovil = ?, id_cliente = ?, total = ?, monto_cuota = ?, fecha_adjudicacion = ?, WHERE id_venta_plan");
        
         ps.setInt(1, ventaplan.getId_vendedor());
         ps.setInt(2, ventaplan.getId_automovil());
         ps.setInt(3, ventaplan.getId_cliente());
         ps.setFloat(4, ventaplan.getTotal());
         ps.setFloat(5, ventaplan.getMonto_cuota());
         ps.setDate(6, ventaplan.getFecha_adjudicacion());
         ps.setInt(7, ventaplan.getId_venta_plan());
        
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public void delete(int id_venta_plan) throws Exception {
        
    try{
         this.conectar();
         String sql = "DELETE  FROM venta_plan WHERE id_venta_plan = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         ps.setInt(1, id_venta_plan);
               
        ps.executeUpdate();
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
    }

    @Override
    public Ventaplan getById(int id_venta_plan) throws Exception {
      Ventaplan vp  = new Ventaplan();
     try{
         this.conectar();
         String sql = "SELECT * FROM venta_plan  WHERE id_venta_plan = ?";
         PreparedStatement ps = this.conn.prepareStatement(sql);
         
         ps.setInt(1, id_venta_plan);
         ResultSet rs = ps.executeQuery();
         
         if (rs.next()){
           vp.setId_venta_plan(rs.getInt("id_venta_plan"));
           vp.setId_vendedor(rs.getInt("id_vendedor"));
          vp.setId_automovil(rs.getInt("id_automovil"));
           vp.setId_cliente(rs.getInt("id_cliente"));
          vp.setTotal(rs.getFloat("total"));
          vp.setMonto_cuota(rs.getFloat("monto_cuota"));
          vp.setFecha_adjudicacion(rs.getDate("fecha_adjudicacion"));
           
         }
        
        } catch (Exception e) {
          throw e;
         }finally {
          this.desconectar();
        }
     return vp;
    }

    @Override
    public List<Ventaplan> getAll() throws Exception {
        
    List<Ventaplan> lista = null;
        try{
         this.conectar();
         String sql = "SELECT vendedor.id_vendedor, vendedor.nombres, vendedor. apellido_paterno, cliente.nombres, cliente.apellido_paterno,automovil.marca, venta_plan.total, venta_plan.monto_cuota FROM vendedor ";
                sql +="INNER JOIN venta_plan ON vendedor.id_vendedor=venta_plan.id_vendedor ";
                sql +="IINNER JOIN cliente ON venta_plan.id_cliente=cliente.id_cliente ";
                sql +="              INNER JOIN automovil ON venta_plan.id_automovil=automovil.id_automovil;";
         PreparedStatement ps = this.conn.prepareStatement(sql);
        
         ResultSet rs = ps.executeQuery();
         lista = new ArrayList<Ventaplan>();
         while (rs.next()){
             Ventaplan vp = new Ventaplan();
            vp.setId_venta_plan(rs.getInt("id_venta_plan"));
            vp.setId_vendedor(rs.getInt("id_vendedor"));
            vp.setId_automovil(rs.getInt("id_automovil"));
            vp.setId_cliente(rs.getInt("id_cliente"));
            vp.setTotal(rs.getFloat("total"));
            vp.setMonto_cuota(rs.getFloat("monto_cuota"));
            vp.setFecha_adjudicacion(rs.getDate("fecha_adjudicacion"));
            vp.setCliente(rs.getString("cliente"));
            vp.setAutomovil(rs.getString("automovil"));
            vp.setVendedor(rs.getString("vendedor"));
            lista.add(vp);
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
