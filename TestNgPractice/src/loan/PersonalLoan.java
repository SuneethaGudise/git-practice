package loan;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test //(groups={"Regression"})
	public void accLogin()
	{
		System.out.println("Login into your account and enter the credentials");
	}
	@Test(dependsOnMethods= {"accLogin"})
	public void savingaccTest()
	{
		System.out.println("This is savings account");
	}
	@Test
	public void currentaccTest()
	{
		System.out.println("This is current account");
	}
	@Test
	public void fixedaccTest()
	{
		System.out.println("This is fixed account");
	}
	
}
