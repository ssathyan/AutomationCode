// AUTHOR : Suresh Sathyanarayan

import java.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Keys;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.support.ui.Select;
//import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
//import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import java.util.Properties;
import org.openqa.selenium.Cookie;
import java.text.SimpleDateFormat;




//public class ServiceStoreConfigureSubmitOrder implements AllObjects {
public class ServiceStoreConfigureSubmitOrder {

	public static String serverNameStr;
	public static String actualServerName;
	public static String accesskeyid;
	public static String actualAccesskeyid;
	public static String secretkey;
	public static String actualSecretkey;
	public static String orderVdcName = "";
	public  WebDriver driver;
	public int count = 0;
	public ArrayList<String> environmentList = new ArrayList<String>();
	public static int vmQuantity;
	public static String userName;
	public static String userPassword;
	public static String serverName; 
	public static FileWriter bwrite = null;

	public ServiceStoreConfigureSubmitOrder(){
	}


	public static void main(String[] args) throws InterruptedException {


// ******* ORIGINAL DRIVER DECLARATION *****

//                  for (int myLoop=1; myLoop<4000000; myLoop++) {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
                        WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                        driver.manage().window().maximize();
                        driver.get(args[0].toString());

                        Cookie cookie= driver.manage().getCookieNamed("JSESSIONID");


// ******* ORIGINAL DRIVER DECLARATION *****




//			 	Thread.sleep(5000);
                        	System.out.println("Entering UserName: ");
				WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/section/div/form/div/div/div[1]/input")));
				//mmUserName.sendKeys(userName);
				element.sendKeys(args[1].toString());
//				Thread.sleep(4000);	


				System.out.println("Entering Password: "); 
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
				element.sendKeys(args[2].toString());

 

//               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                System.out.println("Clicking Login button");
//               element = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
		element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button")));
                element.submit();
//				Thread.sleep(6000);



				for (int innerLoop=1; innerLoop<=900000000; innerLoop++) {	 
					

				System.out.println("Clicking on Shop Packaged Solutions ");
//				WebElement shop_Packaged_Solutions = driver.findElement(By.xpath("html/body/div/section/div[2]/section/div[2]/div/div[2]/p[2]/a"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/section/div[2]/section/div[2]/div/div[2]/p[2]/a")));
				element.click();
//				Thread.sleep(14000);



				System.out.println("Specifying the search string");
//				WebElement searchServiceField = driver.findElement(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/div[2]/ul/li/div/div/input[1]"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/div[2]/ul/li/div/div/input[1]")));
				element.sendKeys("s3");
//				Thread.sleep(6000);


				System.out.println("Clicking on Search Icon");
//				WebElement searchServicesIcon = driver.findElement(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/div[2]/ul/li/div/div/span/button"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/div[2]/ul/li/div/div/span/button")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(4000);


				System.out.println("Clicking on View Details");
//				WebElement searchServicesDetails = driver.findElement(By.xpath("/html/body/div/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(4000);
				
				
	
				System.out.println("Clicking on Configure");
//				WebElement configureServiceButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[2]/div/button"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[2]/div/button")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(8000);
				
				System.out.println("Enter Service Name");
				DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
	   	                Date date = new Date();
	                        String uniqueServiceName = dateFormat.format(date);
//				WebElement serviceName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[1]/section/div[2]/div/div[4]/div/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[1]/section/div[2]/div/div[4]/div/input")));
				//long start = System.currentTimeMillis();
				element.sendKeys(uniqueServiceName);
				Thread.sleep(1000);
				
				
				System.out.println("Click on Continue");
//				WebElement continueButton1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[5]"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[5]")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(2000);
				
				System.out.println("Select Storage Type");
				Select selectStorageType = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[2]/div/table/tbody/tr/td[1]/select")));
				selectStorageType.selectByIndex(1);
				Thread.sleep(2000);
				
				System.out.println("Enter Estimated Total Storage");
//				WebElement estimatedTotalStorage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[3]/div/div/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[3]/div/div/input")));
				//long start = System.currentTimeMillis();
				element.sendKeys("1");
//				Thread.sleep(2000);
				
				System.out.println("Enter Monthly Download");
//				WebElement monthlyDownload = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[4]/div/div/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[4]/div/div/input")));
				//long start = System.currentTimeMillis();
				element.sendKeys("1");
//				Thread.sleep(2000);
				
				System.out.println("Enter Monthly number of Gets");
//				WebElement monthlyNumberOfGets = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[5]/div/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[5]/div/input")));
				//long start = System.currentTimeMillis();
				element.sendKeys("1");
//				Thread.sleep(2000);
				
				System.out.println("Enter Monthly number of Puts");
//				WebElement monthlyNumberOfPuts = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[6]/div/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[6]/div/input")));
				//long start = System.currentTimeMillis();
				element.sendKeys("1");
//				Thread.sleep(2000);
				
				System.out.println("Click on Enable Logging Yes");
//				WebElement enableLoggingYes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[7]/div/div[2]/label[1]/input"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[2]/div[2]/div[2]/section/div[2]/div/div[3]/form/div[7]/div/div[2]/label[1]/input")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(2000);
				
				System.out.println("Click on Continue");
//				WebElement continueButton2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[5]"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[5]")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(4000);
				
			
				System.out.println("Click on Add to Cart & Submit");
//				WebElement addToCartAndSubmit = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[6]"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[1]/div/div[3]/div/button[6]")));
				//long start = System.currentTimeMillis();
				element.click();
//				Thread.sleep(3000);
			
		
				System.out.println("Click on Confirm Order Yes");
//				WebElement confirmOrderYes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/div/div/div[3]/div/button[2]"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/div/div/div[3]/div/button[2]")));
//				long start = System.currentTimeMillis();
                        	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        	Date now1 = new Date();
                        	String strDate = sdf1.format(now1);

				element.click();
				Thread.sleep(3000);
		
				

                        while(!driver.getPageSource().contains("You can view your"));
                        {
                                ;
                        }

//                        long finish = System.currentTimeMillis();
//                        long totalTime = finish - start;

                        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now2 = new Date();
                        String endDate = sdf2.format(now2);

                        try {
                          bwrite = new FileWriter("ServiceStoreConfigureSubmitOrder.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }

                        try {
                                //bwrite.newLine();
                                java.util.Date currentDateTime = new java.util.Date();
//                                bwrite.write(System.lineSeparator());
//                                bwrite.write("Current Time - "+currentDateTime);
                                bwrite.write(cookie.getValue()+","+"ServiceStoreConfigureSubmitOrder,"+innerLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());

                                bwrite.write(System.lineSeparator());
//                                bwrite.write("Response Time for Confirm Order to complete - "+totalTime);
                                bwrite.close();

//        	                Thread.sleep(9000);
	
                        } catch(IOException e) {
                               System.out.println("File Error");
			}
			


		driver.get(args[0].toString()+"/index-userapp.jsp");
                Thread.sleep(1000);

          } // END INNER LOOP

//          driver.close();


//	} // END OUTER FOR LOOP

     }

}
