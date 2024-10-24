package by.nn.zags.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicantDataPage extends BasePage {
    @FindBy(xpath = "//label[text()='Фамилия']/following-sibling::input")
    private WebElement surnameInputField;

    @FindBy (xpath = "//label[text()='Имя']/following-sibling::input")
    private WebElement nameInputField;

    @FindBy (xpath = "//label[text()='Отчество']/following-sibling::input")
    private WebElement middleNameInputField;

    @FindBy (xpath = "//label[text()='Телефон']/following-sibling::input")
    private WebElement phoneInputField;

    @FindBy (xpath = "//label[text()='Номер паспорта']/following-sibling::input")
    private WebElement passportInputField;

    @FindBy (xpath = "//label[text()='Адрес прописки']/following-sibling::input")
    private WebElement addressInputField;

        /*@FindBy (xpath = "//div[@class='MuiDialogActions-root MuiDialogActions-spacing']/button[2]")
    private WebElement nextButton;*/

    @FindBy (xpath = "//button[text()='Далее']")
    private WebElement nextButton;

    public void fillApplicantDataForm(String surname, String name, String middleName, String phone, String passport, String address){
        surnameInputField.sendKeys(surname);
        nameInputField.sendKeys(name);
        middleNameInputField.sendKeys(middleName);
        phoneInputField.sendKeys(phone);
        passportInputField.sendKeys(passport);
        addressInputField.sendKeys(address);
    }
    public void goToChooseServicePage(){
        nextButton.click();
    }





}
