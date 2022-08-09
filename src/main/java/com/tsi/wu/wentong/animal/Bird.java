package com.tsi.wu.wentong.animal;

public abstract class Bird extends Animal{
    public Bird(String name, int health)
    {
        super(name,health);
    }
    @Override
    public String breath() {
        return "Exhale...";
    }

    @Override
    public String breed() {
        return "Pooping egg...";
    }
}
