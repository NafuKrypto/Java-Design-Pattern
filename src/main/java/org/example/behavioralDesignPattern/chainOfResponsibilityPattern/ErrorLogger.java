package org.example.behavioralDesignPattern.chainOfResponsibilityPattern;

public class ErrorLogger extends AbstractLogger{
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
