package org.example;

import org.example.creationalDesignPattern.builder.one.Meal;
import org.example.creationalDesignPattern.builder.one.MealBuilder;

import org.example.creationalDesignPattern.builder.two.Person;
import org.example.behavioralDesignPattern.chainOfResponsibilityPattern.AbstractLogger;
import org.example.structuralDesignPattern.composite.Developer;
import org.example.structuralDesignPattern.composite.Manager;
import org.example.creationalDesignPattern.factory.design.factoryInterface.OS;
import org.example.creationalDesignPattern.factory.design.OperatingSystemFactory;
import org.example.behavioralDesignPattern.strategyDesign.Add;
import org.example.behavioralDesignPattern.strategyDesign.ContextStrategy;
import org.example.behavioralDesignPattern.strategyDesign.Mul;
import org.example.behavioralDesignPattern.strategyDesign.Sub;
import org.example.behavioralDesignPattern.templateDesign.Football;
import org.example.behavioralDesignPattern.templateDesign.templateAbstract.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.behavioralDesignPattern.chainOfResponsibilityPattern.ChainPatternDemo.getChainOfLoggers;

public class Main {
    public static <T> void main(String[] args) {

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
        contextStrategy = new ContextStrategy(new Sub());
        System.out.println(contextStrategy.executeStrategy(1, 2));
        contextStrategy = new ContextStrategy(new Mul());
        System.out.println(contextStrategy.executeStrategy(1, 2));

/**  1.  Template Design
 *
 **/
        Game game = new Football();
        game.play();
/**  1.  Builder One
 *
 **/
        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Non Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());
/**  1.  Builder Two
 *
 **/

        Person person = new Person.Builder().setAge("22").setAddress("banani").setName("nazia").build();
        System.out.println(person.name);

        /**  1.  Chain of Responsibility Pattern
         *
         **/

        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();
        System.out.println("stream: ");

        System.out.println(stream);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("stream2: ");

        System.out.println(stream2);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("stream filter: ");

        System.out.println(evenNumbers);

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> squaredNumbers = numberList.stream().map(n -> n * n);
        List<Integer> numberListResult = numberList.stream().map(n -> n * n).toList();
        squaredNumbers.forEach(System.out::println);

        System.out.println(numberListResult);
        System.out.println(new Object());

        Developer developer=new Developer(1,"mahin","12","female");
        Developer developer1=new Developer(1,"mahini","12","female");
        
        List<Developer> developerList = new ArrayList<>();
        List<T> lists = new ArrayList<>();
        developerList.add(developer);
        developerList.add(developer1);
//         lists.stream().map(object-> (Developer) object).toList();
        Object object = new Object();
        System.out.println(object);

        List<String> names = Arrays.asList( "nafisa","nazia","farhana","mim","lina","mim");
        
        System.out.println(names.stream().filter(n->n.equals("mim")).toList());
        System.out.println(names.stream().filter(n->n.equals("mim")).findFirst().get());

    
        Manager m=new Manager();
        
        System.out.println(m.getAge());
        if(m.getCompany()==null){
            m.setCompany(new Developer());
        }
        m.getCompany().getAge();


         
        
        
        
        
        
    }
}