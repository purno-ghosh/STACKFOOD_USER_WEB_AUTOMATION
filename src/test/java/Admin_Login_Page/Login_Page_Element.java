package Admin_Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login_Page_Element {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='signinSrEmail']")
WebElement emailfld;

    @FindBy(xpath = "//input[contains(@id,'signupSrPassword')]")
    WebElement passfld;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'login')]")
    WebElement logbtn;


//    @FindBy(xpath = "//button[@type='submit'][contains(.,'login')]")
//    WebElement LoginBTN;
//    @FindBy(xpath = "//button[@class='btn btn-sm btn-secondary'][contains(.,'End tour')]")
//    WebElement End_tour;
//    @FindBy(xpath = "//a[contains(.,'Users')]")
//    WebElement Usermod;


    public Login_Page_Element(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Login_With_Valid_user(String email, String password) throws IOException, ParseException, InterruptedException {
        emailfld.sendKeys(email);
        passfld.sendKeys(password);
        logbtn.click();

        //        LoginBTN.click();
//        End_tour.click();
//        Usermod.click();
//        Thread.sleep(2000);
//        System.out.println(email);
//        System.out.println(password);

        return null;
    }
}
