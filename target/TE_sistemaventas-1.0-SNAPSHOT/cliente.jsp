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
    <title>Clientes</title>
    
  </head>
  
  <body>
    
    <div class="container">
        <h1>Cliente</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="clientes" />
        </jsp:include> 
        <br>
   <a href="ClienteControlador?action=add" class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i> Nuevo</a>   
   <br>
   <br>
  <table class="table table-sm">
  <thead class="thead-dark" align="center">
    <tr>
      <th scope="col">id_cliente</th>
      <th scope="col">Carnet</th>
      <th scope="col">Apellido<br>Paterno</th>
      <th scope="col">Apellido<br> Materno</th>
      <th scope="col">Nombres</th>
      <th scope="col">Direccion</th>
      <th scope="col">Telefono</th>
      <th scope="col">Fecha <br>Nacimiento</th>
       <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    
     <c:forEach var="item" items="${clientes}">  
           <tr>
      <td scope="row">${item.id_cliente}</td>
      <td>${item.carnet}</td>
      <td>${item.apellido_paterno}</td>
      <td>${item.apellido_materno}</td>
      <td>${item.nombres}</td>
      <td>${item.direccion}</td>
      <td>${item.telefono}</td>
      <td>${item.fecha_nacimiento}</td>
      <td><a href="ClienteControlador?action=edit&id_cliente=${item.id_cliente}"><i class="fas fa-edit"></i></a></td>
      <td><a href="ClienteControlador?action=delete&id_cliente=${item.id_cliente}" onclick = "return(confirm('Esta seguro de eliminar ??'))">
              <i class="fas fa-trash-alt"></i></a></td>
</tr>  
      </c:forEach>
  </tbody>
</table></div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

