package Task_1_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexBeforeMarket {
    private WebElement marketButton;

    public YandexBeforeMarket() {
        this.marketButton = $x("//div[contains(text(),'Маркет')]");
    }

    public void clickMarket() {
        marketButton.click();
    }
}
