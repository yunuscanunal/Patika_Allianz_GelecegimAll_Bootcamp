package service;

import model.Day;
import model.LectureScheduleTime;

public class LectureScheduleTimeService {


    public LectureScheduleTime createLectureScheduleTime(Day day, String time) {

        LectureScheduleTime lectureScheduleTime = new LectureScheduleTime();
        lectureScheduleTime.setDay(day);
        lectureScheduleTime.setTime(time);

        return lectureScheduleTime;
    }

}
