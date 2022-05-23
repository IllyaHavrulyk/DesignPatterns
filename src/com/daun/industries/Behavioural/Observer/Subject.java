package com.daun.industries.Behavioural.Observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private String name;
    private Set<Observer> observers;

    public void update(String updateMessage){
        observers.forEach((observer) -> {
            System.out.println("Subject(" + name + "):: Sent message to (" + observer.getName() + ") with message:" + updateMessage);
            observer.receiveUpdate(updateMessage);
        });
    }

    public Subject() {
    }

    public Subject(String name, Set<Observer> observers) {
        this.name = name;
        this.observers = observers;
    }

    public Subject(String name) {
        this.name = name;
        this.observers = new HashSet<>();
    }

    public boolean deleteObserver(Observer observer){
        boolean remove = observers.remove(observer);
        System.out.println("Removed " + observer.getName());
        return remove;
    }

    public boolean addObserver(Observer observer){
        boolean add = observers.add(observer);
        System.out.println("Added " + observer.getName());
        return add;
    }

    public Set<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Set<Observer> observers) {
        this.observers = observers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
