package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {

@Test
public void mobilecats()
{
	System.out.println("Meow");
}
@Test(enabled=false)
public void mobiledogs()
{
	System.out.println("bark");
}
@Test(groups= {"smoke"})
public void cow()
{
	System.out.println("cow part of smoke");
}
@BeforeTest
public void beforeTest()
{ 
	System.out.println("First method before test");
}
@AfterTest()
public void afterTest()
{
	System.out.println("After the test");
}
@BeforeSuite
public void beforest()
{
	System.out.println("Before Suit");
}
@AfterSuite(timeOut=4000)
public void afterst()
{
	System.out.println("After Suit");
}

@BeforeMethod
public void beforemthd()
{
	System.out.println("Before Method");
}

@AfterMethod
public void afteremthd()
{
	System.out.println("After Method");
}
}