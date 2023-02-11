package co.com.certificacion.choucair.models;

public class meeting {

    private String meetName;
    private String meetNumer;
    private String meetType;
    private String meetLocation;
    private String meetUnit;
    private String meetOrganized;
    private String meetReporter;
    private String attendees;
    private String meetStartDate;
    private String meetStartTime;
    private String meetEndDate ;
    private String meetEndTime ;

    public String getMeetName() {
        return meetName;
    }

    public String getMeetNumer() {
        return meetNumer;
    }

    public String getMeetType() {
        return meetType;
    }

    public String getMeetLocation() {
        return meetLocation;
    }

    public String getMeetUnit() {
        return meetUnit;
    }

    public String getMeetOrganized() {
        return meetOrganized;
    }

    public String getMeetReporter() {
        return meetReporter;
    }

    public String getMeetStartDate() {
        return meetStartDate;
    }

    public String getMeetStartTime() {
        return meetStartTime;
    }

    public String getMeetEndDate() {
        return meetEndDate;
    }

    public String getMeetEndTime() {
        return meetEndTime;
    }

    public String getAttendees() {
        return attendees;
    }



    public meeting(String meetName, String meetNumer, String meetType, String meetLocation, String meetUnit,
                   String meetOrganized, String meetReporter, String meetStartDate, String meetStartTime, String meetEndDate, String meetEndTime, String attendees) {
        this.meetName = meetName;
        this.meetNumer = meetNumer;
        this.meetType = meetType;
        this.meetLocation = meetLocation;
        this.meetUnit = meetUnit;
        this.meetOrganized = meetOrganized;
        this.meetReporter = meetReporter;
        this.meetStartDate = meetStartDate;
        this.meetStartTime = meetStartTime;
        this.meetEndDate = meetEndDate;
        this.meetEndTime = meetEndTime;
        this.attendees = attendees;
    }


}
