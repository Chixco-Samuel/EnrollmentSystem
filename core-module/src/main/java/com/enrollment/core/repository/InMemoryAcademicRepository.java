package com.enrollment.core.repository;

import com.enrollment.domain.Schedule;
import com.enrollment.domain.Grade;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAcademicRepository implements AcademicRepository {
    // Extensive use of List collections to store data records
    private final List<Schedule> schedules = new ArrayList<>();
    private final List<Grade> grades = new ArrayList<>();

    @Override
    public void saveSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    @Override
    public List<Schedule> getAllSchedules() {
        // Returns a copy of the list to preserve data encapsulation
        return new ArrayList<>(schedules);
    }

    @Override
    public void saveGrade(Grade grade) {
        grades.add(grade);
    }
}