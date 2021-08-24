package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryLoginPage {
	@FindBy(xpath="//a[Text()=' GEARS'] ")
	private WebElement gearBtn;
	
	@FindBy(xpath="(//a[Text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public skillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void gearsButton() {
		gearBtn.click();
	}
	public void skillraryDemoapplication() {
		skillrarydemoapp.click();
	}
}
