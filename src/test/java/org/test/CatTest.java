package org.test;

import com.tsi.wu.wentong.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    Cat testCat = new Cat();
    @Test
    public void test_get_cat_speak(){

        assertEquals("MEOW",testCat.getSpeak(),"getSpeak method failed");
    }
    @Test
    public void test_set_cat_speak(){
        testCat.setSpeak("Meow");
        assertEquals("Meow",testCat.getSpeak(),"setSpeak method failed");
    }
    @Test
    public void test_get_cat_health(){
        assertEquals(0,testCat.getHealth());
    }
    @Test
    public void test_set_cat_health(){
        testCat.setHealth(100);
        assertEquals(100,testCat.getHealth());
    }
}
