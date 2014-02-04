package com.kajaljad.interpreter;

import java.util.ArrayList;
import java.util.List;

public class HistorySaver implements EventObserver {
    List<String> history = new ArrayList<>();

    @Override
    public void onEvent(String line) {
        history.add(line);
    }

    @Override
    public void onQuit() {
        System.out.println("HISTORY OF COMMANDS");
        for (String s : history) {
            System.out.println(s);
        }
    }
}
