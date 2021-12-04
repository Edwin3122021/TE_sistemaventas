package com.emergentes.controlador;

import com.emergentes.dao.ClienteDAO;
import com.emergentes.dao.ClienteDAOimplementacion;
import com.emergentes.modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteControlador", urlPatterns = {"/ClienteControlador"})
public class ClienteControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Cliente cli = new Cliente();
            int id_cliente;
            ClienteDAO dao = new ClienteDAOimplementacion();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {
                case "add":
                    request.setAttribute("cliente", cli);
                    request.getRequestDispatcher("frmcliente.jsp").forward(request, response);

                    break;

                case "edit":
                    id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
                    cli = dao.getById(id_cliente);
                    request.setAttribute("cliente", cli);
                    request.getRequestDispatcher("frmcliente.jsp").forward(request, response);
                    break;

                case "delete":
                   
                    id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
                     //System.out.println("estOY ELIMINANDO" + id_cliente);
                    dao.delete(id_cliente);
                    response.sendRedirect("ClienteControlador");
                    
                    break;

                case "view":
                    //Obtener la lista de registros
                    //System.out.println("estamos aqui");
                    List<Cliente> lista = dao.getAll();
                    request.setAttribute("clientes", lista);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    break;

            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
        String carnet = request.getParameter("carnet");
        String apellido_paterno = request.getParameter("apellidoPaterno");
        String apellido_materno = request.getParameter("apellidoMaterno");
        String nombres = request.getParameter("nombres");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String fecha_nacimiento = request.getParameter("fechaNacimiento");

        Cliente cli = new Cliente();

        cli.setId_cliente(id_cliente);
        cli.setCarnet(carnet);
        cli.setApellido_paterno(apellido_paterno);
        cli.setApellido_materno(apellido_materno);
        cli.setNombres(nombres);
        cli.setDireccion(direccion);
        cli.setTelefono(telefono);
        cli.setFecha_nacimiento(fecha_nacimiento);

        ClienteDAO dao = new ClienteDAOimplementacion();
System.out.println("el valor de id es " + id_cliente);

        if (id_cliente == 0) {
            //Nuevo Registro
            try {
                dao.insert(cli);
            } catch (Exception ex) {
                System.out.println("Error al insertar" + ex.getMessage());
            }
        } else {
            try {
                //Edicion Registro
                dao.update(cli);
            } catch (Exception ex) {
                System.out.println("Error al editar" + ex.getMessage());
            }
        }

        response.sendRedirect("ClienteControlador");
    }

}
