package com.tsi.wu.wentong.animal;

import com.tsi.wu.wentong.animal.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int health){
        super(name,health);
    }
    @Override
    public String eat() {
        return "Fishes...";
    }
}
