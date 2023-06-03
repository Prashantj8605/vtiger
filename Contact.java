package finalMock;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contact {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		 driver.findElement(By.id("appnavigator")).click();
		 Thread.sleep(2000);
	     WebElement ele = driver. findElement(By.xpath("//span[text()=' SALES']"));
	     Actions action=new Actions(driver);
	     action.moveToElement(ele).perform();
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Contacts")).click();
	     driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	     
	     
	     
	     
	     driver.findElement(By.id("s2id_autogen1")).click();
	     WebElement pro = driver.findElement(By.id("s2id_autogen2_search"));
	     Thread.sleep(2000);
	     pro.sendKeys("Mr.");
	     pro.sendKeys(Keys.ENTER);
	     driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("prashant");
	     driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("jadhav");
	     driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("1234567890");
	     driver.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
	     
	     driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("abcd1");
	     driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("https://www.qspiders.com");
	     driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("8605952728");
	     driver.findElement(By.id("s2id_autogen21")).click();
	     WebElement framedp = driver.findElement(By.id("s2id_autogen22_search"));
	     framedp.sendKeys("Atlas Jeniffer");
	     framedp.sendKeys(Keys.ENTER);
	     driver.findElement(By.name("saveButton")).click();
	     driver.findElement(By.xpath("//button[text()='Yes']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("8605952728");
	     driver.findElement(By.id("s2id_autogen3")).click();
	     WebElement source = driver.findElement(By.id("s2id_autogen4_search"));
	     source.sendKeys("Self Generated");
	     source.sendKeys(Keys.ENTER);
	     driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("2483949");
	     driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("PJ");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("8605952728");
	     driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("Mechanical");
	     driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("ABCHB25");
	     driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("prashant@123.gmail.com");
	     WebElement dob = driver.findElement(By.id("Contacts_editView_fieldName_birthday"));
	     
	     dob.sendKeys("30-08-1999");
	     dob.sendKeys(Keys.ENTER);
	     driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("Digvijay");
	     driver.findElement(By.id("contact_id_display")).sendKeys("CEO");
	     driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("123456789");
	     driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("Pj@gmail.com");
	     driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
	     
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.scrollBy(0,300)");
	     
	     driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
	     driver.findElement(By.id("s2id_autogen5")).click();
	     WebElement assign = driver.findElement(By.id("s2id_autogen6_search"));
	     assign.sendKeys("Marketing Group");
	     assign.sendKeys(Keys.ENTER);
	     driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();
	     WebElement date = driver.findElement(By.id("Contacts_editView_fieldName_support_start_date"));
	     date.sendKeys("26-04-2022");
	     date.sendKeys(Keys.ENTER);
	     WebElement date1 = driver.findElement(By.id("Contacts_editView_fieldName_support_end_date"));
	     date1.sendKeys("26-04-2023");
	     date1.sendKeys(Keys.ENTER);
	     driver.findElement(By.name("mailingstreet")).sendKeys("ABCDETFTF");
	     driver.findElement(By.name("otherstreet")).sendKeys("SHJFHFKHSKFHG");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("Deccan");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("Pune");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("Pune");
	     driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("Nashik");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("Maharashtra");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("Karnataka");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("411048");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("416149");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("India");
	     driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("India");
	     driver.findElement(By.name("description")).sendKeys("AJHDGIUGIUGIYGIYGUYGYGIYGIYGIY");
	     jse.executeScript("window.scrollBy(0,1100)");
	     driver.findElement(By.cssSelector("div[class='fileUploadBtn btn btn-primary']")).click();
	     Thread.sleep(2000);
	     Runtime.getRuntime().exec("C:\\Users\\ASUS\\Desktop\\practice1.exe");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[text()='Save']")).click();
	     driver.findElement(By.cssSelector("span[class='fa fa-user']")).click();
	     driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
	}

}
