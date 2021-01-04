package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class TutorialsPage extends UnicenAbstractPage {

	@FindBy(xpath="//*[@class='content']//h3/span/strong")
	private ExtendedWebElement sectionTitle;
		
	@FindBy(xpath="//*[@class='panel-pane pane-token pane-node-body']/div[1]")
	private ExtendedWebElement firstParagraph;
	
	@FindBy(xpath="//*[@class='panel-pane pane-token pane-node-body']/div[2]")
	private ExtendedWebElement secondParagraph;

	public TutorialsPage(WebDriver driver ) {
		super(driver);
	}

	public String getSectionTitleTitle() {
		return sectionTitle.getText();
	}

	public String getFirstParagraph() {
		return firstParagraph.getText();
	}
	
	public String getSecondParagraph() {
		return secondParagraph.getText();
	}
	
	
}
