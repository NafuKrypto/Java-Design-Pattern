package org.example.creationalDesignPattern.factory.design;

import org.example.creationalDesignPattern.factory.design.factoryInterface.OS;


public class Android implements OS {
    @Override
    public void message() {
        System.out.println("Something that works");
    }

}
