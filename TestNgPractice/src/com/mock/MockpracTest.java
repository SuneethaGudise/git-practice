package com.mock;

import org.testng.annotations.Test;

public class MockpracTest {
@Test(enabled =false)
public void testcase1()
{
	System.out.println("first test case");
}
@Test(groups= {"testcase=3"})
public void testcase2()
{
	System.out.println("second test case");
}
@Test(groups = {"testcase=2"})
public void testcase3()
{
	System.out.println("third test case");
}

}
