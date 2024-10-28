package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplListPage extends BasePage{
    @FindBy (css = "table>.MuiTableRow-root:last-of-type :nth-child(5)")
    private WebElement lastApplicationStatus;

    public String getLastApplicationStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lastApplicationStatus));

        return lastApplicationStatus.getText();
    }

}
