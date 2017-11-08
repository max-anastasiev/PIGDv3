package pageobjects;

import org.AppTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSucces extends AppTest {

    private static String url = "http://185.108.182.151:10200/Pigd_414/PwdMgmt.aspx";

    public LoginSucces(WebDriver driver) {
        super();
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td/div/div[2]")
    private WebElement headtext;

    @FindBy(xpath = "//*[@id=\"lnkLogoBig\"]")
    private WebElement homebutton;

    public static String getUrl() {
        return url;
    }

    public WebElement getHeadtext() {
        return headtext;
    }

    public WebElement getHomebutton() {
        return homebutton;
    }
}
