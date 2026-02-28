package by.academy.sokolov.alexey.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {
PizzatempoPage pizzatempoPage;
ChromeDriver driver;
PizzaTempoStep pizzaTempoStep;

    @BeforeEach
    public void warmUp() throws InterruptedException {
        driver = new ChromeDriver();
        pizzaTempoStep = new PizzaTempoStep(driver);
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get(pizzatempoPage.baseUrl);
    }

    @Test
    public void testEnterWithEmptyEmailAndPassword(){
        pizzaTempoStep.fillLoginFormAndSubmit("em","pa");
    }


    @Test
    public void testLoginInvalidEmail(){
        pizzatempoPage.setInputEmail("Email@mail.ru");
    }


    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
