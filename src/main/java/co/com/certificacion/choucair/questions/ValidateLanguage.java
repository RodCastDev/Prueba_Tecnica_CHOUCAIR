package co.com.certificacion.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateLanguage implements Question<String> {

    private Target target;

    public ValidateLanguage(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static ValidateLanguage getText(Target target){
        return new ValidateLanguage(target);
    }
}
