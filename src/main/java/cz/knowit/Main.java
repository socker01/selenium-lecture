package cz.knowit;

import cz.knowit.selenium.Driver;
import org.openqa.selenium.WebDriver;

public class Main
{
    public static void main(String[] args)
    {
        Driver driver = new Driver();
        WebDriver webDriver = driver.getWebDriver();
    }
}