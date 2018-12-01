package com.kodilla.patterns2.observer.homework;

public interface KodillaObservable {
    void registerMentor(KodillaObserver observer);
    void notifyMentor();
}
