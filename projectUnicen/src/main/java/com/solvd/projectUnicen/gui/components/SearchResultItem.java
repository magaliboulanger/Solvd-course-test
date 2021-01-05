package com.solvd.projectUnicen.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class SearchResultItem  extends AbstractUIObject{
	
	
	@FindBy(xpath="//*[@id='content']/ol/li/h3/a")
	private ExtendedWebElement resultTitle;
	@FindBy(xpath="//*[@id=\"content\"]/ol/li/div/p")	
	private ExtendedWebElement resultSumaryText;
	
	

	public SearchResultItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	

}
