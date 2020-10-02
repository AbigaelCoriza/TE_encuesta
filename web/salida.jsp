<%@page import="com.emergentes.modelo.Encuesta" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   Encuesta encu =(Encuesta)request.getAttribute("miencu");
%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gracias por participar</h1>
        <p>Su nombre es :  <%=encu.getNombre()%></p>
        <p>Los lenguajes de su preferencia son:</p>
           <ul>
               <%
            String lenguajes[]= encu.getLenguaje();
            if(lenguajes !=null){
                for( int i=0;i< lenguajes.length; i++){
            
             %>
        
            <li> <%=lenguajes [i] %></li>
        
             <% 
                 }
}
             %>
             </ul> 
    </body>
</html>
