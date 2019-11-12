package com.spartaglobal.ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class QAForms {

    private WebDriver driver;
    private String homePageUrl = "https://www.toolsqa.com/automation-practice-form/";
    private By cookieButtonID = By.id("cookie_action_close_header");
    private By partialLinkTest = By.linkText("Partial Link Test");
    private By linkTest = By.linkText("Link Test");
    private By firstName = By.name("firstname");
    private By lastName = By.id("lastname");
    private By simpleButton = By.id("buttonwithclass");
    private By sexElements = By.name("sex");
    private By experienceElements = By.name("exp");
    private By professionElement = By.name("profession");
    private By toolsElement = By.name("tool");
    private By continentElements = By.name("continent");


    public QAForms(WebDriver driver){
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goToHomePage(){
        driver.navigate().to(homePageUrl);
    }

    public void clickCookieButton(){
        driver.findElement(cookieButtonID).click();
    }

    public void clickLinkTest(){
        driver.findElement(linkTest).click();
    }

    public String getCurrLink(){
       return driver.getCurrentUrl();
    }

    private void inputFirstName(String firstNameInput){
        driver.findElement(firstName).sendKeys(firstNameInput);
    }

    public void inputLastName(String lastNameInput){
        driver.findElement(lastName).sendKeys(lastNameInput);
    }

    public String getFirstNameField(){
        return driver.findElement(firstName).getAttribute("value");
    }

    public String getLastNameField(){
        return driver.findElement(lastName).getAttribute("value");
    }

    public void getSexElement(){
        List<WebElement> sexItems = driver.findElements(sexElements);

        for (org.openqa.selenium.WebElement sexItem: sexItems) {
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
           if (driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected()){
               System.out.println(driver.findElement(By.id(sexItem.getAttribute("id"))).getAttribute("value") + " has been clicked");
           }
        }
    }

    public void getExperienceElement(){
        List<WebElement> expItems = driver.findElements(experienceElements);

        for (org.openqa.selenium.WebElement experience: expItems) {
            driver.findElement(By.id(experience.getAttribute("id"))).click();
            if (driver.findElement(By.id(experience.getAttribute("id"))).isSelected()) {
                System.out.println(driver.findElement(By.id(experience.getAttribute("id"))).getAttribute("value") + " has been clicked");
            }
        }
    }

    public void getProfessionElement(){
        List<WebElement> professionItems = driver.findElements(professionElement);

        for (org.openqa.selenium.WebElement pro: professionItems) {
            driver.findElement(By.id(pro.getAttribute("id"))).click();
            if (driver.findElement(By.id(pro.getAttribute("id"))).isSelected()) {
                System.out.println(driver.findElement(By.id(pro.getAttribute("id"))).getAttribute("value") + " has been clicked");
            }
        }
    }

    public void getToolElement(){
        List<WebElement> toolItems = driver.findElements(toolsElement);

        for (org.openqa.selenium.WebElement tools: toolItems) {
            driver.findElement(By.id(tools.getAttribute("id"))).click();
            if (driver.findElement(By.id(tools.getAttribute("id"))).isSelected()) {
                System.out.println(driver.findElement(By.id(tools.getAttribute("id"))).getAttribute("value") + " has been clicked");
            }
        }
    }


    public void getContinentElement(){
        List<WebElement> continentItems = driver.findElements(continentElements);

        for (org.openqa.selenium.WebElement conItem: continentItems) {
            driver.findElement(By.id(conItem.getAttribute("id"))).click();
           if (driver.findElement(By.id(conItem.getAttribute("id"))).isSelected()){
               System.out.println(driver.findElement(By.id(conItem.getAttribute("id"))).getAttribute("value") + " has been clicked");
           }
        }
    }

    public void checkContentOptions(){
        WebElement continents = driver.findElement(continentElements);
        Select option = new Select(continents);
        for (int i = 0; i <option.getOptions().size() ; i++) {
           option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }





}

