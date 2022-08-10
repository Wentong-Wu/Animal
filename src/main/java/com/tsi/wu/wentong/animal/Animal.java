package com.tsi.wu.wentong.animal;

public abstract class Animal {
    private int health = 100;
    private String name;
    protected Animal(String name)
    {
        super();
        this.name = name;
    }
    public abstract String eat();
    public abstract String breath();
    public abstract String breed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String Move() {
        return "Zoom..";
    }
    public String Sleep(){
        return "Zzz..";
    }
    public String Poop(){
        return "Stinky..";
    }
    public String Die(){
        return "RIP..";
    }

}