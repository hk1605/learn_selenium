package session3ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmultiple {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://practice.expandtesting.com/dropdown");
		dr.manage().window().maximize();
		WebElement fd = dr.findElement(By.id("dropdown"));
		Select ss=new Select(fd);
		List<WebElement> list = ss.getOptions();
		//for(WebElement wb : list) {
		//	System.out.println(wb.getText());
		
		for (int i=0;i<list.size();i++) {
			list.get(i).click();
			Thread.sleep(2000);
			
			
		}
		
		
	}

}
