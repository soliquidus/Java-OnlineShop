package com.directmedia.onlinestore.frontoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * The type Home servlet.
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        out.println("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>OnlineStore</title>\n" +
                "</head><html> <body>\n");
                out.println("<h1>OnlineStore, votre boutique multimédia en ligne !</h1>\n");
                out.println("<a href=\"catalogue\">Accès au catalogue</a>");
                out.println("</body></html>");
    }
}
