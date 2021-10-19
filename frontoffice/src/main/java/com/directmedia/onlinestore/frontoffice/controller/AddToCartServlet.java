package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.ShoppingCart;
import com.directmedia.onlinestore.core.entity.Work;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * Class AddToCartServlet, the Cart controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19 /10/2021
 */
@WebServlet(name = "AddToCartServlet", urlPatterns = {"/addToCart"})
public class AddToCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            Get parameter id
        String idAsString = request.getParameter("identifiant");
        long idAsLong = Long.parseLong(idAsString);

        ShoppingCart cart = (ShoppingCart) request.getSession().getAttribute("cart");

//            If customer doesn't have a cart we need ton instantiate it
        if (cart == null) {
            cart = new ShoppingCart();
            request.getSession().setAttribute("cart", cart);
        }

//            Checking if selected work exists than adding it to the cart
//            Without stream method
//            for(Work work  : Catalogue.listOfWork){
//                if(work.getId() == idAsLong){
//                    cart.getItems().add(work);
//                }
//            }
//            With stream method
        Optional<Work> optionalWork = Catalogue.listOfWork.stream().filter(work -> work.getId() == idAsLong).findAny();
        if (optionalWork.isPresent()) {
            cart.getItems().add(optionalWork.get());
        }
        PrintWriter out = response.getWriter();
        out.print("<html><body>Oeuvre ajoutée au panier ("+ cart.getItems().size() +")<br><a href=\"catalogue\">Retourner au catalogue</a></body></html>");
    }
}