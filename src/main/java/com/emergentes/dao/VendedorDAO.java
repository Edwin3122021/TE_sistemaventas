
package com.emergentes.dao;

import com.emergentes.modelo.Vendedor;
import java.util.List;

public interface VendedorDAO {
   
     public void insert(Vendedor vendedor) throws Exception;
     public void update(Vendedor vendedor) throws Exception;
    public void delete(int id_vendedor)throws Exception;
    public Vendedor getById(int id_vendedor) throws Exception;
    public List<Vendedor> getAll()throws Exception;
}
