package by.nn.zags.pages;

import by.nn.zags.model.CitizenModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitizenDataPage extends BasePage {
    @FindBy(xpath = "//label[text()='Фамилия']/following-sibling::input")
    private WebElement surnameInputField;

    @FindBy (xpath = "//label[text()='Имя']/following-sibling::input")
    private WebElement nameInputField;

    @FindBy (xpath = "//label[text()='Отчество']/following-sibling::input")
    private WebElement middleNameInputField;

    @FindBy (xpath = "//label[text()='Дата рождения']/following-sibling::input")
    private WebElement birthDateInputField;

    @FindBy (xpath = "//label[text()='Номер паспорта']/following-sibling::input")
    private WebElement passportInputField;

    @FindBy(xpath = "//label[text()='Пол']/following-sibling::input")
    private WebElement genderInputField;

    @FindBy (xpath = "//button[text()='Далее']")
    private WebElement nextButton;

    public void fillCitizenDataForm(CitizenModel citizenModel){
        surnameInputField.sendKeys(citizenModel.getSurname());
        nameInputField.sendKeys(citizenModel.getName());
        middleNameInputField.sendKeys(citizenModel.getMiddleName());
        birthDateInputField.sendKeys(citizenModel.getBirthDate());
        passportInputField.sendKeys(citizenModel.getPassport());
        genderInputField.sendKeys(citizenModel.getGender());
        nextButton.click();
    }
    public void goToServiceDataPage(){
        nextButton.click();
    }
}
