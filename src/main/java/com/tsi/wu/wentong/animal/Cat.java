package com.tsi.wu.wentong.animal;

public class Cat extends Mammal {
    private String speak = "MEOW";
    private int Damagepower;
    public Cat()
    {
        super();
    }
    public Cat(String name,int power){
        this.setName(name);
        this.Damagepower = power;
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

    public String getSpeak() {
        return speak;
    }
    public void setSpeak(String s){
        this.speak = s;
    }
    public void Attack(Animal o)
    {
        o.setHealth(o.getHealth()-getDamagePower());
        System.out.println(this.getName()+" has attacked "+ o.getName()+ ". Sad face "+o.getName()+" lost "+ this.getDamagePower()+ " health points.");
    }
    public String kill(){
        return "Sus...";
    }
}
