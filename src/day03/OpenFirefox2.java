package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//启动Firefox
		WebDriver driver=new FirefoxDriver();
		
		String baseUrl="http://localhost/";
		
		// ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
		driver.get(baseUrl + "/ws/ecshop/upload/index.php");
		driver.findElement(By.cssSelector("#ECS_MEMBERZONE > a > img")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("jack");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("退出")).click();
		System.out.println("第一次登录后退出");
		driver.findElement(By.cssSelector("#ECS_MEMBERZONE > a > img")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("peter");
		System.out.println("第二次登录");

		Thread.sleep(3000);
		
		//关闭浏览器
		driver.quit();
	}

}
