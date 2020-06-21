package registration_form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class registration {
	
	public static void main (String args []) {
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://phptravels.org/register.php");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id='inputFirstName']"));
		firstName.sendKeys("Babatunde");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id='inputLastName']"));
		lastName.sendKeys("Ojo");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='inputEmail']"));
		email.sendKeys("babatundeojo@gmail.com");
		
//		Select countryCode = new Select(driver.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[2]/div[4]/div/div/div/div/div[2]")));
//		countryCode.selectByVisibleText("234");
		
		//*[@id="containerNewUserSignup"]/div[2]/div[4]/div/div/div/ul/li[160]
		
		WebElement callingCode = driver.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[2]/div[4]/div/div/div/ul/li[160]"));
		callingCode.click();
		
//		WebElement callingCode = driver.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[2]/div[4]/div/div/div/div/div[2]"));
//		String script = "arguments[0].innerHTML='+234'";
//		((JavascriptExecutor) driver).executeScript(script, callingCode);
		//callingCode.innerText = "234";
		//*[@id="populatedCountryCodephonenumber"]
		
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id='inputPhone']"));
		phoneNumber.sendKeys("234 705 357 9784");
		
		WebElement companyName = driver.findElement(By.xpath("//*[@id='inputCompanyName']"));
		companyName.sendKeys("Japetism Inc.");
		
		WebElement streetAddress1 = driver.findElement(By.xpath("//*[@id='inputAddress1']"));
		streetAddress1.sendKeys("40, Afinjuomo Street, Oworonshoki");
		
		WebElement streetAddress2 = driver.findElement(By.xpath("//*[@id='inputAddress2']"));
		streetAddress2.sendKeys("40, Afinjuomo Street, Oworonshoki");
		
		WebElement city = driver.findElement(By.xpath("//*[@id='inputCity']"));
		city.sendKeys("Kosofe");
		
		WebElement state = driver.findElement(By.xpath("//*[@id='stateinput']"));
		state.sendKeys("Lagos");
		
		WebElement postalCode = driver.findElement(By.xpath("//*[@id='inputPostcode']"));
		postalCode.sendKeys("111010");
		
		Select country = new Select(driver.findElement(By.xpath("//*[@id='inputCountry']")));
		country.selectByVisibleText("Nigeria");

		Select findUs = new Select(driver.findElement(By.xpath("//*[@id='customfield1']")));
		findUs.selectByVisibleText("Google");
		
		WebElement whatsappNumber = driver.findElement(By.xpath("//*[@id='customfield2']"));
		whatsappNumber.sendKeys("2347053579784");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='inputNewPassword1']"));
		password.sendKeys("babatunde");
		
		WebElement confirmPassword = driver.findElement(By.xpath("//*[@id='inputNewPassword2']"));
		confirmPassword.sendKeys("babatunde");
		
		WebElement generatePassword = driver.findElement(By.xpath("//*[@id='containerPassword']/div[4]/button"));
		generatePassword.click();
		
		WebElement joinMailingList = driver.findElement(By.xpath("//*[@id='frmCheckout']/div[3]/div/div/span[2]"));
		joinMailingList.sendKeys("Babatunde");
		
		WebElement uncheckRobot = driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
		uncheckRobot.sendKeys("Babatunde");
		
	}
}
