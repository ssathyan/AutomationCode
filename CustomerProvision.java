// **** AUTHOR: SURESH SATHYANARAYANA

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
        import org.openqa.selenium.support.ui.Select;
        import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.Date;


        public class CustomerProvision {

        public static String orderVDCname = null;
//      public static String url = "https://alaska.qa.grav.cm/";
        public static String send_userid = "suresh.sathyanarayan+805@gravitant.com";
        //public static String send_password = "1qaz!QAZ";
        //public static String send_password = "Gravitant123!";
        public static String send_password = "Gravitant@123";
        public static String VDCName="hghu893";
        public static long seconds;
        public static WebDriver driver;
        public static WebElement element;
        public static FileWriter bwrite = null;


                public CustomerProvision() {    
                }


                public static void main(String args[]) throws InterruptedException {



                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                            bwrite = new FileWriter("CustomerProvision.log",true);
                          }
                          catch(IOException i) {
                                  i.printStackTrace();
                          }


                          try {
                            java.util.Date testStartDateTime = new java.util.Date();
                            //bwrite.newLine();
                            bwrite.write(System.lineSeparator());
                            bwrite.write("Test Start Time - "+testStartDateTime);
                            bwrite.close();
                          }
                          catch(IOException i) {
                          }




                          /** Handling Chrome Driver Config **/
                          System.setProperty("webdriver.chrome.driver", "chromedriver");
                          WebDriver driver = new ChromeDriver();

                          CustomerProvision addAmazonVDCRequestOrderApproval = new CustomerProvision();

                          //WebDriver driver = new FirefoxDriver();
//                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                          driver.manage().window().maximize();
                          System.out.println("Navigating to: " +args[0].toString());
                          //driver.get(url);
                          driver.get(args[0].toString());



                          System.out.println("Entering UserName: ");
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[1]/input")));
                          element.sendKeys(args[1].toString());

                          System.out.println("Entering Password: ");
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[2]/input")));
                          element.sendKeys(args[2].toString());

                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          System.out.println("Clicking Login button");
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button")));
                          element.submit();

                          
                          
                    for (int myLoop=1; myLoop<4000000; myLoop++) {

                          try {
                            bwrite = new FileWriter("CustomerProvision.log",true);
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



                          System.out.println("Clicking Manage tab");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/a/i[2]")));
                          element.click();


                          System.out.println("Clicking Manage VDCs");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a")));
                          element.click();
  
                          
                          System.out.println("Specify VDC name in the Search field");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[3]/input")));
                          element.sendKeys(args[3].toString());


                          System.out.println("Click on Search Icon");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img")));
                          element.click();
                          Thread.sleep(3000);

                          
                          System.out.println("Click on Actions dropdown");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[1]/a/img")));
                          element.click();
 


                        System.out.println("Click on Solution Architecture");
                        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[2]/div[4]/a/span")));
                        element.click();
                        Thread.sleep(16000);


                        System.out.println("Click on Actions");
                        element = (new WebDriverWait(driver, 16)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[1]/a/span")));
                        element.click();
                           
                          
                          System.out.println("Click on VDC Actions");
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[2]/div[3]/a/img")));
                          element.click();
                          
                          
                          System.out.println("Click on Add Resource Group");
                          element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[5]/div/table/tbody/tr/td[1]/div/div[4]/div[1]/a/span")));
                          element.click();
                          



              
             
              System.out.println("Specify VDC Name");
              element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[5]/td[2]/div/table/tbody/tr/td[1]/div/input")));
              DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
              Date date = new Date();
              String uniqueVDCName1 = dateFormat.format(date);
              element.sendKeys(uniqueVDCName1);
              
              
              System.out.println("Specify VM Prefix");
              element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[6]/td[2]/div/table/tbody/tr/td[1]/div/input")));
              dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
              date = new Date();
              String uniqueVDCPrefix = dateFormat.format(date);
              element.sendKeys(uniqueVDCPrefix);

  
              
              System.out.println("Select Template");
              Select select = new Select((new WebDriverWait(driver, 10)).until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td/div/select"))));
              select.selectByIndex(1);



              Thread.sleep(2000); 
              System.out.println("Click on Add");
              element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[10]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[3]/table/tbody/tr/td[2]/a/label")));
              element.click();

              
            Thread.sleep(8000);
  			System.out.println("Click on Review Changes");
              element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
                                  .visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[3]/div/a/img")));
   
  			
  			element.click();
  			element.click(); 
 


  			System.out.println("Click on Continue");
  			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[28]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[1]/a/label")));
  			element.click();
  			element.click();
 
  			
 			
  			System.out.println("Click on Submit for Approval");
  			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[29]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[2]/a/label")));
  			element.click();
  			element.click();
  			
 
                        
                        System.out.println("Click on Approve");
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[5]/td/a"));
            element.click();
                        
                        System.out.println("Click on Technical");
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[1]/input"));
            element.click();
                        
                        System.out.println("Click on Financial");
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/input"));
            element.click();
                        
                        System.out.println("Click on Legal");
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[3]/td[1]/input"));
            element.click();
                        
                        System.out.println("Click on I Agree");
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div/span[2]/input"));
                        element.click();
                                    
                                    System.out.println("Click on OK");
              			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
              	  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/a/label")));
                        element.click();
                                    
                        
                        Thread.sleep(4000);
                                    System.out.println("Click on Provision");
             			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
              	  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[7]/td/a")));
                        element.click();
                                    Thread.sleep(3000);
                                    
                                    System.out.println("Click on OK for Provisioning");
             			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
              	  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[14]/div/div[2]/table/tbody/tr[2]/td/div/div/div[3]/a[2]/label")));

                        element.click();
                                    Thread.sleep(3000);
                                    
                                    
                                    
                                    System.out.println("Click on View VDC");
             			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
              	  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[3]/div[2]/div/table[1]/tbody/tr[1]/td[2]/a")));

                        element.click();
                        long start = System.currentTimeMillis();
                        Thread.sleep(6000);
                                    
                                    
                                    while(driver.getPageSource().contains("in progress..."));
                                    {
                                            ;
                                    }

                                    long finish = System.currentTimeMillis();
                                    long totalTime = finish - start;
                                    System.out.println("Response Time for Provisioning to Complete - "+totalTime);

                                    try {
                                      bwrite = new FileWriter("CustomerProvision.log",true);
                                    }
                                    catch(IOException i) {
                                            i.printStackTrace();
                                    }

                                    try {
                                            java.util.Date currentDateTime = new java.util.Date();
                                            bwrite.write(System.lineSeparator());
                                            bwrite.write("Current Time - "+currentDateTime);
                                            bwrite.write(System.lineSeparator());
                                            bwrite.write("Response Time for Provisioning to complete - "+totalTime);
                                            bwrite.close();
                                    } catch(IOException e) {
                                           System.out.println("File Error");
                                    }


                                    
                                    System.out.println("Clicking Logo");
                                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                    element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img"));
                                    element.click();
                                    Thread.sleep(4000);

                    }
              }

}


