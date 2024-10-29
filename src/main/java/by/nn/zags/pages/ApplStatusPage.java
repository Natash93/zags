package by.nn.zags.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplStatusPage extends BasePage{

    @FindBy(xpath = "//div[@class='MuiDialogTitle-root']")
    private WebElement pageTitle;

    @FindBy(xpath = "//div/span[contains(text(),'Вы выбрали услугу')]")
    private WebElement chosenServiceTitle;

    @FindBy(xpath = "//div/span[contains(text(),\"Ваша заявка отправлена на рассмотрение\")]")
    private WebElement applicationSubmitted;

    @FindBy(xpath = "//button[text()='Закрыть']")
    private WebElement closeButton;

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getChosenServiceTitle() {
        return chosenServiceTitle.getText();
    }
    public String getApplicationSubmittedText() {
        return applicationSubmitted.getText();
    }

    @Step("closing application status page")
    public void closeApplStatusPage(){
        closeButton.click();
    }



}
