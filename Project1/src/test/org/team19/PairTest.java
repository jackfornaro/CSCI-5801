package org.team19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

final class PairTest {
    
    private PairTest() {}
    
    @Test
    void testGetKey() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that keys are equivalennt to what was put into the constructor for the key
        Assertions.assertAll(
            () -> Assertions.assertEquals(2, twoFour.getKey()),
            () -> Assertions.assertEquals('c', cFalse.getKey()),
            () -> Assertions.assertEquals(2, twoFalse.getKey()),
            () -> Assertions.assertEquals(objInstance, objFour.getKey()),
            //Special case: null key
            () -> Assertions.assertNull(nullDemocrat.getKey()),
            () -> Assertions.assertEquals("Obama", obamaNull.getKey())
        );
    }
    
    @Test
    void testGetFirst() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that keys are equivalennt to what was put into the constructor for the key
        Assertions.assertAll(
            () -> Assertions.assertEquals(2, twoFour.getFirst()),
            () -> Assertions.assertEquals('c', cFalse.getFirst()),
            () -> Assertions.assertEquals(2, twoFalse.getFirst()),
            () -> Assertions.assertEquals(objInstance, objFour.getFirst()),
            //Special case: null key
            () -> Assertions.assertNull(nullDemocrat.getFirst()),
            () -> Assertions.assertEquals("Obama", obamaNull.getFirst())
        );
    }
    
    @Test
    void testGetValue() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that keys are equivalennt to what was put into the constructor for the value
        Assertions.assertAll(
            () -> Assertions.assertEquals(4, twoFour.getValue()),
            () -> Assertions.assertEquals(false, cFalse.getValue()),
            () -> Assertions.assertEquals(false, twoFalse.getValue()),
            () -> Assertions.assertEquals(4, objFour.getValue()),
            () -> Assertions.assertEquals("Democrat", nullDemocrat.getValue()),
            //Special case: null value
            () -> Assertions.assertNull(obamaNull.getValue())
        );
    }
    
    @Test
    void testGetSecond() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
    
        //Testing that keys are equivalent to what was put into the constructor for the value
        Assertions.assertAll(
            () -> Assertions.assertEquals(4, twoFour.getSecond()),
            () -> Assertions.assertEquals(false, cFalse.getSecond()),
            () -> Assertions.assertEquals(false, twoFalse.getSecond()),
            () -> Assertions.assertEquals(4, objFour.getSecond()),
            () -> Assertions.assertEquals("Democrat", nullDemocrat.getSecond()),
            //Special case: null value
            () -> Assertions.assertNull(obamaNull.getSecond())
        );
    }
    
    @Test
    void testSetValue() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that setting the values of pairs actually changes the values
        
        Assertions.assertEquals(4, twoFour.getValue());
        twoFour.setValue(2);
        Assertions.assertEquals(2, twoFour.getValue());
        
        Assertions.assertEquals(false, cFalse.getValue());
        cFalse.setValue(false);
        Assertions.assertEquals(false, cFalse.getValue());
        
        Assertions.assertEquals(false, twoFalse.getValue());
        twoFalse.setValue(true);
        Assertions.assertEquals(true, twoFalse.getValue());
        
        Assertions.assertEquals(4, objFour.getValue());
        objFour.setValue(Integer.MAX_VALUE);
        Assertions.assertEquals(Integer.MAX_VALUE, objFour.getValue());
        
        //Special case: Assigning to null
        Assertions.assertEquals("Democrat", nullDemocrat.getValue());
        nullDemocrat.setValue(null);
        Assertions.assertNull(nullDemocrat.getValue());
        
        //Special case: Assigning from null
        Assertions.assertNull(obamaNull.getValue());
        obamaNull.setValue(59);
        Assertions.assertEquals(59, obamaNull.getValue());
    }
    
    @Test
    void testSetSecond() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that setting the values of pairs actually changes the values
        
        Assertions.assertEquals(4, twoFour.getSecond());
        twoFour.setSecond(2);
        Assertions.assertEquals(2, twoFour.getSecond());
        
        Assertions.assertEquals(false, cFalse.getSecond());
        cFalse.setSecond(false);
        Assertions.assertEquals(false, cFalse.getSecond());
        
        Assertions.assertEquals(false, twoFalse.getSecond());
        twoFalse.setSecond(true);
        Assertions.assertEquals(true, twoFalse.getSecond());
        
        Assertions.assertEquals(4, objFour.getSecond());
        objFour.setSecond(Integer.MAX_VALUE);
        Assertions.assertEquals(Integer.MAX_VALUE, objFour.getSecond());
        
        //Special case: Assigning to null
        Assertions.assertEquals("Democrat", nullDemocrat.getSecond());
        nullDemocrat.setSecond(null);
        Assertions.assertNull(nullDemocrat.getSecond());
        
        //Special case: Assigning from null
        Assertions.assertNull(obamaNull.getSecond());
        obamaNull.setSecond(59);
        Assertions.assertEquals(59, obamaNull.getSecond());
    }
    
    @Test
    void testToString() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        
        //Testing that toString prints the pairs in the format Pair{[key], [value]} where [key] and [value] are the pair's key and value, respectively
        Assertions.assertAll(
            () -> Assertions.assertEquals("Pair{2, 4}", twoFour.toString()),
            () -> Assertions.assertEquals("Pair{c, false}", cFalse.toString()),
            () -> Assertions.assertEquals("Pair{2, false}", twoFalse.toString()),
            () -> Assertions.assertEquals(String.format("Pair{%s, 4}", objInstance.toString()), objFour.toString()),
            () -> Assertions.assertEquals("Pair{null, Democrat}", nullDemocrat.toString()),
            () -> Assertions.assertEquals("Pair{Obama, null}", obamaNull.toString())
        );
    }
    
    @Test
    void testEquals() {
        final Object objInstance = new Object();
        final Pair<Integer, Integer> twoFour = new Pair<>(2, 4);
        final Pair<Character, Boolean> cFalse = new Pair<>('c', false);
        final Pair<Integer, Boolean> twoFalse = new Pair<>(2, false);
        final Pair<Object, Integer> objFour = new Pair<>(objInstance, 4);
        final Pair<String, String> nullDemocrat = new Pair<>(null, "Democrat");
        final Pair<String, Integer> obamaNull = new Pair<>("Obama", null);
        final Pair<Character, Boolean> cTrue = new Pair<>('c', true);
        final Pair<Integer, Integer> threeFour = new Pair<>(3, 4);
        
        Assertions.assertAll(
            //Testing pairs equivalent to the above variables (same input)
            () -> Assertions.assertEquals(new Pair<>(2, 4), twoFour),
            () -> Assertions.assertEquals(new Pair<>('c', false), cFalse),
            () -> Assertions.assertEquals(new Pair<>(2, false), twoFalse),
            () -> Assertions.assertEquals(new Pair<>(objInstance, 4), objFour),
            () -> Assertions.assertEquals(new Pair<>(null, "Democrat"), nullDemocrat),
            () -> Assertions.assertEquals(new Pair<>("Obama", null), obamaNull),
            
            //Testing that having equivalent keys but differing values does not result in equal pairs
            () -> Assertions.assertNotEquals(twoFalse, twoFour),
            () -> Assertions.assertNotEquals(cTrue, cFalse),
            
            //Testing that having equivalent values but differing keys does not result in equal pairs
            () -> Assertions.assertNotEquals(cFalse, twoFalse),
            () -> Assertions.assertNotEquals(twoFour, threeFour)
        );
    }
}