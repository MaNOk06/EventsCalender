import java.time.LocalTime;

public interface timelinesEvent {
    void addActivity(String activity, LocalTime startTime, int duration, LocalTime endTime);
    String getTimeline();
}
