package com.syntax.GroupProject2;

public class ChromeD implements TakeScreenshot, RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Chrome navigates to gmail login page");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot of the google search results");
    }
}
class FirefoxD implements WebDriver, RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Firefox navigates to google.com");
    }

    @Override
    public void open() {
        System.out.println("Firefox opens search history");
    }

    @Override
    public void close() {
        System.out.println("Firefox closes the window tab");
    }

    @Override
    public String getTitle() {
        return "Mozilla";
    }
}
class SafariD implements WebDriver,RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Safari navigates to bookmarks");
    }

    @Override
    public void open() {
        System.out.println("Safari opens a new window");
    }

    @Override
    public void close() {
        System.out.println("Safari closes browser");
    }

    @Override
    public String getTitle() {
        return "Apple";
    }
}