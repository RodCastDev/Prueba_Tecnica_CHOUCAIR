package co.com.certificacion.choucair.utils;

import co.com.certificacion.choucair.models.meeting;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class dataTableConfig {

    @DataTableType
    public meeting meetingData (Map<String,String > infoMeeting ) throws Throwable{
        return new meeting(
                infoMeeting.get("MeetingName"),
                infoMeeting.get("Number"),
                infoMeeting.get("Type"),
                infoMeeting.get("Location"),
                infoMeeting.get("Unit"),
                infoMeeting.get("OrganizedBy"),
                infoMeeting.get("Reporter"),
                infoMeeting.get("StarDate"),
                infoMeeting.get("StarTime"),
                infoMeeting.get("EndDate"),
                infoMeeting.get("EndTime"),
                infoMeeting.get("Attendee")
                );
    }
}
