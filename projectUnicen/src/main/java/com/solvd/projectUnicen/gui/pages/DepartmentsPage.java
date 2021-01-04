package com.solvd.projectUnicen.gui.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class DepartmentsPage extends UnicenAbstractPage{

	@FindBy(xpath="//*[@id='table-of-contents-links']/div/ul")
	private ExtendedWebElement departmentsLinks;
	
	@FindBy(xpath="//*[@id='int-DCyS']")
	private ExtendedWebElement subtitleDCyS;
	
	@FindBy(xpath="//*[@id='int-DFD']")
	private ExtendedWebElement subtitleDFD;
	
	@FindBy(xpath="//*[@id='int-DCFyA']")
	private ExtendedWebElement subtitleDCFyA;
	
	@FindBy(xpath="//*[@id='int-DM']")
	private ExtendedWebElement subtitleDM;
	
	@FindBy(xpath="//*[@id='int-ingles']")
	private ExtendedWebElement subtitleIngles;
	
	@FindBy(xpath="//*[@id='content']//h2[6]")
	private ExtendedWebElement subtitleNormas;
	
	@FindBy(xpath="//*[@id='content']//p[1]")
	private ExtendedWebElement DCySText;

	@FindBy(xpath="//*[@id='content']//p[2]")
	private ExtendedWebElement DFDText;	
	
	@FindBy(xpath="//*[@id='content']//p[3]")
	private ExtendedWebElement DCFyAText;
	
	@FindBy(xpath="//*[@id='content']//p[4]")
	private ExtendedWebElement DMText;

	@FindBy(xpath="//*[@id='content']//p[5]")
	private ExtendedWebElement InglesText1;

	@FindBy(xpath="//*[@id='content']//p[6]")
	private ExtendedWebElement InglesText2;

	@FindBy(xpath="//*[@id='content']//p[7]")
	private ExtendedWebElement InglesText3;

	@FindBy(xpath="//*[@id='content']//ul[6]")
	private List<ExtendedWebElement> rulesList;

	public DepartmentsPage(WebDriver driver) {
		super(driver);
	}

	public String getDepartmentsLinks() {
		return departmentsLinks.getText();
	}

	public String getSubtitleDCyS() {
		return subtitleDCyS.getText();
	}

	public String getSubtitleDFD() {
		return subtitleDFD.getText();
	}

	public String getSubtitleDCFyA() {
		return subtitleDCFyA.getText();
	}

	public String getSubtitleDM() {
		return subtitleDM.getText();
	}

	public String getSubtitleIngles() {
		return subtitleIngles.getText();
	}

	public String getSubtitleNormas() {
		return subtitleNormas.getText();
	}

	public String getDCySText() {
		return DCySText.getText();
	}

	public String getDFDText() {
		return DFDText.getText();
	}

	public String getDCFyAText() {
		return DCFyAText.getText();
	}

	public String getDMText() {
		return DMText.getText();
	}

	public String getInglesText1() {
		return InglesText1.getText();
	}

	public String getInglesText2() {
		return InglesText2.getText();
	}

	public String getInglesText3() {
		return InglesText3.getText();
	}

	public List<String> getRulesList() {
		List<String> out = new ArrayList<String>();
		for(ExtendedWebElement ewe: rulesList) {
			out.add(ewe.getText());
		}
		return out;
	}
	
	
	

}
