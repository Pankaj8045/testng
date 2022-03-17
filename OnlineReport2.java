
package webAutomation;

import org.testng.annotations.Test;
import webAutomation.common;
import Util.util;
import objectRepository.ReportObjectrepo;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.Reporter;

public class OnlineReport2 extends ReportObjectrepo {
	public static WebDriver driver;
	public String username, password;
	public String browser;
	public static WebElement element;
	public String folderName;

	// -----------------Read
	// excel---------------------------------------------------------------------------------
	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		util samp = new util();
		Object[][] arrObj = samp.getExcelData("D:\\Users\\F978DHP\\Documents\\Testing.xlsx", "Online_report");
		System.out.println(Arrays.toString(arrObj));
		return arrObj;
	}

	// --------------------------Test Case 1
	// started----------------------------------------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 1)
	public void TestcaseOR_1(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 2 started--------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 2)
	public void TestcaseOR_2(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			driver.findElement(By.xpath(moduleBox)).click();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 3
	// started---------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 3)
	public void TestcaseOR_3(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 4
	// started--------------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 4)
	public void TestcaseOR_4(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
			driver.findElement(By.xpath(owner)).sendKeys(listbyowner);
			driver.findElement(By.xpath(viewer)).sendKeys(listbyviewer);
			Thread.sleep(2000);

			driver.findElement(By.xpath(bt_a)).isDisplayed();

			driver.findElement(By.xpath(bt_b)).isDisplayed();

			driver.findElement(By.xpath(bt_c)).isDisplayed();

			driver.findElement(By.xpath(bt_d)).isDisplayed();

			driver.findElement(By.xpath(bt_e)).isDisplayed();

			driver.findElement(By.xpath(bt_f)).isDisplayed();

			driver.findElement(By.xpath(bt_g)).isDisplayed();

			driver.findElement(By.xpath(bt_h)).isDisplayed();

			driver.findElement(By.xpath(bt_i)).isDisplayed();

			driver.findElement(By.xpath(bt_j)).isDisplayed();

			driver.findElement(By.xpath(bt_k)).isDisplayed();

			driver.findElement(By.xpath(bt_l)).isDisplayed();

			driver.findElement(By.xpath(bt_m)).isDisplayed();

			driver.findElement(By.xpath(bt_n)).isDisplayed();

			driver.findElement(By.xpath(bt_o)).isDisplayed();

			driver.findElement(By.xpath(bt_p)).isDisplayed();

			driver.findElement(By.xpath(bt_q)).isDisplayed();

			driver.findElement(By.xpath(bt_r)).isDisplayed();

			driver.findElement(By.xpath(bt_s)).isDisplayed();

			driver.findElement(By.xpath(bt_t)).isDisplayed();

			driver.findElement(By.xpath(bt_u)).isDisplayed();

			driver.findElement(By.xpath(bt_v)).isDisplayed();

			driver.findElement(By.xpath(bt_w)).isDisplayed();

			driver.findElement(By.xpath(bt_x)).isDisplayed();

			driver.findElement(By.xpath(bt_y)).isDisplayed();

			driver.findElement(By.xpath(bt_z)).isDisplayed();
			driver.findElement(By.xpath(bt_all)).isDisplayed();
			driver.findElement(By.xpath(refresh)).isDisplayed();

			driver.findElement(By.xpath(ch_show_file_names)).isDisplayed();
			takeScreenshot(methodName);

			Select select1 = new Select(driver.findElement(By.xpath(owner)));
			select1.selectByVisibleText(listByOwner1);
			Thread.sleep(5000);
			driver.findElement(By.xpath(bt_listbyowner)).click();
			String institutionName = driver.findElement(By.xpath(institution_name)).getText();
			Assert.assertEquals(institutionName, listByOwner1);
			takeScreenshot(methodName);
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

//--------------------------Test Case 5 started----------------------------------          
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 5)
	public void TestcaseOR_5(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			// takeScreenshot(methodName);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
			takeScreenshot(methodName);
			driver.findElement(By.xpath(connect)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//--------------------------Test Case 6 started-----------------------------                                  
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 6)
	public void TestcaseOR_6(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);

			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			driver.findElement(By.xpath(bt_all)).click();
			takeScreenshot(methodName);
			// --------------------- Full page screenshot----------------------
			Thread.sleep(5000);
			if (browser.equalsIgnoreCase("chrome")) {
				WebElement n = driver.findElement(By.xpath(scroll1));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
				takeScreenshot(methodName);
				Thread.sleep(5000);
				WebElement n1 = driver.findElement(By.xpath(scroll2));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n1);
				takeScreenshot(methodName);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebElement n = driver.findElement(By.xpath(scroll1Firefox));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
				takeScreenshot(methodName);
				Thread.sleep(5000);
				WebElement n1 = driver.findElement(By.xpath(scroll2Firefox));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n1);
				takeScreenshot(methodName);
			}
			Thread.sleep(5000);
			if (browser.equalsIgnoreCase("chrome")) {
				WebElement n2 = driver.findElement(By.xpath(scroll3));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n2);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebElement n2 = driver.findElement(By.xpath(scrollFirefox));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n2);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//--------------------------Test Case 7 started---------------------------------                 
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 7)
	public void TestcaseOR_7(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			// takeScreenshot(methodName);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();

			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			driver.findElement(By.xpath(owner)).sendKeys(listbyowner);
			Select select1 = new Select(driver.findElement(By.xpath(owner)));
			select1.selectByVisibleText(listbyowner);
			Thread.sleep(5000);
			driver.findElement(By.xpath(bt_listbyowner)).click();
			String institutionName = driver.findElement(By.xpath(institution_name)).getText();
			Assert.assertEquals(institutionName, listbyowner);
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

// --------------------------Test Case 8 started-------------------------                                
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 8)
	public void TestcaseOR_8(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			/*
			 * driver.findElement(By.xpath(connect)).click(); WebElement e1 =
			 * driver.findElement(By.xpath(home_page_bt_tools)); Actions action = new
			 * Actions(driver); Thread.sleep(2000); action.moveToElement(e1).perform();
			 * driver.findElement(By.xpath(home_page_bt_online_report)).click();
			 */
			Thread.sleep(2000);
			driver.findElement(By.xpath(viewer)).sendKeys(listbyviewer);
			Thread.sleep(2000);
			String institutionName = driver.findElement(By.xpath(institution_name)).getText();
			Assert.assertEquals(institutionName, listbyviewer);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// --------------------------Test Case 9 started-----------------------                                 
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 9)
	public void TestcaseOR_9(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
			Select select1 = new Select(driver.findElement(By.xpath(owner)));
			select1.selectByVisibleText(listbyowner);
			Thread.sleep(5000);
			driver.findElement(By.xpath(bt_listbyowner)).click();
			String institutionName = driver.findElement(By.xpath(institution_name)).getText();
			Assert.assertEquals(institutionName, listbyowner);

			driver.findElement(By.xpath(All_atoz_tble)).isDisplayed();
			driver.findElement(By.xpath(bt_a)).isEnabled();
			driver.findElement(By.xpath(bt_b)).isEnabled();
			driver.findElement(By.xpath(bt_c)).isEnabled();
			driver.findElement(By.xpath(bt_d)).isEnabled();
			driver.findElement(By.xpath(bt_e)).isEnabled();
			driver.findElement(By.xpath(bt_f)).isEnabled();
			driver.findElement(By.xpath(bt_g)).isEnabled();
			driver.findElement(By.xpath(bt_h)).isEnabled();
			driver.findElement(By.xpath(bt_i)).isEnabled();
			driver.findElement(By.xpath(bt_j)).isEnabled();
			driver.findElement(By.xpath(bt_k)).isEnabled();
			driver.findElement(By.xpath(bt_l)).isEnabled();
			driver.findElement(By.xpath(bt_m)).isEnabled();
			driver.findElement(By.xpath(bt_n)).isEnabled();
			driver.findElement(By.xpath(bt_o)).isEnabled();
			driver.findElement(By.xpath(bt_p)).isEnabled();
			driver.findElement(By.xpath(bt_q)).isEnabled();
			driver.findElement(By.xpath(bt_r)).isEnabled();
			driver.findElement(By.xpath(bt_s)).isEnabled();
			driver.findElement(By.xpath(bt_t)).isEnabled();
			driver.findElement(By.xpath(bt_u)).isEnabled();
			driver.findElement(By.xpath(bt_v)).isEnabled();
			driver.findElement(By.xpath(bt_w)).isEnabled();
			driver.findElement(By.xpath(bt_x)).isEnabled();
			driver.findElement(By.xpath(bt_y)).isEnabled();
			driver.findElement(By.xpath(bt_z)).isEnabled();
			driver.findElement(By.xpath(bt_all)).isEnabled();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 10 started----------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 10)
	public void TestcaseOR_10(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			Thread.sleep(2000);
			driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_a)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_b)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_c)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_d)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_e)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_f)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_g)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_h)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_i)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_j)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_k)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_l)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_m)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_n)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_o)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_p)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_q)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_r)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_s)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_t)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_u)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_v)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_w)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_x)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_y)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_z)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(bt_all)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(logout)).click();
			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// --------------------------Test Case 11 started------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 11)
	public void TestcaseOR_11(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		openBrowser(browser);
		login(url, username, password, methodName);
		takeScreenshot(methodName);
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);

		Select select = new Select(driver.findElement(By.xpath(owner)));
		select.selectByVisibleText(listByOwner);
		driver.findElement(By.xpath(bt_listbyowner)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 12 started------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 12)
	public void TestcaseOR_12(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		Thread.sleep(2000);

		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);

		takeScreenshot(methodName);

	}

	// --------------------------Test Case 13 started-------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 13)
	public void TestcaseOR_13(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);

		driver.findElement(By.xpath(bt_listbyowner)).click();
		Select select = new Select(driver.findElement(By.xpath(owner)));
		select.selectByVisibleText(listByOwner2);

		driver.findElement(By.xpath(bt_listbyowner)).click();
		Thread.sleep(5000);
		String actual = driver.findElement(By.xpath(no_data_found_in_all)).getText();
		System.out.println("No Reports Found under 'All'");
		takeScreenshot(methodName);
		Assert.assertEquals(actual, "No Reports Found under 'All'");
		System.out.println(actual + "actual");
		Thread.sleep(2000);
	}

// --------------------------Test Case 14 started--------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 14)
	public void TestcaseOR_14(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);

	}

// --------------------------Test Case 15 started---------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 15)
	public void TestcaseOR_15(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);

	}

// --------------------------Test Case 16 started------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 16)
	public void TestcaseOR_16(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);
		Thread.sleep(5000);
		takeScreenshot(methodName);
		WebElement n = driver.findElement(By.xpath(scroll1));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
		takeScreenshot(methodName);
		Thread.sleep(5000);
		WebElement n1 = driver.findElement(By.xpath(scroll2));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n1);
		takeScreenshot(methodName);

		WebElement n2 = driver.findElement(By.xpath(scroll3));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n2);

	}

// --------------------------Test Case 17 started------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 17)
	public void TestcaseOR_17(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		driver.findElement(By.xpath(bt_all)).click();
		driver.findElement(By.xpath(ch_show_file_names)).click();
		takeScreenshot(methodName);
	}

// --------------------------Test Case 18 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 18)
	public void TestcaseOR_18(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		Thread.sleep(2000);
		driver.findElement(By.xpath(ch_show_file_names)).click();

		takeScreenshot(methodName);
	}

// --------------------------Test Case 19 started--------------------------         
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 19)
	public void TestcaseOR_19(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		Thread.sleep(3000);
		driver.findElement(By.xpath(connect)).click();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		driver.findElement(By.xpath(report_catagory)).click();
		driver.findElement(By.xpath(download)).click();

		takeScreenshot(methodName);

	}

// --------------------------Test Case 20 started-----------------------------         
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 20)
	public void TestcaseOR_20(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario2";
		try {
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Thread.sleep(2000);
			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_online_report)).click();
			driver.findElement(By.xpath(bt_all)).click();
			if (driver.findElements(By.xpath(link)).size() > 0) {
				System.out.println("link found");
				takeScreenshot(methodName);
			} else {
				System.out.println("link not found");
			}
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath(logout)).click();
				driver.quit();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 21
	// started----------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 21)
	public void TestcaseOR_21(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		openBrowser(browser);
		login(url, username, password, methodName);
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		driver.findElement(By.xpath(report_catagory)).click();
		String actual1 = driver.findElement(By.xpath(owner_report_catagory)).getText();
		Assert.assertEquals(actual1, "Owner");
		System.out.println(actual1 + "actual");
		String actual2 = driver.findElement(By.xpath(description_report_catagory)).getText();
		Assert.assertEquals(actual2, "Description:");
		System.out.println(actual2 + "actual2");
		String actual3 = driver.findElement(By.xpath(date_report_catagory)).getText();
		Assert.assertEquals(actual3, "Date:");
		System.out.println(actual3 + "actual3");
		String actual4 = driver.findElement(By.xpath(prefix_number)).getText();
		Assert.assertEquals(actual4, "Prefix Number:");
		System.out.println(actual4 + "actual4");
		String actual5 = driver.findElement(By.xpath(file_size)).getText();
		Assert.assertEquals(actual5, "File Size:");
		System.out.println(actual5 + "actual5");
		String actual6 = driver.findElement(By.xpath(estimate_download_time)).getText();
		Assert.assertEquals(actual6, "Est. Download Time:");
		System.out.println(actual6 + "actual6");
		String actual7 = driver.findElement(By.xpath(file_name)).getText();
		Assert.assertEquals(actual7, "File Name:");
		System.out.println(actual7 + "actual7");
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 22
	// started--------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 22)
	public void TestcaseOR_22(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(view)).click();
		takeScreenshot(methodName);
		driver.navigate().back();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 23 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 23)
	public void TestcaseOR_23(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(download)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 24 started------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 24)
	public void TestcaseOR_24(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(cancel)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 25
	// started--------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 25)
	public void TestcaseOR_25(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(bt_all)).click();
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		if (browser.equalsIgnoreCase("chrome")) {
			driver.findElement(By.xpath(viewer)).sendKeys(listbyviewer1);
		} else if (browser.equalsIgnoreCase("firefox")) {
			Thread.sleep(10000);
			Select sc = new Select(driver.findElement(By.xpath(viewer)));
			sc.selectByVisibleText(listbyviewer1);
		}
		takeScreenshot(methodName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(bt_listbyviewer)).click();
		takeScreenshot(methodName);
		String institutionName = driver.findElement(By.xpath(institution_name)).getText();
		Assert.assertEquals(institutionName, listbyviewer1);
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 26 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 26)
	public void TestcaseOR_26(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();

		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate1);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 27-------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 27)
	public void TestcaseOR_27(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();

		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate1);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);
		Thread.sleep(5000);
		takeScreenshot(methodName);
		WebElement n = driver.findElement(By.xpath(scroll1));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
		takeScreenshot(methodName);
		Thread.sleep(5000);
		WebElement n1 = driver.findElement(By.xpath(scroll2));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n1);
		takeScreenshot(methodName);

		WebElement n2 = driver.findElement(By.xpath(scroll3));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n2);

	}

	// -------------------------------Test Case 28----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 28)
	public void TestcaseOR_28(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Thread.sleep(3000);

		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate1);
		driver.findElement(By.xpath(bt_all)).click();
		driver.findElement(By.xpath(ch_show_file_names)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 29 started--------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 29)
	public void TestcaseOR_29(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario3";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		driver.findElement(By.xpath(checkbox)).click();
		takeScreenshot(methodName);
	}

	// --------------------------Test Case 30 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 30)
	public void TestcaseOR_30(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Thread.sleep(3000);
			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			Thread.sleep(9000);
			try {
				driver.findElement(By.xpath(home_page_bt_online_report)).click();
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				driver.findElement(By.xpath(downloadReport)).click();
				takeScreenshot(methodName);
				driver.findElement(By.xpath(logout)).click();
				// driver.quit();
				driver.close();
			} catch (Exception e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 31 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 31)
	public void TestcaseOR_31(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		openBrowser(browser);
		login(url, username, password, methodName);
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		if (driver.findElements(By.xpath(link)).size() > 0) {
			System.out.println("link found");
		} else {
			System.out.println("link not found");
		}
	}

	// --------------------------Test Case 32 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 32)
	public void TestcaseOR_32(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(report_catagory)).click();
		String actual1 = driver.findElement(By.xpath(owner_report_catagory)).getText();
		Assert.assertEquals(actual1, "Owner");
		System.out.println(actual1 + "actual");
		String actual2 = driver.findElement(By.xpath(description_report_catagory)).getText();
		Assert.assertEquals(actual2, "Description:");
		System.out.println(actual2 + "actual2");
		String actual3 = driver.findElement(By.xpath(date_report_catagory)).getText();
		Assert.assertEquals(actual3, "Date:");
		System.out.println(actual3 + "actual3");
		String actual4 = driver.findElement(By.xpath(prefix_number)).getText();
		Assert.assertEquals(actual4, "Prefix Number:");
		System.out.println(actual4 + "actual4");
		String actual5 = driver.findElement(By.xpath(file_size)).getText();
		Assert.assertEquals(actual5, "File Size:");
		System.out.println(actual5 + "actual5");
		String actual6 = driver.findElement(By.xpath(estimate_download_time)).getText();
		Assert.assertEquals(actual6, "Est. Download Time:");
		System.out.println(actual6 + "actual6");
		String actual7 = driver.findElement(By.xpath(file_name)).getText();
		Assert.assertEquals(actual7, "File Name:");
		System.out.println(actual7 + "actual7");
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 33 started---------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 33)
	public void TestcaseOR_33(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(view)).click();
		takeScreenshot(methodName);
		driver.navigate().back();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 34 started------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 34)
	public void TestcaseOR_34(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(download)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 35 started------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 35)
	public void TestcaseOR_35(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(cancel)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 36 started--------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 36)
	public void TestcaseOR_36(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		Thread.sleep(3000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		Select select = new Select(driver.findElement(By.xpath(owner)));
		select.selectByVisibleText(listByOwner3);
		driver.findElement(By.xpath(bt_listbyowner)).click();
		Thread.sleep(5000);
		String actual = driver.findElement(By.xpath(no_data_found_in_all)).getText();
		System.out.println("No Reports Found under 'All'");
		takeScreenshot(methodName);
		Assert.assertEquals(actual, "No Reports Found under 'All'");
		System.out.println(actual + "actual");
		Thread.sleep(2000);

	}
		

	// --------------------------Test Case 37 started---------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 37)
	public void TestcaseOR_37(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(connect)).click();
		WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
		Actions action = new Actions(driver);
		// takeScreenshot(methodName);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath(home_page_bt_online_report)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(report_date)).sendKeys(reportdate);
		driver.findElement(By.xpath(bt_all)).click();
		takeScreenshot(methodName);

	}

	// --------------------------Test Case 38
	// started----------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 38)
	public void TestcaseOR_38(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(bt_a)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_b)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_c)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_d)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_e)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_f)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_g)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_h)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_i)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_j)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_k)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_l)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_m)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_n)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_o)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_p)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_q)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_r)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_s)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_t)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_u)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_v)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_w)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_x)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_y)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(bt_z)).click();

	}

	// --------------------------Test Case 39 started------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 39)
	public void TestcaseOR_39(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		folderName = "Scenario4";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		driver.findElement(By.xpath(logout)).click();
		takeScreenshot(methodName);
	}

	// --------------------------Test Case 40
	// started-----------------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 40)
	public void TestcaseOR_40(String url, String username, String password, String browser, String reportdate,
			String listbyowner, String listbyviewer, String listByOwner, String listByOwner1, String listbyviewer1,
			String reportdate1, String listByOwner2, String scenario, String listByOwner3) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			takeScreenshot(methodName);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//                                   

	// -----------------------Take Screenshot------------------------
	public void takeScreenshot(String methodName) throws Exception {
		String timeStamp;
		File screenShotName = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		String folderPath = "./test-output/Screenshots/" + folderName;
		System.out.println(folderPath + "folderPath");
		File f1 = new File(folderPath);
		if (f1.exists()) {
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		} else {
			boolean bool = f1.mkdir();
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		}
		FileHandler.copy(scrFile, screenShotName);
		String filePath = timeStamp + ".png";
		Reporter.log(filePath);

	}

	// -------------------Launch
	// browser------------------------------------------------
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\F978DHP\\Downloads\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("browser.download.folderList", 1);
			options.addPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/x-download, application/pdf, application/octet-stream, application/x-winzip, application/x-pdf");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\F978DHP\\Desktop\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--kiosk-printing");
			driver = new ChromeDriver(options);

			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\Users\\F978DHP\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	}

	// -------------------------------Login to the
	// application--------------------------------------------
	public void login(String url, String username, String password, String methodName) throws Exception {
		driver.get(url);
		// takeScreenshot(methodName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_tb_username)).sendKeys(username);
		Thread.sleep(3000);
		// takeScreenshot(methodName);
		driver.findElement(By.xpath(login_tb_password)).sendKeys(password);
		takeScreenshot(methodName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_bt_login)).click();

	}
}
