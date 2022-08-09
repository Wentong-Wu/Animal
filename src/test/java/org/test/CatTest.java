package org.test;

import com.tsi.wu.wentong.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    Cat testCat = new Cat("Timmy",100, true, 10);
    @Test
    public void test_get_cat_name(){
        assertEquals("Timmy",testCat.getName(),"getName method failed");
    }
    @Test
    public void test_set_cat_name(){
        testCat.setName("Tommy");
        assertEquals("Tommy",testCat.getName(),"setName method failed");
    }
    @Test
    public void test_is_hair(){
        assertEquals(true,testCat.isHair());
    }
    @Test
    public void test_set_hair(){
        testCat.setHair(false);
        assertEquals(false,testCat.isHair());
    }
    @Test
    public void test_get_cat_power(){
        assertEquals(10,testCat.getDamagePower());
    }
    @Test
    public void test_set_cat_power(){
        testCat.setDamagePower(20);
        assertEquals(20,testCat.getDamagePower());
    }
    @Test
    public void test_cat_attack(){
        testCat.setHealth(100);
        testCat.Attack(testCat);
        assertEquals(90,testCat.getHealth());
    }
}
