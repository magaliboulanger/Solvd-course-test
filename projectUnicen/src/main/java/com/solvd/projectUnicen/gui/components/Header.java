package com.solvd.projectUnicen.gui.components;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Header extends AbstractUIObject {

	@FindBy(xpath="//*[@id='header']/div[1]/a/img")
	private ExtendedWebElement logo;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div[1]")
	private ExtendedWebElement contactButtons;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div[2]")
	private ExtendedWebElement topListLinks;
	
	@FindBy(xpath="//*[@id='block-menu-block-4']/div/ul")
	private List<MenuItem> navbar;

	public Header(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
/*
	public ExtendedWebElement getLogo() {
		return logo;
	}
*/
	public List<String> getButtonsNames() {
		return Arrays.asList(contactButtons.getText().split("\\r?\\n"));
	}


	public List<MenuItem> getNavbar() {
		return navbar;
	}

	public List<String> getTopListNames() {
		return Arrays.asList(topListLinks.getText().split("\\r?\\n"));
	}

	public void clickLink(String linkString) {
		driver.findElement(By.linkText(linkString)).click();
	}

	

}
