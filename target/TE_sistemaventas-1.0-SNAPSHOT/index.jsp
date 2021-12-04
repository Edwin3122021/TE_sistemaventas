
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
        <h1>Sistema de Ventas</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="automovil" />
        </jsp:include> 
        <br>
   <a href="#" class="btn btn-primary btn-sm"><i class="fas fa-plus-circle"></i> Nuevo</a>   
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
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td><a href="#"><i class="fas fa-edit"></i></a></td>
      <td><a href="#"><i class="fas fa-trash-alt"></i></a></td>
    </tr>  
  </tbody>
</table></div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

