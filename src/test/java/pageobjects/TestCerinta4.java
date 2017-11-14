package pageobjects;

import org.AppTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TestCerinta4 extends AppTest{



    private static String url = "http://185.108.182.151:10200/Pigd_414/Default.aspx";

    public TestCerinta4(WebDriver driver) throws IOException {
        super();
        driver.get(url);
        PageFactory.initElements(driver, this);
        for (int i = 0; i < 100; i++){
//            @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td/div/div[2]/div[2]/div/table/thead/tr/th[5]")
//                    private static WebElement status;
        }
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/ul/li[1]/a")
    private static WebElement cereri;

    @FindBy(xpath = "//*[@id=\"Menu1_A27\"]")
    private static WebElement toatecereri;



    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td/div/div[2]/div[2]/div/table/thead/tr/th[5]")
    private static WebElement status;

    public static WebElement getStatus(){return status;}


    public static WebElement getCereri() {
        return cereri;
    }

    public static WebElement getToatecereri() {
        return toatecereri;
    }
}
