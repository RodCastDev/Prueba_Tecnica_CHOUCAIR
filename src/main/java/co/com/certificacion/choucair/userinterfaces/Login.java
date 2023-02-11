package co.com.certificacion.choucair.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target nameIn = Target.the("nameIn").locatedBy("//input[@id='LoginPanel0_Username']");
    public static final Target passIn = Target.the("passIn").locatedBy("//input[@id='LoginPanel0_Password']");
    public static final Target buttonEnter = Target.the("buttonEnter").located(By.id("LoginPanel0_LoginButton"));
    public static final Target banner_InvalidLogin = Target.the("bannerInvalidLogin").locatedBy(".toast.toast-error");

}
