package pageobjects;

import org.AppTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends AppTest{

    private static String url = "http://185.108.182.151:10200/Pigd_414/logon.aspx";

    public Login(WebDriver driver){
        super();
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"LogonCtrl_UserName\"]")
    private WebElement username;

    @FindBy(xpath = "//*[@id=\"LogonCtrl_Password\"]")
    private  WebElement password;

    @FindBy(xpath = "//*[@id=\"LogonCtrl_btnLogin\"]")
    private WebElement submit;

    public String getUrl() {
        return url;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmit() {
        return submit;
    }
}
