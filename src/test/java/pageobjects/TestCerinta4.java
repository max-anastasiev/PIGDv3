package pageobjects;

import org.AppTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCerinta4 extends AppTest{

    private static String url = "http://185.108.182.151:10200/Pigd_414/Default.aspx";

    public TestCerinta4(WebDriver driver){
        super();
        driver.get(url);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/ul/li[1]/a")
    private WebElement cereri;

    @FindBy(xpath = "//*[@id=\"Menu1_A27\"]")
    private WebElement toatecereri;


    public WebElement getCereri() {
        return cereri;
    }

    public WebElement getToatecereri() {
        return toatecereri;
    }
}
