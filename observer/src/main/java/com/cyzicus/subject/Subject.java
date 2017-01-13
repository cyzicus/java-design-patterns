package com.cyzicus.subject;

import com.cyzicus.observer.Observer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        updateAll();
    }

    private void updateAll() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

}
