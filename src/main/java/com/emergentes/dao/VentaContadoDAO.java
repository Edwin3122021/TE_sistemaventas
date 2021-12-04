
package com.emergentes.dao;

import com.emergentes.modelo.VentaContado;
import java.util.List;

public interface VentaContadoDAO {
    
    public void insert(VentaContado ventacontado) throws Exception;
    public void update(VentaContado ventacontado) throws Exception;
    public void delete(int id_venta)throws Exception;
    public VentaContado getById(int id_venta) throws Exception;
    public List<VentaContado> getAll()throws Exception;
}
