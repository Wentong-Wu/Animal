package org.test;

import com.tsi.wu.wentong.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    //WDYM Test fail?
    Cat testCat = new Cat("Timmy", true, true,10);
    String currentExpectedName = testCat.getName();
    @Test
    public void test_get_cat_name(){
        assertEquals(currentExpectedName,testCat.getName(),"getName method failed");
    }
    @Test
    public void test_set_cat_name(){
        testCat.setName("Tommy");
        currentExpectedName = testCat.getName();
        assertEquals(currentExpectedName,testCat.getName(),"setName method failed");
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
}
