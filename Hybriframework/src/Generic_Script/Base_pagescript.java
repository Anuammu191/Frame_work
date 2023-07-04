package Generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_pagescript
{
  public WebDriver driver;
  
  public Base_pagescript(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);

  }
}
