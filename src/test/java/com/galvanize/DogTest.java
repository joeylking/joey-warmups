package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void testDogSpeak(){
        Dog dog = new Dog();
        String actual = dog.speak();
        assertEquals("woof woof", actual);
    }
}
