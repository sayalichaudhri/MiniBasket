package com.etsyframework.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(css="#logo")
	public WebElement etsylogo;
	
	@FindBy(css="#desktop-category-nav>div>div>ul>li>a")
	public List<WebElement> homenavbar;
	
	
	

}
