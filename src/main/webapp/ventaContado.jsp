<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
  <head>
      
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <title>Sistema de Ventas</title>
    
  </head>
  
  <body>
    
    <div class="container">
        <h1>Venta al Contado</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="ventascontados" />
        </jsp:include> 
        <br>
   <a href="VentaControlador?action=add" class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i> Nuevo</a>
   <br>
   <br>
  <table class="table table-sm">
  <thead class="thead-dark" align="center">
    <tr>
      <th scope="col">id_venta</th>
      <th scope="col">Nombre<br>Vendedor</th>
         <th scope="col">Nombre<br>Cliente</th>
       <th scope="col">Marca<br>Automovil</th>  
      <th scope="col">Precio</th>
      <th scope="col">Fecha</th>
       <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="item" items="${ventascontados}">  
    <tr>
      <td scope="row">${item.id_venta}</td>
      <td>${item.vendedor}</td>
      <td>${item.cliente}</td>
      <td>${item.automovil}</td>
      <td>${item.precio}</td>
      <td>${item.fecha}</td>
      
      <td><a href="VentaControlador?action=edit&id_venta=${item.id_venta}"><i class="fas fa-edit"></i></a></td>
      <td><a href="VentaControlador?action=delete&id_venta=${item.id_venta}" onclick = "return(confirm('Esta seguro de eliminar ??'))">
              <i class="fas fa-trash-alt"></i></a></td>
    </tr>  
     </c:forEach>
  </tbody> 

</table></div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

