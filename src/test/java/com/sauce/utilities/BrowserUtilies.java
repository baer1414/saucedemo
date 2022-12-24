package com.sauce.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtilies {


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void executeJScommand(String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript(command);

    }

}
