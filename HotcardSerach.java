package webAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import org.openqa.selenium.By;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.util;
import objectRepository.HotcardObjectRepository;
import objectRepository.ObjectRepository;

public class HotcardSerach extends HotcardObjectRepository {
	public static WebDriver driver;
	public String username, password;
	public String browser;
	public String folderName;

	// -----------------Read
	// excel---------------------------------------------------------------------------------
	@BeforeSuite
	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		util samp = new util();
		Object[][] arrObj = samp.getExcelData("D:\\Users\\F978DHP\\Documents\\Testing.xlsx", "Hotcard");
		System.out.println(Arrays.toString(arrObj));
		return arrObj;
	}
	
	// --------------------------Test Case 1 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 1)
    public void TestcaseHS_1(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
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
    public void TestcaseHS_2(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(20000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(home_page_bt_hotcard_search)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 3 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 3)
    public void TestcaseHS_3(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 4 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 4)
    public void TestcaseHS_4(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(hotcard_link)).isEnabled();
                  driver.findElement(By.xpath(hotcard_link)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 5 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 5)
    public void TestcaseHS_5(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(5000);
                  driver.switchTo().frame(0);
                  Select select = new Select(driver.findElement(By.xpath(institution)));
                  java.util.List<WebElement> inst_List = select.getOptions();
                  int size = inst_List.size();
                  for (int i = 0; i < size; i++) {
                  String options = inst_List.get(i).getText();
                  System.out.println(options);
                  }
                  driver.findElement(By.xpath(institution)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(institution)).sendKeys(institutionName);
                  
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 6 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 6)
    public void TestcaseHS_6(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(search_for_text)).sendKeys("Text Entered");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 7 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 7)
    public void TestcaseHS_7(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(search_type_surname)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 8 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 8)
    public void TestcaseHS_8(String url, String username, String password, String browser, String scenario,
                  String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
                  String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
                throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Select sc = new Select(driver.findElement(By.xpath(institution)));
                  sc.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type8);
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(bt_search)).click();

                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 9 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 9)
    public void TestcaseHS_9(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();
                  driver.findElement(By.xpath(status)).isDisplayed();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 10 started-----------------------------
    @Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 10)
    public void TestcaseHS_10(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario1";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(card_number_1)).isEnabled();
                  String card_no_masked = driver.findElement(By.xpath(card_number_1)).getAttribute("value");
                  System.out.println(card_no_masked + "card_no_masked");
                  boolean value = card_no_masked.contains("*******");
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();
                  driver.findElement(By.xpath(logout)).click();
                  driver.close();
           } catch (Exception e) {
                  System.out.println(e);
           }
    }

    // --------------------------Test Case 11 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 11)
    public void TestcaseHC_11(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  openBrowser(browser);
                  login(url, username, password, methodName);
                  System.out.println("Testing");
                  Thread.sleep(3000);
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(2000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(home_page_bt_hotcard_search)).click();
                  driver.switchTo().frame(0);
                  Select sc = new Select(driver.findElement(By.xpath("institution")));
                  sc.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath("search_for_text")).sendKeys(search_type8);
                  driver.findElement(By.xpath("search_type_global")).click();
                  driver.findElement(By.xpath("search_button")).click();
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(hotcard_link)).click();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
//--------------------------Test Case 12 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 12)
    public void TestcaseHC_12(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);

                  // driver.findElement(By.xpath(institution)).click();
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName2);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type1);
                  driver.findElement(By.xpath(search_type_global)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(bt_back)).click();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 13 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 13)
    public void TestcaseHC_13(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(institution)).click();
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName2);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type1);
                  driver.findElement(By.xpath(search_type_global)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(bt_search)).click();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

//--------------------------Test Case 14 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 14)
    public void TestcaseHC_14(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
//--------------------------Test Case 15 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 15)
    public void TestcaseHC_15(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(masked_card)).isEnabled();
                  String card_no_masked = driver.findElement(By.xpath(masked_card)).getAttribute("value");
                  System.out.println(card_no_masked + "card_no_masked");
                  boolean value = card_no_masked.contains("*******");
                  driver.findElement(By.xpath(masked_card)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 16 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 16)
    public void TestcaseHC_16(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 17 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 17)
    public void TestcaseHC_17(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  // driver.findElement(By.xpath(institution)).click();
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName3);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type2);
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(bt_search)).click();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 18 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 18)
    public void TestcaseHC_18(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();
                  driver.findElement(By.xpath(status)).isDisplayed();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 19 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 19)
    public void TestcaseHC_19(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(masked_card)).click();
                  driver.findElement(By.xpath(masked_card)).isEnabled();
                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 20 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 20)
    public void TestcaseHC_20(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario2";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();
                  driver.findElement(By.xpath(logout)).click();
                  driver.close();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

	
    // --------------------------Test Case 21 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 21)
    public void TestcaseHC_21(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  openBrowser(browser);
                  login(url, username, password, methodName);
                  System.out.println("Testing");
                  Thread.sleep(3000);
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(2000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(home_page_bt_hotcard_search)).click();
                  driver.switchTo().frame(0);
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(institution)).sendKeys(institutionName3);
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type6);
                  driver.findElement(By.xpath(search_type_global)).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();
           } catch (Exception e) {
                  System.out.println(e);

           }
    }
//--------------------------Test Case 22 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 22)
    public void TestcaseHC_22(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(hotcard_link)).click();
                  Thread.sleep(3000);
                  driver.switchTo().frame(0);
                  driver.findElement(By.xpath(institution)).sendKeys(institutionName3);
                  //driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type8);
                  driver.findElement(By.xpath(search_type_surname)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  //driver.findElement(By.xpath(bt_back)).click();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 23 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 23)
    public void TestcaseHC_23(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

//--------------------------Test Case 24 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 24)
    public void TestcaseHC_24(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(masked_card)).isEnabled();
                  String card_no_masked = driver.findElement(By.xpath(masked_card)).getAttribute("value");
                  System.out.println(card_no_masked + "card_no_masked");
                  boolean value = card_no_masked.contains("*******");
                  driver.findElement(By.xpath(masked_card)).click();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
//--------------------------Test Case 25 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 25)
    public void TestcaseHC_25(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 26 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 26)
    public void TestcaseHC_26(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(hotcard_link)).click();
                  Thread.sleep(3000);
                  driver.switchTo().frame(0);
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type8);
                  driver.findElement(By.xpath(search_type_global)).click();
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 27 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 27)
    public void TestcaseHC_27(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 28 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 28)
    public void TestcaseHC_28(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(masked_card)).click();

                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 29 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 29)
    public void TestcaseHC_29(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);

           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 30 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 30)
    public void TestcaseHC_30(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario3";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  Thread.sleep(3000);
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type7);
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  driver.switchTo().defaultContent();
                  driver.findElement(By.xpath(logout)).click();
                  driver.close();

           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    
    // --------------------------Test Case 31 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 31)
    public void TestcaseHC_31(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  openBrowser(browser);
                  login(url, username, password, methodName);
                  System.out.println("Testing");
                  Thread.sleep(3000);
                  WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
                  Actions action = new Actions(driver);
                  Thread.sleep(2000);
                  action.moveToElement(e1).perform();
                  driver.findElement(By.xpath(home_page_bt_hotcard_search)).click();
                  driver.switchTo().frame(0);
                  Thread.sleep(3000);
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type3);
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 32 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 32)
    public void TestcaseHC_32(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  driver.findElement(By.xpath(result)).isDisplayed();
                  driver.findElement(By.xpath(tx_institution)).isDisplayed();
                  driver.findElement(By.xpath(tx_search_text)).isDisplayed();
                  driver.findElement(By.xpath(name)).isDisplayed();
                  driver.findElement(By.xpath(address)).isDisplayed();
                  driver.findElement(By.xpath(dob)).isDisplayed();
                  driver.findElement(By.xpath(card_number)).isDisplayed();
                  driver.findElement(By.xpath(status)).isDisplayed();
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 33 ---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 33)
    public void TestcaseHC_33(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(card_number_1)).isEnabled();
                  String card_no_masked = driver.findElement(By.xpath(card_number_1)).getAttribute("value");
                  System.out.println(card_no_masked + "card_no_masked");
                  boolean value = card_no_masked.contains("*******");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 34---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 34)
    public void TestcaseHC_34(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
                  driver.findElement(By.xpath(bt_back)).click();
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 35---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 35)
    public void TestcaseHC_35(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
                  driver.switchTo().defaultContent();
                  driver.findElement(By.xpath(hotcard_link)).click();
                  driver.switchTo().frame(0);
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  String actual = driver.findElement(By.xpath(error_message)).getText();
                  Assert.assertEquals(actual, "No rows were found");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 36---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 36)
    public void TestcaseHC_36(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName3);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type4);
                  driver.findElement(By.xpath(search_type_surname)).click();
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  String actual = driver.findElement(By.xpath(error_message)).getText();
                  Assert.assertEquals(actual, "No rows were found");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }
    // --------------------------Test Case 37---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 37)
    public void TestcaseHC_37(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
                  Select instlist = new Select(driver.findElement(By.xpath(institution)));
                  instlist.selectByVisibleText(institutionName1);
                  driver.findElement(By.xpath(search_for_text)).clear();
                  driver.findElement(By.xpath(search_for_text)).sendKeys(search_type5);
                  driver.findElement(By.xpath(search_type_global)).click();
                  driver.findElement(By.xpath(bt_search)).click();
                  takeScreenshot(methodName);
                  String actual = driver.findElement(By.xpath(error_message)).getText();
                  Assert.assertEquals(actual, "No rows were found");
                  takeScreenshot(methodName);
           } catch (Exception e) {
                  System.out.println(e);

           }
    }

    // --------------------------Test Case 38---------------------------------

    @Test(dataProvider = "getLoginData", groups = { "Scenario4" }, priority = 38)
    public void TestcaseHC_38(String url, String username, String password, String browser, String scenario,
            String institutionName, String institutionName1, String institutionName2, String institutionName3,String search_type1, String search_type2, 
            String search_type3, String search_type4, String search_type5, String search_type6, String search_type7, String search_type8)
          throws Exception {
           try {
                  folderName = "Scenario4";
                  String methodName = new Object() {
                  }.getClass().getEnclosingMethod().getName();
                  System.out.println(methodName + "methodName");
                  takeScreenshot(methodName);
                  System.out.println(methodName + "methodName");
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
