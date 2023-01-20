package day2;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class my_form {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver","C:\\Users\\HP\\Desktop\\Testing\\firefoxdriver_win32(1)\\firefoxdriver.exe");

			WebDriver driver=new FirefoxDriver();

			driver.get("file:///C:/Users/HP/Desktop/sign.html");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.name("first_name")).sendKeys("Shubhangi");
			driver.findElement(By.name("Last_name")).sendKeys("Patil");
			driver.findElement(By.name("user_id")).sendKeys("shubhangipatil2398@gmail.com");
			driver.findElement(By.name("Passwords")).sendKeys("Omsai@2398");
			driver.findElement(By.name("pw2")).sendKeys("Omsai@2398");
			driver.findElement(By.cssSelector("input[value='female']")).click();
			driver.findElement(By.cssSelector("input[value='Software testing']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button")).click();
			Thread.sleep(3000);

		}}
