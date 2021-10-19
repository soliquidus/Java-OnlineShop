package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Connexion controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "AuthentificationServlet", urlPatterns = {"/login"})
public class AuthentificationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.print("<head>\n<meta charset=\"UTF-8\">\n<title>OnlineStore - Gestion de la boutique</title>\n</head><html> <body>\n");
        if(login.equals("michel") && password.equals("123456") || login.equals("caroline") && password.equals("abcdef")){
            out.print("<a href=\"home\">Accès à la page d'accueil</a>");
            HttpSession session = req.getSession();
            session.setAttribute("login",login);
        } else {
            out.print("Login ou mot de passe erronés<br><a href=\"login.jsp\">Nouvelle tentative</a>");
        }
        out.print("</body></html>");
    }
}
