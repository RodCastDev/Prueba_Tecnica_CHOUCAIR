package co.com.certificacion.choucair.stepdefinitions;

import co.com.certificacion.choucair.questions.ValidateLogin;
import co.com.certificacion.choucair.tasks.*;
import co.com.certificacion.choucair.userinterfaces.Login;
import co.com.certificacion.choucair.userinterfaces.MainPage;
import co.com.certificacion.choucair.questions.*;
import co.com.certificacion.choucair.userinterfaces.MeetingPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.com.certificacion.choucair.models.meeting;

import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class StepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("Deseo ir a la pagina demo.serenity")
    public void deseoIrALaPaginaDemoSerenity() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://serenity.is/demo/"));
    }
    @And("^ingreso con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void ingreso_con_usuario_something_y_contrasea_something(String nameUser, String passUser) throws Throwable {
        theActorInTheSpotlight().attemptsTo(LoginData.sendData(nameUser,passUser));
    }
    @Then("valido que se habilite el panel de instrumentos")
    public void validoQueSeHabiliteElPanelDeInstrumentos() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.getText(MainPage.headerPage), is("Dashboard")));
    }

    @When("^selecciono el idioma deseado (.+)$")
    public void selecciono_el_idioma_deseado(String idioma) throws Throwable {
        theActorInTheSpotlight().attemptsTo(Language.selecIdiom(MainPage.seccionIdioma(idioma)));
    }
    @Then("^valido que el idioma seleccionado sea (.+)$")
    public void valido_que_el_idioma_seleccionado_sea(String texto) throws Throwable {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.getText(MainPage.languageHeader(texto))));
    }

    @When("voy la pagina de Meetings")
    public void voyLaPaginaDeMeetings() {
        theActorInTheSpotlight().attemptsTo(selecMenu.selecMeeting());
    }

    @When("creo una nueva reunion, llenando los datos del formulario")
    public void creoUnaNuevaReunionLlenandoLosDatosDelFormulario(meeting infoMeeting) {
        theActorInTheSpotlight().attemptsTo(AddNewMeeting.addNewMeeting(infoMeeting.getMeetName(),infoMeeting.getMeetNumer(),
                infoMeeting.getMeetType(),infoMeeting.getMeetLocation(),infoMeeting.getMeetUnit(),infoMeeting.getMeetOrganized(),
                infoMeeting.getMeetReporter(),infoMeeting.getMeetStartDate(),infoMeeting.getMeetStartTime(),infoMeeting.getMeetEndDate(),
                infoMeeting.getMeetEndTime(), infoMeeting.getAttendees()));
    }

    @Then("valido la creacion de la reunion {string}")
    public void validoLaCreacionDeLaReunion(String nameMeet) {
        theActorInTheSpotlight().should(seeThat(ValidateNewMeet.getNewMeeting(MeetingPage.NameNewMeet(nameMeet))));
    }

    @When("ingreso con credenciales invalidas usuario {string} y contraseña {string}")
    public void ingresoConCredencialesInvalidasUsuarioYContraseña(String nameUser, String passUser) {
        theActorInTheSpotlight().attemptsTo(LoginData.sendData(nameUser,passUser));
    }

    @Then("valido que el Login sea fallido")
    public void validoQueElLoginSeaFallido() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.getText(Login.banner_InvalidLogin), is("Invalid username or password!")));
    }


}
