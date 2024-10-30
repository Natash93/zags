package by.nn.zags.pages;

import by.nn.zags.model.BirthServiceModel;
import by.nn.zags.model.DeathServiceModel;
import by.nn.zags.model.MarriageServiceModel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceDataPage extends BasePage {
    @FindBy(xpath = "//label[text()='Место рождения']/following-sibling::input")
    private WebElement birthPlaceInputField;

    @FindBy(xpath = "//label[text()='Мать']/following-sibling::input")
    private WebElement motherNameInputField;

    @FindBy(xpath = "//label[text()='Отец']/following-sibling::input")
    private WebElement fatherNameInputField;

    @FindBy(id = "TextInputField-13")
    private WebElement registrationDateInputField;

    @FindBy(id = "TextInputField-14")
    private WebElement newSurnameInputField;

    @FindBy(id = "TextInputField-15")
    private WebElement spouseSurnameInputField;

    @FindBy(id = "TextInputField-16")
    private WebElement spouseNameInputField;

    @FindBy(id = "TextInputField-17")
    private WebElement spouseMiddleNameInputField;

    @FindBy(id = "TextInputField-18")
    private WebElement spouseBirthDateInputField;

    @FindBy(id = "TextInputField-19")
    private WebElement spousePassportInputField;

    @FindBy(xpath = "//label[text()='Дата смерти']/following-sibling::input")
    private WebElement dateOfDeathInputField;

    @FindBy(xpath = "//label[text()='Место смерти']/following-sibling::input")
    private WebElement placeOfDeathInputField;

    @FindBy(xpath = "//button[text()='Завершить']")
    private WebElement finishButton;

    @Step("user fills birth service data form")
    public void fillBirthServiceDataForm(BirthServiceModel birthServiceModel){
        birthPlaceInputField.sendKeys(birthServiceModel.getBirthPlace());
        motherNameInputField.sendKeys(birthServiceModel.getMotherName());
        fatherNameInputField.sendKeys(birthServiceModel.getFatherName());
        finishButton.click();
    }

    @Step("user fills marriage service data form")
    public void fillMarriageServiceDataForm(MarriageServiceModel marriageServiceModel){
        registrationDateInputField.sendKeys(marriageServiceModel.getRegistrationDate());
        newSurnameInputField.sendKeys(marriageServiceModel.getNewSurname());
        spouseSurnameInputField.sendKeys(marriageServiceModel.getSpouseSurname());
        spouseNameInputField.sendKeys(marriageServiceModel.getSpouseName());
        spouseMiddleNameInputField.sendKeys(marriageServiceModel.getSpouseMiddleName());
        spouseBirthDateInputField.sendKeys(marriageServiceModel.getSpouseBirthDate());
        spousePassportInputField.sendKeys(marriageServiceModel.getSpousePassport());
        finishButton.click();
    }

    /*public void finishApplicationSubmission(){
        finishButton.click();
    }*/

    @Step("user fills death service data form")
    public void fillDeathServiceDataForm (DeathServiceModel deathServiceModel){
        dateOfDeathInputField.sendKeys(deathServiceModel.getDateOfDeath());
        placeOfDeathInputField.sendKeys(deathServiceModel.getPlaceOfDeath());
        finishButton.click();
    }
    public boolean isFinishButtonEnabled(){
        return finishButton.isEnabled();
    }
}
