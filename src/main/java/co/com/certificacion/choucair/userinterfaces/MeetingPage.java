package co.com.certificacion.choucair.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;


public class MeetingPage extends PageObject {

    public static final Target newMeetingButton = Target.the("nueva_reunion").locatedBy("//span[text()=' New Meeting']");

    public static final Target form_meetName = Target.the("Form-meetName").locatedBy("//input[@name='MeetingName'] ");
    public static final Target form_meetNumber = Target.the("Form-meetNumber").locatedBy("//input[@name='MeetingNumber']");

    public static final Target form_meetType = Target.the("Form-meetType").locatedBy("//div[contains(@class,'MeetingTypeId')]//span[contains(@class, 'select2-chosen')] ");
    public static final Target form_inputMeetType = Target.the("Form-meetType").locatedBy("//*[@class='select2-search']//label[contains(text(),'Meeting Type')]//..//input");

    public static final Target form_meetLocation = Target.the("Form-meetLocation").locatedBy("//div[contains(@class,'LocationId')]//span[contains(@class, 'select2-chosen')]");
    public static final Target form_inputMeetLocation = Target.the("Form-meetLocation").locatedBy("//*[@class='select2-search']//label[contains(text(),'Location')]//..//input");

    public static final Target form_meetUnit = Target.the("Form-meetUnit").locatedBy("//div[contains(@class, 'UnitId')]//span[contains(@class, 'select2-chosen')]");
    public static final Target form_inputMeetUnit = Target.the("Form-meetUnit").locatedBy("//*[@class='select2-search']//label[contains(text(),'Unit')]//..//input");

    public static final Target form_meetOrganized = Target.the("Form-meetOrganized").locatedBy("//div[contains(@class, 'OrganizerContactId')]//span[contains(@class, 'select2-chosen')]");
    public static final Target form_inputMeetOrganized = Target.the("Form-meetOrganized").locatedBy("//*[@class='select2-search']//label[contains(text(),'Organized By')]//..//input");

    public static final Target form_meetReporter = Target.the("Form-meetReporter").locatedBy("//div[contains(@class, 'ReporterContactId')]//span[contains(@class, 'select2-chosen')]");
    public static final Target form_inputmeetReporter = Target.the("Form-meetReporter").locatedBy("//*[@class='select2-search']//label[contains(text(),'Reporter')]//..//input");

    public static final Target form_meetStartDate = Target.the("Form-meetStartDate").locatedBy("//input[@name='StartDate']");
    public static final Target form_meetStartTime = Target.the("Form-meetStartTime").locatedBy(".StartDate>.editor.s-DateTimeEditor.time");
    public static final Target form_meetEndDate = Target.the("Form-meetEndDate").locatedBy("//input[@name='EndDate']");
    public static final Target form_meetEndTime = Target.the("Form-meetEndTime").locatedBy(".EndDate>.editor.s-DateTimeEditor.time ");

    public static final Target form_meetAttendeeList = Target.the("Form-meetAttendeeList").locatedBy("//div[contains(@class, 'AttendeeList')]//span[contains(@class, 'select2-chosen')]");
    public static final Target form_inputMeetAttendeeList = Target.the("Form-meetAttendeeList").locatedBy("//div[@class='select2-search']//input[@id='s2id_autogen12_search']");

    public static final Target buttonSave = Target.the("buttonSave").locatedBy("//span[text()=' Save']");

    public static Target NameNewMeet(String nameMeet){
        String srt_nameMeet = "//div[@class='slick-cell l1 r1']//a[contains(text(),'"+nameMeet+"')]";
        return Target.the("nombre_nueva_reunion").locatedBy(srt_nameMeet);
    }

}
