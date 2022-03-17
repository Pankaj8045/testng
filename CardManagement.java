package webAutomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webAutomation.common;
import Util.util;
import objectRepository.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CardManagement extends ObjectRepository {
	public static WebDriver driver;
	public String username, password;
	public String browser;
	public String folderName;

	@BeforeSuite

	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		util samp = new util();
		Object[][] arrObj = samp.getExcelData("D:\\Users\\F978DHP\\Documents\\Testing.xlsx", "CardManagement");
		System.out.println(Arrays.toString(arrObj));
		// Object[][] arrObj = getIDPData();

		return arrObj;
	}

	// --------------------------Test Case 1 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 1)
	public void TestcaseCM_1(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 2 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 2)
	public void TestcaseCM_2(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(card_management_module)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(connect)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 3 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 3)
	public void TestcaseCM_3(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_module)).click();
			driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(search_in_module)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(connect)).click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 4 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 4)
	public void TestcaseCM_4(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(20000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_card_management)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 5 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 5)
	public void TestcaseCM_5(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			WebElement e1 = driver.findElement(By.xpath(card_management_home_link));
			Actions action1 = new Actions(driver);
			Thread.sleep(20000);
			action1.moveToElement(e1).perform();
			takeScreenshot(methodName);
			String actual2 = driver.findElement(By.xpath(card_management_home_link)).getText();
			Assert.assertEquals(actual2, "Card Management Home");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 6 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 6)
	public void TestcaseCM_6(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			WebElement e1 = driver.findElement(By.xpath(visa_exception_file_processing));
			Actions action1 = new Actions(driver);
			Thread.sleep(20000);
			action1.moveToElement(e1).perform();
			takeScreenshot(methodName);
			String actual3 = driver.findElement(By.xpath(visa_exception_file_processing)).getText();
			Assert.assertEquals(actual3, "Visa Exception File Processing");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 7 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 7)
	public void TestcaseCM_7(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			WebElement e1 = driver.findElement(By.xpath(card_management_help));
			Actions action1 = new Actions(driver);
			Thread.sleep(20000);
			action1.moveToElement(e1).perform();
			takeScreenshot(methodName);
			String actual4 = driver.findElement(By.xpath(card_management_help)).getText();
			Assert.assertEquals(actual4, "Help");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 8 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 8)
	public void TestcaseCM_8(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {

		folderName = "Scenario1";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		driver.findElement(By.xpath(card_management_help)).click();
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		java.util.Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				takeScreenshot(methodName);
				try {
					driver.findElement(By.xpath(card_management_help_close_window)).click();
					takeScreenshot(methodName);
				} catch (UnhandledAlertException aex) {
					System.out.println("caught unhandled alert exception");
				}

				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("you have reacehd hered ----" + alertText);
				alert.accept();
				System.out.println("you have reacehd here after successfull alert accept");
				driver.switchTo().window(parent);

				takeScreenshot(methodName);
			}
		}
	}

	// --------------------------Test Case 9 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 9)
	public void TestcaseCM_9(String url, String username, String password, String card_number_testcase1, String browser,
			String card_number_19digits, String lastName1, String lastName2, String lastName3, String lastName4,
			String lastName5, String lastName6, String lastName7, String lastName8, String firstInitial1,
			String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario1";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		driver.findElement(By.xpath(card_management_help)).click();
		takeScreenshot(methodName);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		java.util.Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());

				WebElement e1 = driver.findElement(By.xpath(card_status));
				Actions action1 = new Actions(driver);
				Thread.sleep(20000);
				action1.moveToElement(e1).perform();
				takeScreenshot(methodName);
				String card_status_string = driver.findElement(By.xpath(card_status)).getText();
				System.out.println(card_status_string + "card_status_string");
				Assert.assertEquals(card_status_string, "Card Status");

				WebElement e2 = driver.findElement(By.xpath(Glossary));
				Actions action2 = new Actions(driver);
				Thread.sleep(20000);
				action2.moveToElement(e2).perform();
				takeScreenshot(methodName);
				String Glossary_string = driver.findElement(By.xpath(Glossary)).getText();
				System.out.println(Glossary_string + "Glossary_string");
				Assert.assertEquals(Glossary_string, "Glossary");

				WebElement e3 = driver.findElement(By.xpath(account_type));
				Actions action3 = new Actions(driver);
				Thread.sleep(20000);
				action3.moveToElement(e3).perform();
				takeScreenshot(methodName);
				String account_type_string = driver.findElement(By.xpath(account_type)).getText();
				System.out.println(account_type_string + "account_type");
				Assert.assertEquals(account_type_string, "Account Types");

				WebElement e4 = driver.findElement(By.xpath(card_limits));
				Actions action4 = new Actions(driver);
				Thread.sleep(20000);
				action4.moveToElement(e4).perform();
				takeScreenshot(methodName);
				String card_limits_string = driver.findElement(By.xpath(card_limits)).getText();
				System.out.println(card_limits_string + "card_limits");
				Assert.assertEquals(card_limits_string, "Card Limits");

				WebElement e5 = driver.findElement(By.xpath(file_maintenance_error_codes));
				Actions action5 = new Actions(driver);
				Thread.sleep(20000);
				action5.moveToElement(e5).perform();
				takeScreenshot(methodName);
				String file_maintenance_error_codes_string = driver.findElement(By.xpath(file_maintenance_error_codes))
						.getText();
				System.out.println(file_maintenance_error_codes_string + "file_maintenance_error_codes");
				Assert.assertEquals(file_maintenance_error_codes_string, "File Maintenance Error Codes");

				WebElement e6 = driver.findElement(By.xpath(action_code));
				Actions action6 = new Actions(driver);
				Thread.sleep(20000);
				action6.moveToElement(e6).perform();
				takeScreenshot(methodName);
				String action_code_string = driver.findElement(By.xpath(action_code)).getText();
				System.out.println(action_code_string + "action_code");
				Assert.assertEquals(action_code_string, "Action Code");

				WebElement e7 = driver.findElement(By.xpath(region_code));
				Actions action7 = new Actions(driver);
				Thread.sleep(20000);
				action7.moveToElement(e7).perform();
				takeScreenshot(methodName);
				String region_code_string = driver.findElement(By.xpath(region_code)).getText();
				System.out.println(region_code_string + "region_code");
				Assert.assertEquals(region_code_string, "Region Code");
				try {
					driver.findElement(By.xpath(card_management_help_close_window)).click();
					takeScreenshot(methodName);
				} catch (UnhandledAlertException aex) {

					System.out.println("caught unhandled alert exception");

				}

				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("you have reacehd hered ----" + alertText);
				alert.accept();
				System.out.println("you have reacehd here after successfull alert accept");
				driver.switchTo().window(parent);
			}
		}
	}

	// --------------------------Test Case 10 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 10)
	public void TestcaseCM_10(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario1";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		driver.findElement(By.xpath(card_management_help)).click();
		takeScreenshot(methodName);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		java.util.Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				takeScreenshot(methodName);
				try {
					driver.findElement(By.xpath(card_management_help_close_window)).click();
					takeScreenshot(methodName);
				} catch (UnhandledAlertException aex) {

					System.out.println("caught unhandled alert exception");

				}

				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("you have reacehd hered ----" + alertText);
				alert.accept();
				System.out.println("you have reacehd here after successfull alert accept");
				driver.switchTo().window(parent);
				driver.findElement(By.xpath(logout)).click();
				driver.close();
			}
		}
	}

	// --------------------------Test Case 11 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 11)
	public void TestcaseCM_11(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario2";
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
		driver.findElement(By.xpath(home_page_bt_card_management)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(cardnumberTextBox)).sendKeys("");
		driver.findElement(By.xpath(card_management_bt_search)).click();
		Alert alert = driver.switchTo().alert();
		String errorMessage = alert.getText();
		// String errorMessage1 = driver.findElement(By.xpath(error)).getText();
		Assert.assertEquals(errorMessage, errorMsg);
		takeScreenshot(methodName);
		/*
		 * try { driver.findElement(By.xpath(searchButton)).click();
		 * takeScreenshot(methodName); } catch (UnhandledAlertException aex) {
		 * 
		 * System.out.println("caught unhandled alert exception");
		 * 
		 * } WebDriverWait wait = new WebDriverWait(driver, 90);
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); String alertText = alert.getText();
		 * 
		 * alert.accept(); // driver.switchTo().defaultContent();
		 */
	}

	// --------------------------Test Case 12 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 12)
	public void TestcaseCM_12(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_card_number)).sendKeys(card_number_19digits);
			Thread.sleep(5000);
			driver.findElement(By.xpath(card_management_bt_search)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 13 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 13)
	public void TestcaseCM_13(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName1);
			takeScreenshot(methodName);
			try {
				driver.findElement(By.xpath(card_management_bt_submit)).click();
				takeScreenshot(methodName);
			} catch (UnhandledAlertException aex) {

				System.out.println("caught unhandled alert exception");

			}

			Thread.sleep(20000);
			WebDriverWait wait = new WebDriverWait(driver, 70);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("you have reacehd hered ----" + alertText);
			alert.accept();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 14 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 14)
	public void TestcaseCM_14(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList2);
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_management_home_link)).click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 15 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 15)
	public void TestcaseCM_15(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			takeScreenshot(methodName);
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList2);
			// SoftAssert softAssert = new SoftAssert();
			// softAssert.assertEquals("actual", "institutionNameList2");
			String actual = driver.findElement(By.xpath(card_management_cb_institution)).getText();
			Assert.assertEquals(actual, institutionNameList2);

			try {
				driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName2);
				driver.findElement(By.xpath(searchButton)).click();
				Thread.sleep(10000);
				takeScreenshot(methodName);
			} catch (Exception e) {
				System.out.println("inside the try catch" + e.toString());
			}

			driver.findElement(By.xpath(card_management_home_link)).click();
			Select sc = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			sc.selectByVisibleText(institutionNameList2);
			String actual1 = sc.getFirstSelectedOption().getText();
			Select instlist2 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist2.selectByVisibleText(institutionNameList2);
			driver.findElement(By.xpath(card_management_cb_institution)).getText();
			Assert.assertEquals(actual1, institutionNameList2);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName3);
			driver.findElement(By.xpath(searchButton)).click();
			Thread.sleep(5000);
			takeScreenshot(methodName);

			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist3 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist3.selectByVisibleText(institutionNameList1);
			driver.findElement(By.xpath(searchButton)).click();
			Thread.sleep(5000);
			String errorMessage = driver.findElement(By.xpath(error)).getText();
			System.out.println("errorMessage" + errorMessage); // SoftAssert softAssert =
			// new SoftAssert(); // softAssert.assertEquals("errorMessage", "errorMsg1");
			takeScreenshot(methodName);
			Assert.assertEquals(errorMessage, errorMsg1);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// --------------------------Test Case 16 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 16)
	public void TestcaseCM_16(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(20000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_card_management)).click();
			// driver.findElement(By.xpath(card_management_home_link)).click();
			Thread.sleep(5000);
			try {
				Select instlist3 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
				instlist3.selectByVisibleText(institutionNameList2);
			} catch (Exception e) {
				System.out.println(e);
			}
			// driver.findElement(By.xpath(card_management_cb_institution)).sendKeys(institutionNameList2);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName4);
			driver.findElement(By.xpath(card_management_tb_firstinitial)).sendKeys(firstInitial2);
			takeScreenshot(methodName);
			Thread.sleep(5000);
			driver.findElement(By.xpath(card_management_home_link)).click();
			// driver.findElement(By.xpath(card_management_cb_institution)).sendKeys(institutionNameList2);
			Select instlist4 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist4.selectByVisibleText(institutionNameList2);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName2);
			driver.findElement(By.xpath(card_management_tb_firstinitial)).sendKeys(firstInitial1);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 17 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 17)
	public void TestcaseCM_17(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Thread.sleep(5000);
			driver.findElement(By.xpath(connect)).click();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_card_management)).click();
			System.out.println("I am here 1234" + institutionNameList3);
			Select instlist = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist.selectByVisibleText(institutionNameList3);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName5);
			driver.findElement(By.xpath(card_management_tb_postalcode)).sendKeys(postCode1);
			takeScreenshot(methodName);
			Thread.sleep(5000);
			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList3);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName6);
			Thread.sleep(2000);
			driver.findElement(By.xpath(card_management_tb_postalcode)).sendKeys(postCode2);

			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 18 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 18)
	public void TestcaseCM_18(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist.selectByVisibleText(institutionNameList4);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName7);
			driver.findElement(By.xpath(card_management_ch_available_cards_only)).click();
			driver.findElement(By.xpath(card_management_ch_visa_only)).click();
			driver.findElement(By.xpath(card_management_ch_non_expired)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_management_bt_submit)).click();

			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist2 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist2.selectByVisibleText(institutionNameList4);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName7);
			driver.findElement(By.xpath(card_management_ch_available_cards_only)).click();
			driver.findElement(By.xpath(card_management_ch_proprietary)).click(); //
			driver.findElements(By.xpath(card_management_ch_special_search));

			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_management_bt_submit)).click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 19 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 19)
	public void TestcaseCM_19(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			Thread.sleep(5000);
			Select sc = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			sc.selectByVisibleText(institutionNameList5);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName8);
			driver.findElement(By.xpath(card_management_ch_available_cards_only)).click();
			driver.findElement(By.xpath(card_management_ch_non_expired)).click();
			driver.findElement(By.xpath(card_management_ch_proprietary)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_management_bt_submit)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 20 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 20)
	public void TestcaseCM_20(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_card_number)).isDisplayed();
			driver.findElement(By.xpath(card_management_bt_search)).isDisplayed();
			driver.findElement(By.xpath(card_management_cb_institution)).isDisplayed();
			driver.findElement(By.xpath(card_management_tb_lastname)).isDisplayed();
			driver.findElement(By.xpath(card_management_tb_firstinitial)).isDisplayed();
			driver.findElement(By.xpath(card_management_tb_postalcode)).isDisplayed();
			driver.findElement(By.xpath(card_management_ch_available_cards_only)).isDisplayed();
			driver.findElement(By.xpath(card_management_ch_visa_only)).isDisplayed();
			driver.findElement(By.xpath(card_management_ch_non_expired)).isDisplayed();
			driver.findElement(By.xpath(card_management_ch_proprietary)).isDisplayed();
			driver.findElement(By.xpath(card_management_ch_special_search)).isDisplayed();
			driver.findElement(By.xpath(searchButton)).isDisplayed();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(logout)).click();
			driver.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 21 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 21)
	public void TestcaseCM_21(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
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
			driver.findElement(By.xpath(home_page_bt_card_management)).click();
			Thread.sleep(2000);
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList2);

			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName8);
			driver.findElement(By.xpath(card_management_bt_submit)).click();
			// Thread.sleep(20000);
			driver.findElement(By.xpath(short_name)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_firstname)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_address)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_postal)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_update)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_card)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_expiry)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_status)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_expiry)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(short_institution)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 22 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 22)
	public void TestcaseCM_22(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList1);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName1);
			driver.findElement(By.xpath(card_management_bt_submit)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 23 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 23)
	public void TestcaseCM_23(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			Select instlist1 = new Select(driver.findElement(By.xpath(card_management_cb_institution)));
			instlist1.selectByVisibleText(institutionNameList1);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName1);
			driver.findElement(By.xpath(card_management_bt_submit)).click();
			takeScreenshot(methodName);
			String actual = driver.findElement(By.xpath(record_found)).getText();
			Assert.assertEquals(actual, recordfound);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 24 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 24)
	public void TestcaseCM_24(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(home_page_bt_card_management)).click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_card_number)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(card_management_bt_search)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_information_page)).isEnabled();
			driver.findElement(By.xpath(card_limits)).isEnabled();
			driver.findElement(By.xpath(acc_informations)).isEnabled();
			driver.findElement(By.xpath(acc_balance)).isEnabled();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 25 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 25)
	public void TestcaseCM_25(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_card_number)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(card_management_bt_search)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 26 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 26)
	public void TestcaseCM_26(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(card_management_tb_card_number)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(card_management_bt_search)).click();
			// driver.findElement(By.xpath(masked_card)).isDisplayed();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 27 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 27)
	public void TestcaseCM_27(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Thread.sleep(5000);
			driver.findElement(By.xpath(masked_card)).isDisplayed();
			driver.findElement(By.xpath(view_pan)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 28 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 28)
	public void TestcaseCM_28(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			WebElement e1 = driver.findElement(By.xpath(cardstatus_i));
			Actions action = new Actions(driver);

			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			Thread.sleep(5000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 29 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 29)
	public void TestcaseCM_29(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(cardstatus_i));
			Actions action = new Actions(driver);

			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath(cardstatus_i)).click();
			String parent = driver.getWindowHandle();
			Set<String> s = driver.getWindowHandles();
			// Now iterate using Iterator
			java.util.Iterator<String> I1 = s.iterator();
			while (I1.hasNext()) {
				String child_window = I1.next();
				if (!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					System.out.println(driver.switchTo().window(child_window).getTitle());
					takeScreenshot(methodName);
					try {
						driver.findElement(By.xpath(card_management_help_close_window)).click();
						takeScreenshot(methodName);
					} catch (UnhandledAlertException aex) {

						System.out.println("caught unhandled alert exception");

					}

					WebDriverWait wait = new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					String alertText = alert.getText();
					System.out.println("you have reacehd hered ----" + alertText);
					alert.accept();
					System.out.println("you have reacehd here after successfull alert accept");
					driver.switchTo().window(parent);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// --------------------------Test Case 30 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 30)
	public void TestcaseCM_30(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(bt_print)).click();

			takeScreenshot(methodName);
			Thread.sleep(5000);

			try {

				Thread.sleep(3000);
				WebElement temp = driver.findElement(By.xpath("bt_printpdf"));
				temp.click();
				Actions action1 = new Actions(driver);
				action1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);

				Thread.sleep(6000);
				driver.findElement(By.xpath(logout)).click();
				driver.close();

			}

			catch (Exception e) {

				System.out.println("No button.");
				driver.close();
				return;

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 31 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 31)
	public void TestcaseCM_31(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			System.out.println("Testing");
			// takeScreenshot(methodName);
			Thread.sleep(10000);
			driver.findElement(By.xpath(card_management_module)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(search_in_module)).click();
			driver.findElement(By.xpath(card_limits1)).click();
			String actual1 = driver.findElement(By.xpath(standard_override_Limits_type)).getText();
			Assert.assertEquals(actual1, "Type ");
			String actual2 = driver.findElement(By.xpath(standard_override_Limits_amount)).getText();
			Assert.assertEquals(actual2, "Amount");
			String actual3 = driver.findElement(By.xpath(standard_override_Limits_uses)).getText();
			Assert.assertEquals(actual3, "Uses");
			String actual4 = driver.findElement(By.xpath(usage_information_amount)).getText();
			Assert.assertEquals(actual4, "Amount");
			String actual5 = driver.findElement(By.xpath(usage_information_uses)).getText();
			Assert.assertEquals(actual5, "Uses");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 32 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 32)
	public void TestcaseCM_32(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			String actual = driver.findElement(By.xpath(card_information_page)).getText();
			Assert.assertEquals(actual, "Card Information");
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 33 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 33)
	public void TestcaseCM_33(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(i_tooltip));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			takeScreenshot(methodName);
			// String tooltip = driver.findElement(By.xpath(i_tooltip)).getText();
			String tooltip = driver.findElement(By.xpath(i_tooltip)).getAttribute("title");
			Assert.assertEquals(tooltip, "Card Limits explanation");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 34 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 34)
	public void TestcaseCM_34(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(i_tooltip)).click();
			takeScreenshot(methodName);
			String parent = driver.getWindowHandle();
			Set<String> s = driver.getWindowHandles();
			// Now iterate using Iterator
			java.util.Iterator<String> I1 = s.iterator();
			while (I1.hasNext()) {
				String child_window = I1.next();
				if (!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					System.out.println(driver.switchTo().window(child_window).getTitle());
					takeScreenshot(methodName);
					try {
						driver.findElement(By.xpath(card_management_help_close_window)).click();
						takeScreenshot(methodName);
					} catch (UnhandledAlertException aex) {

						System.out.println("caught unhandled alert exception");

					}

					WebDriverWait wait = new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					String alertText = alert.getText();
					System.out.println("you have reacehd hered ----" + alertText);
					alert.accept();
					System.out.println("you have reacehd here after successfull alert accept");
					driver.switchTo().window(parent);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 35 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 35)
	public void TestcaseCM_35(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			takeScreenshot(methodName);
			// driver.findElement(By.xpath(print)).click();

			// takeScreenshot(methodName);
			// Thread.sleep(5000);

			try {

				Thread.sleep(3000);
				WebElement temp = driver.findElement(By.xpath("bt_printpdf"));
				temp.click();
				Actions action1 = new Actions(driver);
				action1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);

				Thread.sleep(6000);

			}

			catch (Exception e) {

				System.out.println("No button.");
				// driver.close();
				return;

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 36 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 36)
	public void TestcaseCM_36(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(account_info)).click();
			takeScreenshot(methodName);
			String institution = driver.findElement(By.xpath(acct_info_institution)).getText();
			Assert.assertEquals(institution, "Institution:");
			String card_no = driver.findElement(By.xpath(acct_info_card_number)).getText();
			Assert.assertEquals(card_no, "Card Number:");
			String id = driver.findElement(By.xpath(acct_info_id)).getText();
			Assert.assertEquals(id, "ID:");
			String linked1 = driver.findElement(By.xpath(linked_account)).getText();
			Assert.assertEquals(linked1, "Account");
			String linked2 = driver.findElement(By.xpath(linked_type)).getText();
			Assert.assertEquals(linked2, "Type ");
			String linked3 = driver.findElement(By.xpath(linked_acct1)).getText();
			Assert.assertEquals(linked3, "Account");
			String linked4 = driver.findElement(By.xpath(linked_number)).getText();
			Assert.assertEquals(linked4, "Number");
			String linked5 = driver.findElement(By.xpath(linked_acct2)).getText();
			Assert.assertEquals(linked4, "Account");
			String linked6 = driver.findElement(By.xpath(linked_qualifier)).getText();
			Assert.assertEquals(linked6, "Qualifier");
			String linked7 = driver.findElement(By.xpath(linked_primary)).getText();
			Assert.assertEquals(linked7, "Primary");
			String linked8 = driver.findElement(By.xpath(linked_pri_acct)).getText();
			Assert.assertEquals(linked8, "Account");
			String linked9 = driver.findElement(By.xpath(linked_funding)).getText();
			Assert.assertEquals(linked9, "Funding");
			String linked10 = driver.findElement(By.xpath(linked_funding_acct)).getText();
			Assert.assertEquals(linked10, "Account");
			String linked11 = driver.findElement(By.xpath(linked_acct3)).getText();
			Assert.assertEquals(linked11, "Account");
			String linked12 = driver.findElement(By.xpath(linked_access)).getText();
			Assert.assertEquals(linked12, "Access");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 37 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 37)
	public void TestcaseCM_37(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 38 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 38)
	public void TestcaseCM_38(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			// driver.findElement(By.xpath(linked_access)).click();
			driver.findElement(By.xpath(show_link)).isEnabled();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	// -------------------Test case 39 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 39)
	public void TestcaseCM_39(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			// driver.findElement(By.xpath(linked_access)).click();
			driver.findElement(By.xpath(show_link)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(hide_link)).click();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// -------------------Test case 40 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 40)
	public void TestcaseCM_40(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario4";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(acct_type_tooltip));
			Actions action = new Actions(driver);
			Thread.sleep(6000);
			action.moveToElement(e1).perform();
			takeScreenshot(methodName);
			String tooltip = driver.findElement(By.xpath(acct_type_tooltip)).getAttribute("title");

			Assert.assertEquals(tooltip, "Account types explanation");

			WebElement e2 = driver.findElement(By.xpath(prim_acct_tooltip));
			Actions action1 = new Actions(driver);
			Thread.sleep(2000);
			action1.moveToElement(e2).perform();
			takeScreenshot(methodName);
			String tooltip1 = driver.findElement(By.xpath(prim_acct_tooltip)).getAttribute("title");
			Assert.assertEquals(tooltip1, "Primary Account explanation");

			WebElement e3 = driver.findElement(By.xpath(funding_acct_tooltip));
			Actions action2 = new Actions(driver);
			Thread.sleep(2000);
			action2.moveToElement(e3).perform();
			takeScreenshot(methodName);
			String tooltip2 = driver.findElement(By.xpath(funding_acct_tooltip)).getAttribute("title");
			Assert.assertEquals(tooltip2, "Funding Account explanation");
			driver.findElement(By.xpath(logout));
			driver.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	// ------------------Testcase 41 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 41)
	public void cardManagement_41(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {

		// public void OpenBrowser(browser) throws InterruptedException {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		openBrowser(browser);
		login(url, username, password, methodName);
		takeScreenshot(methodName);

		driver.findElement(By.xpath(card_management_module)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(acc_informations)).click();
		WebElement e1 = driver.findElement(By.xpath(acc_typei));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(acc_typei)).click();
		takeScreenshot(methodName);

		WebElement e2 = driver.findElement(By.xpath(acc_primaryi));
		Actions action2 = new Actions(driver);
		Thread.sleep(2000);
		action2.moveToElement(e2).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(acc_primaryi)).click();
		takeScreenshot(methodName);

		WebElement e3 = driver.findElement(By.xpath(acc_fundingacci));
		Actions action3 = new Actions(driver);
		Thread.sleep(2000);
		action3.moveToElement(e3).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(acc_fundingacci)).click();
		takeScreenshot(methodName);

	}

	// ------------------Testcase 42 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 42)
	public void cardManagement_42(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario5";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(acc_informationprint)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(connect)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// ------------------Testcase 43 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 43)
	public void cardManagement_43(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {

		// public void OpenBrowser(browser) throws InterruptedException {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(acc_institution)).isDisplayed();
		driver.findElement(By.xpath(acc_cardnumber)).isDisplayed();
		driver.findElement(By.xpath(acc_id)).isDisplayed();
		driver.findElement(By.xpath(connect)).click();
	}

	// ------------------Testcase 44 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 44)
	public void cardManagement_44(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();
		driver.findElement(By.xpath(acc_acctype)).isDisplayed();
		driver.findElement(By.xpath(acc_accnumber)).isDisplayed();
		driver.findElement(By.xpath(acc_ledbalance)).isDisplayed();
		driver.findElement(By.xpath(acc_avabalance)).isDisplayed();
		driver.findElement(By.xpath(acc_credline)).isDisplayed();
		driver.findElement(By.xpath(acc_access)).isDisplayed();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(connect)).click();
	}

	// ------------------Testcase 45 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 45)
	public void cardManagement_45(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();

		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();
		driver.findElement(By.xpath(acc_bt_show)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(connect)).click();
	}

	// ------------------Testcase 46 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 46)
	public void cardManagement_46(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();

		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();
		driver.findElement(By.xpath(acc_bt_show)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(acc_hide)).click();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(connect)).click();

	}

	// ------------------Testcase 47 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 47)
	public void cardManagement_47(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();

		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();

		WebElement e1 = driver.findElement(By.xpath(acc_typei));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(connect)).click();

	}

	// ------------------Testcase 48 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 48)
	public void cardManagement_48(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");

		driver.findElement(By.xpath(card_management_module)).click();

		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(bt_account_balance)).click();

		WebElement e1 = driver.findElement(By.xpath(acc_typei));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(e1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(acc_typei)).click();
		takeScreenshot(methodName);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		java.util.Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				takeScreenshot(methodName);
				try {
					driver.findElement(By.xpath(card_management_help_close_window)).click();
					takeScreenshot(methodName);
				} catch (UnhandledAlertException aex) {
					System.out.println("caught unhandled alert exception");
				}
				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("you have reacehd hered ----" + alertText);
				alert.accept();
				System.out.println("you have reacehd here after successfull alert accept");
				driver.switchTo().window(parent);
			}
		}

		driver.findElement(By.xpath(connect)).click();
	}

	// ------------------Testcase 49 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 49)
	public void cardManagement_49(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario5";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_management_module)).click();
			driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(search_in_module)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(bt_account_balance)).click();
			takeScreenshot(methodName);
			Thread.sleep(1000);
			try {
				Thread.sleep(3000);
				WebElement temp = driver.findElement(By.xpath("bt_printpdf"));
				temp.click();
				Actions action1 = new Actions(driver);
				action1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);

				Thread.sleep(6000);

			} catch (Exception e) {
				System.out.println("No button.");
				// driver.close();
				return;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

//------------------Testcase 50 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario5" }, priority = 50)
	public void cardManagement_50(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		folderName = "Scenario5";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + "methodName");
		driver.findElement(By.xpath(connect)).click();

		driver.findElement(By.xpath(card_management_module)).click();

		driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
		driver.findElement(By.xpath(search_in_module)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(trans_search)).isDisplayed();
		Thread.sleep(1000);
		driver.findElement(By.xpath(lookup_another)).isDisplayed();
		takeScreenshot(methodName);
		driver.findElement(By.xpath(logout)).click();
		driver.close();
	}
	// ------------------Testcase 51 started----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario6" }, priority = 51)
	public void cardManagement_51(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario6";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			System.out.println("Testing");
			driver.findElement(By.xpath(card_management_module)).click();
			driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(search_in_module)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(trans_search)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

// ------------------Testcase 52 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario6" }, priority = 52)
	public void cardManagement_52(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario6";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			driver.findElement(By.xpath(card_management_module)).click();
			driver.findElement(By.xpath(cardnumberTextBox)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(card_management_bt_search)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(lookup_another)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(bt_go)).click();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

// ------------------Testcase 53 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario6" }, priority = 53)
	public void cardManagement_53(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario6";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(status_update)).click();
			takeScreenshot(methodName);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

// issue with application (will automate latter)
// ------------------Testcase 54 started----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario6" }, priority = 54)
	public void cardManagement_54(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario6";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(connect)).click();
			driver.findElement(By.xpath(card_management_module)).click();
			driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
			driver.findElement(By.xpath(search_in_module)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(status_update)).click();
			Thread.sleep(1000);
			takeScreenshot(methodName);
			driver.findElement(By.xpath(logout)).click();
			driver.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

//-----------------------To be implemented in future----------------------------------------------------------
//// issue with application (will automate latter)
//public void cardManagement_55(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {
//
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(bt_no)).click();
//                takeScreenshot(methodName);
//}
//
//// issue with application (will automate latter)

//-------------------To be implemented in future-----------------------------
//public void cardManagement_56(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {
//
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                driver.findElement(By.xpath(card_management_module)).click();
//                driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
//                driver.findElement(By.xpath(search_in_module)).click();
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(status_update)).click();
//                driver.findElement(By.xpath(bt_yes)).click();
//                takeScreenshot(methodName);
//}
//-------------------To be tested manually-----------------------------
//// 57 we can verify manually
//

//-------------------To be implemented in future-----------------------------
//// issue with application (will automate latter)
//public void cardManagement_58(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {
//
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                driver.findElement(By.xpath(card_management_module)).click();
//                driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
//                driver.findElement(By.xpath(search_in_module)).click();
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(card_status)).sendKeys(cardstatus);
//                driver.findElement(By.xpath(status_update)).click();
//                takeScreenshot(methodName);
//
//}
//-------------------To be implemented in future-----------------------------
//// issue with application (will automate latter)
//public void cardManagement_59(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {
//
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(bt_no)).click();
//                takeScreenshot(methodName);
//}

//-------------------To be implemented in future-----------------------------
////issue with application (will automate latter)
//public void cardManagement_60(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {
//
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                driver.findElement(By.xpath(card_management_module)).click();
//                driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
//                driver.findElement(By.xpath(search_in_module)).click();
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(status_update)).click();
//                driver.findElement(By.xpath(bt_yes)).click();
//                takeScreenshot(methodName);
//}
//
//-------------------Testcase 61 To be verified manually------------------------------------

//-------------------To be implemented in future-----------------------------
//// issue with application (will automate latter)
//public void cardManagement_62(String url, String username, String password, String card_number_testcase1,
//                                String browser) throws Exception {   
//                String methodName = new Object() {
//                }.getClass().getEnclosingMethod().getName();
//                System.out.println(methodName + "methodName");
//
//                driver.findElement(By.xpath(card_management_module)).click();
//                driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
//                driver.findElement(By.xpath(search_in_module)).click();
//                Thread.sleep(1000);
//                driver.findElement(By.xpath(card_status)).sendKeys(cardstatus);
//                driver.findElement(By.xpath(status_update)).click();
//                takeScreenshot(methodName);
//
//}
//
// -------------------Testcase 63 to be verified manually
// -------------------------------------
//
	@Test(dataProvider = "getLoginData", groups = { "Scenario7" }, priority = 64)
	public void cardManagement_64(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario7";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			System.out.println("Testing");

			driver.findElement(By.xpath(card_management_module)).click();
			takeScreenshot(methodName);
//         driver.findElement(By.xpath(card_number_in_module)).sendKeys(card_number_testcase1);
//        driver.findElement(By.xpath(search_in_module)).click();

			driver.findElement(By.xpath(card_management_home_link)).click();
			driver.findElement(By.xpath(institutionHomePage)).sendKeys(institutionNameList2);
			driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName8);
			driver.findElement(By.xpath(card_management_bt_submit)).click();
			String actual = driver.findElement(By.xpath(record_found)).getText();
			Assert.assertEquals(actual, recordfound1);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// -------------------Test case 65 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario7" }, priority = 65)
	public void cardManagement_65(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario7";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			// driver.findElement(By.xpath(card_management_home_link)).click();
			// driver.findElement(By.xpath(institutionHomePage)).sendKeys(institutionName);
			// driver.findElement(By.xpath(card_management_tb_lastname)).sendKeys(lastName);
			// driver.findElement(By.xpath(searchButton)).click();
			driver.findElement(By.xpath(card1)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card2)).click();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card3)).click();

			driver.findElement(By.xpath(multiple_selection_checkbox)).isDisplayed();
			takeScreenshot(methodName);
			// Assert.assertEquals(mul_sel_checkbox, "Click checkbox for multiple
			// selection");

			/*
			 * driver.findElement(By.xpath(mul_sel_box_card1)).isEnabled();
			 * driver.findElement(By.xpath(mul_sel_box_card2)).isEnabled();
			 * driver.findElement(By.xpath(mul_sel_box_card3)).isEnabled();
			 * driver.findElement(By.xpath(mul_sel_box_card1)).isDisplayed();
			 * driver.findElement(By.xpath(mul_sel_box_card2)).isDisplayed();
			 * driver.findElement(By.xpath(mul_sel_box_card3)).isDisplayed();
			 */
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// -------------------Test case 66 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario7" }, priority = 66)
	public void cardManagement_66(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario7";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(maskcard)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// -------------------Test case 67 Started-------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario7" }, priority = 67)
	public void cardManagement_67(String url, String username, String password, String card_number_testcase1,
			String browser, String card_number_19digits, String lastName1, String lastName2, String lastName3,
			String lastName4, String lastName5, String lastName6, String lastName7, String lastName8,
			String firstInitial1, String firstInitial2, String postCode1, String postCode2, String institutionNameList1,
			String institutionNameList2, String institutionNameList3, String institutionNameList4,
			String institutionNameList5, String cardstatus, String Scenario) throws Exception {
		try {
			folderName = "Scenario7";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(logout)).click();
			takeScreenshot(methodName);
			driver.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

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
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			options.addArguments("--kiosk-printing");
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\F978DHP\\Desktop\\chromedriver.exe");
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
		takeScreenshot(methodName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_tb_username)).sendKeys(username);
		takeScreenshot(methodName);
		driver.findElement(By.xpath(login_tb_password)).sendKeys(password);
		takeScreenshot(methodName);
		Thread.sleep(5000);
		driver.findElement(By.xpath(login_bt_login)).click();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
