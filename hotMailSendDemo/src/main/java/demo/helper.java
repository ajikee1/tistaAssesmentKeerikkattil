package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helper {

	private WebDriver driver;

	public void createWebDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/ajithkeerikkattil/Desktop/code/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public By getBy(String type, String locator) {

		By by = null;

		if ("id".equalsIgnoreCase(type)) {
			by = By.id(locator);
		} else if ("name".equalsIgnoreCase(type)) {
			by = By.name(locator);
		} else if ("className".equalsIgnoreCase(type)) {
			by = By.className(locator);
		} else if ("xpath".equalsIgnoreCase(type)) {
			by = By.xpath(locator);
		} else if ("css".equalsIgnoreCase(type)) {
			by = By.cssSelector(locator);
		} else if ("linkText".equalsIgnoreCase(type)) {
			by = By.linkText(locator);
		} else if ("tagName".equalsIgnoreCase(type)) {
			by = By.tagName(locator);
		} else if ("partialLinkText".equalsIgnoreCase(type)) {
			by = By.partialLinkText(locator);
		}
		return by;
	}

	public void enterText(By by, String text) {
		WebElement element = driver.findElement(by);
		element.sendKeys(text);
	}

	public void click(By by) {
		WebElement element = driver.findElement(by);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		element.click();
	}
	
	public void selectFromDropDown(By by, String value)
	{
		WebElement element = driver.findElement(by);
		Select dropDown = new Select(element);
		dropDown.selectByValue(value);
		//dropDown.selectByIndex(0);
	}

	public void wait(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	public boolean isPresent(By by)
	{
		Boolean isPresent = driver.findElements(by).size() > 0;
		return isPresent;
	}

	public void closeDriver() {
		driver.quit();
	}

}
