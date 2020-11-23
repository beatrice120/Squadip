package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = Squad.setUpNewSquad();
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String() {// testing if it will be receiving names of squad inserted
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("super",newSquad.getSquadName());
    }
    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.setUpNewSquad();// testing if it will be accepting squad size
        assertEquals(3,newSquad.getSize());
    }
    @Test
    public void newSquad_getPower_String() {
        Squad newSquad = Squad.setUpNewSquad();//testing if it will be accepting user to enter squad power
        assertEquals("Infinity Stone",newSquad.getReasons());
    }
    @Test
    public void newSquad_getInstances_true() {// testing if it will be accepting displaying all the squad
        Squad newSquad = Squad.setUpNewSquad();
        Squad another = Squad.setUpNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }


}