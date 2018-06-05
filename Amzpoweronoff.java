
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Amzpoweronoff {

	public static int i;
	static DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
	static Date date = new Date();
	static String uniqueTime = "auto" + dateFormat.format(date);

	/***************
	 * To Execute please pass 11(Eleven )arguments as 1.
	 * Environment(URL):https://qa-cluster02.gravitant.net/ 2. User Name
	 * :ssathyan@us.ibm.com 3. User Password: Gravitant@123 4. Market maker
	 * Email ID: cm-mm-admin@gravitant.com 5. Market maker
	 * password:rgnToYV8eEQ2sa1 6. Provider Account Customer Name: SS 7. VM
	 * Quantity: 10 8. Number of for loop: for ex 3 09. AKIAJRCEHJMXON4P3RFQ
	 * 10.8xBzFiNiuSM5PhLPQZcsVYhG/nzomHvA9VCLiNn4
	 * *******************************************************/
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");

		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get(args[0].toString());

		Amzpoweronoff.gravitantaccount(Driver, args);
		Thread.sleep(5000);
		provisionAmazon(Driver, args);

		Amzpoweronoff.LoopVMprovision(Driver, args);

		Thread.sleep(5000);
	}

	// Method for writing logs inside txt file
	public static void logwritter(String str) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String uniqueTime = dateFormat.format(date);
		// Here we can change text response time file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"amzpoweroffonresponetime.txt", true))) {
			String content = str;

			bw.write(uniqueTime + " : " + content);
			bw.newLine();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	// Adding Amazon Provider Account

	public static void gravitantaccount(WebDriver Driver, String args[])
			throws Exception {
		logwritter("Adding Amazon Provider Account");
		System.out.println("Adding Amazon Provider Account");
		System.out.println("Login as Market maker");
		logwritter("Login as Market maker");
		Driver.findElement(By.id("username")).sendKeys(args[3]);
		Driver.findElement(By.id("password")).sendKeys(args[4]);
		Driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		try {
			WebElement checkbox = Driver.findElement(By
					.xpath("//input[@type='checkbox']"));
			checkbox.click();
			Thread.sleep(2000);
			WebElement popupok = Driver.findElement(By
					.xpath("//button[text()='OK']"));
			popupok.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		clickLink(Driver, By.id("fulfillmentMenu_homePage"));
		clickLink(Driver, By.id("providerAccountsMenuItem_homePage"));
		clickLink(Driver, By.xpath("(//label[text()='Add Account'])[1]"));
		Thread.sleep(4000);
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'iaasProviderOptions')]"),
				"Amazon");
		Thread.sleep(4000);
		clickLink(Driver, By.xpath("//label[text()='Next >>']"));
		Thread.sleep(4000);
		System.out.println("Entering Account name");
		inputTextEnabled(Driver, By.xpath("//input[contains(@id,'name')]"),
				uniqueTime);
		String customerselection = args[5];
		Thread.sleep(5000);
		System.out.println("Selecting Customer from dropdown");
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'accountBasicDataBroker')]"),
				customerselection);
		Thread.sleep(5000);
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'selectAccountType')]"),
				"Standalone");
		Thread.sleep(5000);
		inputTextEnabled(Driver,
				By.xpath("//input[contains(@id,'autocomplete-accountOwner')]"),
				"cm-mm-admin");
		Thread.sleep(5000);
		try {
			clickLink(Driver,
					By.xpath("(//span[text()='cm-mm-admin@gravitant.com'])[1]"));
		} catch (Exception e) {

		}

		Thread.sleep(4000);
		System.out.println("Clicking Next button");
		clickLink(Driver, By.xpath("//label[text()='Next >>']"));
		Thread.sleep(4000);
		System.out.println("Entering Amazon provisioning details");
		String Accesskey = args[7];
		String Secretkey = args[8];
		inputTextEnabled(Driver,
				By.xpath("(//input[contains(@id,'provAccountAttribute')])[1]"),
				Accesskey);
		Thread.sleep(1000);

		inputTextEnabled(Driver,
				By.xpath("(//input[contains(@id,'provAccountAttribute')])[2]"),
				Secretkey);
		Thread.sleep(1000);

		clickLink(Driver, By.xpath("//a[text()='Test Connection']"));
		Thread.sleep(6000);
		System.out.println("Clicking on Save button");
		clickLink(Driver, By.xpath("//label[text()='Save']"));
		Thread.sleep(3000);
		System.out.println("Signing out Market maker");
		clickLink(Driver, By.xpath("//a[@id='User_Profile_Menu']"));
		clickLink(Driver, By.xpath("//a[@id='Sign_Out_Menu']"));
		Thread.sleep(3000);

	}

	static DateFormat dateFormat1 = new SimpleDateFormat("ddMMyyyyHHmmss");
	static Date date1 = new Date();
	static String uniqueTime1 = "auto" + dateFormat.format(date);
	static String result = uniqueTime1.toLowerCase().substring(14, 18);

	// Amazon Adding VDC , Resource and Market maker provisioing

	public static void provisionAmazon(WebDriver Driver, String args[])
			throws Exception {
		System.out
				.println("Amazon Adding VDC , Resource and Market maker provisioing starts here...");
		logwritter("Amazon Adding VDC , Resource and Market maker provisioing starts here...");
		logwritter("LOgin as User");
		System.out.println("Login as User");
		System.out.println("Entering User name");
		Driver.findElement(By.id("username")).sendKeys(args[1]);
		Driver.findElement(By.id("password")).sendKeys(args[2]);
		System.out.println("Clicking on Login button");
		Driver.findElement(By.tagName("button")).click();

		try {
			WebElement checkbox = Driver.findElement(By
					.xpath("//input[@type='checkbox']"));
			checkbox.click();
			Thread.sleep(2000);
			WebElement popupok = Driver.findElement(By
					.xpath("//button[text()='OK']"));
			popupok.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Thread.sleep(3000);
		logwritter("Adding Amazon VDC");
		System.out.println("Adding Amazon VDC");
		clickLink(Driver, By.id("Buy_Menu"));
		clickLink(Driver, By.id("Build_Custom_Solution_Menu"));
		System.out.println("Selecting Amazon provider");
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'provider')]"), "Amazon");
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'cloudInstance')]"),
				"Asia Pacific (Singapore) Region");
		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[contains(@id,'serviceDefinition')]"),
				"Amazon Elastic Compute Cloud");
		System.out.println("Entering VDC name");

		inputTextEnabled(Driver, By.xpath("//input[contains(@id,'name')]"),
				uniqueTime);
		System.out.println("Entering VDC namespace");

		inputTextEnabled(Driver,
				By.xpath("//input[contains(@id,'vdcNameSpace')]"), result);
		System.out.println("Clicking on Next");
		clickLink(Driver, By.xpath("//label[text()='Next']"));
		System.out.println("Entering Key pair name");
		clickLink(Driver, By.xpath("//input[@value='Create Key Pair']"));
		inputTextEnabled(Driver, By.xpath("//input[@id='vdcAddForm:name']"),
				result);
		System.out.println("Clicking on Next button");
		clickLink(Driver, By.xpath("//label[text()='Next']"));
		Thread.sleep(4000);
		System.out.println("Clicking on Design Architecture button");

		clickLink(Driver, By.xpath("//label[text()='Design Architecture']"));
		SavePopup(Driver);

		System.out.println("Adding Resource Group (VM)");
		logwritter("Adding Resource Group (VM)");

		clickLink(Driver, By.xpath("//span[text()='Actions']"));
		clickLink(Driver, By.xpath("//span[text()='VDC Actions:']"));

		clickLink(Driver, By.xpath("//span[text()='Add Resource Group (VMs)']"));

		System.out.println("Selecting VM template");
		inputTextEnabled(
				Driver,
				By.xpath("//label[text()='Add Resource Group (VMs)']/following::input[1]"),
				result);

		inputTextEnabled(
				Driver,
				By.xpath("//label[text()='Add Resource Group (VMs)']/following::input[2]"),
				result);
		Thread.sleep(2000);

		selectDropDownByIndex(
				Driver,
				By.xpath("//label[text()='Add Resource Group (VMs)']/following::select[4]"),
				1);
		try {
			selectDropDownByIndex(
					Driver,
					By.xpath("//label[text()='Add Resource Group (VMs)']/following::select[4]"),
					1);
		} catch (Exception e) {

		}
		Thread.sleep(8000);
		System.out.println("Clickng on Add VM button");

		clickLink(Driver, By.xpath("//label[text()='Add']"));

		clickLink(Driver, By.xpath("//span[text()='Actions']"));
		clickLink(Driver, By.xpath("//span[text()='VDC Actions:']"));

		System.out.println("Clickng on Review changes");
		logwritter("Clickng on Review changes");
		clickLink(
				Driver,
				By.id("pollingForm:reviewChangesImage_solutionArchitecturePage"));
		Thread.sleep(5000);
		System.out.println("Clickng on Continue button");
		clickLink(Driver, By.xpath("//label[text()='Continue']"));
		clickLink(Driver, By.xpath("//label[text()='Continue']"));
		Thread.sleep(10000);
		clickLink(Driver, By.xpath("//div[5]/div[2]/a/label"));
		Thread.sleep(10000);
		System.out.println("Clickng on Approval");

		Thread.sleep(4000);

		try {
			clickLink(Driver,
					By.id("detailsPageId:approveLink_orderDetailsPage"));
		} catch (Exception e) {
			clickLink(Driver,
					By.id("detailsPageId:approveLink_orderDetailsPage"));
		}
		clickLink(
				Driver,
				By.xpath("//label[text()='VDC Order Approval']/following::input[1]"));
		clickLink(
				Driver,
				By.xpath("//label[text()='VDC Order Approval']/following::input[2]"));
		clickLink(
				Driver,
				By.xpath("//label[text()='VDC Order Approval']/following::input[3]"));
		clickLink(
				Driver,
				By.xpath("//label[text()='VDC Order Approval']/following::input[4]"));

		clickLink(Driver, By.xpath("//label[text()='OK']"));
		Thread.sleep(5000);
		System.out.println("Clicking on Place order and submit");

		clickLink(Driver,
				By.id("detailsPageId:placeLiveOrderLink_orderDetailsPage"));
		try {
			clickLink(Driver,
					By.id("detailsPageId:placeLiveOrderLink_orderDetailsPage"));
		} catch (Exception e) {

		}
		clickLink(Driver, By.xpath("//label[text()='Submit']"));
		clickLink(Driver, By.xpath("//label[text()='OK']"));
		Thread.sleep(5000);

		System.out.println("Signing out as Customer");
		clickLink(Driver, By.xpath("//a[@id='User_Profile_Menu']"));
		clickLink(Driver, By.xpath("//a[@id='Sign_Out_Menu']"));
		Thread.sleep(4000);
		System.out.println("Login as Market maker");
		logwritter("Login as Market maker");
		Thread.sleep(3000);
		Driver.findElement(By.id("username")).sendKeys(args[3]);
		Driver.findElement(By.id("password")).sendKeys(args[4]);
		Driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		try {
			WebElement checkbox = Driver.findElement(By
					.xpath("//input[@type='checkbox']"));
			checkbox.click();
			Thread.sleep(2000);
			WebElement popupok = Driver.findElement(By
					.xpath("//button[text()='OK']"));
			popupok.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Thread.sleep(6000);

		clickLink(Driver, By.id("fulfillmentMenu_homePage"));
		clickLink(Driver, By.id("fulfillSubmittedOrdersMenuItem_homePage"));

		selectDropDownByTextOptionVisible(Driver,
				By.xpath("//select[@id='sortOrderId']"), "Newest Submitted");
		inputTextEnabled(Driver,
				By.xpath("//input[@id='myOrderSearchTextId']"), uniqueTime);

		clickLink(Driver, By.id("myOrdersSearchBtnId"));
		Thread.sleep(8000);
		System.out.println("Clicking on View order");
		clickLink(Driver, By.xpath("//a[text()='View Order']"));
		System.out.println("Selecting Amazon account");

		selectDropDownByTextOptionVisible(Driver,
				By.xpath("(//select[contains(@id,'providerAccount')])[1]"),
				uniqueTime);

		clickLink(Driver,
				By.xpath("(//button[@id='buttonOrderCancelSubmit'])[3]"));
		Thread.sleep(4000);

		System.out.println("Clicking VDC Services");

		clickLink(Driver,
				By.xpath("(//a[contains(@onclick,'showServiceDetails')])[1]"));
		Thread.sleep(5000);
		System.out.println("Clicking on Load Network");
		clickLink(Driver,
				By.xpath("//button[contains(@id,'buttonLoadNetworkConfig')]"));
		Thread.sleep(5000);
		clickLink(Driver, By.xpath("//button[@type='submit']"));
		clickLink(
				Driver,
				By.xpath("//button[contains(@id,'buttonServiceStatusChangeId')]"));
		System.out.println("Clicking on order details link");
		clickLink(Driver,
				By.xpath("//a[contains(@onclick,'showOrderDetailsPage')]"));
		Thread.sleep(6000);
		System.out.println("Clicking on Start provisioning");
		clickLink(Driver,
				By.xpath("//a[@id='startProvisioningbtn_OrderDetailsPage']"));
		Thread.sleep(3000);
		System.out.println("Clicking on provisioning Yes confirm");
		try {
			clickLink(Driver,
					By.xpath("//button[@id='yesBtn_ConfirmProvisioningPopUp']"));
		} catch (Exception e) {

		}
		Thread.sleep(6000);
		clickLink(Driver, By.xpath("//a[@id='User_Profile_Menu']"));
		clickLink(Driver, By.xpath("//a[@id='Sign_Out_Menu']"));
		Thread.sleep(3000);

	}

	// Amazon adding Resource Iteration starts here
	public static void LoopVMprovision(WebDriver Driver, String args[])
			throws Exception {
		java.util.Date loopDateTime = new java.util.Date();
		logwritter("Starting Iteration #" + i + ".... At: " + loopDateTime);
		System.out.println("Starting Iteration #" + i + ".... At: "
				+ loopDateTime);
		System.out.println("Login as User");
		System.out.println("Entering User name");
		Driver.findElement(By.id("username")).sendKeys(args[1]);
		Driver.findElement(By.id("password")).sendKeys(args[2]);
		System.out.println("Clicking on Login button");
		Driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		System.out.println("CLicking Manage menu");
		clickLink(Driver, By.id("Manage_Menu"));
		clickLink(Driver, By.id("Manage_Vdcs_Menu"));
		Thread.sleep(4000);

		DateFormat df = new SimpleDateFormat("" + "HH:mm:ss");
		Calendar calobj = Calendar.getInstance();

		System.out.println(df.format(calobj.getTime())
				+ "Waiting for 2 mins for VDC to Active status");
		logwritter(df.format(calobj.getTime())
				+ "Waiting for 2 mins for VDC to Active status");
		Thread.sleep(120000);

		DateFormat df1 = new SimpleDateFormat("" + "HH:mm:ss");
		Calendar calobj1 = Calendar.getInstance();
		System.out.println(df1.format(calobj1.getTime()) + "Waiting completed");

		selectDropDownByTextOptionVisible(Driver,
				By.id("selectOneMenuProviders"), "Amazon");
		Thread.sleep(8000);
		System.out.println(df.format(calobj.getTime())
				+ "Searching for Amazon Active VDC");
		logwritter(df.format(calobj.getTime())
				+ "Searching for Amazon Active VDC");
		inputTextEnabled(Driver, By.xpath("//input[@type='text']"), uniqueTime);

		clickLink(Driver, By.xpath("//input[@type='text']/following::img[1]"));
		Thread.sleep(4000);

		for (int second = 0;; second++) {

			WebElement clicktext = Driver.findElement(By
					.xpath("(//span[contains(@id,'vdc-table:')])[10]"));
			String textInsideInputBox = clicktext.getText();

			String datatest = "Active";
			if (second >= 15) {
				System.out.println("Assertion Failed: Expected VDC Status "
						+ "\"" + textInsideInputBox + "\"" + " actual "
						+ datatest);
				logwritter("Assertion Failed: Expected VDC Status "
						+ "\"" + textInsideInputBox + "\"" + " actual "
						+ datatest);
				throw new NoSuchElementException("Element not visible");
			}
			try {

				// if(!datatest.isEmpty() && !textInsideInputBox.isEmpty()){
				if (datatest.trim().equalsIgnoreCase(textInsideInputBox.trim())) {

					System.out
							.println("Assertion successful: Expected VDC Status"
									+ "\""
									+ textInsideInputBox
									+ "\""
									+ " actual " + datatest);
					break;
				}

			} catch (Exception e) {
			}

			Thread.sleep(15000);
			DateFormat df2 = new SimpleDateFormat("" + "HH:mm:ss");
			Calendar calobj2 = Calendar.getInstance();
			System.out.println(df2.format(calobj2.getTime())
					+ "Waiting for VDC to get Active status");
		}

		clickLink(Driver, By.xpath("//span[text()='Actions']"));
		clickLink(Driver, By.xpath("//span[text()='Solution Architecture']"));
		Thread.sleep(10000);

		String res = args[6];
		int n = Integer.parseInt(res);
		for (i = 1; i <= n; i++) {
			{

				for (int second = 0;; second++) {
					if (second >= 150) {
						throw new TimeoutException("Time Out");

					}

					try {

						clickLink(Driver, By.xpath("//span[text()='Actions']"));
						clickLink(
								Driver,
								By.xpath("//*[@id='pollingForm:actionsMenuBar:actions:selectaction:link']/span"));
						clickLink(
								Driver,
								By.xpath("//*[@id='pollingForm:actionsMenuBar:actions:selectaction:poweroff:out']"));
						Thread.sleep(5000);
						clickLink(Driver, By.xpath("//label[text()='OK']"));
						System.out.println("Waiting for Power OFF VM");
						logwritter("Waiting for Power OFF VM");
						Thread.sleep(20000);
						break;
					} catch (Exception e) {

					}
					Thread.sleep(2000);
				}

			}

			{

				for (int second = 0;; second++) {
					if (second >= 150) {
						throw new TimeoutException("Time Out");

					}

					try {

						clickLink(Driver, By.xpath("//span[text()='Actions']"));
						clickLink(
								Driver,
								By.xpath("//*[@id='pollingForm:actionsMenuBar:actions:selectaction:link']/span"));
						clickLink(
								Driver,
								By.xpath("//*[@id='pollingForm:actionsMenuBar:actions:selectaction:poweron:out']"));
						Thread.sleep(5000);
						clickLink(Driver, By.xpath("//label[text()='OK']"));
						System.out.println("Waiting for Power ON VM");
						logwritter("Waiting for Power ON VM");						
						Thread.sleep(20000);
						break;
					} catch (Exception e) {

					}
					Thread.sleep(2000);
				}

			}
		}
	}

	// Utility methods below

	public static void click(WebDriver Driver, By by)
			throws InterruptedException {
		for (int second = 0;; second++) {
			if (second >= 30) {
				throw new NoSuchElementException("click");

			}
			try {

				Driver.findElement(by).click();

				break;
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}

	}

	public static void inputTextEnabled(WebDriver Driver, By by, String text)
			throws InterruptedException {
		for (int second = 0;; second++) {
			if (second >= 20) {

				throw new NoSuchElementException("inputTextEnabled");

			}

			try {
				Driver.findElement(by).clear();
				Driver.findElement(by).sendKeys(text);
				if (!Driver.findElement(by).getAttribute("value").isEmpty())
					break;
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}

	public static void selectDropDownByTextOptionVisible(WebDriver Driver,
			By by, String text) throws InterruptedException {
		for (int second = 0;; second++) {
			if (second >= 20) {
				throw new NoSuchElementException(
						"selectDropDownByTextOptionVisible");
			}

			try {
				Select dropdown = new Select(Driver.findElement(by));
				if (dropdown.getOptions().size() >= 1) {
					dropdown.selectByVisibleText(text);
					break;
				}

			} catch (Exception e) {

			}

			Thread.sleep(1000);
		}

	}

	public static void selectDropDownByIndex(WebDriver Driver, By by, int text)
			throws InterruptedException {
		for (int second = 0;; second++) {
			if (second >= 20) {
				throw new NoSuchElementException(
						"selectDropDownByTextOptionVisible");
			}

			try {
				Select dropdown = new Select(Driver.findElement(by));
				if (dropdown.getOptions().size() >= 1) {
					dropdown.selectByIndex(text);
					break;
				}

			} catch (Exception e) {

			}

			Thread.sleep(1000);
		}

	}

	public static void waitUntilElementPresent(WebDriver Driver, By by)
			throws Exception {
		for (int second = 0;; second++) {
			if (second >= 30) {
				throw new TimeoutException("Time Out");

			}

			try {

				if (!(Driver.findElements(by).size() > 0)) {

					break;
				}

			} catch (Exception e) {

			}
			Thread.sleep(5000);

		}

	}

	public static void clickLink(WebDriver Driver, By by) throws Exception {

		for (int second = 0;; second++) {
			if (second >= 20) {
				throw new TimeoutException("Time Out");

			}

			try {

				WebElement link = Driver.findElement(by);
				link.click();
				break;
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}

	}

	public static boolean waitForObject(String objectName, By by,
			WebDriver Driver) throws Exception {
		int globalWaitTime = 0;
		WebDriverWait wait = new WebDriverWait(Driver, globalWaitTime);
		boolean objectExists = false;
		for (int second = 0;; second++) {
			if (second >= 30) {
				throw new TimeoutException("Time Out");

			}
			try {
				wait.until(ExpectedConditions.presenceOfElementLocated((by)));
				objectExists = true;
			} catch (Exception e) {

			}
			Thread.sleep(1000);
			return objectExists;

		}

	}

	public static void SavePopup(WebDriver Driver) throws Exception {
		for (int second = 0;; second++) {

			try {
				if (second >= 30) {
					throw new TimeoutException("Time Out");

				}
				Driver.switchTo().activeElement();
				Robot robot = new Robot();
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);

				break;
			} catch (Exception e) {

			}
			Thread.sleep(1000);
		}
	}

}
