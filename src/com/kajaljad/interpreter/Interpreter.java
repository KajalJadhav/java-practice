package com.kajaljad.interpreter;

public class Interpreter {
    public static void main(String[] args) {
        EventLoop events = new EventLoop();
        events.add(new EchoCommand());
        events.add(new HelloCommand());
        events.add(new LongLengthCommand());
        events.add(new HistorySaver());
        events.run();
    }
}
