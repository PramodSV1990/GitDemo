package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Third {
@BeforeClass
public void beforeFirst()
{
	System.out.println("Am first smoke");
}
@Parameters({"URL","username","password"})
	@Test(groups= {"smoke"})
	public void smokeFirst(String url,String username,String password)
	{

		System.out.println(url+" "+username+" "+password);
		}
@Test(dataProvider="getdata")
public void login(String username,String pwd)
{
System.out.println("Username "+username);	
System.out.println("Password "+pwd);
}

@DataProvider
public Object[][] getdata() {
	Object[][] data=new Object[3][2];
	data[0][0]="firstusername";
	data[0][1]="firstpwd";
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	data[2][0]="thirdusername";
	data[2][1]="thirdpwd";
	return data;
}
}
