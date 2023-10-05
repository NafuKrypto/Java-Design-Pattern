package org.example.factory.Design;

import org.example.factory.Design.factoryInterface.OS;


public class Windows implements OS {
    @Override
    public void message() {
    System.out.println("Everyone Uses it");
    }
}
