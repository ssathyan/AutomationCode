	// package com.gravitant;

	import java.util.concurrent.TimeUnit;
	import java.io.*;
	import java.util.*;
	import java.time.*;
//	import javax.servlet.http.Cookie;
	import org.openqa.selenium.Cookie;
	import java.text.SimpleDateFormat;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.support.ui.Select;


	public class ManageOrders {

	public static String orderVDCname = null;
//	public static String url = "https://alaska.qa.grav.cm/";
	public static String send_userid = "suresh.sathyanarayan+805@gravitant.com";
	//public static String send_password = "1qaz!QAZ";
	//public static String send_password = "Gravitant123!";
	public static String send_password = "Gravitant@123";
	public static String VDCName="hghu893";
	public static long seconds;
	public static WebDriver driver;
	public static WebElement element;
	public static FileWriter bwrite = null;


		public ManageOrders() {	
		}


		protected boolean isElementPresent(By by){
        		try{
            			driver.findElement(by);
            			return true;
        		}
        		catch(NoSuchElementException e){
            				return false;
        		}
    		}


		public static void main(String args[]) throws InterruptedException {



                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                          bwrite = new FileWriter("ManageOrders.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }


                        try {
                          java.util.Date testStartDateTime = new java.util.Date();
                          //bwrite.newLine();
                          //bwrite.write("Test Start Time - "+testStartDateTime);
                          //bwrite.write(System.lineSeparator());
                          bwrite.close();
                        }
                        catch(IOException i) {
                        }


//                  for (int myLoop=1; myLoop<4000000; myLoop++) {


			/** Handling Chrome Driver Config **/
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriver driver = new ChromeDriver();


			ManageOrders addAmazonVDCRequestOrderApproval = new ManageOrders();

			//WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			System.out.println("Navigating to: " +args[0].toString());
			//driver.get(url);
			driver.get(args[0].toString());

			Cookie cookie= driver.manage().getCookieNamed("JSESSIONID");
//			System.out.println("THE COOKIE VALUE IS: : "+cookie.getValue());


			//WebElement element;

			System.out.println("Entering UserName: ");
			Thread.sleep(2000);
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[1]/input")));
			//element.sendKeys(send_userid);
			element.sendKeys(args[1].toString());
			//Thread.sleep(3000);


			System.out.println("Entering Password: ");
			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
			element.sendKeys(args[2].toString());
			//Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Clicking Login button");
			element = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
			element.submit();
//		        Thread.sleep(2000);
			
			


		 for (int innerLoop=1;innerLoop<900000000;innerLoop++) {

			System.out.println("Clicking Manage tab");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//element = driver.findElement(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/a/i[2]"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/a/i[2]")));
			element.click();
			//Thread.sleep(3000);
//			Thread.sleep(1000);


			System.out.println("Clicking Manage Orders");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//element = driver.findElement(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[7]/a"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[7]/a")));
			//Date startTime = new Date();
                        //long start = System.currentTimeMillis();

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        		Date now1 = new Date();
        		String strDate = sdf1.format(now1);
//        		System.out.println("Start time is: "+strDate);

			element.click();


                        while(!driver.getPageSource().contains("All amounts shown in USD"));
                        {
                                ;
                        }


			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        		Date now2 = new Date();
        		String endDate = sdf2.format(now2);
//        		System.out.println("End time is: "+endDate);


                        //long finish = System.currentTimeMillis();
                        //Date finishTime = new Date(); 
                        //long totalTime = finishTime.getTime() - startTime.getTime();
                        //System.out.println("Response Time for Orders page to load- "+totalTime);
//                        System.out.println(cookie.getValue()+","+"ManageOrders,"+myLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());

                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                          bwrite = new FileWriter("ManageOrders.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }

                        try {
                                //bwrite.newLine();
                                java.util.Date currentDateTime = new java.util.Date();
                                //bwrite.write(System.lineSeparator());
                                //bwrite.write("Current Time - "+currentDateTime);
                        	bwrite.write(cookie.getValue()+","+"ManageOrders,"+innerLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());
                                bwrite.write(System.lineSeparator());
//                                //bwrite.write("Response Time for Manage Orders Page to load- "+totalTime);
                                bwrite.close();
                        } catch(IOException e) {
                               System.out.println("File Error");
			}

//				Thread.sleep(4000);

			
			System.out.println("Clicking Logo");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img"));
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img")));
			element.click();
			// Thread.sleep(8000);

		} // END INNER LOOP

        //  driver.close();


//	} // END OUTER LOOP
  }

}





