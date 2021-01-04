package com.projectUnicen;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectUnicen.gui.components.*;
import com.solvd.projectUnicen.gui.pages.HomePage;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderTest extends AbstractTest {
	
	private final String EXPECTED_TEXT_1= "Ingresantes";
	private final String EXPECTED_TEXT_2= "Estudiantes";
	private final String EXPECTED_TEXT_3= "Docentes";
	private final String EXPECTED_TEXT_4= "No Docentes";
	private final String EXPECTED_TEXT_5= "Graduados";
	private final String EXPECTED_TEXT_6= "Escuelas";
	private final String EXPECTED_TEXT_7= "Empresas";


	public Object[] createData() {
		 return new Object[] 
		   { EXPECTED_TEXT_1,EXPECTED_TEXT_2,EXPECTED_TEXT_3,EXPECTED_TEXT_4, EXPECTED_TEXT_5,EXPECTED_TEXT_6,EXPECTED_TEXT_7 };		 
	}
	
		
	@Test
	@MethodOwner(owner ="Magali Boulanger")
	public void testHeaderText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		
		List<String> names = header.getTopListNames();
		Assert.assertTrue(names.contains(EXPECTED_TEXT_1));
		
	}
	
}
