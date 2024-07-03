package org.example;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Dog dog=new Dog("alberts",2);
        assertEquals("alberts",dog.getName());

    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Dog dog=new Dog("alberts",2);
        dog.setName("roman");
        assertEquals("alberts",dog.getName());
    }
    @org.junit.jupiter.api.Test
    void setName2() {
        Dog dog = new Dog("", 2);
        dog.setName("roman");
        assertEquals("roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}