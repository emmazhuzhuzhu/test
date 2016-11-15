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
		//����Ĭ��·���µ�Firefox
		//WebDriver driver=new FirefoxDriver();

		//������Ĭ��·���°�װ��Firefox
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		
		String baseUrl="";
		
		// �����Բ�
		driver.get(baseUrl + "file:///E:/selenium/example/message.html");
		// ��������
		
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("peter");
		// ��������
		driver.findElement(By.name("e-mail")).clear();
		driver.findElement(By.name("e-mail")).sendKeys("jack@163.com");
		// ��������
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Hello,jack!");
		// �����ɰ�ť
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("abcde");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("zhangsan");
		driver.findElement(By.name("e-mail")).clear();
		driver.findElement(By.name("e-mail")).sendKeys("zhangsan@163.com");
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Hello,zhangsan");

		
		//�ر������
		driver.quit(); 
	}

}
