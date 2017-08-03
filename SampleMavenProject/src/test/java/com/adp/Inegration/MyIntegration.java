package com.adp.Inegration;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.adp.MyUnit.MyUnit;

public class MyIntegration {
	@Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);
        String result2 = myUnit.concatenate2("one", "two");

        assertEquals("onetwo", result2);
        String result3 = myUnit.concatenate2("one", "two");

        assertEquals("onetwo", result3);

    }
	
	
}
