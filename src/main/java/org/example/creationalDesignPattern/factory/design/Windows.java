package org.example.creationalDesignPattern.factory.design;

import org.example.creationalDesignPattern.factory.design.factoryInterface.OS;


public class Windows implements OS {
    @Override
    public void message() {
    System.out.println("Everyone Uses it");
    }
}
