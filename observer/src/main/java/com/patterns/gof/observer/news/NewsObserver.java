package com.patterns.gof.observer.news;


/**
 * Created by anni0913 on 03.02.2016.
 */
public abstract class NewsObserver implements Observer, Show {

    protected String businessNews;
    protected String sportNews;

    @Override
    public void update(String businessNews, String sportNews) {
        this.businessNews = businessNews;
        this.sportNews = sportNews;
        show();
    }
}
