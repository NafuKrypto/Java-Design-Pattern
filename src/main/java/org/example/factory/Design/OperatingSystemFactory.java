package org.example.factory.Design;

import org.example.factory.Design.factoryInterface.OS;

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
