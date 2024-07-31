<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Provedores</h1>

     <button onclick="window.location.href='/compras-inventario-web/provedores/findOne?opcion=1';return false ;">
         Agregar
        </button>
        
        <table>
           <thead>
                <tr>
                    <th> idProvedores</th>
                    <th> Nombre</th>
                    <th> Direcci�n</th>
                    <th> Tel�fono</th>
                    <th> Email</th>        
               </tr>
        </thead>
        <tbody>
           <c:forEach var="item" items="${provedores}">
                <tr> 
                    <td> ${item.idProvedores}</td>
                    <td> ${item.nombre}</td>
                    <td> ${item.direccion}</td>
                    <td> ${item.telefono}</td>
                    <td> ${item.email}</td>
                    <td> 
                          <button onclick="window.location.href='/compras-inventario-web/provedores/findOne?idProvedores=${item.idProvedores}&opcion=1';return false">
                          Actualizar
                          </button>
                          <button onclick="window.location.href='/compras-inventario-web/provedores/findOne?idProvedores=${item.idProvedores}&opcion=2';return false">
                          Eliminar
                          </button>             
                    </td>
               
               </tr>
            </c:forEach>
          </tbody>
        </table>
     

</body>
</html>