
package com.emergentes.controlador;

import com.emergentes.dao.AutomovilDAO;
import com.emergentes.dao.AutomovilDAOimplementacion;
import com.emergentes.dao.ClienteDAO;
import com.emergentes.dao.ClienteDAOimplementacion;
import com.emergentes.dao.VendedorDAO;
import com.emergentes.dao.VendedorDAOimplementacion;
import com.emergentes.dao.VentaContadoDAO;
import com.emergentes.dao.VentaContadoDAOimplementacion;
import com.emergentes.modelo.Automovil;
import com.emergentes.modelo.Cliente;
import com.emergentes.modelo.Vendedor;
import com.emergentes.modelo.VentaContado;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "VentaControlador", urlPatterns = {"/VentaControlador"})
public class VentaControlador extends HttpServlet {
 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          try{
           VentaContadoDAO dao = new VentaContadoDAOimplementacion();
           ClienteDAO daoCliente = new ClienteDAOimplementacion();
           AutomovilDAO daoAutomovil = new AutomovilDAOimplementacion();
           VendedorDAO daoVendedor = new VendedorDAOimplementacion();
           
            int id_venta;
            List<Vendedor> lista_vendedor = null;
            List<Automovil> lista_automovil = null;
           List<Cliente> lista_cliente = null;
           VentaContado vc = new VentaContado();
           
           String action = (request.getParameter("action")!= null) ? request.getParameter("action") : "view";
      
      switch (action)
      {
          case "add":
              lista_vendedor = daoVendedor.getAll();
              lista_automovil = daoAutomovil.getAll();
              lista_cliente = daoCliente.getAll();
              request.setAttribute("lista_vendedor", lista_vendedor);
              request.setAttribute("lista_automovil", lista_automovil);
              request.setAttribute("lista_cliente", lista_cliente);
              
             request.setAttribute("ventacontado", vc);
             request.getRequestDispatcher("frmventacontado.jsp").forward(request, response);
          
              
              lista_vendedor = daoVendedor.getAll();
              lista_automovil = daoAutomovil.getAll();
              lista_cliente = daoCliente.getAll();
              
              request.setAttribute("lista_vendedor", lista_vendedor);
              request.setAttribute("lista_automovil", lista_automovil);
              request.setAttribute("lista_cliente", lista_cliente);
               
             
              break;
          
          case "edit":
             
              
              id_venta = Integer.parseInt(request.getParameter("id_venta"));
              vc = dao.getById(id_venta);
              
              request.setAttribute("ventacontado", vc);
               request.getRequestDispatcher("frmventacontado.jsp").forward(request, response);
              
              break;
          
          case "delete":
              break;
          
          case "view":
              //Ordenar la lista de registros de la tabla ventaContado
               System.out.println("estamos aqui");
              List<VentaContado> lista = dao.getAll();
              request.setAttribute("ventascontados", lista);
              request.getRequestDispatcher("ventaContado.jsp").forward(request, response);
              break;
      }
      
        } catch(Exception ex)
        {
            System.out.println("Error " + ex.getMessage());
        }
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
