package co.com.certificacion.choucair.tasks;

import co.com.certificacion.choucair.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginData implements Task {

    private String userName;
    private String password;

    public LoginData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(Login.nameIn),
                Enter.theValue(password).into(Login.passIn),
                Click.on(Login.buttonEnter));

    }
    public static LoginData sendData (String userName, String password ){
        return Tasks.instrumented(LoginData.class, userName, password);
    }
}
