package edu.unicen.tp2;

import java.util.ArrayList;
import java.util.List;

public class Show {
    List<Season> seasonsList = new ArrayList<>();
    String title;
    String description;
    String creator;
    String genre;

    public int getViewedEpisodes() {
        int viewedCounter;
        viewedCounter = 0;
        for (Season se : seasonsList) {
            viewedCounter += se.getViewedEpisodes();
        }
        return viewedCounter;
    }

    private int getShowLenght() {
        return seasonsList.size();
    }

    public double getAverageRate() {
        int totalRate = 0;
        int totalEpisodes = 0;
        double getAverageRate = 0;
        for (Season se : seasonsList) {
            totalRate += se.getTotalRate();
            totalEpisodes += se.getSeasonLenght();
        }
        return totalRate / totalEpisodes;
    }

    public boolean isViewed() {
        boolean viewed = true;
        for (Season se : seasonsList) {//todo mejorar esto, ponerle alguna condicion mas prolija para que corte.
            if (se.getViewedEpisodes() != se.getSeasonLenght()) return false;
        }
        return true;
    }
}
