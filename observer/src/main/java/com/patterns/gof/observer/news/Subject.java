package com.patterns.gof.observer.news;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anni0913 on 03.02.2016.
 */
public class Subject {

    private List<Observer> observersList;

    private String businessNews;
    private String sportNews;

    public Subject() {
        observersList = new ArrayList<Observer>();
    }

    public void setNews(String businessNews, String sportNews) {
        this.businessNews = businessNews;
        this.sportNews = sportNews;
        newsChanged();
    }

    private void newsChanged() {
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer : observersList) {
            observer.update(businessNews, sportNews);
        }
    }

    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observersList.remove(observer);
    }


}
