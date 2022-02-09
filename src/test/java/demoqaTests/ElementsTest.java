package demoqaTests;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ElementsTest extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL); //pozivamo URL
    }

    @Test
    public void goToElementsPage() {
        demoqaHomePage.clickElements();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".col-12.mt-4.col-md-6")));

        String actualString = driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).getText();
        String expectedString = "Please select an item from left to start practice.";
        Assert.assertEquals(actualString, expectedString);

    }

    @Test
    public void clickOnTextBoxButtonAndFillTextBoxForm() {
        goToElementsPage();
        elementsPage.clickTextBoxButton();

        String validFullName = excelReader.getStringData("ElementsPage", 1, 1);
        String validEmailAddress = excelReader.getStringData("ElementsPage", 1, 2);
        String validCurrentAddress = excelReader.getStringData("ElementsPage", 1, 3);
        String validPermanentAddress = excelReader.getStringData("ElementsPage", 1, 4);

        waitVisibility(elementsPage.getButtonsElement());
        textBoxPage.inputFullName(validFullName);
        textBoxPage.inputEmail(validEmailAddress);
        textBoxPage.inputCurrentAddress(validCurrentAddress);
        textBoxPage.inputPermanentAddress(validPermanentAddress);

        scroll(textBoxPage.getBtnSubmit());
        textBoxPage.clickBtnSubmit();


    }

    @Test
    public void VerifyThatUserCanClickOnCheckBoxButtonHome() {
        goToElementsPage();
        elementsPage.clickCheckBoxButton();
        checkBoxPage.selectHomeDropChekBox();
        checkBoxPage.selectCheckBoxHome();
        checkBoxPage.selectDesktopDropCheckBox();
        checkBoxPage.selectHomeDropChekBox();
        checkBoxPage.selectDesktop(1);
        checkBoxPage.clickOnPlusIcon();

        Assert.assertTrue(checkBoxPage.getNotification().isDisplayed());


    }

    @Test
    public void VerifyThatUserClicOnImpressionRadioButton() {
        goToElementsPage();
        elementsPage.clickRadioElementsButton();
        radioButtonPage.clckAllRadioButtonText();
        radioButtonPage.clickYesImpressiveButtons(1);
        Assert.assertEquals(radioButtonPage.getResult(), "Yes");


    }

    @Test
    public void AddButtonShoulBeVisibleWhenTheWebTablesLinkIsClickedUnderElementsAccordionMenu() {
        goToElementsPage();
        elementsPage.clickWebTablesElementButton();
        Assert.assertTrue(webTablePage.getAddButton().isDisplayed());
    }

    @Test
    public void WhenTheAddButtonIsClickedRegFormTextFirstNameLastNameEmailAgeSalaryAndDepartmentAreViewable() {
        goToElementsPage();
        elementsPage.clickWebTablesElementButton();
        webTablePage.getAddButton().click();
        wdwait.until(ExpectedConditions.visibilityOf(webTablePage.getFirstNameTextBox()));
        Assert.assertTrue(webTablePage.getFirstNameTextBox().isDisplayed());
        Assert.assertTrue(webTablePage.getLastNameTextBox().isDisplayed());
        Assert.assertTrue(webTablePage.getUserEmailTextBox().isDisplayed());
        Assert.assertTrue(webTablePage.getAgeTextBox().isDisplayed());
        Assert.assertTrue(webTablePage.getSalaryTextBox().isDisplayed());
        Assert.assertTrue(webTablePage.getDepartmentTextBox().isDisplayed());

    }

    @Test
    public void userCanAddData() {
        goToElementsPage();
        elementsPage.clickWebTablesElementButton();
        webTablePage.getAddButton().click();

        String firstName = excelReader.getStringData("ElementsPage", 3, 1);
        String lastName = excelReader.getStringData("ElementsPage", 3, 2);
        String email = excelReader.getStringData("ElementsPage", 3, 3);
        int age = excelReader.getIntegerData("ElementsPage", 3, 4);
        int salary = excelReader.getIntegerData("ElementsPage", 3, 5);
        String department = excelReader.getStringData("ElementsPage", 3, 6);


        webTablePage.inputFirstName(firstName);
        webTablePage.inputLastName(lastName);
        webTablePage.inputEmail(email);
        webTablePage.inputAge(age);
        webTablePage.inputSalary(salary);
        webTablePage.inputDepartment(department);
        webTablePage.getSubmitButton().click();

        String expectedName = "Dragana";
        Assert.assertEquals(firstName, expectedName);

    }

    @Test
    public void clickOnAllButtons() {
        goToElementsPage();
        elementsPage.clickButtonElements();
        actionDoubleClick(buttonsPage.getDoubleClickButt());
        Assert.assertTrue(buttonsPage.getDoubleClickNotification().isDisplayed());
        actionRightClick(buttonsPage.getRightClickButt());
        Assert.assertTrue(buttonsPage.getRightClickNotification().isDisplayed());
        buttonsPage.clickOnClickMeButt();
        Assert.assertTrue(buttonsPage.getNotification().isDisplayed());
        Assert.assertEquals("You have done a dynamic click", buttonsPage.clickNotificatiion());

    }

    @Test
    public void ClickHomeAndCheckIfThereOpenedANewPage() {
        goToElementsPage();
        elementsPage.clickLinksElement();

        linksPage.getHomeLink().click();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demoqa.com/";
        Assert.assertNotEquals(actualUrl, expectedUrl);
        Assert.assertTrue(linksPage.getHomeLink().isDisplayed());
    }

    @Test
    public void moved() {
        goToElementsPage();
        elementsPage.clickLinksElement();

        linksPage.getMoved().click();
        Assert.assertTrue(linksPage.getStatus().isDisplayed());

    }

    @Test
    public void PageMustHaveValidImageBrokenImageValidLinkAndBrokenLink() {
        goToElementsPage();
        elementsPage.clickBrokenLinksButton();

        brokenImageLinksPage.getBrokenLinksImage().click();


        String[] expectedDate = {"Valid image", "Broken image", "Valid Link", "Broken Link"};
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(brokenImageLinksPage.getFourObjects().get(i).getText(), expectedDate[i]);
        }
    }

    @Test
    public void VerifyThatValidImageMustBeVisible() {
        goToElementsPage();
        elementsPage.clickBrokenLinksButton();
        scroll(brokenImageLinksPage.getBrokenLinksImage());
        brokenImageLinksPage.getBrokenLinksImage().click();

        Assert.assertNotEquals(brokenImageLinksPage.getPictures().get(1).getAttribute("naturalWidth"), "[0]");

    }

    @Test
    public void VerifyThatClickingOnTheBrokenLinkShouldGetNotFoundError() {
        goToElementsPage();
        elementsPage.clickBrokenLinksButton();
        brokenImageLinksPage.getBrokenLinksImage().click();
        scroll(brokenImageLinksPage.getLinks().get(1));
        brokenImageLinksPage.getLinks().get(1).click();

        Assert.assertTrue(brokenImageLinksPage.getStatusCode().isDisplayed());

    }

    @Test
    public void VerifyThatUploadAndDownPageUnderElementsAreVisible() {
        goToElementsPage();
        elementsPage.clickUploadAndDownloadButton();
        Assert.assertTrue(uploadAndDownloadPage.getMainHeader().isDisplayed());

    }

    @Test
    public void VerifyThatDownButtOnThePageIsClickableAndASampeFileIsDownloadedWhenClicked() {
        goToElementsPage();
        elementsPage.clickUploadAndDownloadButton();
        uploadAndDownloadPage.getDownloadButton().click();

        //String filePath = "/Users/draganamitrovic/Downloads/sampleFile.jpeg";
        String filePath = excelReader.getStringData("ElementsPage", 4, 1);
        boolean isFileExist = Files.exists(Paths.get(filePath));

        Assert.assertTrue(isFileExist);
    }

    @Test
    public void VerifyThatASampleFileCanBeUploaded() {
        goToElementsPage();
        elementsPage.clickUploadAndDownloadButton();
        String sampleFile = excelReader.getStringData("ElementsPage", 4, 1);
        uploadAndDownloadPage.getSelectFile().sendKeys(sampleFile);
        Assert.assertTrue(uploadAndDownloadPage.getUploadedFile().isDisplayed());
        Assert.assertEquals(uploadAndDownloadPage.getUploadedFile().getAttribute("id"), "uploadedFilePath");


    }

    @Test
    public void VerifyThatUserHaveTheIdValue() {
        goToElementsPage();
        elementsPage.clickdynamicPropertiesButton();

        List<String> randomList = new ArrayList<>();

        int j = 0;
        for (int i = 1; i < 4; i++) {
            String idValue = dynamicPropertiesPage.getRandomText().getAttribute("id");
            System.out.println(idValue);
            if (!randomList.contains(idValue)) {
                randomList.add(idValue);
                j++;
            }
            driver.navigate().refresh();
        }
        Assert.assertEquals(randomList.size(), j);


    }

    @Test
    public void VerifyThatItIsEnableAfter5Seconds() {
        goToElementsPage();
        elementsPage.clickdynamicPropertiesButton();

        Assert.assertFalse(dynamicPropertiesPage.getEnableButt().isEnabled());

        wdwait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.getEnableButt()));
        Assert.assertTrue(dynamicPropertiesPage.getEnableButt().isEnabled());
    }

    @Test
    public void VerifyThatItIsViewableAfter5Seconds() throws InterruptedException {
        goToElementsPage();
        elementsPage.clickdynamicPropertiesButton();

        boolean isNotDisplayed = false;
        try {
            dynamicPropertiesPage.getVisibleButt().isDisplayed();
        } catch (NoSuchElementException e) {
            isNotDisplayed = true;
        }
        Assert.assertTrue(isNotDisplayed);
        //nisam se snasla assert da uradim
    }
}

















