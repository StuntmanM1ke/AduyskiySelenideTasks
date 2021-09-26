package ru.yandex;

import Steps.Steps;
import Task_1_3.MarketPage;
import Task_1_3.YandexBeforeMarket;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class Tests {
    protected Steps steps = new Steps();

    @BeforeEach
    public void option(){
        Configuration.timeout = 6000;
        Configuration.startMaximized = true;
    }

    @Test
    public void yandexMarketForTask13(){
        open("https://yandex.ru/");
        YandexBeforeMarket yandexBeforeMarket = new YandexBeforeMarket();
        steps.goMarket(yandexBeforeMarket);
        MarketPage marketPage = new MarketPage();
        steps.goLaptops(marketPage);
    }
}
