package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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

    @org.junit.Test
    public void mapAB() {
        assertEquals(Map.of("a", "Hi", "ab", "HiThere", "b", "There"), codingBat.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
        assertEquals(Map.of("a", "Hi"), codingBat.mapAB(new HashMap<>(Map.of("a", "Hi"))));
        assertEquals(Map.of("b", "There"), codingBat.mapAB(new HashMap<>(Map.of("b", "There"))));
    }

    @org.junit.Test
    public void wordLen() {
        assertEquals(Map.of("bb", 2, "a", 1), codingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));
        assertEquals(Map.of("that", 4, "and", 3, "this", 4), codingBat.wordLen(new String[]{"this", "and", "that", "and"}));
        assertEquals(Map.of("code", 4, "bug", 3), codingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

}