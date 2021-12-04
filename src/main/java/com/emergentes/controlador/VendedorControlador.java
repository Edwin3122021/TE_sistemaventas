
package com.emergentes.controlador;

import com.emergentes.dao.VendedorDAO;
import com.emergentes.dao.VendedorDAOimplementacion;
import com.emergentes.modelo.Vendedor;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "VendedorControlador", urlPatterns = {"/VendedorControlador"})
public class VendedorControlador extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
          try{
            
            Vendedor ven = new Vendedor();
            int id_vendedor;
            VendedorDAO dao = new VendedorDAOimplementacion();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action") : "view";
           
            switch(action){
                case "add":
                  request.setAttribute("vendedor", ven);
                    request.getRequestDispatcher("frmvendedor.jsp").forward(request, response);
                    break;
                    
                case "edit":
                    id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
                    ven = dao.getById(id_vendedor);
                    
                    request.setAttribute("vendedores", ven);
                    request.getRequestDispatcher("frmvendedor.jsp").forward(request, response);
                    break;
                    
                case "delete":
                    id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
                     //System.out.println("estOY ELIMINANDO" + id_cliente);
                    dao.delete(id_vendedor);
                    response.sendRedirect("VendedorControlador");
                    break;
                    
                case "view":
                    List<Vendedor> lista = dao.getAll();
                    request.setAttribute("vendedores", lista);
                    request.getRequestDispatcher("vendedor.jsp").forward(request, response);
                    break;
                    
            }
           }catch(Exception ex){
               System.out.println("Error" + ex.getMessage());
           }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
        String apellido_paterno = request.getParameter("apellidoPaterno");
        String apellido_materno = request.getParameter("apellidoMaterno");
        String nombres = request.getParameter("nombres");
        String cargo = request.getParameter("cargo");
        String fecha_ingreso = request.getParameter("fechaIngreso");

        Vendedor ven = new Vendedor();

        ven.setId_vendedor(id_vendedor);
        ven.setApellido_paterno(apellido_paterno);
        ven.setApellido_materno(apellido_materno);
        ven.setNombres(nombres);
        ven.setCargo(cargo);
        ven.setFecha_ingreso(fecha_ingreso);

        VendedorDAO dao = new VendedorDAOimplementacion();
System.out.println("el valor de id es " + id_vendedor);

        if (id_vendedor == 0) {
            //Nuevo Registro
            try {
                dao.insert(ven);
            } catch (Exception ex) {
                System.out.println("Error al insertar" + ex.getMessage());
            }
        } else {
            try {
                //Edicion Registro
                dao.update(ven);
            } catch (Exception ex) {
                System.out.println("Error al editar" + ex.getMessage());
            }
        }

        response.sendRedirect("vendedorControlador");
    }
      
    }

  
