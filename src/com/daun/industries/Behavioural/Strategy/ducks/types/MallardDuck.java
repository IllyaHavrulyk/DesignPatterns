package com.daun.industries.Behavioural.Strategy.ducks.types;

import com.daun.industries.Behavioural.Strategy.behaviors.fly.FlyWithWings;
import com.daun.industries.Behavioural.Strategy.behaviors.quack.Quack;
import com.daun.industries.Behavioural.Strategy.ducks.Duck;

public class MallardDuck extends Duck {
  public MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display(){
    System.out.println("Mallard Duck : " + name);
  }
}
