package org;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pageobjects.Login;
import pageobjects.LoginSucces;
import pageobjects.TestCerinta4;

import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;

public class AppTest 
{
        public String loginlink = "http:///185.108.182.151:10200//Pigd_414//logon.aspx";

        @Before
                public void before(){
                System.setProperty("webdrriver.gecko.driver","C:/selenium/geckodriver");
        }

        @Test
        public void login(){
                WebDriver driver = new FirefoxDriver();
                Login login = new Login(driver);

                login.getUsername().sendKeys("cts");
                login.getPassword().sendKeys("1");

                login.getSubmit().click();

                Assert.assertThat("http://185.108.182.151:10200/Pigd_414/PwdMgmt.aspx", is(driver.getCurrentUrl()));


                LoginSucces loginsucces = new LoginSucces(driver);
                Assert.assertThat(loginsucces.getHeadtext().getText(), is("Programul Integrat de Gestionare a Dosarelor - PIGD v4.1.2 (versiunea din: 6 noiembrie 2017 18:01:29)"));
                loginsucces.getHomebutton().click();
                Assert.assertThat("http://185.108.182.151:10200/Pigd_414/Default.aspx", is(driver.getCurrentUrl()));

                TestCerinta4 cerinta4 = new TestCerinta4(driver);
                Actions actions =  new Actions(driver);
                actions.moveToElement(cerinta4.getCereri()).moveToElement(cerinta4.getToatecereri()).click().build().perform();

        }

        @After
                public void after(){
                final WebDriver driver = new WebDriver() {
                        public void get(String s) {

                        }

                        public String getCurrentUrl() {
                                return null;
                        }

                        public String getTitle() {
                                return null;
                        }

                        public List<WebElement> findElements(By by) {
                                return null;
                        }

                        public WebElement findElement(By by) {
                                return null;
                        }

                        public String getPageSource() {
                                return null;
                        }

                        public Set<String> getWindowHandles() {
                                return null;
                        }

                        public String getWindowHandle() {
                                return null;
                        }

                        public TargetLocator switchTo() {
                                return null;
                        }

                        public Navigation navigate() {
                                return null;
                        }

                        public Options manage() {
                                return null;
                        }

                        public void close() {

                        }

                        public void quit() {

                        }
                };
}


}
