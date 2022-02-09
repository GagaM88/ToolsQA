package practiceFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class PracticePage extends BasePage {

    WebDriver driver;
    WebElement practiceFormButton;
    WebElement firstName;
    WebElement lastName;
    WebElement userEmail;
    WebElement male;
    WebElement female;
    WebElement other;
    WebElement dateOfBirth;
    WebElement mobile;
    WebElement submit;
    WebElement hobbySports;
    WebElement hobbyReading;
    WebElement hobbyMusic;
    WebElement monthDropdown;
    WebElement yearDropdown;
    WebElement day;
    WebElement subjects;
    WebElement chooseFile;
    WebElement currentAddress;
    WebElement selectState;
    WebElement selectCity;
    WebElement submitOutput;
    WebElement outputText;

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeFormButton() {
        return driver.findElement(By.cssSelector(".element-group:nth-child(2) #item-0"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getUserEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getMale() {
        return driver.findElement(By.id("gender-radio-1"));
    }

    public WebElement getFemale() {
        return driver.findElement(By.cssSelector("#genterWrapper > .col-md-9 > :nth-child(2)"));
    }

    public WebElement getOther() {
        return driver.findElement(By.id("gender-radio-3"));
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getMobile() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getSubmit() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getHobbySports() {
        return driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
    }

    public WebElement getHobbyReading() {
        return driver.findElement(By.cssSelector("#hobbiesWrapper > .col-md-9 > :nth-child(2)"));
    }

    public WebElement getHobbyMusic() {
        return driver.findElement(By.id("hobbies-checkbox-3"));
    }

    public WebElement getMonthDropdown() {
        return driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
    }

    public WebElement getYearDropdown() {
        return driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
    }

    public WebElement getDay() {
        return driver.findElement(By.xpath("//div[.='13']"));
    }

    public WebElement getSubjects() {
        return driver.findElement(By.xpath("//input[@id='subjectsInput']"));
    }

    public WebElement getChooseFile() {
        return driver.findElement(By.id("uploadPicture"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getSelectState() {
        return driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
    }

    public WebElement getSelectCity() {
        return driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
    }

    public List<WebElement> getSubmitOutput() {
        return (List<WebElement>) driver.findElement(By.xpath("//tr"));
    }

    public WebElement getOutputText() {
        return driver.findElement(By.xpath("//div[@class='table-responsive']"));
    }
    //-----------------------------

    public void inputFirstName(String firstName) {
        this.getFirstName().clear();
        this.getFirstName().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        this.getLastName().clear();
        this.getLastName().sendKeys(lastName);
    }

    public void inputUserEmail(String email) {
        this.getUserEmail().clear();
        this.getUserEmail().sendKeys(email);
    }

    public void genderButt(){
        this.getFemale().click();
    }
    public void inputMobileNumber(int mobile) {
       this.getMobile().clear();
       this.getMobile().sendKeys(String.valueOf(mobile));
    }
    public void inputDate() {
        this.getDateOfBirth().click();

    }
    public void inputSubject(String subject) {
        this.getSubjects().clear();
        this.getSubjects().sendKeys(subject);
    }
    public void hobbyButton(){
        this.getHobbySports().click();
    }
    public void uploadPicture(String picture){
        this.getChooseFile().sendKeys(picture);
    }
    public void inputAddress(String address) {
        this.getCurrentAddress().sendKeys(address);
    }
    public void selectDropDownStateValue(){
        this.getSelectState().sendKeys("NCR");
        this.getSelectState().sendKeys(Keys.TAB);
    }
    public void selectDropDownCityValue() {
        this.getSelectCity().sendKeys("Delhi");
        this.getSelectCity().sendKeys(Keys.TAB);

    }

    }





