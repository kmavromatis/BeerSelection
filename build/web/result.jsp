<%-- 
    Document   : result
    Created on : Oct 11, 2016, 8:39:37 PM
    Author     : user
--%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Beers</title>
    </head>
    <body>
        <h1 allign = "center">Beer Reccommendations (jsp)</h1>
        <p>
            
            <%
                List styles = (List)request.getAttribute("styles");
                Iterator it = styles.iterator();
                while(it.hasNext()){
                    out.print("<br>try: "+it.next());
                }
                
            %>    
        
        
    </body>
</html>
