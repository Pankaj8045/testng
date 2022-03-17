package webAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.util;
import objectRepository.FuelObjectRepo;
import objectRepository.ReportObjectrepo;

public class FuelCardAmpol extends FuelObjectRepo {
	public static WebDriver driver;
	public String username, password;
	public String browser;
	public static WebElement element;
	public String folderName;
	public String pre_cvn;
	public String pre_exp_date;

	// -----------------Read
	// excel---------------------------------------------------------------------------------
	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		util samp = new util();
		Object[][] arrObj = samp.getExcelData("D:\\Users\\F978DHP\\Documents\\Testing.xlsx",
				"FuelCardManagement_Ampol");
		System.out.println(Arrays.toString(arrObj));
		return arrObj;
	}

	// --------------------------Test Case 1 started-----------------------------

	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 1)
	public void TestcaseFCMA_1(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
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
	public void TestcaseFCMA_2(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(20000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(fuel_card_management)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 3 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 3)
	public void TestcaseFCMA_3(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName);
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_search_link)).isDisplayed();
			String actual = driver.findElement(By.xpath(card_search_link)).getText();
			System.out.println(actual + "actual");
			Assert.assertEquals(actual, card_search);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 4 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 4)
	public void TestcaseFCMA_4(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			Thread.sleep(10000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 5 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 5)
	public void TestcaseFCMA_5(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			try {
				driver.findElement(By.xpath(search_button)).click();
			} catch (Exception e) {
				System.out.println(e);
			}
			driver.findElement(By.xpath(institution_id)).isDisplayed();
			driver.findElement(By.xpath(institution_name)).isDisplayed();
			driver.findElement(By.xpath(card_type)).isDisplayed();
			driver.findElement(By.xpath(card_status)).isDisplayed();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 6 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 6)
	public void TestcaseFCMA_6(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(reissue_card_btn)).isDisplayed();
			driver.findElement(By.xpath(refresh)).isDisplayed();
			driver.findElement(By.xpath(save)).isDisplayed();
			driver.findElement(By.xpath(reissue_card_btn)).isEnabled();
			driver.findElement(By.xpath(refresh)).isEnabled();
			driver.findElement(By.xpath(save)).isEnabled();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 7 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 7)
	public void TestcaseFCMA_7(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			WebElement e1 = driver.findElement(By.xpath(card_search_link_homepage));
			Actions action = new Actions(driver);
			Thread.sleep(20000);
			action.moveToElement(e1).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_search_link_homepage)).isDisplayed();
			WebElement e2 = driver.findElement(By.xpath(card_holder_info));
			Actions action1 = new Actions(driver);
			Thread.sleep(20000);
			action1.moveToElement(e2).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_holder_info)).isDisplayed();
			WebElement e3 = driver.findElement(By.xpath(pin_info_reset));
			Actions action2 = new Actions(driver);
			Thread.sleep(20000);
			action2.moveToElement(e3).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(pin_info_reset)).isDisplayed();
			WebElement e4 = driver.findElement(By.xpath(fmi_validation));
			Actions action3 = new Actions(driver);
			Thread.sleep(20000);
			action3.moveToElement(e4).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(fmi_validation)).isDisplayed();
			WebElement e5 = driver.findElement(By.xpath(purchase_control));
			Actions action4 = new Actions(driver);
			Thread.sleep(20000);
			action4.moveToElement(e5).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(purchase_control)).isDisplayed();
			WebElement e6 = driver.findElement(By.xpath(product_codes));
			Actions action5 = new Actions(driver);
			Thread.sleep(20000);
			action5.moveToElement(e6).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(product_codes)).isDisplayed();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 8 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 8)
	public void TestcaseFCMA_8(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			Select select = new Select(driver.findElement(By.xpath(card_status)));
			java.util.List<WebElement> card_status_List = select.getOptions();
			int size = card_status_List.size();
			for (int i = 0; i < size; i++) {
				String options = card_status_List.get(i).getText();
				System.out.println(options);
			}
			driver.findElement(By.xpath(card_status)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 9 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 9)
	public void TestcaseFCMA_9(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Select select = new Select(driver.findElement(By.xpath(card_verification_number)));
			java.util.List<WebElement> card_veri_num_List = select.getOptions();
			int size = card_veri_num_List.size();
			for (int i = 0; i < size; i++) {
				String options = card_veri_num_List.get(i).getText();
				System.out.println(options);
			}

			WebElement n = driver.findElement(By.xpath(scroll));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			driver.findElement(By.xpath(card_verification_number)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 10 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 10)
	public void TestcaseFCMA_10(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Thread.sleep(5000);
			try {
				Select select1 = new Select(driver.findElement(By.xpath(pin_reset)));
				java.util.List<WebElement> pin_reset_List = select1.getOptions();
				int size = pin_reset_List.size();
				for (int i = 0; i < size; i++) {
					String options1 = pin_reset_List.get(i).getText();
					System.out.println(options1);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			WebElement n = driver.findElement(By.xpath(scroll));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			driver.findElement(By.xpath(pin_reset)).click();
			takeScreenshot(methodName);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(logout)).click();
			driver.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 11 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 11)
	public void TestcaseFCMA_11(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(20000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(fuel_card_management)).click();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			driver.findElement(By.xpath(search_button)).click();
			driver.findElement(By.xpath(view_pan)).isEnabled();
			driver.findElement(By.xpath(view_pan)).isDisplayed();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 12 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 12)
	public void TestcaseFCMA_12(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(view_pan)).click();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 13 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 13)
	public void TestcaseFCMA_13(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(refresh)).click();
			Thread.sleep(3000);
			WebElement e6 = driver.findElement(By.xpath(view_pan));
			Actions action5 = new Actions(driver);
			Thread.sleep(20000);
			action5.moveToElement(e6).perform();
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 14 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 14)
	public void TestcaseFCMA_14(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			// driver.switchTo().frame(1);
			driver.findElement(By.xpath(pin_info_reset)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 15 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 15)
	public void TestcaseFCMA_15(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(fmi_validation)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 16 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 16)
	public void TestcaseFCMA_16(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(purchase_control)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 17 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 17)
	public void TestcaseFCMA_17(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(product_codes)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 18 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 18)
	public void TestcaseFCMA_18(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_holder_info)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 19 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 19)
	public void TestcaseFCMA_19(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_search_link_homepage)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 20 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 20)
	public void TestcaseFCMA_20(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			driver.findElement(By.xpath(search_button)).click();
			driver.findElement(By.xpath(card_verification_number)).sendKeys(card_ver_no);
			driver.findElement(By.xpath(current_exp_date)).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath(current_exp_date)).sendKeys(current_Exp_date);
			try {
				Select select = new Select(driver.findElement(By.xpath(pin_reset)));
				select.selectByVisibleText(pin_reset_list);
				String option = select.getFirstSelectedOption().getText();
				System.out.println(option + "options");
				Assert.assertEquals(option, pin_reset_list);
				takeScreenshot(methodName);
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				driver.findElement(By.xpath(save)).click();
				Thread.sleep(3000);
				String crd_ver_no = new Select(driver.findElement(By.xpath(card_verification_number)))
						.getFirstSelectedOption().getText();
				Assert.assertEquals(crd_ver_no, card_ver_no);
				String crnt_exp_date = driver.findElement(By.xpath(current_exp_date)).getAttribute("value");
				Assert.assertEquals(crnt_exp_date, current_Exp_date);
				driver.findElement(By.xpath(logout)).click();
				driver.close();

			} catch (Exception e) {
				driver.quit();
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//--------------------------Test Case 21 started-----------------------------  
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 21)
	public void TestcaseFCMA_21(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
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
			driver.findElement(By.xpath(fuel_card_management)).click();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			driver.findElement(By.xpath(search_button)).click();
			driver.findElement(By.xpath(bt_refresh)).click();

			takeScreenshot(methodName);
			String crd_ver_no = new Select(driver.findElement(By.xpath(card_verification_number)))
					.getFirstSelectedOption().getText();
			Assert.assertEquals(crd_ver_no, card_ver_no);
			String crnt_exp_date = driver.findElement(By.xpath(current_exp_date)).getAttribute("value");
			Assert.assertEquals(crnt_exp_date, current_Exp_date);
			try {
				Select select = new Select(driver.findElement(By.xpath(pin_reset)));
				select.selectByVisibleText(pin_reset_list);
				String option = select.getFirstSelectedOption().getText();
				System.out.println(option + "options");
				Assert.assertEquals(option, pin_reset_list);
				takeScreenshot(methodName);
			} catch (Exception e) {
				System.out.println(e);
			}
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath(connect)).click(); 
			WebElement e2 =driver.findElement(By.xpath(home_page_bt_tools)); 
			Actions action2 = new Actions(driver); Thread.sleep(2000); 
			action2.moveToElement(e2).perform();
					 driver.findElement(By.xpath(fuel_card_management)).click();
					 driver.switchTo().frame(0);
					 driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
					 driver.findElement(By.xpath(search_button)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 22 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 22)
	public void TestcaseFCMA_22(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			//driver.switchTo().defaultContent();
			/*
			 * driver.findElement(By.xpath(connect)).click(); WebElement e1 =
			 * driver.findElement(By.xpath(home_page_bt_tools)); Actions action = new
			 * Actions(driver); Thread.sleep(2000); action.moveToElement(e1).perform();
			 * driver.findElement(By.xpath(fuel_card_management)).click();
			 * driver.switchTo().frame(0);
			 * driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			 * driver.findElement(By.xpath(search_button)).click();
			 */
			driver.findElement(By.xpath(tb_dailytranscountlimit)).clear();
			driver.findElement(By.xpath(tb_dailytranscountlimit)).sendKeys(dailytranscountlimit);
			driver.findElement(By.xpath(tb_dailydollorlimit)).clear();
			driver.findElement(By.xpath(tb_dailydollorlimit)).sendKeys(dailydollorlimit);
			driver.findElement(By.xpath(tb_month_dollorlimit)).clear();
			driver.findElement(By.xpath(tb_month_dollorlimit)).sendKeys(month_dollorlimit);
			driver.findElement(By.xpath(tb_daily_vollimit)).clear();
			driver.findElement(By.xpath(tb_daily_vollimit)).sendKeys(daily_vollimit);
			driver.findElement(By.xpath(tb_month_vollimit)).clear();
			driver.findElement(By.xpath(tb_month_vollimit)).sendKeys(month_vollimit);
			driver.findElement(By.xpath(tb_per_tran_dollorlimit)).clear();
			driver.findElement(By.xpath(tb_per_tran_dollorlimit)).sendKeys(per_tran_dollorlimit);
			driver.findElement(By.xpath(tb_per_tran_vollimit)).clear();
			driver.findElement(By.xpath(tb_per_tran_vollimit)).sendKeys(per_tran_vollimit);
			Thread.sleep(4000);
			takeScreenshot(methodName);
			//driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 23 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 23)
	public void TestcaseFCMA_23(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			takeScreenshot(methodName);
			driver.switchTo().frame(0);
			try {
			
			driver.findElement(By.xpath(bt_save)).click();
			//takeScreenshot(methodName);
			} catch (Exception e) {
				System.out.println(e);
			}
			// driver.switchTo().defaultContent();
			// Thread.sleep(5000);

			takeScreenshot(methodName);
			WebElement n = driver.findElement(By.xpath(tb_dailytranscountlimit));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			Thread.sleep(5000);
			String actualResult = driver.findElement(By.xpath(tb_dailytranscountlimit)).getAttribute("value");
			Assert.assertEquals(actualResult, dailytranscountlimit);
			String actualResult1 = driver.findElement(By.xpath(tb_dailydollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult1, dailydollorlimit);
			String actualResult2 = driver.findElement(By.xpath(tb_month_dollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult2, month_dollorlimit);
			String actualResult3 = driver.findElement(By.xpath(tb_daily_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult3, daily_vollimit);
			String actualResult4 = driver.findElement(By.xpath(tb_month_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult4, month_vollimit);
			String actualResult5 = driver.findElement(By.xpath(tb_per_tran_dollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult5, per_tran_dollorlimit);
			String actualResult6 = driver.findElement(By.xpath(tb_per_tran_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult6, per_tran_vollimit);
			takeScreenshot(methodName);
			//driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 24 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 24)
	public void TestcaseFCMA_24(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(bt_refresh)).click();
			WebElement n = driver.findElement(By.xpath(tb_dailytranscountlimit));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			takeScreenshot(methodName);

			String actualResult = driver.findElement(By.xpath(tb_dailytranscountlimit)).getAttribute("value");
			Assert.assertEquals(actualResult, dailytranscountlimit);
			String actualResult1 = driver.findElement(By.xpath(tb_dailydollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult1, dailydollorlimit);
			String actualResult2 = driver.findElement(By.xpath(tb_month_dollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult2, month_dollorlimit);
			String actualResult3 = driver.findElement(By.xpath(tb_daily_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult3, daily_vollimit);
			String actualResult4 = driver.findElement(By.xpath(tb_month_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult4, month_vollimit);
			String actualResult5 = driver.findElement(By.xpath(tb_per_tran_dollorlimit)).getAttribute("value");
			Assert.assertEquals(actualResult5, per_tran_dollorlimit);
			String actualResult6 = driver.findElement(By.xpath(tb_per_tran_vollimit)).getAttribute("value");
			Assert.assertEquals(actualResult6, per_tran_vollimit);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 25 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 25)
	public void TestcaseFCMA_25(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(product_codes)).click();

			/// Add some extra product code
			driver.findElement(By.xpath(product_code_enabled)).sendKeys(enabled);
			driver.findElement(By.xpath(save)).click();
			String data_saved = new Select(driver.findElement(By.xpath(product_code_enabled))).getFirstSelectedOption()
					.getAttribute("label");
			System.out.println(data_saved + "DataSaved");
			Assert.assertEquals(data_saved, enabled);
			WebElement n = driver.findElement(By.xpath(product_code_enabled));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 26 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 26)
	public void TestcaseFCMA_26(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(bt_refresh)).click();
			String data_saved = new Select(driver.findElement(By.xpath(product_code_enabled))).getFirstSelectedOption()
					.getAttribute("label");
			System.out.println(data_saved + "DataSaved");
			Assert.assertEquals(data_saved, enabled);
			WebElement n = driver.findElement(By.xpath(product_code_enabled));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 27 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 27)
	public void TestcaseFCMA_27(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_status)).sendKeys(card_status2);
			driver.findElement(By.xpath(save)).click();
			String card_status_data = new Select(driver.findElement(By.xpath(card_status))).getFirstSelectedOption()
					.getText();
			Assert.assertEquals(card_status_data, card_status2);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// --------------------------Test Case 28 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 28)
	public void TestcaseFCMA_28(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			driver.findElement(By.xpath(bt_refresh)).click();
			String card_status_data = new Select(driver.findElement(By.xpath(card_status))).getFirstSelectedOption()
					.getText();
			Assert.assertEquals(card_status_data, card_status2);
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// --------------------------Test Case 29 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 29)
	public void TestcaseFCMA_29(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_search_link1)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(reissue_card);
			driver.findElement(By.xpath(search_button)).click();
			pre_cvn = driver.findElement(By.xpath(previous_cvn)).getText();
			pre_exp_date = driver.findElement(By.xpath(previous_exp_date)).getText();
			String curr_cvn = driver.findElement(By.xpath(current_cvn)).getText();
			Assert.assertEquals(curr_cvn, pre_cvn);
			String curr_exp_date = driver.findElement(By.xpath(current_exp_date)).getText();
			Assert.assertEquals(curr_exp_date, pre_exp_date);
			takeScreenshot(methodName);
			try {
				driver.findElement(By.xpath(bt_reissue_lost_stolen)).click();
			} catch (UnhandledAlertException aex) {
				takeScreenshot(methodName);

				System.out.println("caught unhandled alert exception");

			}
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (Exception e) {
			System.out.println("inside method 29" + e);
		}

	}

	// --------------------------Test Case 30 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 30)
	public void TestcaseFCMA_30(String url, String username, String password, String browser, String scenario,
			String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
			String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
			String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
			String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");

			Thread.sleep(2000);
			takeScreenshot(methodName);
			try {
				driver.findElement(By.xpath(bt_reissue_lost_stolen)).click();
				WebDriverWait wait = new WebDriverWait(driver, 90);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
				// driver.switchTo().defaultContent();
			} catch (Exception e) {
				System.out.println("inside scenario 30" + e);
			}
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(connect)).click();
			driver.findElement(By.xpath(logout)).click();
			takeScreenshot(methodName);
			driver.close();

		} catch (Exception e) {
			driver.quit();
			System.out.println("inside scenario 30 catch" + e);

		}

	}

    // --------------------------Test Case 31 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 31)
    public void TestcaseFCMA_31(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
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
                  driver.findElement(By.xpath(fuel_card_management)).click();
                  driver.switchTo().frame(0);
                  driver.findElement(By.xpath(card_number_textbox)).sendKeys(reissue_card);
                  driver.findElement(By.xpath(search_button)).click();
//
                  //takeScreenshot(methodName);
                  try {
                        driver.findElement(By.xpath(bt_reissue_lost_stolen)).click();
                        takeScreenshot(methodName);
                  } catch (UnhandledAlertException aex) {

                        System.out.println("caught unhandled alert exception");

                  }
                  WebDriverWait wait = new WebDriverWait(driver, 90);
                  wait.until(ExpectedConditions.alertIsPresent());
                  Alert alert = driver.switchTo().alert();
                  //String alertText = alert.getText();

                  alert.dismiss();
                  pre_cvn = driver.findElement(By.xpath(previous_cvn)).getText();
                  pre_exp_date = driver.findElement(By.xpath(previous_exp_date)).getText();
                  driver.switchTo().defaultContent();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }

    }

    // --------------------------Test Case 32 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 32)
    public void TestcaseFCMA_32(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  driver.switchTo().frame(0);
                  // driver.findElement(By.xpath(bt_reissue_lost_stolen)).click();

                  WebDriverWait wait = new WebDriverWait(driver, 90);
                  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(bt_reissue_lost_stolen)));

              wait.until(ExpectedConditions.elementToBeClickable(By.xpath(bt_reissue_lost_stolen))).click();

                  try {
                        // WebDriverWait wait = new WebDriverWait(driver, 90);
                        wait.until(ExpectedConditions.alertIsPresent());
                        Alert alert = driver.switchTo().alert();
                  //     String alertText = alert.getText();
                        System.out.println(" alert text");
                     alert.accept();
                        driver.switchTo().defaultContent();

                        
                  } catch (UnhandledAlertException aex) {

                        System.out.println("caught unhandled alert exception");

                  }
                  driver.findElement(By.xpath(connect)).click();
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(2000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(fuel_card_management)).click();
                  driver.switchTo().frame(0);
                  driver.findElement(By.xpath(card_number_textbox)).sendKeys(reissue_card);
                  driver.findElement(By.xpath(search_button)).click();
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();

           } catch (Exception e) {
                  System.out.println(e);
           }

    }

//--------------------------Test Case 33 started----------------------------- 
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 33)
    public void TestcaseFCMA_33(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(connect)).click();
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(2000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(fuel_card_management)).click();
                  driver.switchTo().frame(0);
                  driver.findElement(By.xpath(card_number_textbox)).sendKeys(reissue_card);
                  driver.findElement(By.xpath(search_button)).click();
//
                  
                  driver.findElement(By.xpath(bt_refresh)).click();
                  takeScreenshot(methodName);
                  String curr_cvn = driver.findElement(By.xpath(current_cvn)).getText();
                  Assert.assertEquals(curr_cvn, pre_cvn);
                  String curr_exp_date = driver.findElement(By.xpath(current_exp_date)).getText();
                  Assert.assertEquals(curr_exp_date, pre_exp_date);

                  //add prev cvn and prev expiry date should be blank
                  pre_cvn = driver.findElement(By.xpath(previous_cvn)).getText();
                  boolean pre_cvn_blank = pre_cvn.isBlank();
                  Assert.assertEquals(pre_cvn_blank, true);
                  pre_exp_date = driver.findElement(By.xpath(previous_exp_date)).getText();
                  boolean pre_exp_date_blank = pre_exp_date.isBlank();
                  Assert.assertEquals(pre_exp_date_blank, true);
                  
                  
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 34 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 34)
    public void TestcaseFCMA_34(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(view_pan)).isEnabled();
                  driver.findElement(By.xpath(view_pan)).isDisplayed();
                  String card_no_masked = driver.findElement(By.xpath(card_number_masked)).getAttribute("value");
                  System.out.println(card_no_masked + "card_no_masked");
               boolean value = card_no_masked.contains("XXXXXXX");
               Assert.assertEquals(value, true);
                  takeScreenshot(methodName);
                  
                  // mask validation
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

//--------------------------Test Case 35 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 35)
    public void TestcaseFCMA_35(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(view_pan)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 36 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 36)
    public void TestcaseFCMA_36(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {

                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(bt_refresh)).click();
                  takeScreenshot(methodName);
                  Thread.sleep(2000);
                  
                  String card_no_masked = driver.findElement(By.xpath(card_number_masked)).getAttribute("value");
               boolean value = card_no_masked.contains("XXXXXXX");
               Assert.assertEquals(value, true);
                  driver.findElement(By.xpath(card_search_link1)).click();
                  Thread.sleep(2000);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 37 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 37)
    public void TestcaseFCMA_37(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(search_button2)).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath(error_message)).isDisplayed();
                  takeScreenshot(methodName);
                  String actual = driver.findElement(By.xpath(error_message)).getText();
                  Assert.assertEquals(actual, "Invalid Card Number");
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 38 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 38)
    public void TestcaseFCMA_38(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath(card_number_textbox)).sendKeys(invalid_cardnumber);
                  driver.findElement(By.xpath(search_button)).click();
                  Thread.sleep(2000);
                  String actual = driver.findElement(By.xpath(invalid_card)).getText();
                  takeScreenshot(methodName);
                  Assert.assertEquals(actual, "Invalid Card Number");
                  System.out.println(actual + "actual");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 39 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 39)
    public void TestcaseFCMA_39(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  // driver.findElement(By.xpath(card_search_link1)).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath(card_number_textbox)).clear();
                  driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
                  driver.findElement(By.xpath(search_button)).click();
                  driver.findElement(By.xpath(current_exp_date)).clear();
                  driver.findElement(By.xpath(bt_save)).click();
                  Thread.sleep(2000);
                  String actual = driver.findElement(By.xpath(current_exp_date_err)).getText();
                  // System.out.println("No Reports Found under 'All'");
                  takeScreenshot(methodName);
                  Assert.assertEquals(actual, "Invalid Field Values:CurrentExpDate");
                  System.out.println(actual + "actual");
                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);
           }

    }

    // --------------------------Test Case 40 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 40)
    public void TestcaseFCMA_40(String url, String username, String password, String browser, String scenario,
                  String card_number, String dailytranscountlimit, String dailydollorlimit, String month_dollorlimit,
                  String daily_vollimit, String month_vollimit, String per_tran_dollorlimit, String per_tran_vollimit,
                  String card_status2, String reissue_card, String invalid_cardnumber, String card_ver_no,
                  String current_Exp_date, String pin_reset_list, String enabled) throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
           //     Thread.sleep(2000);
                  driver.switchTo().defaultContent();
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
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("browser.download.folderList", 1);
			options.addPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/x-download, application/pdf, application/octet-stream, application/x-winzip, application/x-pdf");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			// options.addArguments("--kiosk-printing");
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\F978DHP\\Downloads\\chromedriver.exe");
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
