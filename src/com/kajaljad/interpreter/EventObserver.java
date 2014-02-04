package com.kajaljad.interpreter;

public interface EventObserver {
    public void onEvent(String line);
    public void onQuit();
}
