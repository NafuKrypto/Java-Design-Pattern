package org.example.creationalDesignPattern.factory.design;

import org.example.creationalDesignPattern.factory.design.factoryInterface.OS;


public class IOS implements OS {
    @Override
    public void message() {
        System.out.println("Fucking Expensive");
    }
}
