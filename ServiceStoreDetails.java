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




//public class ServiceStoreDetails implements AllObjects {
public class ServiceStoreDetails {

	public static String serverNameStr;
	public static String actualServerName;
	public static String accesskeyid;
	public static String actualAccesskeyid;
	public static String secretkey;
	public static String actualSecretkey;
	public static String orderVdcName = "";
	public static WebDriver driver;
	public int count = 0;
	public ArrayList<String> environmentList = new ArrayList<String>();
	public static int vmQuantity;
	public static String userName;
	public static String userPassword;
	public static String serverName; 
	public static FileWriter bwrite = null;

	public ServiceStoreDetails(){
	}


	public static void main(String[] args) throws InterruptedException {


// ******* ORIGINAL DRIVER DECLARATION *****

//                  for (int myLoop=1; myLoop<4000000; myLoop++) {

			System.setProperty("webdriver.chrome.driver", "chromedriver");
                        //WebDriver driver = new ChromeDriver();
                        driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                      driver.manage().window().maximize();
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
//				WebElement mmPassword = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
				element.sendKeys(args[2].toString());

 

                        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        	System.out.println("Clicking Login button");
//                        	WebElement login = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button")));
                        	element.submit();
//				Thread.sleep(6000);



				System.out.println("Clicking on Shop Packaged Solutions ");
//				WebElement shop_Packaged_Solutions = driver.findElement(By.xpath("html/body/div/section/div[2]/section/div[2]/div/div[2]/p[2]/a"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/section/div[2]/section/div[2]/div/div[2]/p[2]/a")));
				element.click();
//				Thread.sleep(14000);




		for (int innerLoop=1; innerLoop<=90000000; innerLoop++) {	 

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
				//Thread.sleep(4000);


				System.out.println("Clicking on View Details");
//				WebElement searchServicesDetails = driver.findElement(By.xpath("/html/body/div/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/section/section/div[3]/div/div[3]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span")));
//				long start = System.currentTimeMillis();
                        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now1 = new Date();
                        String strDate = sdf1.format(now1);

				element.click();
//				Thread.sleep(4000);
				

                        while(!driver.getPageSource().contains("Amazon S3 enables a highly reliable storage in the"));
                        {
                                ;
                        }

//                        long finish = System.currentTimeMillis();
//                        long totalTime = finish - start;

                        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        Date now2 = new Date();
                        String endDate = sdf2.format(now2);

                        try {
                          bwrite = new FileWriter("ServiceStoreDetails.log",true);
                        }
                        catch(IOException i) {
                                i.printStackTrace();
                        }

                        try {
                                //bwrite.newLine();
                                java.util.Date currentDateTime = new java.util.Date();
//                                bwrite.write(System.lineSeparator());
//                                bwrite.write("Current Time - "+currentDateTime);
                                bwrite.write(cookie.getValue()+","+"ServiceStoreDetails,"+innerLoop+","+strDate+","+endDate+","+now1.getTime()+","+now2.getTime());

                                bwrite.write(System.lineSeparator());
//                                bwrite.write("Response Time for Search to complete - "+totalTime);
                                bwrite.close();

        	                Thread.sleep(6000);
	
                        } catch(IOException e) {
                               System.out.println("File Error");
			}
			



				System.out.println("Clicking on Clear link");
//				WebElement searchServicesClearSearchLink = driver.findElement(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/h4[1]/span/a"));
				element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/section/section/div/div/div[2]/div/div[2]/form/h4[1]/span/a")));
				element.click();
//				Thread.sleep(6000);


          } // END INNER LOOP

 //         driver.close();


//	} // END OUTER LOOP

     }

}
