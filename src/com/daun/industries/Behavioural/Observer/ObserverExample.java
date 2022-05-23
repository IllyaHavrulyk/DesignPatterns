package com.daun.industries.Behavioural.Observer;

public class ObserverExample {
    public static void main(String[] args) {
        Subject subject = new Subject("Subject");
        Observer observer1 = new Observer("Observer 1", subject);
        Observer observer2 = new Observer("Observer 2", subject);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.update("New Update is coming!!!");
        subject.deleteObserver(observer2);
        subject.update("New Update after deleting observer!!!");
    }
}
