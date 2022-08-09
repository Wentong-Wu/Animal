package com.tsi.wu.wentong.animal;

public class Cat extends Mammal {
    private int Damagepower;
    public Cat(String name,int health, boolean hair, int damagepower)
    {
        super(name,health,hair);
        this.Damagepower = damagepower;
    }

    public int getDamagePower() {
        return Damagepower;
    }

    public void setDamagePower(int power) {
        this.Damagepower = power;
    }

    @Override
    public String eat() {
        return "Milk...";
    }

    public void Attack(Animal o)
    {
        o.setHealth(o.getHealth()-getDamagePower());
    }
    public String kill(){
        return "Sus...";
    }
}
