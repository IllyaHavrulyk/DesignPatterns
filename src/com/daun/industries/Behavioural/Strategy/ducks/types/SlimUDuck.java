package com.daun.industries.Behavioural.Strategy.ducks.types;

import com.daun.industries.Behavioural.Strategy.behaviors.fly.FlyRocketPowered;
import com.daun.industries.Behavioural.Strategy.behaviors.quack.Quack;
import com.daun.industries.Behavioural.Strategy.ducks.Duck;

public class SlimUDuck extends Duck {
  public SlimUDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyRocketPowered();
  }

  @Override
  public void display() {
    System.out.println("Rocket powered Duck : " + name);
  }
}
