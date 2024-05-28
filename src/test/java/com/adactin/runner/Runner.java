package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.stepdef", plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass
	public static void browserclose() {
		driver.close();
	}

}
