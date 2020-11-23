package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = Hero.setUpNewHero();
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("betty",newHero.getName());// testing if it will be accepting the name in adding hero name
    }
    @Test
    public void newHero_getAge_Int() {
        Hero newHero = Hero.setUpNewHero();// testing if it will be accepting the age
        assertEquals(30,newHero.getAge());
    }
    @Test
    public void newHero_getPower_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("heat",newHero.getPower());// testing if it will be accepting to enter the hero power
    }
    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("fire",newHero.getWeakness());//testing if it will accept to enter weakness of a hero
    }
    @Test
    public void newHero_getAllInstances_true() {
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        assertTrue(Hero.getAllInstances().contains(newHero));// to test if it will be giving us all instances we insearted
        assertTrue(Hero.getAllInstances().contains(another));
    }


    @Test
    public void newHero_findById_id() {
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();// testing if it will be getting the hero ID
        Hero another = Hero.setUpNewHero();
        assertEquals(1,Hero.findById(another.getId()).getId());
    }
}