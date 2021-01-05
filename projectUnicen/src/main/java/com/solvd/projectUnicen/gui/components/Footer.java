package com.solvd.projectUnicen.gui.components;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Footer extends AbstractUIObject { 

	@FindBy(xpath="//*[@id='views_slideshow_cycle_main_carrousel-block']")
	private ExtendedWebElement imageLinks;
	
	@FindBy(xpath="//*[@id='block-block-1']/p")
	private ExtendedWebElement contactInformationList;

	public Footer(WebDriver driver,SearchContext searchContext) {
		super(driver, searchContext);
	}

	public ExtendedWebElement getImageLinks() {
		return imageLinks;
	}

	public String getContactInformationList() {
		return contactInformationList.getText();
	}
	
	
	

}
