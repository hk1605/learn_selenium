package session3ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnseleniumbasic {
	
	public static void main(String[] args) {
		
		ChromeDriver ab=new ChromeDriver();
		ab.get("http://leaftaps.com/opentaps/control/main");
		ab.manage().window().maximize();
		ab.getTitle();
		//ab.close();
		
		ab.findElement(By.id("username")).sendKeys("Demosalesmanager");
		ab.findElement(By.id("password")).sendKeys("crmsfa");
		ab.findElement(By.className("decorativeSubmit")).click();
		
		ab.findElement(By.partialLinkText("CRM")).click();
		ab.findElement(By.linkText("Create Lead")).click();
		
		ab.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		WebElement sourcedd=ab.findElement(By.id("createLeadForm_dataSourceId"));
		Select ob1=new Select(sourcedd);
		ob1.selectByIndex(1);
		
		WebElement industrydd=ab.findElement(By.id("createLeadForm_industryEnumId"));
		Select ob2=new Select(industrydd);
		ob2.selectByVisibleText("Aerospace");
		
		WebElement owershipdd=ab.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ob3=new Select(owershipdd);
		ob3.selectByValue("OWN_PROPRIETOR");
		
		
		
	}

}
