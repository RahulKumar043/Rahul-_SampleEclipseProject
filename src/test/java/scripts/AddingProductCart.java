package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibaries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.skillraryLoginPage;

public class AddingProductCart extends BaseClass {

	@Test
	public void tc1() throws FileNotFoundException, IOException {
		skillraryLoginPage s=new skillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapplication();
		
		utilities.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver,d.getCourseTab());
		d.seleniumtraningbtn();
		
		AddtocartPage a=new AddtocartPage(driver);
		utilities.doubleClick(driver,a.getAddBtn());
		a.addtocatrButton();
		utilities.alertPopup(driver);
		Assert.assertEquals(driver.getTitle(),pdata.getData("addtocartTitle"));
	}
}
