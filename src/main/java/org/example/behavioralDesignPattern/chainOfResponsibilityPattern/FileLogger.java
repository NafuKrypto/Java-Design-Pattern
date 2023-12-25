package org.example.behavioralDesignPattern.chainOfResponsibilityPattern;

public class FileLogger extends AbstractLogger{
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
