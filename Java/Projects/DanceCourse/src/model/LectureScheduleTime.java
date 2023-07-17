package model;

import java.time.DayOfWeek;

public class LectureScheduleTime {

    private Day day;

    private String time;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LectureScheduleTime{" +
                "day=" + day +
                ", time='" + time + '\'' +
                '}';
    }
}
