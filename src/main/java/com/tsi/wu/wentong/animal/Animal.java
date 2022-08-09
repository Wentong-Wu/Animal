package com.tsi.wu.wentong.animal;

import java.util.Date;

public abstract class Animal {

    private int health = 100;
    private String name;
    public Animal(String name)
    {
        super();
        this.name = name;
    }
    public abstract String eat();
    public abstract String breath();
    //public abstract Animal breed(Animal partner);
    public <T extends Animal>Animal breed(Animal partner){
        Animal babyAnimal = null;
        try{
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
        }catch (NoSuchMethodException nsm){
            System.out.println("No method exists");
        }
        catch (Exception e){
            System.out.println("Breed failed");
        }finally {
            return babyAnimal;
        }
    }


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