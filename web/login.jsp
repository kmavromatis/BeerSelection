<%-- 
    Document   : result
    Created on : Oct 11, 2016, 8:39:37 PM
    Author     : user
--%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Beers select</title>
    </head>
    <body>
        
        <p>
            
            <%
                List info = (List)request.getAttribute("info");
                out.print("Hello,"+info.get(0)+" ("+info.get(1)+") ,born in "+info.get(2)+"\n");
                int sessions = (Integer)request.getAttribute("sessions");
                out.println("There are "+sessions+" active sessions");
                %>    
        
       <h1 align="center">Beer Selection Page</h1>
        <form method="POST" action="SelectBeer.do">
            <center>
                Select beer characteristics:<p>
                    Color:

                    <select name="color" size="1">
                        <option>yellow</option>
                        <option>amber</option>
                        <option>brown</option>
                        <option>dark</option>
                    </select>
                    <br>
                    <br>

                    Country:

                    <select name="country" size="1">
                        <option>Greek</option>
                        <option>non-Greek</option>

                    </select>
                    <br>
                    <br>


                    <input type="SUBMIT">
            </center>
        </form>
    </body>
</html>