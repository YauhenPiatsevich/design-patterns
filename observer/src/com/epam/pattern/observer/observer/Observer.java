package com.epam.pattern.observer.observer;

import com.epam.pattern.observer.observable.Observable;

public interface Observer
{
    void update(Observable observable);
}
