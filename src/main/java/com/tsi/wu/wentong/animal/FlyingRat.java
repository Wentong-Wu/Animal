package com.tsi.wu.wentong.animal;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(String name, int health){
        super(name,health);
    }
    @Override
    public String eat() {
        return "food???????..";
    }
    @Override
    public String takeOff() {
        return "Run...Jump...";
    }

    @Override
    public String flying() {
        return "flapping...";
    }

    @Override
    public String landing() {
        return "Slow...land.";
    }
}
