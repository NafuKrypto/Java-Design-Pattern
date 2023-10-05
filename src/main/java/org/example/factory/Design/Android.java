package org.example.factory.Design;

import org.example.factory.Design.factoryInterface.OS;


public class Android implements OS {
    @Override
    public void message() {
        System.out.println("Something that works");
    }

}
