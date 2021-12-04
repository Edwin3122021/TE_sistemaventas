<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h1>Formulario de Automoviles</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="automoviles" />
        </jsp:include> 
        <br>
      
   <form action="AutomovilControlador" method="post">
       <input type="hidden" name="id_automovil" value="${automovil.id_automovil}">
       
        <div  class="mb-3">
            <label for="" class="form-label">Numero de Motor</label>
            <input type="text" class="form-control" name="num_motor" value="${automovil.num_motor}" placeholder="Escriba el numero de motor">
        </div>
        
       
       
         <div class="mb-3">
            <label for="" class="form-label">Modelo</label>
            <input type="text" class="form-control" name="modelo" value="${automovil.modelo}" placeholder="Escribra el modelo">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Marca</label>
            <input type="text" class="form-control" name="marca" value="${automovil.marca}"placeholder="Escribra la marca">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Color</label>
            <input type="text" class="form-control" name="color" value="${automovil.color}" placeholder="Escribra  el color">
        </div>
       
       
 
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
   
    </div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

