package by.nn.zags.tests.ui;

import by.nn.zags.model.*;
import by.nn.zags.pages.*;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApplicationSubmissionTest extends BaseTest {
    private HomePage homePage;
    private ApplicantDataPage applicantDataPage;
    private ChooseServicePage chooseServicePage;
    private CitizenDataPage citizenDataPage;
    private ServiceDataPage serviceDataPage;
    private ApplStatusPage applStatusPage;
    private AdminDataPage adminDataPage;
    private ApplListPage applListPage;

    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
        homePage.openMainPage();

        applicantDataPage = new ApplicantDataPage();
        chooseServicePage = new ChooseServicePage();
        citizenDataPage = new CitizenDataPage();
        serviceDataPage = new ServiceDataPage();
        applStatusPage = new ApplStatusPage();
        adminDataPage = new AdminDataPage();
        applListPage = new ApplListPage();
    }

    @Test
    @Feature("Application for birth registration")
    public void createAndCheckBirthRegistrationApplication() {
        ApplicantModel applicantModel = new ApplicantModel("Bah", "Iogan", "Volfgang", "1234567", "hb12345678", "some city");
        CitizenModel citizenModel = new CitizenModel("Bah", "Iogan", "Volfgang", "01.01.1990", "hb12345678", "male");
        BirthServiceModel birthServiceModel = new BirthServiceModel("some city", "Alena", "Pedro");
        AdminModel adminModel = new AdminModel("Admin", "Admin", "Admin", "123123123", "hb7654321", "02.02.1995");

        SoftAssert softAssert = new SoftAssert();
        homePage.enterAsUser();
        applicantDataPage.fillApplicantDataForm(applicantModel);
        chooseServicePage.chooseBirthRegistrationService();
        citizenDataPage.fillCitizenDataForm(citizenModel);
        softAssert.assertFalse(serviceDataPage.isFinishButtonEnabled(), "'Finish' button must be disabled at the start");
        serviceDataPage.fillBirthServiceDataForm(birthServiceModel);

        Assert.assertEquals(applStatusPage.getApplicationSubmittedText(), "Ваша заявка отправлена на рассмотрение.");
        Assert.assertEquals(applStatusPage.getChosenServiceTitle(), "Вы выбрали услугу: Pегистрация рождения");

        applStatusPage.closeApplStatusPage();
        homePage.enterAsAdmin();
        adminDataPage.fillAdminDataForm(adminModel);
        applListPage.getLastApplicationType();
        applListPage.getLastApplicationStatus();

        Assert.assertEquals(applListPage.getLastApplicationType(), "Получение свидетельства о рождении");
        Assert.assertEquals(applListPage.getLastApplicationStatus(), "На рассмотрении");
        softAssert.assertAll();
    }

    @Test
    @Feature("Application for marriage registration")
    public void createAndCheckMarriageRegistrationApplication() {
        ApplicantModel applicantModel = new ApplicantModel("Bah", "Iogan", "Volfgang", "1234567", "hb12345678", "some city");
        CitizenModel citizenModel = new CitizenModel("Bah", "Iogan", "Volfgang", "01.01.1990", "hb12345678", "male");
        MarriageServiceModel marriageServiceModel = new MarriageServiceModel("10.09.2024", "Bah", "Kozadoev", "Oleg", "Olegovich", "08.08.1989", "hb1234567");
        AdminModel adminModel = new AdminModel("Admin", "Admin", "Admin", "123123123", "hb7654321", "02.02.1995");

        homePage.enterAsUser();
        applicantDataPage.fillApplicantDataForm(applicantModel);
        chooseServicePage.chooseMarriageRegistrationService();
        citizenDataPage.fillCitizenDataForm(citizenModel);
        serviceDataPage.fillMarriageServiceDataForm(marriageServiceModel);

        Assert.assertEquals(applStatusPage.getApplicationSubmittedText(), "Ваша заявка отправлена на рассмотрение.");
        Assert.assertEquals(applStatusPage.getChosenServiceTitle(), "Вы выбрали услугу: Регистрация брака");

        applStatusPage.closeApplStatusPage();
        homePage.enterAsAdmin();
        adminDataPage.fillAdminDataForm(adminModel);
        applListPage.getLastApplicationType();
        applListPage.getLastApplicationStatus();

        Assert.assertEquals(applListPage.getLastApplicationType(), "Получение свидетельства о браке");
        Assert.assertEquals(applListPage.getLastApplicationStatus(), "На рассмотрении");
    }

    @Test
    @Feature("Application for death registration")
    public void createAndCheckDeathRegistrationApplication() {
        ApplicantModel applicantModel = new ApplicantModel("Bah", "Iogan", "Volfgang", "1234567", "hb12345678", "some city");
        CitizenModel citizenModel = new CitizenModel("Bah", "Iogan", "Volfgang", "01.01.1990", "hb12345678", "male");
        DeathServiceModel deathServiceModel = new DeathServiceModel("01.01.2023", "city of death");
        AdminModel adminModel = new AdminModel("Admin", "Admin", "Admin", "123123123", "hb7654321", "02.02.1995");

        homePage.enterAsUser();
        applicantDataPage.fillApplicantDataForm(applicantModel);
        chooseServicePage.chooseDeathRegistrationService();
        citizenDataPage.fillCitizenDataForm(citizenModel);
        serviceDataPage.fillDeathServiceDataForm(deathServiceModel);

        Assert.assertEquals(applStatusPage.getApplicationSubmittedText(), "Ваша заявка отправлена на рассмотрение.");
        Assert.assertEquals(applStatusPage.getChosenServiceTitle(), "Вы выбрали услугу: Регистрация смерти");

        applStatusPage.closeApplStatusPage();
        homePage.enterAsAdmin();
        adminDataPage.fillAdminDataForm(adminModel);
        applListPage.getLastApplicationType();
        applListPage.getLastApplicationStatus();

        Assert.assertEquals(applListPage.getLastApplicationType(), "Получение свидетельства о смерти");
        Assert.assertEquals(applListPage.getLastApplicationStatus(), "На рассмотрении");
    }

    /*@Test(dependsOnMethods = "createDeathRegistrationApplication")
    public void adminCheckStatus() {
        AdminModel adminModel = new AdminModel("Admin", "Admin", "Admin", "123123123", "hb7654321", "02.02.1995");

        homePage.enterAsAdmin();
        adminDataPage.fillAdminDataForm(adminModel);
        applListPage.getLastApplicationStatus();

        Assert.assertEquals(applListPage.getLastApplicationStatus(), "На рассмотрении");
    }*/

    @AfterMethod
    public void quit() {
        homePage.quit();
    }
}
