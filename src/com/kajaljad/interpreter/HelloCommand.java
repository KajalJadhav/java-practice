package com.kajaljad.interpreter;

public class HelloCommand implements EventObserver {
    @Override
    public void onEvent(String line) {
        if (line.equalsIgnoreCase("Hello"))
            System.out.println("Hi.....");
    }

    @Override
    public void onQuit() {

    }
}
