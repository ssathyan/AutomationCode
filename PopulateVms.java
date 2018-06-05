
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

        import com.sun.jersey.api.client.Client;
        import com.sun.jersey.api.client.ClientHandlerException;
        import com.sun.jersey.api.client.ClientResponse;
        import com.sun.jersey.api.client.config.ClientConfig;
        import com.sun.jersey.api.client.config.DefaultClientConfig;
        //import com.sun.jersey.core.util.MultivaluedMap;
        import javax.ws.rs.core.MultivaluedMap;
        import com.sun.jersey.core.util.MultivaluedMapImpl;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.nio.file.StandardOpenOption;


        public class PopulateVms {

        public static String orderVDCname = null;
//      public static String url = "https://alaska.qa.grav.cm/";
        public static String send_userid = "suresh.sathyanarayan+805@gravitant.com";
        //public static String send_password = "1qaz!QAZ";
        //public static String send_password = "Gravitant123!";
        public static String send_password = "Gravitant@123";
        public static String VDCName =null; //="05042017154256";
        public static long seconds;
        public static WebDriver driver;
        public static WebElement element;
        public static FileWriter bwrite = null;
        public static BufferedReader buf = null;
        public static String VDC_ID= null;

        public static String currentLine = null;

        public static String apiKey = null;
        public static String url = null;
        public static String restResponse = null;
        public static String VDC_text = null;
        public static final int MAX_RETRIES =1;

                public PopulateVms() {    
                }

                // ****** VIJAY'S' CODE BEGINS HERE ***************
                private static Client createClient() {
                  ClientConfig config = new DefaultClientConfig();
                  Client restClient = Client.create(config);
                  restClient.setConnectTimeout(60 * 1000);
                  restClient.setReadTimeout(60 * 1000 * 2);
                  return restClient;
                }
                // ****** VIJAY'S' CODE ENDS HERE ***************

                public static void main(String args[]) throws InterruptedException, FileNotFoundException, IOException {


                        try {
                          //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                            bwrite = new FileWriter("PopulateVms.log",true);
                            buf = new BufferedReader(new FileReader("AssetConfig.properties"));
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




                         /* 
                         System.setProperty("webdriver.chrome.driver", "chromedriver");
                         WebDriver driver = new ChromeDriver();

                          PopulateVms addAmazonVDCRequestOrderApproval = new PopulateVms();

                          WebDriver driver = new FirefoxDriver();
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                          driver.manage().window().maximize();
                          System.out.println("Navigating to: " +args[0].toString());
                          //driver.get(url);
                          driver.get(args[0].toString());



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
                          element.sendKeys(args[2].toString());
                          Thread.sleep(3000);

                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          System.out.println("Clicking Login button");
                          element = driver.findElement(By.xpath("html/body/div[1]/section/div/form/div/div/div[3]/button"));
                          element.submit();
                          Thread.sleep(6000);

                          
                          

                          try {
                            //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                            bwrite = new FileWriter("PopulateVms.log",true);
                          }
                          catch(IOException i) {
                                  i.printStackTrace();
                          }


                          try {
                            java.util.Date loopDateTime = new java.util.Date();
                            bwrite.write(System.lineSeparator());
                            //bwrite.write("Starting Iteration #"+myLoop+".... At: "+loopDateTime);
                            bwrite.close();
                          }
                          catch(IOException i) {
                          }



                          System.out.println("Clicking Manage tab");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/a/i[2]"));
                          element.click();
                          Thread.sleep(3000);
                          System.out.println("Clicking Manage VDCs");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/div[1]/div/header/nav/div/div[2]/ul/li[3]/ul/li[17]/a"));
   //           long start = System.currentTimeMillis();
                          element.click();
                         
 
                          System.out.println("Specify VDC name in the Search field");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[3]/input"));
//              long start = System.currentTimeMillis();
			  String vdcName = args[3].toString(); 
                          element.sendKeys(vdcName);


                          System.out.println("Click on Search Icon");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/table[2]/tbody/tr/td[4]/a/img"));
//              long start = System.currentTimeMillis();
                          element.click();
                          Thread.sleep(8000);
                          
                          System.out.println("Click on Actions dropdown");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[1]/a/img"));
//              long start = System.currentTimeMillis();
                          element.click();
                          Thread.sleep(3000);
                          
                          System.out.println("Click on Solution Architecture");
                          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                          element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/div/form/div[3]/div[1]/table/tbody/tr/td[6]/div/div[2]/div[4]/a/span"));
//              long start = System.currentTimeMillis();
                          element.click();
                          Thread.sleep(25000);



                          */










// ****** VIJAY'S' CODE BEGINS HERE ***************
                        
                        try {
                          //currentLine = buf.readLine();

                          while((currentLine = buf.readLine())!= null){
                            //currentLine = buf.readLine();
                            //System.out.println("currentLine:" + currentLine);

                            if(currentLine.contains("cm.UserLoader.uri=")) {
                                url = currentLine.split("=")[1];
                                System.out.println("url:" + url);
                              }

                            if(currentLine.contains("cm.UserLoader.apiKey=")) {
                                apiKey = currentLine.split("=")[1];
                                System.out.println("apiKey:" + apiKey);
                            }

                            if(currentLine.contains("cm.UserLoader.VDCdetails.assetInfo=")) {
                                VDCName = currentLine.split("=")[1];
                                System.out.println("VDCName:" + VDCName);
                            }
                          }
                        } catch (FileNotFoundException e) {
                          //
                        }

                          url = url + "/api/assets/vdcs";

                          MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
                          queryParams.add("assetname", VDCName);
                          queryParams.add("version", "1.2");

                          
                          ClientResponse response = null;
                          int retries = 0;
                          while (response == null && (retries < MAX_RETRIES))
                          {
                            try
                            {
                              System.out.println("REST GET URL is: " + url);
                              response = 
                                  createClient().resource("")
                                  .path(url)
                                  .queryParams(queryParams)
                                  .header("Content-Type", "application/json")
                                  .header("apikey", apiKey)
                                  .get(ClientResponse.class);

                              break;

                            } catch (ClientHandlerException e) {
                              System.out.println("Caught an exception while executing GET with url " + url + ". Message :" + e.getMessage() + e);
                              System.out.println("Retrying request");
                              retries++;
                              continue;
                            }
                          }
                           
                          restResponse = response.getEntity(String.class);

                          String[] responses = restResponse.split(",");
                          for (String str : responses) {
                            if (str.contains("cmAssetId")) {
                              VDC_ID = str.split(":")[1];
                            }
                          }

                          VDC_ID = VDC_ID.substring(1, VDC_ID.length()-1);

                          VDC_text = "\n"+"AssetId=" + VDC_ID;
                          //VDC_text = "AssetId=" + VDC_ID;

                         try {
                              Files.write(Paths.get("AssetConfig.properties"), VDC_text.getBytes(), StandardOpenOption.APPEND);
                          }catch (IOException e) {
                             System.out.println("Caught an exception while writing VDC_ID to AssetConfig.properties");
                          }


// ****** VIJAY'S CODE ENDS HERE ***************                          

                      

                /*     
              
                        Thread.sleep(30000);
  			System.out.println("Click on Review Changes");
  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  			element = driver
  				.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[1]/div/div[1]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td[3]/div/a/img"));
  			element.click();
  			element.click(); 
  			Thread.sleep(4000);


  			System.out.println("Click on Continue");
  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[28]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[1]/a/label")));
  			element.click();
  			element.click();
  			Thread.sleep(4000);

  			
  			System.out.println("Click on Submit for Approval");
  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  			element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
  				.visibilityOfElementLocated(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td[1]/div/div/form[29]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div[5]/div[2]/a/label")));
  			element.click();
  			element.click();
  			Thread.sleep(4000);
                       
 
                        System.out.println("Click on Approve");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[5]/td/a"));
//            long start = System.currentTimeMillis();
            element.click();
                        Thread.sleep(15000);
                        
                        System.out.println("Click on Technical");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[1]/input"));
//            long start = System.currentTimeMillis();
            element.click();
                        Thread.sleep(3000);
                        
                        System.out.println("Click on Financial");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/input"));
//            long start = System.currentTimeMillis();
            element.click();
                        Thread.sleep(3000);
                        
                        System.out.println("Click on Legal");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
            element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[3]/td[1]/input"));
//            long start = System.currentTimeMillis();
            element.click();
                        Thread.sleep(3000);
                        System.out.println("Click on I Agree");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div/span[2]/input"));
//                        long start = System.currentTimeMillis();
                        element.click();
                                    Thread.sleep(3000);
                                    
                                    System.out.println("Click on OK");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[6]/div/div[2]/table/tbody/tr[2]/td/div/div/a/label"));
//                        long start = System.currentTimeMillis();
                        element.click();
                                    Thread.sleep(15000);
                                    
                                    
                                    System.out.println("Click on Provision");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[2]/div/table/tbody/tr/td[2]/div/div/div/table/tbody/tr[7]/td/a"));
//                        long start = System.currentTimeMillis();
                        element.click();
                                    Thread.sleep(20000);
                                    
                                    
                                    System.out.println("Click on OK for Provisioning");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[14]/div/div[2]/table/tbody/tr[2]/td/div/div/div[3]/a[2]/label"));
//                        long start = System.currentTimeMillis();
                        element.click();
                                    Thread.sleep(20000);
                                    
                                    
                                    
                                    System.out.println("Click on View VDC");
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                        
                        element = driver.findElement(By.xpath("/html/body/div/section/div[3]/table/tbody/tr/td/div/div/form[3]/div[2]/div/table[1]/tbody/tr[1]/td[2]/a"));
//                        long start = System.currentTimeMillis();
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
                                      //bwrite = new BufferedWriter(new FileWriter("suresh.log",true));
                                      bwrite = new FileWriter("PopulateVms.log",true);
                                    }
                                    catch(IOException i) {
                                            i.printStackTrace();
                                    }

                                    try {
                                            //bwrite.newLine();
                                            java.util.Date currentDateTime = new java.util.Date();
                                            bwrite.write(System.lineSeparator());
                                            bwrite.write("Current Time - "+currentDateTime);
                                            bwrite.write(System.lineSeparator());
                                            bwrite.write("Response Time for Provisioning to complete - "+totalTime);
                                            bwrite.close();
                                    } catch(IOException e) {
                                           System.out.println("File Error");
                                    }

                                    Thread.sleep(9000);

                                    
                                    System.out.println("Clicking Logo");
                                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                    element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/nav/div/div[1]/div/div[1]/a/img"));
                                    element.click();
                                    Thread.sleep(20000);
*/
              }

            }

