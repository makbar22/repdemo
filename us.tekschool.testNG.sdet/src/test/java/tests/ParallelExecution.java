package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution extends Base {

	@Test
	public void chromBrowswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel/");
		logger.info("This title is through Chrome execution " + driver.getTitle());
	}

	@Test
	public void fireFoxBrowswer() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://tek-school.com/hotel/");
		logger.info("This title is through Firefox execution " + driver.getTitle());

	}

	@Test
	public void internetExpBrowswer() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.get("http://tek-school.com/hotel/");
		logger.info("This title is through Internet Explorer execution " + driver.getTitle());

	}

}
