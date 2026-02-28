package by.academy.sokolov.alexey.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {

    ChromeDriver driver;
    String inputLoginName = "astroauth_login";
    String inputPasswordName = "astroauth_pass";
    String buttonSubmitName = "astroauth_submit";
    String baseUrl = "https://www.pizzatempo.by/";

    public PizzatempoPage(ChromeDriver newDriver){
        driver = newDriver;
    }


    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.name(buttonSubmitName));
        submitButton.click();
    }


    public void setInputEmail(String str) {
        WebElement emailInput = driver.findElement(By.name(inputLoginName));
        emailInput.sendKeys(str);
    }

    public void setInputPassword(String str) {
        WebElement passwordInput = driver.findElement(By.name(inputPasswordName));
        passwordInput.sendKeys(str);
    }

}
