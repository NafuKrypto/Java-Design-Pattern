package org.example.behavioralDesignPattern.chainOfResponsibilityPattern;

public class ChainPatternDemo {

    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger=new ErrorLogger();
        AbstractLogger fileLogger=new FileLogger();
        AbstractLogger consoleLogger=new ConsoleLogger();

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return  errorLogger;

}
}