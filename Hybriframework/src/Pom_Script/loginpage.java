
package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Script.Base_pagescript;

public class loginpage extends Base_pagescript
{
		@FindBy(id="email")
		private WebElement unField;
		
		@FindBy(id="pass")
		private WebElement pwdField;
		
		@FindBy(name="login")
		private WebElement loginBtn;
		
		public loginpage(WebDriver driver)
		{
			super(driver);
		}
		public void passUN(String Un)
		{
			unField.sendKeys(Un);
		}
		public void passPwd(String Pwd)
		{
			pwdField.sendKeys(Pwd);
		}
		public void btn()
		{
			loginBtn.click();
		}
	}

