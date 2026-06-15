package com.enrollment.core.repository;

import com.enrollment.domain.Schedule;
import com.enrollment.domain.Grade;
import java.util.List;

public interface AcademicRepository {
    void saveSchedule(Schedule schedule);
    List<Schedule> getAllSchedules();
    void saveGrade(Grade grade);
}