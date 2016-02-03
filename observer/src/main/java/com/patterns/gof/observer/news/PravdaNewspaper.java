package com.patterns.gof.observer.news;

/**
 * Created by anni0913 on 03.02.2016.
 */
public class PravdaNewspaper extends NewsObserver {

    @Override
    public void show() {
        System.out.println("*******PRAVDA*********\n-" + businessNews + "-\n-" + sportNews + '-');
    }
}
