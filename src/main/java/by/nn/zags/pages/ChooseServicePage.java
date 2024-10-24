package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseServicePage extends BasePage{

    @FindBy(xpath = "//button[text()='Регистрация рождения']")
    private WebElement birthRegistrationServiceButton;

    /*@FindBy (xpath = "//div[@class='MuiDialogContent-root']//button[2]")
    private WebElement birthRegistrationServiceButton;*/

    public void chooseBirthRegistrationService(){
        birthRegistrationServiceButton.click();
    }
}

