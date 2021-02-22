package com.telran.cheaptrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPageHelper extends PageBase {

    private static final String TRIP_PANEL_XPATH = "/hierarchy" +
            "/android.widget.FrameLayout" +
            "/android.widget.LinearLayout" +
            "/android.widget.FrameLayout" +
            "/android.widget.LinearLayout" +
            "/android.widget.FrameLayout" +
            "/android.view.ViewGroup" +
            "/android.webkit.WebView" +
            "/android.webkit.WebView" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View[3]" +
            "/android.view.View[2]" +
            "/android.view.View";

    public MainPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement fromLine;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement submitCityFrom;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement toLine;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.widget.Button")
    WebElement submitCityTo;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[3]" +
            "/android.view.View[2]" +
            "/android.view.View")
    WebElement letsGoButton;

    @FindBy(xpath = "/hierarchy" +
            "/android.widget.FrameLayout" +
            "/android.widget.LinearLayout" +
            "/android.widget.FrameLayout" +
            "/android.widget.LinearLayout" +
            "/android.widget.FrameLayout" +
            "/android.view.ViewGroup" +
            "/android.webkit.WebView" +
            "/android.webkit.WebView" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.widget.ListView" +
            "/android.widget.Button")
    WebElement selectLanguage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]")
    WebElement russianLanguage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View")
    List<WebElement> languageList;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ListView/android.widget.Button")
    WebElement selectCurrency;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[26]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.RadioButton/android.widget.Button")
    WebElement rub;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View")
    List<WebElement> currencyList;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    WebElement title;


    public void fillInFromTypeForm(String textInput) {
        fromLine.click();
        inputTextToField(fromLine, textInput);
        waitUntilElementVisible(submitCityFrom, 5);
        submitCityFrom.click();
    }


    public void fillInToTypeForm(String textInput) {
        toLine.click();
        inputTextToField(toLine, textInput);
        waitUntilElementVisible(submitCityTo, 5);
        submitCityTo.click();
    }

    public void clickOnLetsGoButton() {
        letsGoButton.click();
    }

    public void selectRussianLanguage() {
        selectLanguage.click();
        waitUntilElementVisible(russianLanguage, 5);
        languageList.get(1).click();
    }

    public void selectRubCurrency() {
        selectCurrency.click();
        waitUntilElementVisible(rub, 3);
        currencyList.get(26).click();
    }

    public boolean isLanguageOnPageRussian(String text) {
        return title.getText().contains(text);
    }


}
