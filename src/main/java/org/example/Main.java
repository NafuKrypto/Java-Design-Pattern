package org.example;

import org.example.factory.Design.factoryInterface.OS;
import org.example.factory.Design.OperatingSystemFactory;
import org.example.strategy.design.Add;
import org.example.strategy.design.ContextStrategy;
import org.example.strategy.design.Mul;
import org.example.strategy.design.Sub;
import org.example.template.design.Football;
import org.example.template.design.templateAbstract.Game;

public class Main {
    public static void main(String[] args) {

/**  1.  Factory Design
 * un comment this code to see how it works
 //        OS obj=new Android();
 //        obj.message();
 we could use this but instead we use the below code for factory
 **/
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
//        pass string "open" , "closed" or anything
        OS objectOS = operatingSystemFactory.getInstance(" ");
        objectOS.message();

/**  1.  Strategy Design
 *
 **/

        ContextStrategy contextStrategy = new ContextStrategy(new Add());
        int result = contextStrategy.executeStrategy(1, 2);
        System.out.println(result);
        contextStrategy=new ContextStrategy(new Sub());
        System.out.println(contextStrategy.executeStrategy(1,2));
        contextStrategy=new ContextStrategy(new Mul());
        System.out.println(contextStrategy.executeStrategy(1,2));

/**  1.  Template Design
 *
 **/
        Game game=new Football();
        game.play();


    }
}