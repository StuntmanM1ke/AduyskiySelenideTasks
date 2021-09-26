package Task_1_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MarketPage {
//    public boolean isPageLoaded() {
//        return false;
//    }


    public MarketPage() {
    }


    private WebElement computerFilter;
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




    public void goToLaptop() {
        $x("//span[contains(text(),'Компьютеры')]").click();
        SelenideElement laptops = $x("//a[@href=\"/catalog--noutbuki/54544/list?hid=91013\"]");
        laptops.shouldBe(Condition.visible).click();
    }

   /* public void goToSmartphones() {
        electronics.click();
        smartPhones = driver.findElement(By.xpath("//a[contains(text(),'Смартфоны') and @class='_2qvOO _2x2zB _9qbcy']"));
        smartPhones.click();
    }

    public void setAllFiltersLaptops() {
        setPrice("10000", "30000");
        hpPoint = driver.findElement(By.xpath("//span[@class = '_1o8_r' and contains(text(),'HP')]"));
        lenovoPoint = driver.findElement(By.xpath("//span[@class = '_1o8_r' and contains(text(),'Lenovo')]"));
        hpPoint.click();
        lenovoPoint.click();
    }

    public void setPrice(String from, String to) {
        priceFieldFrom = driver.findElement(By.xpath("//*[@id = 'glpricefrom']"));
        priceFieldTo = driver.findElement(By.xpath("//*[@id = 'glpriceto']"));
        priceFieldFrom.sendKeys(from);
        priceFieldTo.sendKeys(to);
    }

    public void setRangeToTwelve() {
        showSmthg = driver.findElement(By.xpath("//button[@class='vLDMf']"));
        showSmthg.click();
        showTwelve = driver.findElement(By.xpath("//button[@class='_1KpjX _35Paz']"));
        showTwelve.click();
    }

    public void searchFirstOne() {
        searchField = driver.findElement(By.xpath("//input[@id='header-search']"));
        searchButton = driver.findElement(By.xpath("//span[contains(text(),'Найти')]"));
        searchField.sendKeys(results.get(0).getText());
        searchButton.click();
    }

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
