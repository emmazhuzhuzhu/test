package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//启动默认路径下的Firefox
		//WebDriver driver=new FirefoxDriver();

		//启动非默认路径下安装的Firefox
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		
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

		
		//关闭浏览器
		driver.quit(); 
	}

}
