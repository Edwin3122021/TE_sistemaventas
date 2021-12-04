
package com.emergentes.dao;

import com.emergentes.modelo.Automovil;
import java.util.List;

public interface AutomovilDAO {
 
     public void insert(Automovil automovil) throws Exception;
    public void update(Automovil automovil) throws Exception;
    public void delete(int id_automovil)throws Exception;
    public Automovil getById(int id_automovil) throws Exception;
    public List<Automovil> getAll()throws Exception;
    
}
