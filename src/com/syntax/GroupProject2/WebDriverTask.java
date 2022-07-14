package com.syntax.GroupProject2;

public interface WebDriverTask {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriverTask{
    @Override
    public void openBrowser() {
        System.out.println("Opens Google Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes the Google Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizes the Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("Presses the search button");
    }
}
class FirefoxDriver implements WebDriverTask{
    @Override
    public void openBrowser() {
        System.out.println("Opens the Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes the Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizes the Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Opens a new tab");
    }

    public static void main(String[] args) {
        WebDriverTask[] browsers={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriverTask browser:browsers){
            browser.openBrowser();
            browser.closeBrowser();
            browser.maximizeWindow();
            browser.findElement();
        }
    }
}