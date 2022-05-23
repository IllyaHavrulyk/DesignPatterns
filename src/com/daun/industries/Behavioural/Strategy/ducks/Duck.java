package com.daun.industries.Behavioural.Strategy.ducks;

import com.daun.industries.Behavioural.Strategy.behaviors.fly.FlyBehavior;
import com.daun.industries.Behavioural.Strategy.behaviors.quack.QuackBehavior;

public abstract class Duck {
  protected String name;
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("I'm swimming");
  }

  public abstract void display();

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
