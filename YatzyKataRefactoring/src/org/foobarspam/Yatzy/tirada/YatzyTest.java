package org.foobarspam.Yatzy.tirada;

import static org.junit.Assert.*;
import org.junit.Test;

public class YatzyTest {

	@Test
	public void chance_test() {
		assertEquals(15, Yatzy.chance(1,2,3,4,5));
	}
	@Test 
    public void test_yatzy_score() {
        assertEquals(50, Yatzy.yatzy_score(1,1,1,1,1));
        assertEquals(0, Yatzy.yatzy_score(6,6,6,6,3));
    }

    @Test 
    public void test_ones() {
        assertEquals(3, Yatzy.ones(1,1,1,4,4));
        assertEquals(2, Yatzy.ones(6,5,6,1,1));
    }

    @Test 
    public void test_twos() {
        assertEquals(6, Yatzy.twos(2,2,2,4,4));
        assertEquals(4, Yatzy.twos(6,5,6,2,2));
    }
    
    @Test 
    public void test_threes() {
        assertEquals(9, Yatzy.threes(3,3,3,4,4));
        assertEquals(6, Yatzy.threes(6,5,6,3,3));
    }
    
    @Test
    public void test_fours() {
    	assertEquals(4, new Yatzy(1,2,3,4,5).fours());
    	assertEquals(8, new Yatzy(1,2,4,4,5).fours());
    }
    
    @Test
    public void test_fives() {
    	assertEquals(5, new Yatzy(1,2,3,4,5).fives());
    	assertEquals(0, new Yatzy(1,2,4,4,4).fives());
    }
    
    @Test
    public void test_sixs() {
    	assertEquals(0, new Yatzy(1,2,3,4,5).sixs());
    	assertEquals(12, new Yatzy(6,6,4,4,5).sixs());
    }
}
