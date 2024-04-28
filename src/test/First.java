package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
public class First 
{

@Test(groups= {"smoke"})


public void mobileLogin()
{

System.out.println("Mobile Login successfull smoke");
Assert.assertTrue(false);
}

@Test(dependsOnMethods={"generalLogin"})
public void netBanking()
{

System.out.println("NetBanking Login Successfull");
}
@Parameters({"URL","username","password"})
@Test
public void generalLogin(String url,String username,String password)
{

System.out.println(url+" "+username+" "+password);
}
}