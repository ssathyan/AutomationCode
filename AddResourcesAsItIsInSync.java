// package com.gravitant;

	import java.util.concurrent.TimeUnit;
	import java.io.*;
        import org.openqa.selenium.Cookie;
        import java.text.SimpleDateFormat;
        import java.util.*;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.support.ui.Select;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.testng.Assert;



	public class AddResourcesAsItIsInSync {

	public static String orderVDCname = null;
//	public static String url = "https://alaska.qa.grav.cm/";
	public static String send_userid = "suresh.sathyanarayan+805@gravitant.com";
	//public static String send_password = "1qaz!QAZ";
	//public static String send_password = "Gravitant@123";
	public static String VDCName="hghu893";
	public static long seconds;
	public static WebDriver driver;
	public static WebElement element;
	//public static FileWriter fw = null;
	public static FileWriter bwrite = null;
	//public static BufferedWriter bwrite;


	protected static boolean isTextPresent(String text){
    		try{
      			  boolean b = driver.getPageSource().contains(text);
       			 return b;
    		}
    		catch(Exception e){
       		 return false;
    		}
  	}


		public AddResourcesAsItIsInSync() {	
		}


		public static void main(String args[]) throws InterruptedException {




			try {
			  //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
			  bwrite = new FileWriter("AddResourcesAsItIsInSync.log",true);
			}
			catch(IOException i) {
				i.printStackTrace();
			}


			try {
//			   System.out.println("HERE");
			  java.util.Date testStartDateTime = new java.util.Date();
			  //bwrite.newLine();
//			  bwrite.write(System.lineSeparator());
//			  bwrite.write("Test Start Time - "+testStartDateTime);
			  bwrite.close();
			}
			catch(IOException i) {
			}

			/** Handling Chrome Driver Config **/
			//System.setProperty("webdriver.chrome.driver", "C:\\SmokeTests\\Chrome_Selenium\\chromedriver.exe");

		  for (int myLoop=1; myLoop<4000000; myLoop++) {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriver driver = new ChromeDriver();

			AddResourcesAsItIsInSync addAmazonVDCRequestOrderApproval = new AddResourcesAsItIsInSync();

/*
			WebDriver driver = new FirefoxDriver();
*/
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
			System.out.println("Navigating to: " +args[0].toString());
			//driver.get(url);
			driver.get(args[0].toString());

                        Cookie cookie= driver.manage().getCookieNamed("JSESSIONID");

			//WebElement element;

			System.out.println("Entering UserName: ");
			Thread.sleep(2000);
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[1]/input")));
			//element.sendKeys(send_userid);
			element.sendKeys(args[1].toString());
			Thread.sleep(3000);


			System.out.println("Entering Password: ");
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
			//element.sendKeys(send_password);
			element.sendKeys(args[2].toString());
			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Clicking Login button");
			element = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
			element.submit();
			Thread.sleep(6000);

			
			

// 	PREVIOUS FOR STATEMENT HERE


/*
			try {
			  //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
			  bwrite = new FileWriter("AddResourcesAsItIsInSync.log",true);
			}
			catch(IOException i) {
				i.printStackTrace();
			}


			try {
			  java.util.Date loopDateTime = new java.util.Date();
			  bwrite.write(System.lineSeparator());
			  bwrite.write("Starting Iteration #"+myLoop+".... At: "+loopDateTime);
			  bwrite.close();
			}
			catch(IOException i) {
			}

*/


			System.out.println("Clicking Manage tab");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/a"));
			element.click();
			Thread.sleep(3000);


			System.out.println("Clicking Manage vdc");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a"));
			element.click();
			Thread.sleep(9000);

/*			
			
			System.out.println("Click on Manage Orders ");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[7]/a"));
			long start = System.currentTimeMillis();
			element.click();
			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("Response time for Add to complete - "+totalTime); 
			Thread.sleep(10000);
			
		


				System.out.println("click on logo");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img")));
				element.click();
				Thread.sleep(8000);




*/

                        System.out.println("Clicking Add Vdc");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[1]/a/label"));
                        element.click();
                        Thread.sleep(9000);


	
			System.out.println("Select Provider");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[3]/div[2]/div[1]/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td/table/tbody/tr/td[2]/div/select")));
			select.selectByIndex(1);
			Thread.sleep(3000);
		
			
			System.out.println("Select Cloud Instance");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[3]/div[2]/div[1]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/select")));
			select.selectByIndex(2);
			Thread.sleep(3000);

			System.out.println("Select Service");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[3]/div[2]/div[1]/table/tbody/tr/td[1]/div/table/tbody/tr[3]/td/table/tbody/tr/td[2]/div/select")));
			select.selectByIndex(1);
			Thread.sleep(3000);
			
			
			System.out.println("Specify VDC Name");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver
				.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[3]/div[2]/div[1]/table/tbody/tr/td[1]/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/div/input"));
			//element.sendKeys("VDC"+myLoop);
	             DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
       	             Date date = new Date();
                     String uniqueVDCName = dateFormat.format(date);
			element.sendKeys(uniqueVDCName);
			Thread.sleep(2000);
			
			
			System.out.println("Specify VDC Namespace");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver
				.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[3]/div[2]/div[1]/table/tbody/tr/td[1]/div/table/tbody/tr[5]/td/table/tbody/tr/td[2]/div/input"));
			element.sendKeys("1234");
			Thread.sleep(2000);
			
			
			System.out.println("Click on Next");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver
				.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div/a[2]/label"));
			element.click();
			Thread.sleep(6000);

                        System.out.println("Click on Create Key Pair");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        element = driver
                                .findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[6]/div/div[2]/div/div/table/tbody/tr/td/div/table/tbody/tr/td[1]/input"));
                        element.click();
                        Thread.sleep(6000);

                        System.out.println("Specify Key Pair Name");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        element = driver
                                .findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[2]/table/tbody/tr[2]/td/div/div/div[4]/div[6]/div/div[2]/div/div/div/table/tbody/tr/td[2]/div/input"));
                    dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
                     date = new Date();
                     String uniqueKeyPairName = dateFormat.format(date);
			element.sendKeys(uniqueKeyPairName);
                        Thread.sleep(6000);
			

			System.out.println("Click on Next");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div/div[2]/div/a[2]/label"));
			element.submit();
			element.click();
			Thread.sleep(3000);


			System.out.println("Click on Design Architecture");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div/div/a[3]/label"));
			element.click();
			Thread.sleep(32000);


                        System.out.println("Click on Actions");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[1]/a/span"));
                        element.click();
                        Thread.sleep(10000);


                        System.out.println("Click on VDC Actions");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[2]/div/a/img"));
                        element.click();
                        Thread.sleep(10000);

                        System.out.println("Click on Add Resource Group");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[3]/div[1]/a/span"));
                        element.click();
                        Thread.sleep(15000);


                        System.out.println("Select Template");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select")));
                        select.selectByIndex(1);
                        Thread.sleep(20000);


                        System.out.println("Specify VDC Name");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[5]/td[2]/div/table/tbody/tr/td[1]/div/input"));
                    dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
                     date = new Date();
                     String uniqueVDCName1 = dateFormat.format(date);
                        element.sendKeys(uniqueVDCName1);
                        Thread.sleep(10000);



                       System.out.println("Specify VM Prefix");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[6]/td[2]/div/table/tbody/tr/td[1]/div/input"));
                    dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
                     date = new Date();
                     String uniqueVDCPrefix = dateFormat.format(date);
                        element.sendKeys(uniqueVDCPrefix);
                        Thread.sleep(10000);

                        System.out.println("Select Template");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select")));
                        select.selectByIndex(1);
                        Thread.sleep(20000);

/*
                       System.out.println("Specify Quantity");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[12]/td[2]/div/input"));
			element.clear();
                        Thread.sleep(5000);
                        element.sendKeys("30");
                        Thread.sleep(10000);
*/


                        System.out.println("Select Template");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select")));
                        select.selectByIndex(1);
                        Thread.sleep(8000);

                        System.out.println("Select Template");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select")));
                        select.selectByIndex(1);
                        Thread.sleep(8000);


                        System.out.println("Select Template");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        select = new Select(driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select")));
                        select.selectByIndex(1);
                        Thread.sleep(8000);


                       System.out.println("Click on Add");
                       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[3]/table/tbody/tr/td[2]/a/label"));
//			long start = System.currentTimeMillis();
                        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now1 = new Date();
                        String strDate = sdf1.format(now1);

                        element.click();
			//while (Assert.assertTrue(true, isTextPresent("Your text")))
			while(driver.getPageSource().contains("Your resources will be added to the Solution Architecture"))
			{
				;
			}

//			long finish = System.currentTimeMillis();
//			long totalTime = finish - start; 
//			System.out.println("Response Time for Add to Complete - "+totalTime);

                        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now2 = new Date();
                        String endDate = sdf2.format(now2);


                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                          bwrite = new FileWriter("AddResourcesAsItIsInSync.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }

			try {
			        //bwrite.newLine();
			  	java.util.Date currentDateTime = new java.util.Date();
//			  	bwrite.write(System.lineSeparator());
//			  	bwrite.write("Current Time - "+currentDateTime);
                                bwrite.write(cookie.getValue()+","+"AddResourcesAsItIsInSync,"+myLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());
			  	bwrite.write(System.lineSeparator());
//				bwrite.write("Response Time for Add to Complete - "+totalTime);
			        bwrite.close();
		        } catch(IOException e) {
			       System.out.println("File Error");
     			}


                        Thread.sleep(30000);





                                System.out.println("click on logo");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img")));
                                element.click();
                                Thread.sleep(12000);







/*








                                System.out.println("Click on Review Changes");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[3]/div/a/img"));
                                element.click();
                                Thread.sleep(8000);


                                System.out.println("Click on Continue");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[27]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[1]/a/label"));
				element.click();
                                Thread.sleep(8000);


                                System.out.println("Click on Submit for Approval");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[28]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[2]/a/label"));
                                element.click();
                                Thread.sleep(8000);



				System.out.println("Click on Approve");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[5]/td/a"));
				element.click();
				Thread.sleep(3000);


				System.out.println("click on Technical checkbox");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[1]/input")));
				element.click();
				Thread.sleep(1000);



				System.out.println("click on Financial checkbox");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/input")));
				element.click();
				Thread.sleep(1000);

				
				System.out.println("click on Legal checkbox");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[3]/td[1]/input")));
				element.click();
				Thread.sleep(1000);

				System.out.println("click on agreement checkbox");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div/span[2]/input")));
				element.click();

				
				System.out.println("click on OK");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/a/label")));
				element.click();
				
				
				System.out.println("click on Place Order");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[6]/td/a")));
				element.click();
				
				
				System.out.println("click on Submit for Place Order Confirmation");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[9]/div/div[2]/table/tbody/tr[2]/td/div/div/a/label")));
				element.click();
				
				
				System.out.println("click on OK VDC Order Successfully Submitted");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[10]/div/div[2]/table/tbody/tr[2]/td/div/div/a/label")));
				element.click();


				System.out.println("click on logo");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img")));
				element.click();
				Thread.sleep(8000);



*/









				System.out.println("Clicking Manage tab");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/a"));
				element.click();
				Thread.sleep(3000);


				System.out.println("Clicking Manage vdc");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a"));
				element.click();
				Thread.sleep(9000);


		   driver.close();




		   } // END for loop




		}
}
