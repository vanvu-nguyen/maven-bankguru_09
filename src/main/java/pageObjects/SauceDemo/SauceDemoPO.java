package pageObjects.SauceDemo;

import AdminPageUIs.SauceDemoPUI;
import commons.BaseAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SauceDemoPO extends BaseAction {
    WebDriver driver;

    public SauceDemoPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void clickToSortAtoZ() {
        waitForElementClickable(driver, SauceDemoPUI.SORT_FILTER);
        selectItemInDefaultDropdown(driver, SauceDemoPUI.SORT_FILTER, "Name (A to Z)");
    }

    public boolean isProductListSortAtoZ() {
        List<WebElement> listProductElementSortedBySystem = getListElement(driver, SauceDemoPUI.PRODUCT_LIST_BY_NAME);
        ArrayList<String> listProductNameSortedBySystem = new ArrayList<>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductNameSortedBySystem.add(productElement.getText());
        }
        System.out.println(listProductNameSortedBySystem);
        ArrayList<String> listProductNameSortedByUser = new ArrayList<>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductNameSortedByUser.add(productElement.getText());
        }
        Collections.sort(listProductNameSortedByUser);
        System.out.println(listProductNameSortedByUser);
        return listProductNameSortedBySystem.equals(listProductNameSortedByUser);
    }

    public void clickToSortZtoA() {
        waitForElementClickable(driver, SauceDemoPUI.SORT_FILTER);
        selectItemInDefaultDropdown(driver, SauceDemoPUI.SORT_FILTER, "Name (Z to A)");
    }

    public boolean isProductListSortZtoA() {
        List<WebElement> listProductElementSortedBySystem = getListElement(driver, SauceDemoPUI.PRODUCT_LIST_BY_NAME);
        ArrayList<String> listProductNameSortedBySystem = new ArrayList<>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductNameSortedBySystem.add(productElement.getText());
        }
        System.out.println(listProductNameSortedBySystem);
        ArrayList<String> listProductNameSortedByUser = new ArrayList<>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductNameSortedByUser.add(productElement.getText());
        }
        Collections.sort(listProductNameSortedByUser);
        Collections.reverse(listProductNameSortedByUser);
        System.out.println(listProductNameSortedByUser);
        return listProductNameSortedBySystem.equals(listProductNameSortedByUser);

    }

    public void clickToSortLowToHigh() {
        waitForElementClickable(driver, SauceDemoPUI.SORT_FILTER);
        selectItemInDefaultDropdown(driver, SauceDemoPUI.SORT_FILTER, "Price (low to high)");
    }

    public boolean isProductListSortLowtoHigh() {
        List<WebElement> listProductElementSortedBySystem = getListElement(driver, SauceDemoPUI.PRODUCT_LIST_BY_PRICE);
        ArrayList<Float> listProductPriceSortedBySystem = new ArrayList<Float>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductPriceSortedBySystem.add(Float.parseFloat(productElement.getText().replace("$", "").trim()));
        }
        System.out.println(listProductPriceSortedBySystem);
        ArrayList<Float> listProductPriceSortedByUser = new ArrayList<Float>();
        for (WebElement productElement: listProductElementSortedBySystem) {
            listProductPriceSortedByUser.add(Float.parseFloat(productElement.getText().replace("$", "")));
        }
        Collections.sort(listProductPriceSortedByUser);
        System.out.println(listProductPriceSortedByUser);
        return listProductPriceSortedBySystem.equals(listProductPriceSortedByUser);
    }
}
