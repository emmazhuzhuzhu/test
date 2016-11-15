package day03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;




import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNG;

import sun.util.logging.resources.logging;

public class OpenChrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  final Logger logger = LogManager.getLogger(OpenChrome.class.getName());
		  
		  logger.info("info");
		// TODO Auto-generated method stub
		
//		//打开默认安装路径下的Chrome浏览器
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win.exe");	
	    final WebDriver driver=new ChromeDriver();

		//打开非默认安装路径下的Chrome浏览器
		//System.setProperty("webdriver.chrome.bin", "C:\\Documents and Settings\\Administrator\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chrome.exe");
		//System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win.exe");	
		//WebDriver driver=new ChromeDriver();
		
		//截图
	  
	    File source_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	    try {
			FileUtils.copyFile(source_file, new File("dir_name" + File.separator + new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + ".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	    //driver.navigate().to(arg0);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    new WebDriverWait(driver, 15 ).until(
	    		
	    			     ExpectedConditions.presenceOfElementLocated(By.cssSelector( "css locator" ))
	    			);
	    WebDriverWait wait = new WebDriverWait(driver,10);  
	    
	   Boolean f =  wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                 
            	return true;
            	//return !justification.getAttribute("class").contains("x-form-invalid-field");
             }
            
        WebElement e = ( new WebDriverWait(driver, 10 )) .until(
            			     new ExpectedCondition< WebElement>(){
            			         @Override
            		         public WebElement apply( WebDriver d) {
            	             return d.findElement( By.id( "id locator" ));
            			         }
            		 	     }
            			);
 });
		//TestNG tng = new TestNG();
		//tng.setGroups(groups);
		driver.get("http://www.baidu.com/");  
		
		driver.findElement(By.name("wd")).clear();
		driver.findElement(By.cssSelector("#form>span>input[id='kw']")).sendKeys("Emma"); 
		driver.findElement(By.xpath("//a[contains(text(),'登录')]")).click();
		//driver.findElement(By.name("wd")).clear();
		//driver.findElement(By.xpath("//form[@id='form']//input[@id='kw']")).sendKeys("hello"); 
		/*
		String baseUrl="";
		
		// 打开留言簿
		driver.get(baseUrl + "file:///E:/selenium/example/message.html");
		// 输入名字
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("peter");
		// 输入邮箱
		driver.findElement(By.name("e-mail")).clear();
		driver.findElement(By.name("e-mail")).sendKeys("jack@163.com");
		// 输入留言
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Hello,jack!");
		// 点击完成按钮
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("abcde");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("zhangsan");
		driver.findElement(By.name("e-mail")).clear();
		driver.findElement(By.name("e-mail")).sendKeys("zhangsan@163.com");
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Hello,zhangsan");

		
		
		*/
		//关闭浏览器
		driver.quit();
	}

}
