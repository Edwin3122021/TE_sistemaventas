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
        <h1>Formulario Vendedor</h1>
        <jsp:include page="META-INF/menu.jsp">
            <jsp:param name="opcion" value="vendedores" />
        </jsp:include> 
        <br>
         

   
   <form action="VendedorControlador" method="post">
       <input type="hidden" name="id_vendedor" value="${vendedor.id_vendedor}">
        
        <div class="mb-3">
            <label for="" class="form-label">Apellido Paterno</label>
            <input type="text" class="form-control" name="apellidoPaterno" value="${vendedor.apellido_paterno}" placeholder="Escribra su primer apellido">
        </div>
  
       
       <div class="mb-3">
            <label for="" class="form-label">Apellido Materno</label>
            <input type="text" class="form-control" name="apellidoMaterno" value="${vendedor.apellido_materno}"placeholder="Escribra su segundo apellido">
        </div>
       
         <div class="mb-3">
            <label for="" class="form-label">Nombres</label>
            <input type="text" class="form-control" name="nombres" value="${vendedor.nombres}" placeholder="Escribra su nombre">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Cargo</label>
            <input type="text" class="form-control" name="cargo" value="${vendedor.telefono}" placeholder="Escribra su cargo">
        </div>
       
       <div class="mb-3">
            <label for="" class="form-label">Fecha Ingreso</label>
            <input type="text" class="form-control" name="fechaIngreso" value="${vendedor.fecha_ingreso}" placeholder="Escribra su fecha ingreso">
        </div>
 
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
    
</div>
  
 
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>


    
  </body>
</html>


