package Steps;

import Task_1_3.MarketPage;
import Task_1_3.YandexBeforeMarket;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.switchTo;

public class Steps {
    @Step("Шаг 1. Перейти в маркет")
    public void goMarket(YandexBeforeMarket yandexBeforeMarket) {
        yandexBeforeMarket.clickMarket();
        switchTo().window(1);
    }

    @Step("Шаг 2. Перейти в ноутбуки")
    public void goLaptops(MarketPage marketPage){
        marketPage.goToLaptop();
    }
}
