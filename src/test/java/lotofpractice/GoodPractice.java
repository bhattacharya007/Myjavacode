package lotofpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		WebElement Checkboxes = driver.findElement(By.xpath("//*[@id='content']/ul/li[6]/a"));
		Checkboxes.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/div/h3"));
		driver.findElement(By.xpath("//*[@id='checkboxes']"));
		
		WebElement checkbox1= driver.findElement(By.xpath("//*[@id='checkboxes']"));
		WebElement checkbox2= driver.findElement(By.xpath("//*[@id='checkboxes']"));
		if (checkbox1.isSelected()) {
			checkbox1.click();
			if (checkbox2.isSelected()) {
				checkbox2.click();
				WebElement header = driver.findElement(By.xpath("//h3"));
	            String headerText = header.getText();
	            if (headerText.equals("Checkboxes")) {
	                System.out.println("Header verification PASSED");
	            } else {
	                System.out.println("Header verification FAILED: " + headerText);
	                WebElement footer = driver.findElement(By.xpath("//*[@id='page-footer']/div/div"));
	                String footerText = footer.getText();
	                if (footerText.contains("Powered by Elemental Selenium")) {
	                    System.out.println("Footer verification PASSED");
	                } else {
	                    System.out.println("Footer verification FAILED: " + footerText);
	                }
	                
	                driver.quit();
	            }
				
				
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		

	}

}
