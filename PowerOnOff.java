
	// package com.gravitant;

	import java.util.concurrent.TimeUnit;
        import java.io.*;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import java.text.SimpleDateFormat;
        import org.openqa.selenium.Cookie;
        import java.util.Date;



	public class PowerOnOff {

	public static String orderVDCname = null;
	public static String url = "https://alaska.qa.grav.cm/";
	public static String send_userid = "suresh.sathyanarayan+805@gravitant.com";
	//public static String send_password = "1qaz!QAZ";
	public static String send_password = "Gravitant@123";
	public static String VDCName="hghu893";
	public static long seconds;
	public static WebDriver driver;
	public static WebElement element;
        public static FileWriter bwrite = null;



		public PowerOnOff() {	
		}


		public static void main(String args[]) throws InterruptedException {


                        try {
                          bwrite = new FileWriter("PowerOnOff.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }


                        try {
                          java.util.Date testStartDateTime = new java.util.Date();
                          bwrite.close();
                        }
                        catch(IOException i) {
                        }


			PowerOnOff syncOperation = new PowerOnOff();

		//    for (int myLoop=1; myLoop<3000000; myLoop++) {


			System.setProperty("webdriver.chrome.driver", "chromedriver");
                        WebDriver driver = new ChromeDriver();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                        driver.manage().window().maximize();

			//WebDriver driver = new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			//driver.get(url);
			driver.get(args[0].toString());

                        Cookie cookie= driver.manage().getCookieNamed("JSESSIONID");

//			Thread.sleep(6000);

// PREVIOUS FOR LOOP

			//WebElement element;

			System.out.println("Entering UserName: ");
//			Thread.sleep(2000);
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[1]/input")));
			element.sendKeys(args[1].toString());
//			Thread.sleep(3000);


			System.out.println("Entering Password: ");
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
			element.sendKeys(args[2].toString());
//			Thread.sleep(3000);

// 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Clicking Login button");
//			element = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button")));
			element.submit();
//			Thread.sleep(6000);


			System.out.println("Clicking Manage tab");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/a"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/a")));
			element.click();
//			Thread.sleep(3000);


			System.out.println("Clicking Manage vdc");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a")));
			element.click();
//			Thread.sleep(3000);

/*
			System.out.println("Click VDC Icon");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img")));
			element.click();
//			Thread.sleep(3000);
*/


			System.out.println("Specify VDC Name in Search field");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[3]/input"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[3]/input")));
			element.sendKeys(args[3].toString());
			Thread.sleep(2000);
			
			
			System.out.println("Click on Search icon");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img")));
			element.click();
			Thread.sleep(3000);
			
/*
			System.out.println("Click VDC Actions");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[1]/a/img"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[1]/a/img")));
			element.submit();
			element.click();
//			Thread.sleep(3000);
*/


                          System.out.println("Click on Actions dropdown");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[1]/a/img")));
                          element.click();


			System.out.println("Click Solution Architecture");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[2]/div[4]/a/span"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[2]/div[4]/a/span")));
			element.click();
			Thread.sleep(16000);


		    for (int myLoop=1; myLoop<90000000; myLoop++) {


			System.out.println("click on Actions");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[1]/a/span")));
			element.click();
//			Thread.sleep(3000);


				System.out.println("VDC Actions");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[2]/div[3]/a/img")));
				element.click();
//				Thread.sleep(3000);


				System.out.println("click on Sync");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[4]/div[19]/a/span")));
				element.click();
//				Thread.sleep(20000);


				System.out.println("click OK Begin SYNC");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[47]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/a[1]/label")));

                        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now1 = new Date();
                        String strDate = sdf1.format(now1);

				element.click();

				Thread.sleep(6000);


				System.out.println("click OK Sync Request");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[47]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/a/label")));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[47]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/a/label")));
				element.click();


                        while(driver.getPageSource().contains("Sync in progress"));
                        {
                                ;
                        }

                        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now2 = new Date();
                        String endDate = sdf2.format(now2);


                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                          bwrite = new FileWriter("PowerOnOff.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }

                        try {
                                java.util.Date currentDateTime = new java.util.Date();
                                bwrite.write(cookie.getValue()+","+"PowerOnOff,"+myLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());
                                bwrite.write(System.lineSeparator());
                                bwrite.close();
                        } catch(IOException e) {
                               System.out.println("File Error");
                        }




				System.out.println("****************************************** IERATION #"+myLoop+" ******************************************");
				System.out.println(".............Sleeping for 10 seconds");
				Thread.sleep(10000);
				//Thread.sleep(80000);
				



		   } // END FOR LOOP

		}
}
	
	

