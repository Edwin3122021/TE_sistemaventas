<%
String opcion = request.getParameter("opcion");
%>
  <ul class="nav nav-tabs">
      
  <li class="nav-item">
    <a class="nav-link <%= (opcion.equals("cliente") ? "active" : "") %>" href="ClienteControlador">Cliente</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link <%= (opcion.equals("automovil") ? "active" : "") %>" href="AutomovilControlador">Automovil</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link <%= (opcion.equals("vendedor") ? "active" : "") %>" href="VendedorControlador">Vendedor</a>
  </li>
  
   <li class="nav-item">
    <a class="nav-link <%= (opcion.equals("venta_contado") ? "active" : "") %>" href="VentaControlador">Venta al Contado</a>
  </li>
  
  
 
 
  
</ul>
