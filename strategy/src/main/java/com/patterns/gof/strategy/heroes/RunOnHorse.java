package com.patterns.gof.strategy.heroes;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class RunOnHorse implements RunBehaviour {
    @Override
    public void run() {
        System.out.println("Run on horse");
    }
}
