
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
        <h1>Formulario Cliente</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="clientes" />
        </jsp:include> 
        <br>
        

   
   <form action="ClienteControlador" method="post">
       <input type="hidden" name="id_cliente" value="${cliente.id_cliente}">
       
        <div  class="mb-3">
            <label for="" class="form-label">Carnet</label>
            <input type="text" class="form-control" name="carnet" value="${cliente.carnet}" placeholder="Escriba su carnet">
        </div>
        
        
       
        <div class="mb-3">
            <label for="" class="form-label">Apellido Paterno</label>
            <input type="text" class="form-control" name="apellidoPaterno" value="${cliente.apellido_paterno}" placeholder="Escribra su primer apellido">
        </div>
  
       
       <div class="mb-3">
            <label for="" class="form-label">Apellido Materno</label>
            <input type="text" class="form-control" name="apellidoMaterno" value="${cliente.apellido_materno}"placeholder="Escribra su segundo apellido">
        </div>
       
         <div class="mb-3">
            <label for="" class="form-label">Nombres</label>
            <input type="text" class="form-control" name="nombres" value="${cliente.nombres}" placeholder="Escribra su nombre">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Direccion</label>
            <input type="text" class="form-control" name="direccion" value="${cliente.direccion}"placeholder="Escribra su direccion">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Telefono</label>
            <input type="text" class="form-control" name="telefono" value="${cliente.telefono}" placeholder="Escribra su telefono">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Fecha Nacimiento</label>
            <input type="text" class="form-control" name="fechaNacimiento" value="${cliente.fecha_nacimiento}" placeholder="Escribra su fecha nacimiento">
        </div>
 
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
   
    </div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

