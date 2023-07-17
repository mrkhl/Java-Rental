package om.gov.omantax.entity;

public class Date {
    private String startDateAndTime;
    private  String endDateAndTime;

    public Date(String startDateAndTime, String endDateAndTime) {
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
    }

    @Override
    public String toString() {
        return "Date{" +
                "startDateAndTime='" + startDateAndTime + '\'' +
                ", endDateAndTime='" + endDateAndTime + '\'' +
                '}';
    }

    public String getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(String startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public String getEndDateAndTime() {
        return endDateAndTime;
    }

    public void setEndDateAndTime(String endDateAndTime) {
        this.endDateAndTime = endDateAndTime;
    }
}
