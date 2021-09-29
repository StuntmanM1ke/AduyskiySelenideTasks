package ru.yandex;

import Task_1_3.YandexBeforeMarket;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    @BeforeEach
    public void option() {
        Configuration.timeout = 6000;
        Configuration.startMaximized = true;
    }

    @Test
    public void yandexMarketForTask13() {
        open("https://yandex.ru/", YandexBeforeMarket.class)
                .goMarket()
                .goToLaptop()
                .setAllFiltersLaptops("10000", "30000")
                .setRangeToTwelve()
                .checkResults()
                .searchFirstOne();
    }
}
