package co.com.certificacion.choucair.tasks;

import co.com.certificacion.choucair.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class selecMenu implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.meetingMenu));
        actor.attemptsTo(Click.on(MainPage.meetingSubMenu));
    }
    public static selecMenu selecMeeting (){
        return Tasks.instrumented(selecMenu.class);
    }
}
