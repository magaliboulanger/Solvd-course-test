package com.solvd.projectUnicen.services;

import org.openqa.selenium.WebDriver;

import com.solvd.projectUnicen.gui.pages.HomePage;
import com.solvd.projectUnicen.gui.pages.SearchPage;

public interface SearchService {

    default SearchPage search(WebDriver driver, String query){
        HomePage hp = new HomePage(driver);
        hp.open();
        return hp.getHeader().search(query);
    }
}