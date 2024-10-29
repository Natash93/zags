package by.nn.zags.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseServicePage extends BasePage{

    @FindBy(xpath = "//button[text()='Регистрация рождения']")
    private WebElement birthRegistrationServiceButton;

    @FindBy(xpath = "//button[text()='Регистрация брака']")
    private WebElement marriageRegistrationServiceButton;

    @FindBy(xpath = "//button[text()='Регистрация смерти']")
    private WebElement deathRegistrationServiceButton;

    /*@FindBy (xpath = "//div[@class='MuiDialogContent-root']//button[2]")
    private WebElement birthRegistrationServiceButton;*/

    @Step("user choosing birth registration service")
    public void chooseBirthRegistrationService(){
        birthRegistrationServiceButton.click();
    }
    public void chooseMarriageRegistrationService(){
        marriageRegistrationServiceButton.click();
    }
    public void chooseDeathRegistrationService(){
        deathRegistrationServiceButton.click();
    }
}

