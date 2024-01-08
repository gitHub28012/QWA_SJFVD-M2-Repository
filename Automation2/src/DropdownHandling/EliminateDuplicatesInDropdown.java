package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesInDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/QSP/Desktop/Movies.html");
		
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		
		Select s = new Select(dropdown);
		
		List<WebElement> allDulplicateOptions = s.getOptions();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i=0;i<allDulplicateOptions.size();i++)
		{
			String allOptions = allDulplicateOptions.get(i).getText();
			
			set.add(allOptions);
		}
		
		for(String option:set)
		{
			System.out.println(option);
		}
		
		

	}

}
