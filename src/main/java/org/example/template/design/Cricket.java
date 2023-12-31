package org.example.template.design;

import org.example.template.design.templateAbstract.Game;

public class Cricket extends Game {

    @Override
    public void endPlay() {
        System.out.println("Cricket game is ending");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket game is initializing");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game is starting");
    }


}
