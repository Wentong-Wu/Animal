package org.test;

import com.tsi.wu.wentong.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void test_get_cat_name(){
        Cat testCat = new Cat("Timmy", true, true,10);
        assertEquals("Timmy",testCat.getName(),"getName method failed");
    }

    @Test
    public void test_set_cat_name(){
        Cat testCat = new Cat("Timmy", true, true,10);
        testCat.setName("Tommy");
        assertEquals("Tommy",testCat.getName(),"setName method failed");
    }
    @Test
    public void test_set_hair(){
        Cat testCat = new Cat("Timmy", true, true,10);
        testCat.setHair(false);
        assertEquals(false,testCat.isHair());
    }
    @Test
    public void test_is_hair(){
        Cat testCat = new Cat("Timmy", true, true,10);
        assertEquals(true,testCat.isHair());
    }

    @Test
    public void test_set_cat_power(){
        Cat testCat = new Cat("Timmy", true, true,10);
        testCat.setDamagePower(20);
        assertEquals(20,testCat.getDamagePower());
    }

    @Test
    public void test_get_cat_power(){
        Cat testCat = new Cat("Timmy", true, true,10);
        assertEquals(10,testCat.getDamagePower());
    }

    @Test
    public void test_attack(){
        Cat testCat = new Cat("Tim",true,true,10);
        Bat testBat = new Bat("Vlad",true,true);
        testBat.setHealth(100);
        testCat.Attack(testBat);
        assertEquals(90,testBat.getHealth(),"Attack not working");
    }
}
