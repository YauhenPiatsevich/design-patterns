package com.epam.pattern.observer.observable;

import com.epam.pattern.observer.observer.Observer;

public interface Observable
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
