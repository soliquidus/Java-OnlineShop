package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * Work addition controller
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
@WebServlet(name = "AddWorkServlet", urlPatterns = {"/add-work"})
public class AddWorkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        boolean success = true;
        RequestDispatcher dispatcher = null;

        Work newWork = new Work(req.getParameter("title"));
        newWork.setGenre(req.getParameter("genre"));
        try {
            newWork.setRelease(Integer.parseInt(req.getParameter("release")));
        } catch (NumberFormatException nfe) {
            success = false;
        }
        newWork.setSummary(req.getParameter("summary"));
        newWork.setMainArtist(new Artist(req.getParameter("artist")));

//        For method
//        for (Work work : Catalogue.listOfWork) {
//            if (work.getTitle().equals(newWork.getTitle()) && work.getRelease() == newWork.getRelease()
//                    && work.getMainArtist().getName().equals(newWork.getMainArtist().getName())) {
//                success = false;
//                break;
//            }
//        }

//        Stream method
        Optional<Work> optionalWork = Catalogue.listOfWork.stream().filter(work -> work.getTitle().equals(newWork.getTitle()) &&
                work.getRelease() == newWork.getRelease() && work.getMainArtist().getName().equals(newWork.getMainArtist().getName())).findAny();
        if (optionalWork.isPresent()) {
            success = false;
        }
        if (success) {
            Catalogue.listOfWork.add(newWork);
            req.setAttribute("identifiantOeuvre", newWork.getId());
            dispatcher = req.getRequestDispatcher("/work-add-success");
            dispatcher.forward(req, resp);
        } else {
            dispatcher = req.getRequestDispatcher("/work-add-failure");
            dispatcher.forward(req, resp);
        }
    }
}

