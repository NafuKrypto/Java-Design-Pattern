package org.example.template.design;

import org.example.template.design.templateAbstract.Game;

public class Football extends Game {

    @Override
    public void startPlay() {
        System.out.println("Footballl game is starting");
    }

    @Override
    public void initialize() {
        System.out.println("Footballl game is initializing");
    }


    @Override
    public void endPlay() {
        System.out.println("Footballl game is ending");
    }
}
