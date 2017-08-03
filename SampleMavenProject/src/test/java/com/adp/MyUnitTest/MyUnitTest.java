package com.adp.MyUnitTest;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.adp.MyUnit.MyUnit;

public class MyUnitTest {
	@Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onewo", result);

    }
	@Test
	public void testConcatenate2(){
		MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onewo", result);
	}
	
}
