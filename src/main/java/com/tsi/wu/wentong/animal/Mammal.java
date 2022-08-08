package com.tsi.wu.wentong.animal;

import java.util.Date;

public abstract class Mammal extends Animal{

    private boolean hair;

    public Mammal()
    {
        super();
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
