package com.cyzicus.observer;

import com.cyzicus.subject.Subject;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
