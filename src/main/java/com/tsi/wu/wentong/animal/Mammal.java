package com.tsi.wu.wentong.animal;

public abstract class Mammal extends Animal{

    private boolean hair = true;
    private boolean isMale;

    public Mammal(String name, boolean hair, boolean isMale)
    {
        super(name);
        this.hair = hair;
        this.isMale = isMale;
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
    public String breed(){
        return "Breeding";
    }
}
