package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_class {
	public static WebDriver driver;
	public static Actions a;
	public static ChromeOptions options;
	public static JavascriptExecutor js;
	public static File f;
	public static Select s1;

	
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\ProjectMaven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
        return driver;
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void find(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static void dragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src,dest).perform();
	}
	
	public static void mouseRightClick(WebElement element) {
		a.contextClick(element).click();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	
	public static void refreshPage() {
		driver.navigate().refresh();
	}
	
	public static void pageForward() {
		driver.navigate().forward();
	}
	
	public static void pageBack() {
		driver.navigate().back();
	}
	
	public static void removePopup() {
		options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
	}
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public static void scrollUp(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}
	
	public static void upAndDown(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}
	
	public static String text(WebElement element) {
         String txt = element.getText();
         return txt;

	}
	
	public static String Attribute(WebElement element) {

		String attr = element.getAttribute("value");

		return attr;

	}
	
	public static void implicit() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	
    public static void mousehover(WebElement element) {
		
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}



	public static Set<String> window( ) {
		Set<String> win = driver.getWindowHandles();
		return win;
	}
	
	public static void selectText(WebElement element, String txt) {
		s1 = new Select(element);
		s1.selectByVisibleText(txt);
		
	}
	public static void selectIndex(WebElement element, int ind) {
		s1 = new Select(element);
		s1.selectByIndex(ind);
		
	}
	
	public static void selectValue(WebElement element, String value) {
		s1 = new Select(element);
		s1.selectByValue(value);
	}




//excel read

    public static String excel(int row, int cell) throws IOException {
    f=new File("C:\\Users\\Administrator\\eclipse-workspace\\Mavenn\\src\\test\\java\\org\\datadriven\\Adactin.xlsx");
    	//obj creation for FileInput to read a particular file
    	FileInputStream f1=new FileInputStream(f);
    	//to create a workbook
    	Workbook w= new XSSFWorkbook(f1);
    	
    	Sheet s = w.getSheet("Sheet1");
    	
    	Row r = s.getRow(row);
    	
    	Cell c = r.getCell(cell);
    	
    	int cellType = c.getCellType();
    	String value="";
    	if(cellType==1) {
    		
    		 value = c.getStringCellValue();
    	}
    	
    	else if(DateUtil.isCellDateFormatted(c)){
    		Date d = c.getDateCellValue();
    		SimpleDateFormat sf=new SimpleDateFormat("DD/mm/yyyy");
    		value = sf.format(d);
    		  		
    	}
    	else {
    		double d = c.getNumericCellValue();
    		long l=(long)d;
    		value = String.valueOf(l);
    		
    	}
		return value;
    }
    
    public static Workbook excelWrite(int rowvalue, int cellvalue, String value) throws IOException {
    	File f=new File("C:\\Users\\Administrator\\eclipse-workspace\\Mavenn\\src\\test\\java\\org\\datadriven\\Adactin.xlsx");
    	
    	FileInputStream f1=new FileInputStream(f);
    	
    	Workbook w =new XSSFWorkbook(f1);
    	
    	Sheet s = w.getSheet("Sheet1");
    	
    	Row r = s.getRow(rowvalue);
    	
    	Cell c = r.createCell(cellvalue);
    	
    	c.setCellValue(value);
    	
    	FileOutputStream f3=new FileOutputStream(f);
    	w.write(f3);
    	
    	return w;
    	
    	
    }

}
























