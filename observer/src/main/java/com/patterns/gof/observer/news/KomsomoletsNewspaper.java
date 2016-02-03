package com.patterns.gof.observer.news;

/**
 * Created by anni0913 on 03.02.2016.
 */
public class KomsomoletsNewspaper extends NewsObserver{
    @Override
    public void show() {
        System.out.println("*******KOMSOMOLETS*********\n-" + businessNews + "-\n-" + sportNews + '-');
    }
}
