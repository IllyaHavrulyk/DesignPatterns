package com.daun.industries.ducks.types;

import com.daun.industries.behaviors.fly.FlyWithWings;
import com.daun.industries.behaviors.quack.Quack;
import com.daun.industries.ducks.Duck;

public class MallardDuck extends Duck {
  public MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display(){
    System.out.println("Mallard Duck : " + name);
  }
}
