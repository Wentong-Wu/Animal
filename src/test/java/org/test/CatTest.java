package org.test;

import com.tsi.wu.wentong.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void test_get_cat_name(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        assertEquals("Timmy",testCat.getName(),"getName method failed");
    }

    @Test
    public void test_set_cat_name(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        testCat.setName("Tommy");
        assertEquals("Tommy",testCat.getName(),"setName method failed");
    }
    @Test
    public void test_set_hair(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        testCat.setHair(false);
        assertEquals(false,testCat.isHair());
    }
    @Test
    public void test_is_hair(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        assertEquals(true,testCat.isHair());
    }

    @Test
    public void test_set_cat_power(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        testCat.setDamagePower(20);
        assertEquals(20,testCat.getDamagePower());
    }

    @Test
    public void test_get_cat_power(){
        Cat testCat = new Cat("Timmy",100, true, true,10);
        assertEquals(10,testCat.getDamagePower());
    }

    @Test
    public void test_attack(){
        Cat testCat = new Cat("Tim",100,true,true,10);
        Bat testBat = new Bat("Vlad",100,true,true);
        testBat.setHealth(100);
        testCat.Attack(testBat);
        assertEquals(90,testBat.getHealth(),"Attack not working");
    }
    @Test
    public void test_isAlive(){
        Bat testBat = new Bat("vamp",100,true,true);
        assertEquals(true,testBat.getIsAlive());
    }
    @Test
    public void test_die(){
        Bat testBat = new Bat("vamp",100,true,true);
        testBat.Died();
        assertEquals(false,testBat.getIsAlive());
    }
    @Test
    public void test_isMale(){
        Bat testBat = new Bat("vamp",100,true,true);
        assertEquals(true,testBat.isMale());
    }
    @Test
    public void test_set_isMale(){
        Bat testBat = new Bat("vamp",100,true,true);
        testBat.setMale(false);
        assertEquals(false,testBat.isMale());
    }
    @Test
    public void test_get_health(){
        Bat testBat = new Bat("vamp",100,true,true);
        assertEquals(100,testBat.getHealth());
    }
    @Test
    public void test_set_health(){
        Bat testBat = new Bat("vamp",100,true,true);
        testBat.setHealth(50);
        assertEquals(50,testBat.getHealth());
    }
}
