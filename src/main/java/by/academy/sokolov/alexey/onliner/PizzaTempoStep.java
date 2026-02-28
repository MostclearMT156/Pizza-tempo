package by.academy.sokolov.alexey.onliner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaTempoStep {
    PizzatempoPage page;

    public PizzaTempoStep(ChromeDriver webDriver) {
        page = new PizzatempoPage(webDriver);
    }

    public void fillLoginFormAndSubmit(String name, String password) {
        page.setInputEmail(name);
        page.setInputPassword(password);
        page.clickSubmitButton();
    }
}
