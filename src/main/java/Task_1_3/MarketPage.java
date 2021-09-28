package Task_1_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.WaitUntil;
import com.codeborne.selenide.conditions.Text;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MarketPage  extends BasePage{
    public MarketPage() {
    }

    SelenideElement firstInListBefore;
    private SelenideElement searchResultsMarker = $x("//button[@class='vLDMf']");
    private WebElement electronics;
    private WebElement priceFieldFrom;
    private WebElement priceFieldTo;
    private WebElement smartPhones;
    private WebElement laptopFilter;
    private WebElement hpPoint;
    private WebElement lenovoPoint;
    private WebElement showSmthg;
    private WebElement showTwelve;
    private WebElement searchField;
    private WebElement searchButton;

    public ElementsCollection getResults() {
        ElementsCollection results = $$x("//h3");
        return results;
    }

    @Step ("Перейти в ноутбуки")
    public MarketPage goToLaptop() {
        $x("//span[contains(text(),'Компьютеры')]").click();
        SelenideElement laptops = $x("//a[@href=\"/catalog--noutbuki/54544/list?hid=91013\"]");
        laptops.shouldBe(Condition.visible).click();
        return this;
    }

    public void goToSmartphones() {
        $x("//span[contains(text(),'Электроника')]").click();
        // smartPhones = driver.findElement(By.xpath("//a[contains(text(),'Смартфоны') and @class='_2qvOO _2x2zB _9qbcy']"));
        smartPhones.click();
    }
    @Step("Задание фильтров {priceFrom}, {priceTo}")
    public MarketPage setAllFiltersLaptops(String priceFrom, String priceTo) {
        $x("//span[@class = '_1o8_r' and contains(text(),'HP')]").click();
        $x("//span[@class = '_1o8_r' and contains(text(),'Lenovo')]").click();
        $x("//*[@id = 'glpricefrom']").sendKeys(priceFrom);
        $x("//*[@id = 'glpriceto']").sendKeys(priceTo);
        return this;
    }

    @Step("Установка количества показываемых элементов на страницу")
    public MarketPage setRangeToTwelve() {
        $x("//button[@class='vLDMf']").shouldBe(Condition.visible).click();
        $x("//button[@class='_1KpjX _35Paz']").click();
        return this;
    }

    @Step("Проверка количества отображаемых элементов")
    public MarketPage checkResults() {
        searchResultsMarker.shouldBe(visible).click();
        Assertions.assertEquals(12, getResults().size());
        return this;
    }

    @Step("Поиск по первому элементу и сравнение результатов с запросом")
    public MarketPage searchFirstOne() {
        firstInListBefore = getResults().get(0);
        $x("//input[@id='header-search']").sendKeys(firstInListBefore.getText());
        $x("//span[contains(text(),'Найти')]").click();
        Assertions.assertEquals(getResults().get(0).getText(), firstInListBefore.getText());
        return this;
    }

    /*
    public void setBrandFilter (String brandName) throws InterruptedException {
        WebElement showAll = driver.findElement(By.xpath("//*[@class ='_1KpjX _2Wg9r']"));
        showAll.click();
        WebElement brandField = driver.findElement(By.xpath("//*[@class='_1JYTt']"));
        brandField.sendKeys(brandName);
        WebElement brandPoint = driver.findElement(By.xpath("//span[contains(text(), '" + brandName + "') and @class='_1o8_r _17C4L']"));
        Thread.sleep(5000);
        try {
            brandPoint.click();
        } catch (StaleElementReferenceException e){
            brandPoint = driver.findElement(By.xpath("//span[contains(text(), '" + brandName.substring(1) + "') and @class='_1o8_r _17C4L']"));
            brandPoint.click();
        }
    }

    public List<WebElement> getBrandList() throws InterruptedException {
        List<WebElement> list = getResults();
        WebElement nextPage = driver.findElement(By.xpath("//a[contains(text(), 'Вперёд')]"));
        while (true){
            try {
                nextPage.click();
                Thread.sleep(3000);
                List<WebElement> newPage = getResults();
                list.addAll(newPage);
            } catch (StaleElementReferenceException e) {
                break;
                }
        }return list;
    }

    @Override
    public boolean isPageLoaded() {
        return true;
    }*/
}
