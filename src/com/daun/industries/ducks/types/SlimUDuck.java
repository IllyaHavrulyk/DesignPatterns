package com.daun.industries.ducks.types;

import com.daun.industries.behaviors.fly.FlyRocketPowered;
import com.daun.industries.behaviors.quack.Quack;
import com.daun.industries.ducks.Duck;

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
