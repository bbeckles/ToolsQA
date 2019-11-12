package com.spartaglobal.ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bailee Beckles\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
//
//
//        chromeDriver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
//        chromeDriver.findElementById("cookie_action_close_header").click();
//        chromeDriver.findElement(By.linkText("Partial Link Test")).click();
//
//        String currentpage = chromeDriver.getCurrentUrl();
//        chromeDriver.findElement(By.linkText("Link Test")).click();
//        chromeDriver.navigate().to(currentpage);
//
//        chromeDriver.findElement(By.name("firstname")).sendKeys("Bail-EE");
//        chromeDriver.findElement(By.id("lastname")).sendKeys("notBailee");
//
//        chromeDriver.findElementById("buttonwithclass").click();
//
//        for (int i = 0; i <= 1; i++) {
//            chromeDriver.findElementById("sex-" + i).click();
//
//        }
//
//        for (int i = 0; i <=6 ; i++) {
//            chromeDriver.findElementById("exp-" + i).click();
//        }
//
//        chromeDriver.findElementById("datepicker").sendKeys("11/11/2019");
//
//        for (int i = 0; i <= 1; i++) {
//            chromeDriver.findElementById("profession-" + i);
//
//        }
//
//
//
//        for (int i = 0; i <=2 ; i++) {
//            chromeDriver.findElementById("tool-" + i);
//
//        }
//
//        WebElement webelement = chromeDriver.findElementById("continents");
//        Select select = new Select(webelement);
//        for(int i = 0; i<select.getOptions().size(); i++) {
//
//            select.selectByIndex(i);
//
//        }
//
//        WebElement wElement1 = chromeDriver.findElementById("continentsmultiple");
//        Select select1 = new Select(wElement1);
//        for(int i = 0; i<select1.getOptions().size(); i++) {
//
//            select1.selectByIndex(i);
//        }
//
//        WebElement wElement2 = chromeDriver.findElementById("selenium_commands");
//        Select select2 = new Select(wElement1);
//        for(int i = 0; i<select2.getOptions().size(); i++) {
//
//            select2.selectByIndex(i);
//        }
//
//        chromeDriver.findElementById("submit").click();
//        chromeDriver.findElementById("submit1").click();
//        chromeDriver.findElementById("submit2").click();
//        chromeDriver.findElementById("submit3").click();
//
//        }


        QAForms qaForms = new QAForms(chromeDriver);
        qaForms.goToHomePage();
        qaForms.clickCookieButton();
        qaForms.getProfessionElement();
    }
}
