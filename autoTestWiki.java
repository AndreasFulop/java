import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.junit.jupiter.api.*;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class autoTestWiki {
    private static WebDriver driver;
    private final String URL = "https://www.wikipedia.org/";
  
    WebDriverWait wait;
  
    @BeforeAll
    static void setDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @BeforeEach
    void setWebDriver(){
        driver = new ChromeDriver();
    }

    public void loginWikipedia () {
        driver.get(URL);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-link-box-en")));
        WebElement englishLanguage = driver.findElement(By.id("js-link-box-en"));
        englishLanguage.click();
       }

    @DisplayName("Can I find the Selenium page?")
    @Test
    public void testWikiSelenium() {
        loginWikipedia();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).click();
        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.name("go"));
        searchButton.click();
        assertEquals("https://en.wikipedia.org/wiki/Selenium",driver.getCurrentUrl() );
    }

    @DisplayName("Can I find the Selenium (software) page?")
    @Test
    public void testWikiSeleniumSoftware() {
        loginWikipedia();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement softwareSelenium = driver.findElement(By.linkText("Selenium (software)"));
        softwareSelenium.click();
        String currentURLWithProvenance = driver.getCurrentUrl();
        String[] currentURLWithoutProvenance = new String[10];
        if (currentURLWithProvenance.contains(", ?@")) {
            currentURLWithoutProvenance = currentURLWithProvenance.split(", ?@");
        } else {
            currentURLWithoutProvenance[0] = currentURLWithProvenance;
        }
        assertEquals("https://en.wikipedia.org/wiki/Selenium_(software)",currentURLWithoutProvenance[0]);
    }

@DisplayName("Re-set the font-style")
@RepeatedTest(1)
    public void testWikiFontChanging() throws InterruptedException {
    loginWikipedia();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p-lang\"]/button"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='uls-display-settings-fonts-tab']"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"languagesettings-settings-panel\"]/div/div[3]/div[3]/div/div/label"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content-font-selector"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content-font-selector > option:nth-child(1)"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Did_you_know_..."))).click();
    sleep(2000);
    String actualFontTypeFull = driver.findElement(By.id("Did_you_know_...")).getCssValue("font-family");
    actualFontTypeFull = actualFontTypeFull.replaceAll(",", "");
    String[] actualFontType = actualFontTypeFull.split(" ");
    String expected = "ComicNeue";
    Assertions.assertEquals(expected, actualFontType[0]);
}

    @DisplayName("Are there something about Seleniuim Grid in the page Selenium (software)?")
    @Test
    public void testWikiSeleniumGrid() {
        boolean isSeleniumGrid = false;
        loginWikipedia();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).click();
        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement softwareSelenium = driver.findElement(By.linkText("Selenium (software)"));
        softwareSelenium.click();
        List<WebElement> allIds = driver.findElements((By.id("Selenium Grid")));
        allIds.addAll(driver.findElements(By.id("Selenium_Grid")));
        allIds.addAll(driver.findElements(By.id("SeleniumGrid")));
        allIds.addAll(driver.findElements(By.id("Selenium-Grid")));
        allIds.addAll(driver.findElements(By.id("selenium-grid")));
        try {
            for (WebElement i : allIds) {
                isSeleniumGrid = true;
                System.out.println("There is a good ID");
            }
        } catch (Exception e) {System.out.println("There are no useful IDs");}
        finally{
            List<WebElement> allElements = driver.findElements(By.xpath("//*"));
            for (WebElement j : allElements) {
                if (j.getText().contains("Selenium Grid")) {
                    isSeleniumGrid = true;
                    System.out.println("\"Selenium Grid\" is in the text");
                    break;
                }
            }

        }
        assertTrue(isSeleniumGrid);
    }

    @AfterEach
    public void testWikiQuit() {
        driver.quit();
    }
}
