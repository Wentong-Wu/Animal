package com.tsi.wu.wentong.animal;

public class Penguin extends Bird {
    public Penguin(String name, int health){
        super(name,health);
    }
    @Override
    public String eat() {
        return "Fishes...";
    }
}
