package methoddriven;

import java.util.List;

import org.openqa.selenium.WebDriver;

//import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPOM 
{
	final String locVal="loginButton";

	@FindBy(xpath="//input[@name='username']") private WebElement untb;
	public WebElement getUntb()
	{
		return untb;
	}
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}

	@FindBy(xpath="//input[@name='pwd']") private WebElement pwtb;
	public WebElement getPntb()
	{
		return pwtb;
	}
	public void setPwtb(String pwd)
	{
		pwtb.sendKeys(pwd);
	}

	@FindBy(id=locVal) private WebElement loginbtn;
	public WebElement getLoginbtn()
	{
		return loginbtn;
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}

	@FindBy(xpath="//a") private List<WebElement> allLinks;
	public List<WebElement> getAllLinksCount()
	{
		return allLinks;
		
	}

	public void countAllLinks()
	{
		System.out.println(allLinks.size());
	}

//Initialization
	public ActiPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Utilization
	public void login(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginbtn.click();
	}
}

