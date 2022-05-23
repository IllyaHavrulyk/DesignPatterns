package com.daun.industries.Behavioural.Observer;

public class Observer {
    private String name;
    private Subject subject;

    public Observer() {
    }

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void receiveUpdate(String updateMessage){
        System.out.println("Observer(" + name + "):: I've received a message :" + updateMessage);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
