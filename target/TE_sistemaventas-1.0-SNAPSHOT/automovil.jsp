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
 
    <title>Automovil</title>
    
  </head>
  
  <body>
    
    <div class="container">
        <h1>Automovil</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="automoviles" />
        </jsp:include> 
        <br>
   <a href="AutomovilControlador?action=add" class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i> Nuevo</a>   
  
    <br>
   <br>
  <table class="table table-sm">
  <thead class="thead-dark" align="center">
    <tr>
      <th scope="col">id_automovil</th>
      <th scope="col">Numero Motor</th>
      <th scope="col">Modelo</th>
      <th scope="col">Marca</th>
      <th scope="col">Color</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="item" items="${automoviles}"> 
    <tr>
      <td scope="row">${item.id_automovil}</td>
      <td>${item.num_motor}</td>
      <td>${item.modelo}</td>
      <td>${item.marca}</td>
      <td>${item.color}</td>
      <td><a href="AutomovilControlador?action=edit&id_automovil=${item.id_automovil}"><i class="fas fa-edit"></i></a></td>
      <td><a href="AutomovilControlador?action=delete&id_automovil=${item.id_automovil}" onclick = "return(confirm('Esta seguro de eliminar ??'))">
              <i class="fas fa-trash-alt"></i></a></td>

    </tr>
    </c:forEach>
  
  </tbody>
</table>
   
</div>
  
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>


