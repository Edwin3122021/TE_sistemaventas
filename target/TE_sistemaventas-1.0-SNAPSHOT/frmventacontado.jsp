
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
        <h1>Formulario de Venta Contado</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="ventascontados" />
        </jsp:include> 
        <br>
   
   <form action="VentaControlador" method="post">
       <input type="hidden" name="id_venta" value="${venta_contado.id_venta}">
       
         <div  class="mb-3">
            <label for="" class="form-label">Vendedor</label>
            <input type="text" class="form-control" name="id_vendedor" value="${venta_contado.id_vendedor}" placeholder="Escriba su carnet">
            <select name="id_vendeor" class></select>
         </div>
        
        
         <div  class="mb-3">
            <label for="" class="form-label">Automovil</label>
            <input type="text" class="form-control" name="id_automovil" value="${venta_contado.id_automovil}" placeholder="Escriba su carnet">
        </div>
        
        
         <div  class="mb-3">
            <label for="" class="form-label">Cliente</label>
            <input type="text" class="form-control" name="id_cliente" value="${venta_contado.id_cliente}" placeholder="Escriba su carnet">
        </div>
        
       
       <div class="mb-3">
            <label for="" class="form-label">Precio</label>
            <input type="text" class="form-control" name="precio" value="${venta_contado.precio}" placeholder="Escribra su telefono">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Fecha</label>
            <input type="text" class="form-control" name="fecha" value="${venta_contado.fecha}" placeholder="Escribra su fecha nacimiento">
        </div>
 
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
   
    </div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>

