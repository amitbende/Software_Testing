package Date_Picker;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.booking.com/");

        Thread.sleep(2000);

        // Close the popup if it's present
        try {
            WebElement popupCloseButton = driver.findElement(By.cssSelector(".modal-mask-closeBtn"));
            if (popupCloseButton.isDisplayed()) {
                popupCloseButton.click();
            }
        } catch (Exception e) {
            // Popup not found, continue
        }

        // Click on the Check-in Date field
        driver.findElement(By.cssSelector(".sb-date-field__input.-checkout.-empty")).click();

        // Set the expected checkout month and day
        String expectedCheckoutMonth = "November 2023";
        String expectedCheckoutDay = "20";

        // Wait for the calendar to load
        Thread.sleep(2000);

        // Loop to navigate through the months
        while (true) {
            String actualMonthYear = driver.findElement(By.cssSelector(".bui-calendar__month")).getText();
            if (expectedCheckoutMonth.equals(actualMonthYear)) {
                break;
            } else {
                driver.findElement(By.cssSelector(".bui-calendar__control--next")).click();
                Thread.sleep(1000); // Wait for calendar update
            }
        }

        // Select the checkout day
        List<WebElement> checkoutDates = driver.findElements(By.cssSelector(".bui-calendar__date"));
        for (WebElement date : checkoutDates) {
            if (date.getText().equals(expectedCheckoutDay)) {
                date.click();
                break;
            }
        }

        // Close the browser after use
        driver.quit();
    }
}
