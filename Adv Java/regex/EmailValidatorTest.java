package com.regex;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
TestNG
------
1.Install plugin from TestNG website
search TestNG for eclipse
It will redirect to https://github.com/cbeust/testng-eclipse/
copy the url of latest release

2.go to help in eclipse
help-> Install new software -> add the github link and proceed
restart the eclipse

3.Add TestNG jar into project buildpath-> libraries->click classpath -> add library ->apply
Now create a new test case in any of the project
4.Now right click and Run the TestNG class
*/


public class EmailValidatorTest {
	private EmailValidator emailValidator;

	@BeforeClass
	public void initData() {
		emailValidator = new EmailValidator();
	}

	@DataProvider
	public Object[][] vaildEmailProviders() {
		return new Object[][] { { new String[] { "Ram@gmail.com", "Rocky_11@yahoo.com", "David.Billa007@outlook.com",
				"maddy.1000@yahoo.com", "math.1234@gmail.edu", "AI.edu.1000@google.org", "maddy-1000@microsoft.com",
				"maddy.1000@com.com", "admin_.contact@zoho.com" } } };
	}

	@DataProvider
	public Object[][] InvalidvaildEmailProviders() {
		return new Object[][] { { new String[] { "Ram@com@.py", "Rocky_11", "David.Billa007@outlook.com.a",
				"maddy.1000@%#.com", "math.is..1234@yahoo.edu", "AI.edu.1000@.com.org", "maddy-1000@microsoft._com",
				"maddy.@com.la", "admin_@.contact@zoho.com" } } };
	}

	@Test(dataProvider = "vaildEmailProviders")
	public void validEmailTest(String[] Email) {
		for (String mail : Email) {
			boolean valid = emailValidator.validate(mail);
			System.out.println("Email is valid : " + mail + " , " + valid);
			Assert.assertEquals(valid, true);
		}
	}

	@Test(dataProvider = "InvalidvaildEmailProviders", dependsOnMethods = "validEmailTest")
	public void invalidEmailTest(String[] Email) {
		for (String mail : Email) {
			boolean valid = emailValidator.validate(mail);
			System.out.println("Email is valid : " + mail + " , " + valid);
			Assert.assertEquals(valid, false);

		}
	}

}
