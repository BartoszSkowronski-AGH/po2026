package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();


    @org.junit.Test
    public void hasTeen() {
        assertEquals(true, codingBat.hasTeen(12,10,15));
        assertEquals(true, codingBat.hasTeen(13,10,7));
        assertEquals(true, codingBat.hasTeen(12,10,19));
    }

    @org.junit.Test
    public void or35() {
        assertEquals(true, codingBat.or35(55));
        assertEquals(true, codingBat.or35(12));
        assertEquals(true, codingBat.or35(0));
    }

    @org.junit.Test
    public void has77() {
        assertEquals(true, codingBat.has77(new int[]{1,2,7,7}));
        assertEquals(true, codingBat.has77(new int[]{1,2,7,2,7}));
        assertEquals(true, codingBat.has77(new int[]{7,2,3,7,7}));
    }

    @org.junit.Test
    public void makeAbba() {
        assertEquals("HeyAbbaAbbaHey", codingBat.makeAbba("Hey","Abba"));
        assertEquals("abba", codingBat.makeAbba("a","b"));
        assertEquals("xyyx", codingBat.makeAbba("x","y"));
    }
}