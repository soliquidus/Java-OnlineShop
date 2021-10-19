package com.directmedia.onlinestore.backoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Logout Controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>OnlineStore - Gestion de la boutique</title>\n" +
                "</head><html> <body>\n");
        out.println("<h1>OnlineStore - Gestion de la boutique</h1>\n");
        out.println("Bonjour " + request.getSession().getAttribute("login") + "<a href=\"logout\"> (Déconnexion)</a><br>");
        out.println("<a href=\"catalogue\">Accès au catalogue</a><br>");
        out.println("<a href=\"add-work-form.jsp\">Ajouter au catalogue</a>");
        out.println("</body></html>");
    }
}
