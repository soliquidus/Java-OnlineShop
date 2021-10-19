package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WorkDetailsServlet", urlPatterns = {"/work-details"})
public class WorkDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("id");
//        Java 8 stream
//        Work work = Catalogue.listOfWork.stream().filter(w -> w.getId() == Long.parseLong(id)).findFirst().get();

        Work work = null;
        for (Work w : Catalogue.listOfWork) {
            if (w.getId() == Long.parseLong(id)) {
                work = w;
                break;
            }
        }
        out.print("<head>\n<meta charset=\"UTF-8\">\n <title>Descriptif de l'oeuvre</title>\n</head><html> <body>\n");
        out.print("<h1>Descriptif de l'oeuvre</h1><br/>\n");
        out.print("Titre : " + work.getTitle() + "<br>");
        out.print("Année de parution : " + work.getRelease() + " <br>");
        out.print("Artiste : " + work.getMainArtist().getName() + " <br>");
        out.print("Genre : " + work.getGenre() + "<br>");
        out.print("Résumé : " + work.getSummary() + " <br>");
        out.print("<form action=\"addToCart\" method=\"post\">");
        out.print("<input type=\"hidden\" name=\"identifiant\" value=\"" + work.getId() + "\"/>");
        out.print("<input type=\"submit\" value=\"Ajouter au caddie\"/>");
        out.print("</form></body></html>");
    }
}
