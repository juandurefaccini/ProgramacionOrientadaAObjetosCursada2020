package edu.unicen.tp2;

import java.util.ArrayList;
import java.util.List;

public class Season {
    List<Episode> episodeList = new ArrayList<>();

    public int getViewedEpisodes() {
        int viewedCounter = 0;
        for (Episode ep : episodeList) {
            if (ep.getFlag()) {
                viewedCounter += 1;
            }
        }
        return viewedCounter;
    }

    public double getSeasonLenght() {
        return episodeList.size();
    }

    public int getTotalRate() {
        int totalRate = 0;
        for (Episode ep : episodeList) {
            totalRate += ep.getRate();
        }
        return totalRate;
    }

    public double getRateAverage() {

        return getTotalRate() / getSeasonLenght();
    }

    public static void main(String[] args) {

    }
}
