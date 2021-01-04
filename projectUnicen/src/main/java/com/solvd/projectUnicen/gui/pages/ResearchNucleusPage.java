package com.solvd.projectUnicen.gui.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class ResearchNucleusPage extends UnicenAbstractPage{
	
	
	@FindBy(xpath="//*[@id='content']//p")
	private ExtendedWebElement sectionTitle;
	  
   
	@FindBy(xpath="//*[@class='panel-pane pane-token pane-node-body']/ul")
	private List<ExtendedWebElement> listItems;


	public ResearchNucleusPage(WebDriver driver) {
		super(driver);
	}


	public String getSectionTitle() {
		return sectionTitle.getText();
	}


	public List<String> getListItems() {
		List<String> out = new ArrayList<String>();
		for(ExtendedWebElement ewe: listItems) {
			out.add(ewe.getText());
		}
		return out;
	}
	
	


	

}
