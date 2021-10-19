package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {

    public static void main(String[] args) {
        Artist tomCruise = new Artist("Tom Cruise");
        Artist michaelJackson = new Artist("Michael Jackson");
        Artist louisDeFunes = new Artist("Louis De Funés");

        Work minorityReport = new Work("Minority Report");
        Work bad = new Work("Bad");
        Work leGendarme = new Work("Le gendarme de Saint-Tropez");

        minorityReport.setMainArtist(tomCruise);
        bad.setMainArtist(michaelJackson);
        leGendarme.setMainArtist(louisDeFunes);

        minorityReport.setRelease(2002);
        bad.setRelease(1987);
        leGendarme.setRelease(1964);

        minorityReport.setSummary("En 2054, la société du futur a éradiqué les crimes en se dotant d'un système de prévention," +
                " détection et répression le plus sophistiqué du monde. Dissimulés de tous, trois extras-lucides transmettent les " +
                "images des crimes à venir aux policiers de la Précrime. Cependant, un jour, John, le chef de brigade, reçoit l'impossible" +
                " : sa propre image assassinant un inconnu. Démarre alors une course contre la montre pour prouver son innocence.");
        bad.setSummary("Bad est le septième album solo de Michael Jackson et son troisième album solo chez Epic Records. Coproduit par Michael " +
                "Jackson, il est le troisième et dernier album produit par Quincy Jones. Sorti le 31 août 1987, ce disque fut probablement le plus " +
                "attendu des années 1980 car il devait succéder à Thriller (1982), l'album le plus vendu au monde. ");
        leGendarme.setSummary("Suite à une promotion, le gendarme Cruchot doit quitter son petit village provençal pour aller s'installer à Saint-Tropez." +
                " Une fois sur place, le gendarme fait preuve de beaucoup d'ambition et de dynamisme. Folle de joie, sa fille le suit et ne tarde pas à se" +
                " faire de nouvelles relations parmi les estivants. Au grand désarroi de son père, elle se fait passer pour la fille d'un milliardaire, ce " +
                "qui va lui valoir de sacrés ennuis.");

        minorityReport.setGenre("Science Fiction");
        bad.setGenre("Pop");
        leGendarme.setGenre("Comédie");

        Catalogue.listOfWork.add(minorityReport);
        Catalogue.listOfWork.add(bad);
        Catalogue.listOfWork.add(leGendarme);

        for(Work work : Catalogue.listOfWork) {
            System.out.println(work.getTitle() + " (" + work.getRelease() + ")");
        }
    }
}
