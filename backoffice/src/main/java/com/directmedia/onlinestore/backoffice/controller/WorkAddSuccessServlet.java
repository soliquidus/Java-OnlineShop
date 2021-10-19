package com.directmedia.onlinestore.backoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Work add success controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "WordAddSuccessServlet", urlPatterns = {"/work-add-success"})
public class WorkAddSuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><body>L'oeuvre a été ajoutée ! Son identifiant interne est " + request.getAttribute("identifiantOeuvre") + " <a href=\"home\">Retourner à l'accueil</a></body></html>");
    }
}
