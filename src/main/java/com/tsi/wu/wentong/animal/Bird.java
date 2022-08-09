package com.tsi.wu.wentong.animal;

public abstract class Bird extends Animal{
    public Bird(String name)
    {
        super(name);
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
