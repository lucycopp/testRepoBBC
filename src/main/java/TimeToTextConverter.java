import java.time.LocalTime;

public class TimeToTextConverter {
    public String getTimeAsString(LocalTime time) {
        if (time.getHour() == 0 && time.getMinute() == 0) {
            return "midnight";
        }
        else if (time.getHour() == 12 && time.getMinute() == 0) {
            return "midday";
        }
        else return null;

    }
}
