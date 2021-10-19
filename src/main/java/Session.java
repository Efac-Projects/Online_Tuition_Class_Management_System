public class Session {
    private String Date;
    private  String TimeRange;

    public Session(String date, String timeRange) {
        Date = date;
        TimeRange = timeRange;
    }

    public String getDate() {
        return Date;
    }

    public String getTimeRange() {
        return TimeRange;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTimeRange(String timeRange) {
        TimeRange = timeRange;
    }
}


