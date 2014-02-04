package com.kajaljad.interpreter;

public class LongLengthCommand implements EventObserver {
    @Override
    public void onEvent(String line) {
        if (line.length() > 10)
            System.out.println("Give Small Command");
    }

    @Override
    public void onQuit() {

    }
}
