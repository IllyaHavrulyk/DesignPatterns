package com.daun.industries.Behavioural.Strategy.behaviors.fly;

public class FlyRocketPowered implements FlyBehavior{

  @Override
  public void fly(){
    System.out.println("I am flying with rocket.");
  }
}
