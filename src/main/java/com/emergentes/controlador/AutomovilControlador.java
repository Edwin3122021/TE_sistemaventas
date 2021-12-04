
package com.emergentes.controlador;

import com.emergentes.dao.AutomovilDAO;
import com.emergentes.dao.AutomovilDAOimplementacion;
import com.emergentes.modelo.Automovil;
import java.io.IOException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AutomovilControlador", urlPatterns = {"/AutomovilControlador"})
public class AutomovilControlador extends HttpServlet {
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       try{
           AutomovilDAO dao = new AutomovilDAOimplementacion();
           Automovil auto = new Automovil();
          int id_automovil;
            String action = (request.getParameter("action")!= null) ? request.getParameter("action") : "view";
           
            switch(action){
                case "add":
                    request.setAttribute("automovil",auto);
                    request.getRequestDispatcher("frmautomovil.jsp").forward(request, response);
                    
                    
                    break;
                    
                case "edit":
                    id_automovil = Integer.parseInt(request.getParameter("id_automovil"));
                    auto = dao.getById(id_automovil);
                    request.setAttribute("automovil",auto);
                    request.getRequestDispatcher("frmautomovil.jsp").forward(request, response);
                    break;
                    
                case "delete":
                   id_automovil = Integer.parseInt(request.getParameter("id_automovil"));
                    dao.delete(id_automovil);
                    response.sendRedirect("AutomovilControlador");
                    break;
                    
                case "view":
                    //Obtener la lista de registros 
                    //System.out.println("estamos aqui");
                    List<Automovil> lista = dao.getAll();
                    request.setAttribute("automoviles", lista);
                    request.getRequestDispatcher("automovil.jsp").forward(request, response);
                   
                    break;
                    
            }
           }catch(Exception ex){
               System.out.println("Error" + ex.getMessage());
           }

        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
        int id_automovil = Integer.parseInt(request.getParameter("id_automovil"));
        String num_motor = request.getParameter("num_motor");
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        String color = request.getParameter("color");
        
        Automovil auto = new Automovil();
        
        auto.setId_automovil(id_automovil);
        auto.setNum_motor(num_motor);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        AutomovilDAO dao = new AutomovilDAOimplementacion();
        
        if(id_automovil==0){
            try {
                dao.insert(auto);
            } catch (Exception ex) {
               System.out.println("Error al insertar"+ex.getMessage());
            }
        
        
        }else{
            try {
                //Edicion de registro
                dao.update((auto));
            } catch (Exception ex) {
                System.out.println("Error al editar"+ex.getMessage());
            }
        }
        response.sendRedirect("AutomovilControlador");
    }

   

}
