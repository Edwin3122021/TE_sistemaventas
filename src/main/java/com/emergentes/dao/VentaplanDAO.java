
package com.emergentes.dao;

import com.emergentes.modelo.Ventaplan;
import java.util.List;

public interface VentaplanDAO {
    
     public void insert(Ventaplan ventaplan) throws Exception;
    public void update(Ventaplan ventaplan) throws Exception;
    public void delete(int id_venta_plan)throws Exception;
    public Ventaplan getById(int id_venta_plan) throws Exception;
    public List<Ventaplan> getAll()throws Exception;
}
