package day03;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC009MessageAssert {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  
  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win.exe");	
	driver=new ChromeDriver();
   // driver = new FirefoxDriver();
   // baseUrl = "";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTC009MessageAssert() throws Exception {
    //driver.get(baseUrl + "file:///E:/selenium/example/message.html");
    driver.get("http://www.baidu.com/");  
    assertEquals("百度一下，你就知道", driver.getTitle());
    System.out.println("driver.getTitle() is"+driver.getTitle());
    /*
    assertEquals("名字:", driver.findElement(By.cssSelector("td")).getText());
    assertEquals("E-Mail:", driver.findElement(By.xpath("//tr[3]/td")).getText());
    assertEquals("完 成", driver.findElement(By.cssSelector("input[type=\"submit\"]")).getAttribute("value"));
    String n = "jack";
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("jack");
    driver.findElement(By.name("e-mail")).clear();
    driver.findElement(By.name("e-mail")).sendKeys("jack@163.com");
    driver.findElement(By.name("comments")).clear();
    driver.findElement(By.name("comments")).sendKeys("Hello,jack!");
    assertEquals(n, driver.findElement(By.name("name")).getAttribute("value"));
    assertEquals(n + "@163.com", driver.findElement(By.name("e-mail")).getAttribute("value"));
    assertEquals("Hello," + n + "!", driver.findElement(By.name("comments")).getAttribute("value"));
  */
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
