package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.projectUnicen.gui.components.*;

public abstract class UnicenAbstractPage extends AbstractPage{
	@FindBy(xpath="//*[@id=\"footer\"]")
	private Footer footer;

	@FindBy(xpath="//*[@id=\"header\"]")
	private Header header;

	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[1]/div/div/div/ul")
	private List<ExtendedWebElement> menu;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/div[1]/div/div/div")
	private ExtendedWebElement menuTitle;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/div[2]/div/div[2]/h1")
	private ExtendedWebElement title;
	

	public UnicenAbstractPage(WebDriver driver) {
		super(driver);
	}


	public Footer getFooter() {
		return footer;
	}


	public Header getHeader() {
		return header;
	}


	public List<ExtendedWebElement> getMenu() {
		return menu;
	}


	public ExtendedWebElement getMenuTitle() {
		return menuTitle;
	}


	public ExtendedWebElement getTitle() {
		return title;
	}





}
