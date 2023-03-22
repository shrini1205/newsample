package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
	}

	public static void getTitle() {

		System.out.println(driver.getTitle());
	}

	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void printText(WebElement element) {
		System.out.println(element.getText());
	}

	public static String stringData(int row, int cell) throws IOException {

		File f = new File("C:\\Users\\hi\\eclipse-workspace\\AdactInCucu\\testdata\\AdactinData.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet10");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String stringValue = c.getStringCellValue();
		return stringValue;

	}

	public static String numericData(int row, int cell) throws IOException {

		File f = new File("C:\\Users\\hi\\eclipse-workspace\\AdactInCucu\\testdata\\AdactinData.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet10");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String numericValue = String.valueOf(l);
		return numericValue;

	}

}
