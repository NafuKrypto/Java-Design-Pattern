package org.example.template.design.templateAbstract;

public abstract class Game {
    public  abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

//    templete methods
    public final void play(){
        initialize();
        startPlay();
        endPlay();

    }
}
