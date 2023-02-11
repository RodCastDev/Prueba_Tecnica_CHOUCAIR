package co.com.certificacion.choucair.tasks;

import co.com.certificacion.choucair.userinterfaces.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import java.util.Arrays;
import java.util.List;

public class AddNewMeeting implements Task {

    private String meetName;
    private String meetNumer;
    private String meetType;
    private String meetLocation;
    private String meetUnit;
    private String meetOrganized;
    private String meetReporter;
    private String meetStartDate;
    private String meetStartTime;
    private String meetEndDate ;
    private String meetEndTime ;
    private String attendees;

    public AddNewMeeting(String meetName, String meetNumer, String meetType, String meetLocation, String meetUnit, String meetOrganized,
                         String meetReporter, String meetStartDate, String meetmeetStartTime, String meetEndDate, String meetEndTime,String attendees) {
        this.meetName = meetName;
        this.meetNumer = meetNumer;
        this.meetType = meetType;
        this.meetLocation = meetLocation;
        this.meetUnit = meetUnit;
        this.meetOrganized = meetOrganized;
        this.meetReporter = meetReporter;
        this.meetStartDate = meetStartDate;
        this.meetStartTime = meetmeetStartTime;
        this.meetEndDate = meetEndDate;
        this.meetEndTime = meetEndTime;
        this.attendees = attendees;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(MeetingPage.newMeetingButton));

        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_meetName,meetName));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_meetNumber,meetNumer));

        actor.attemptsTo(Click.on(MeetingPage.form_meetType));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputMeetType,meetType),new SendKeysIntoTarget(MeetingPage.form_inputMeetType,Keys.ENTER));

        actor.attemptsTo(Click.on(MeetingPage.form_meetLocation));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputMeetLocation,meetLocation), new SendKeysIntoTarget(MeetingPage.form_inputMeetLocation,Keys.ENTER));

        actor.attemptsTo(Click.on(MeetingPage.form_meetUnit));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputMeetUnit,meetUnit),new SendKeysIntoTarget(MeetingPage.form_inputMeetUnit,Keys.ENTER));

        actor.attemptsTo(Click.on(MeetingPage.form_meetOrganized));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputMeetOrganized,meetOrganized),new SendKeysIntoTarget(MeetingPage.form_inputMeetOrganized, Keys.ENTER));

        actor.attemptsTo(Click.on(MeetingPage.form_meetReporter));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputmeetReporter,meetReporter), new SendKeysIntoTarget(MeetingPage.form_inputmeetReporter, Keys.ENTER));

        List<String> attendeeList = Arrays.asList(attendees.split(","));
        for (String attendee: attendeeList) {
            actor.attemptsTo(Click.on(MeetingPage.form_meetAttendeeList));
            actor.attemptsTo(WaitUntil.the(MeetingPage.form_inputMeetAttendeeList, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
            actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_inputMeetAttendeeList,attendee), new SendKeysIntoTarget(MeetingPage.form_inputMeetAttendeeList, Keys.ENTER));

        }

        actor.attemptsTo(Click.on(MeetingPage.form_meetStartDate), Clear.field(MeetingPage.form_meetStartDate),  new SendKeysIntoTarget(MeetingPage.form_meetStartDate,meetStartDate));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_meetStartTime,meetStartTime));
        actor.attemptsTo(Click.on(MeetingPage.form_meetEndDate),Clear.field(MeetingPage.form_meetEndDate), new SendKeysIntoTarget(MeetingPage.form_meetEndDate,meetEndDate));
        actor.attemptsTo(new SendKeysIntoTarget(MeetingPage.form_meetEndTime,meetEndTime));

        actor.attemptsTo(Click.on(MeetingPage.buttonSave));
    }
    public static AddNewMeeting addNewMeeting (String Name, String Number, String Type, String Location,
                                               String Unit, String Organized, String Reporter, String StDate,
                                               String StTime, String EnDate, String EnTime, String attendees){
        return Tasks.instrumented(AddNewMeeting.class,Name, Number, Type, Location , Unit ,Organized,Reporter,StDate,StTime,EnDate,EnTime,attendees);
    }
}
