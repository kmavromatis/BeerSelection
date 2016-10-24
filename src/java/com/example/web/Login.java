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
import com.example.model.Uthldap;
import com.example.model.ActiveSessions;

public class Login extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        ActiveSessions activeSessions = new ActiveSessions();
        String passwd = request.getParameter("psw");
        String user = request.getParameter("uname");
        Uthldap ldap = new Uthldap(user, passwd);

        if (ldap.auth()) {
            int totalsessions = activeSessions.getActiveSessions();
            List info = new ArrayList();
            info.add(ldap.getName());
            info.add(ldap.getDept());
            info.add(ldap.getBirthYear());
            request.setAttribute("info", info);
            request.setAttribute("sessions", totalsessions);
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request, response);

            //out.println("<html><body>Autheticated Youre name is:" + ldap.getName() +"</body></html>");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<html><body>Authetication failed</body></html>");
        }

    }
}
