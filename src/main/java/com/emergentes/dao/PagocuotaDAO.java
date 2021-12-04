
package com.emergentes.dao;

import com.emergentes.modelo.Pagocuota;
import java.util.List;

public interface PagocuotaDAO {

    public void insert(Pagocuota pagocuota) throws Exception;
    public void update(Pagocuota pagocuota) throws Exception;
    public void delete(int id_cuota)throws Exception;
    public Pagocuota getById(int id_cuota) throws Exception;
    public List<Pagocuota> getAll()throws Exception; 
}
