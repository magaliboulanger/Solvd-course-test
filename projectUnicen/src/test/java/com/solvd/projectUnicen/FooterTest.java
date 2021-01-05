package com.solvd.projectUnicen;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectUnicen.gui.components.Footer;
import com.solvd.projectUnicen.gui.pages.HomePage;

public class FooterTest  extends AbstractTest {
   
	private final String EXPECTED_TEXT= "Facultad de Ciencias Exactas – UNICEN(link is external)| Tandil, Bs. As., Argentina | | Tel. : (+54) (0249) 4385650 | Webmaster: Dirección TIC.";
	
	@Test
	@MethodOwner(owner ="Magali Boulanger")
	public void testFooterText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		
		Footer footer = hp.getFooter();
		String contactList = footer.getContactInformationList();
	
		String text= footer.getContactInformationList().replaceAll("\n", "");
		
		Assert.assertEquals(text,EXPECTED_TEXT);
		
	}
}
