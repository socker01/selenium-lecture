package cz.knowit.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

/**
 * WebDriver initializer
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
public final class Driver
{
    private static final String PATH = "src\\main\\resources\\win\\geckodriver.exe";
    private static final String MAC_PATH = "src\\main\\resources\\mac\\geckodriver";

    private final WebDriver webDriver;

    public Driver()
    {
        System.setProperty("webdriver.gecko.driver", PATH);
        this.webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Nonnull
    public WebDriver getWebDriver()
    {
        return webDriver;
    }
}
