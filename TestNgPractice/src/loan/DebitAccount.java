package loan;

import org.testng.annotations.Test;
//@listener(packagename.classname)
public class DebitAccount {
@Test(groups={"Regression"})
public void debtDetails()
{
	System.out.println("Enter the debit details");
}
@Test
public void depAmount()
{
	System.out.println("Deposit the amount");
}
@Test
public void withdraw()
{
	System.out.println("Amount withdraw");
}
@Test
public void balance()
{
	System.out.println("Balance amount");
}
}
