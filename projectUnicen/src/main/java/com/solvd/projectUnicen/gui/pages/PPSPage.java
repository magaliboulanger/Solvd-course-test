package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class PPSPage extends UnicenAbstractPage{

	
	@FindBy(xpath="//*[@id='content']//p/strong")
	private ExtendedWebElement sectionTitle;
	
	@FindBy(xpath="//*[@class='panel-pane pane-token pane-node-body']/div/div")
	private ExtendedWebElement paragraph;
	
	@FindBy(xpath="//*[@class='panel-pane pane-token pane-node-body']//ul")
	private List<ExtendedWebElement> listLinks;

	public PPSPage(WebDriver driver) {
		super(driver);
	}

	public String getSectionTitle() {
		return sectionTitle.getText();
	}

	public String getParagraph() {
		return paragraph.getText();
	}

	public List<String> getListLinks() {
		//TODO
		return null;
	}

	
	
	
}
