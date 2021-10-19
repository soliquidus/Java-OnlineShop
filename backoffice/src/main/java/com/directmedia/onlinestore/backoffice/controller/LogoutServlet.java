package com.directmedia.onlinestore.backoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Home controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.getSession().invalidate();
        out.println("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>OnlineStore - Gestion de la boutique</title>\n" +
                "</head><html> <body>\n");
        out.println("Vous avez été déconnecté cliquez<a href=\"login.jsp\">ici</a> pour vous reconnecter\n");
        out.println("</body></html>");
    }
}
