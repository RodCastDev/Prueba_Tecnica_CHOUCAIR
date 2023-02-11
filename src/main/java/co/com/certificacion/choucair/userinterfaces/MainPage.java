package co.com.certificacion.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class MainPage extends PageObject {

    public static final Target headerPage = Target.the("texto_a_validar").locatedBy("//*[@class='content-header']/h1");
    public static final Target iconLanguage = Target.the("iconoIdioma").locatedBy("//i[@class='s-sidebar-band-icon fa fa-language']");

    public static Target seccionIdioma(String Idioma){
        String str_idioma = "//div[contains(@class,'dropdown dropend')]//li //*[contains(text(),'"+Idioma+"')]";
        return Target.the("Opcion Idioma").locatedBy(str_idioma);
    }
    public static Target languageHeader(String texto){
        String str_Header = "//section//*[contains(text(),'"+texto+"')]";
        return Target.the("Idioma_del_titulo").locatedBy(str_Header);
    }

    public static final Target meetingMenu = Target.the("boton_MenuReuniones").locatedBy("//span[text()='Meeting']");
    public static final Target meetingSubMenu = Target.the("boton_SubReuniones").locatedBy("//span[text()='Meetings']");

}
