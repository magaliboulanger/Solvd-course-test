package com.solvd.projectUnicen.gui.components;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class MenuItem extends AbstractUIObject {

	private ExtendedWebElement title;
	private List<ExtendedWebElement> links;
	public MenuItem(WebDriver driver, SearchContext searchContext) {
		super(driver,searchContext);
	}
	public ExtendedWebElement getTitle() {
		return title;
	}
	
	public List<ExtendedWebElement> getLinks() {
		return links;
	}

	
	

}
