/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author user
 */
import com.example.model.BeerExpert;
public class BeerSelect extends HttpServlet  {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
throws IOException, ServletException {
        //response.setContentType("text/html");
       // PrintWriter out=response.getWriter();
        String c = request.getParameter("color");
        String c2 = request.getParameter("country");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c,c2);
        
        
       request.setAttribute("styles",result);
       RequestDispatcher view = request.getRequestDispatcher("result.jsp");
       view.forward(request,response);
        
        
    }
    
}
