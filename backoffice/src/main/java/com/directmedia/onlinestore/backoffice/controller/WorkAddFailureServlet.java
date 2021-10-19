package com.directmedia.onlinestore.backoffice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Work add exceptions controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "WordAddFailureServlet", urlPatterns = {"/work-add-failure"})
public class WorkAddFailureServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><body>Une erreur est survenue, l'oeuvre n'a pas été ajoutée ! <a href=\"home\">Retourner à l'accueil</a></body></html>");
    }
}
