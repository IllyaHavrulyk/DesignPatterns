package com.daun.industries.Behavioural.Strategy.behaviors.quack;

public class MuteQuack implements QuackBehavior{

  public void quack(){
    System.out.println("<<Silence>>");
  }
}
