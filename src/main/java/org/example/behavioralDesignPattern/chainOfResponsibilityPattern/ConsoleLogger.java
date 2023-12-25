package org.example.behavioralDesignPattern.chainOfResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
