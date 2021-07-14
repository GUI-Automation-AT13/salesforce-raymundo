/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

import static core.utils.LoadEnvironmentFile.getDotenv;

public class CaseTests {
  private WebDriver driver;
  private WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    System.setProperty("webdriver.chrome.driver", getDotenv().get("CHROME_DRIVER_PATH"));
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, 30);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }


  public void tearDown() {
    driver.quit();
  }

  public void LoginWithValidCredentials() {
    driver.get(getDotenv().get("BASE_URL_CASE"));
    driver.findElement(By.id("username")).sendKeys(getDotenv().get("SALESFORCE_USERNAME"));
    driver.findElement(By.id("password")).sendKeys(getDotenv().get("SALESFORCE_PASSWORD"));
    driver.findElement(By.id("Login")).click();
  }

  public void logout() {
    clickOnElementByCss(".profileTrigger > .uiImage");
    clickOnElementByLinkText("Log Out");
  }


  public void createCaseWithAllValues() {
    LoginWithValidCredentials();
    clickOnElementByCss("div[title=\"New\"]");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("Phone");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("Mechanical");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("Performance");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("GC1040");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("Yes");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("No");
    sendKeysOnElementByXpath("//label/span[text()=\"Web Email\"]//following::input[1]", "email@email.com");
    sendKeysOnElementByXpath("//label/span[text()=\"Web Name\"]//following::input[1]", "www.company.com");
    sendKeysOnElementByXpath("//label/span[text()=\"Web Company\"]//following::input[1]", "company");
    sendKeysOnElementByXpath("//label/span[text()=\"Web Phone\"]//following::input[1]", "77744555");
    sendKeysOnElementByXpath("//label/span[text()=\"Engineering Req Number\"]//following::input[1]", "1");
    sendKeysOnElementByXpath("//label/span[text()=\"Subject\"]//following::input[1]", "Subject");
    sendKeysOnElementByXpath("(//textarea[@class=\" textarea\"])[1]", "Description");
    sendKeysOnElementByXpath("(//textarea[@class=\" textarea\"])[2]", "My comments");
    clickOnElementByXpath("//input[@title=\"Search Accounts\"]");
    clickOnElementByXpath("//span[@title=\"New Account\"]/..");
    sendKeysOnElementByXpath("//span[text()=\"Account Information\"]/../..//span[text()=\"Account Name\"]/../../input",
            "Account to test");
    clickOnElementByXpath(".forceModalActionContainer--footerAction > .uiButton--default > .label");
    clickOnElementByXpath("//input[@title=\"Search Contacts\"]");
    clickOnElementByXpath("//span[@title=\"New Contact\"]/..");
    sendKeysOnElementByXpath("//input[contains(@class, \"firstName \")]", "Raymundo");
    sendKeysOnElementByXpath("//input[contains(@class, \"lastName \")]", "Guaraguara");
    clickOnElementByCss(".forceModalActionContainer--footerAction > .uiButton--default > .label");
    clickOnElementByCss(".forceActionButton:nth-child(3) > .label");
    clickOnElementByCss("lightning-button button[name=\"Delete\"]");
    clickOnElementByCss(".uiButton--brand:nth-child(2) > .label");
    logout();
  }


  public void createCaseWithRequiredValues() {
    LoginWithValidCredentials();
    clickOnElementByCss("div[title=\"New\"]");
    clickOnElementByLinkText("--None--");
    clickOnElementByLinkText("Phone");
    clickOnElementByXpath("//div[@class=\"actionsContainer\"]//span[text()=\"Save\"]");
    clickOnElementByCss("lightning-button button[name=\"Delete\"]");
    clickOnElementByCss(".uiButton--brand:nth-child(2) > .label");
    logout();
  }

  public void clickOnElementByLinkText(final String text) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(text)));
    driver.findElement(By.linkText(text)).click();
  }

  public void clickOnElementByCss(final String text) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(text)));
    driver.findElement(By.cssSelector(text)).click();
  }

  public void clickOnElementByXpath(final String text) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(text)));
    driver.findElement(By.xpath(text)).click();
  }

  public void sendKeysOnElementByXpath(final String text, final String value) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(text)));
    driver.findElement(By.xpath(text)).sendKeys(value);
  }
}
