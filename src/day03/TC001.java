package day03;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.166.6.229/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTC001Message() throws Exception {
    // 鎵撳紑鐣欒█绨�
    driver.get(baseUrl + "file:///E:/selenium/example/message.html");
    // 杈撳叆鍚嶅瓧
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("peter");
    // 杈撳叆閭
    driver.findElement(By.name("e-mail")).clear();
    driver.findElement(By.name("e-mail")).sendKeys("jack@163.com");
    // 杈撳叆鐣欒█
    driver.findElement(By.name("comments")).clear();
    driver.findElement(By.name("comments")).sendKeys("Hello,jack!");
    // 鐐瑰嚮瀹屾垚鎸夐挳
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.findElement(By.name("comments")).clear();
    driver.findElement(By.name("comments")).sendKeys("abcde");
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("zhangsan");
    driver.findElement(By.name("e-mail")).clear();
    driver.findElement(By.name("e-mail")).sendKeys("zhangsan@163.com");
    driver.findElement(By.name("comments")).clear();
    driver.findElement(By.name("comments")).sendKeys("Hello,zhangsan");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
