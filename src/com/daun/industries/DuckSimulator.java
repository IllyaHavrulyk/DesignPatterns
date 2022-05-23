package com.daun.industries;

import com.daun.industries.Behavioural.Strategy.behaviors.fly.FlyRocketPowered;
import com.daun.industries.Behavioural.Strategy.ducks.Duck;
import com.daun.industries.Behavioural.Strategy.ducks.types.MallardDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setName("Mallard");
        mallardDuck.display();
        //перед динамічною зміною поведінки
        mallardDuck.performFly();
        //після динамічної зміни поведінки
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
    }
}
