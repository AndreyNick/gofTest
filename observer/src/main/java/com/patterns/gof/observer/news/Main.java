package com.patterns.gof.observer.news;

/**
 * Created by anni0913 on 03.02.2016.
 */
public class Main {
    public static void main(String args[]) {
        Subject subject = new Subject();
        subject.addObserver(new KomsomoletsNewspaper());
        subject.addObserver(new PravdaNewspaper());
        subject.setNews("Business news", "Sport news");
    }
}
