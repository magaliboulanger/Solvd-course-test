package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.components.Header;

public class ContactPage extends UnicenAbstractPage{
	
	@FindBy(xpath= "//*[@id='content']//address")
	private ExtendedWebElement address;

	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[1]")
	private ExtendedWebElement sectionSearcherTitle;
	
	@FindBy(xpath="//*[@id='content']//p")
	private ExtendedWebElement searcherText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[2]")
	private ExtendedWebElement sectionDependenciesTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[1]")
	private ExtendedWebElement dependenciesText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[3]")
	private ExtendedWebElement sectionAuthoritiesTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[2]")
	private ExtendedWebElement authoritiesText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[4]")
	private ExtendedWebElement sectionOfficesTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[3]")
	private ExtendedWebElement officesText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[5]")
	private ExtendedWebElement sectionDepartmentsTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[4]")
	private ExtendedWebElement departmentsText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[6]")
	private ExtendedWebElement sectionInformationTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[5]")
	private ExtendedWebElement informationText;
	
	@FindBy(xpath="//*[@id='content']//div[2]/div/div/h2[7]")
	private ExtendedWebElement sectionRSSTitle;
	
	@FindBy(xpath="//*[@id='content']//dl[6]")
	private ExtendedWebElement rssText;

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public String getAddress() {
		return address.getText();
	}

	public String getSectionSearcherTitle() {
		return sectionSearcherTitle.getText();
	}

	public String getSearcherText() {
		return searcherText.getText();
	}

	public String getSectionDependenciesTitle() {
		return sectionDependenciesTitle.getText();
	}

	public String getDependenciesText() {
		return dependenciesText.getText();
	}

	public String getSectionAuthoritiesTitle() {
		return sectionAuthoritiesTitle.getText();
	}

	public String getAuthoritiesText() {
		return authoritiesText.getText();
	}

	public String getSectionOfficesTitle() {
		return sectionOfficesTitle.getText();
	}

	public String getOfficesText() {
		return officesText.getText();
	}

	public String getSectionDepartmentsTitle() {
		return sectionDepartmentsTitle.getText();
	}

	public String getDepartmentsText() {
		return departmentsText.getText();
	}

	public String getSectionInformationTitle() {
		return sectionInformationTitle.getText();
	}

	public String getInformationText() {
		return informationText.getText();
	}

	public String getSectionRSSTitle() {
		return sectionRSSTitle.getText();
	}

	public String getRssText() {
		return rssText.getText();
	}
	
	

	
	}

	
	
	

