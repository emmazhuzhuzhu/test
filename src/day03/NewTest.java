package day03;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	  @BeforeClass
	    public void beforeClass() {
	        System.out.println("this is before class22222");
	    }

	    @Test
	    public void TestNgLearn() {
	        System.out.println("this is TestNG test case2222");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("this is after class2222");
	    }
}
