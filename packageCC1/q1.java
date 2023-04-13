package packageCC1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class q1 {
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
		Thread.sleep(3000);
		WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		addtocart.click();
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		WebElement chkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		chkout.click();
		WebElement fn=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		fn.sendKeys("VARSHAA");
		WebElement ln=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		ln.sendKeys("GR");
		WebElement pin=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		pin.sendKeys("642002");
		WebElement cne=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		cne.click();
		WebElement productNameElement = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		String productName = productNameElement.getText();
		WebElement productPriceElement = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
		String productPrice = productPriceElement.getText();
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
	}

}	
		
		