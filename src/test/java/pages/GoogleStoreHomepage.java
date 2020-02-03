package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GoogleStoreHomepage {

    WebDriver driver;


    public GoogleStoreHomepage(){

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class='mqn2-axn']")
    public List<WebElement> products;

    @FindBy(xpath = "(//button[@class='button primary transaction bigger-btn'])[1]")
    public WebElement buyButton;

    @FindBy(xpath = "(//div[@class='slick-track']/div//button[.='Add to cart'])[1]")
    public WebElement firstProductOption;

    @FindBy(xpath = "(//div[@class='cart-items-row']//a)[2]")
    public WebElement cartProduct;

}
