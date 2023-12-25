package org.example.creationalDesignPattern.factory.design;

import org.example.creationalDesignPattern.factory.design.factoryInterface.OS;

public class OperatingSystemFactory {

    public OS getInstance(String str){
        if(str.equals("open")){
            return new Android();
        }
        else if(str.equals("closed")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}
