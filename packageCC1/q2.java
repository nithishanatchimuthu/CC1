package packageCC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.saucedemo.com/");
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		searchbox.sendKeys("standard_user");
		WebElement passw=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passw.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		WebElement azElement = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		String az = azElement.getText();
		System.out.println("Product Name A-Z: " + az);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select select = new Select(dropdown);
		select.selectByValue("za");
		WebElement zaElement = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		String za= zaElement.getText();
		System.out.println("Product Name Z-A: " + za);
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("lohi");
		WebElement lhElement = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		String lh= lhElement.getText();
		System.out.println("Product Name Z-A: " + lh);
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("hilo");
		WebElement hlElement = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		String hl= hlElement.getText();
		System.out.println("Product Name Z-A: " + hl);

		
	}
}