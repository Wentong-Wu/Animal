package com.tsi.wu.wentong.animal;

import com.tsi.wu.wentong.animal.Bird;

public class Penguin extends Bird {
    public Penguin(String name){
        super(name);
    }
    @Override
    public String eat() {
        return "Fishes...";
    }
}
