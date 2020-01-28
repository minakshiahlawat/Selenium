package test;

import java.io.IOException;


import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.PomFacebookSignup;

public class FacebookSignUpForm extends BaseTest {
	//public WebDriver driver;
	@Test
	
	public void FbSignup() throws IOException, InterruptedException
	{
		PomFacebookSignup fb=new PomFacebookSignup(driver);
		fb.fillForm();
	}

}
