package co.com.certificacion.choucair.tasks;
import co.com.certificacion.choucair.userinterfaces.Login;
import co.com.certificacion.choucair.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

public class Language implements Task {
    private Target target;

    public Language(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.iconLanguage));
        actor.attemptsTo(MoveMouse.to(target), Click.on(target));
    }
    public static Language selecIdiom (Target target){
        return Tasks.instrumented(Language.class, target);
    }
}

