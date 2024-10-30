package by.nn.zags.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplListPage extends BasePage{
    @FindBy (css = ".MuiDialogActions-spacing>button:last-child")
    private WebElement refreshButton;

    @FindBy (css = "table>.MuiTableRow-root:last-of-type :nth-child(5)")
    private WebElement lastApplicationStatus;

    @FindBy(css = "table>.MuiTableRow-root:last-of-type :nth-child(3)")
    private WebElement lastApplicationType;

    @Step("checking last application type")
    public String getLastApplicationType() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lastApplicationType));
        refreshButton.click();
        return lastApplicationType.getText();
    }

    @Step("checking last application status")
    public String getLastApplicationStatus() {
        return lastApplicationStatus.getText();
    }


}
