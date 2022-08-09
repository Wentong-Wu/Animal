package com.tsi.wu.wentong.animal;

import java.util.Date;

public abstract class Mammal extends Animal{

    private boolean hair;

    public Mammal(String name, int health,boolean hair)
    {
        super(name,health);
        this.hair = hair;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public String breath() {
        return "Inhale...";
    }

    @Override
    public String breed() {
        return "Reproducing...";
    }
}
