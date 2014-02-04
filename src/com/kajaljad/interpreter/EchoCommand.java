package com.kajaljad.interpreter;

public class EchoCommand implements EventObserver {
    @Override
    public void onEvent(String line) {
        System.out.println("ECHO:" + line);
    }

    @Override
    public void onQuit() {

    }
}
