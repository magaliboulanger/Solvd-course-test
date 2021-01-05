package com.solvd.projectUnicen.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.projectUnicen.gui.components.SearchResultItem;

public class SearchPage extends UnicenAbstractPage{

	@FindBy(xpath="//*[@id='content']/ol")
	private List<SearchResultItem> items;
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public List<SearchResultItem> getResultItems() {
		return items;
	}
	
	
}
