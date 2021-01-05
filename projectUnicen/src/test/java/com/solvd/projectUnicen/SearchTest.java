package com.solvd.projectUnicen;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectUnicen.gui.components.SearchResultItem;
import com.solvd.projectUnicen.gui.pages.SearchPage;
import com.solvd.projectUnicen.services.SearchService;

public class SearchTest extends AbstractTest implements SearchService {

    @Test(dataProvider = "DataProvider")
    @MethodOwner(owner = "Magali Boulanger")
    @XlsDataSourceParameters(path = "xls/searchs.xlsx", sheet = "search", dsUid = "TUID")
    public void resultSearch(HashMap<String, String> args){
        String query = args.get("Search");
        SearchPage sp = search(getDriver(), query);
        List<SearchResultItem> results = sp.getResultItems();
        Assert.assertTrue(results.size() != 0);
        Assert.assertTrue(results.stream().allMatch(s -> StringUtils.containsIgnoreCase(s.getName(), query)));
    }
}
