package com.kajaljad.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventLoop {
    List<EventObserver> observerList = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            for (EventObserver eventObserver : observerList) {
                eventObserver.onEvent(line);
            }
            if (line.equalsIgnoreCase("quit")) {
                for (EventObserver eventObserver : observerList) {
                    eventObserver.onQuit();
                }
                break;
            }

        }
    }

    public void add(EventObserver observer) {
        observerList.add(observer);
    }
}
