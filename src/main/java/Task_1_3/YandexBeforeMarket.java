package Task_1_3;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class YandexBeforeMarket extends BasePage {
    private WebElement marketButton;

    @Step("Перейти в маркет")
    public MarketPage goMarket() {
        clickMarket();
        switchTo().window(1);
        return page(MarketPage.class);
    }

    public YandexBeforeMarket() {
        this.marketButton = $x("//div[contains(text(),'Маркет')]");
    }

    public void clickMarket() {
        marketButton.click();
    }
}
