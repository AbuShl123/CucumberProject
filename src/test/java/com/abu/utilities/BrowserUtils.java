package com.abu.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public final class BrowserUtils {
    private BrowserUtils(){}

    public static void sleep(long sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ignored) {}
    }

    /**
     * This method will accept a list of webElements and return its text
     * as a new List of Strings
     * @param elements List<WebElements>
     * @return List<String>
     */
    public static List<String> getTextsOf(List<WebElement> elements){
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    /**
     * This method will accept dropdown as a webElement
     * and return all the options' text in a List of Strings
     * @param select Select
     * @return List<String>
     */
    public static List<String> getTextsOf(Select select){
        return select.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
