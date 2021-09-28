package Steps;

import Task_1_3.MarketPage;
import Task_1_3.YandexBeforeMarket;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

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

    @Step("Шаг 3. Задание фильтров {priceFrom}, {priceTo}")
    public void setAllFilters(MarketPage marketPage, String priceFrom, String priceTo ){
        marketPage.setAllFiltersLaptops(priceFrom, priceTo);
    }

    @Step("Шаг 4. Установка количества показываемых элементов на страницу")
    public void setRange(MarketPage marketPage){
        marketPage.setRangeToTwelve();
    }

    @Step("Шаг 5. Проверка количества отображаемых элементов")
    public void CheckResults(MarketPage marketPage){
       Assertions.assertEquals(12, marketPage.getResults().size());
    }
}
