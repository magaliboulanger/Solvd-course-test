package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class HomePage extends UnicenAbstractPage{
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
	@FindBy(xpath="//*[@id=\"footer\"]")
	private Footer footer;

	@FindBy(xpath="//*[@id=\"header\"]")
	private Header header;

	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]")
	private List<ExtendedWebElement> images;


	public HomePage(WebDriver driver) {
		super(driver);
	}


	public Footer getFooter() {
		return footer;
	}


	public Header getHeader() {
		return header;
	}


	public List<ExtendedWebElement> getImages() {
		return images;
	}

	

}
