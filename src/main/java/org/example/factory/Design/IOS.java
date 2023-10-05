package org.example.factory.Design;

import org.example.factory.Design.factoryInterface.OS;


public class IOS implements OS {
    @Override
    public void message() {
        System.out.println("Fucking Expensive");
    }
}
