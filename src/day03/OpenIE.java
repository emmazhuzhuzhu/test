package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//����Ĭ��·���µ�IE�����
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer-x64.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.baidu.com/");  
		
		driver.findElement(By.name("wd")).clear();
		driver.findElement(By.id("kw")).sendKeys("Emma"); 
		driver.findElement(By.xpath("//a[contains(text(),'��¼')]")).click();
		/*
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

		
		
		Thread.sleep(3000);
		
		//�ر������
		driver.quit();
		*/
	}

}
