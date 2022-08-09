package com.tsi.wu.wentong.animal;

public class Bat extends Mammal implements Flying{

    public Bat(String name, int health,boolean hair){
        super(name,health,hair);
    }
    public String scream(){
        return "reeeeeeeeeeeee";
    }
    @Override
    public String eat() {
        return "Blood..???";
    }
    @Override
    public String takeOff() {
        return "Drop...Flap";
    }

    @Override
    public String flying() {
        return "Flapping...very fast...";
    }

    @Override
    public String landing() {
        return "Upside Down.....";
    }
}
