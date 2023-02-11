package co.com.certificacion.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateNewMeet implements Question<String> {

    private Target target;

    public ValidateNewMeet(Target target) {
            this.target = target;
        }
        @Override
        public String answeredBy(Actor actor) {
            return Text.of(target).viewedBy(actor).asString();
        }
        public static ValidateNewMeet getNewMeeting (Target target){
            return new ValidateNewMeet(target);
        }
}
