package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class CompetitionsPage extends UnicenAbstractPage{

	@FindBy(xpath="//*[@id=\"quicktabs-tab-concursos-1\"]")
	private List<ExtendedWebElement> links;
	
	@FindBy(xpath="//*[@id=\"quicktabs-tabpage-concursos-2\"]/div/div/table/tr")
	private List<ExtendedWebElement> rows;

		
	public CompetitionsPage(WebDriver driver) {
		super(driver);
	}

	public List<ExtendedWebElement> getLinks() {
		return links;
	}

	public List<ExtendedWebElement> getRows() {
		return rows;
	}

	
	
	
}
