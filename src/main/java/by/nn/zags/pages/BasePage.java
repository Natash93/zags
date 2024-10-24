package by.nn.zags.pages;

import by.nn.zags.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openMainPage() {
        driver.get("https://user:senlatest@regoffice.senla.eu");
    }

    public void quit() {
        DriverManager.quitDriver();
    }
}
