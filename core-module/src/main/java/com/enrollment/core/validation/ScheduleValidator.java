package com.enrollment.core.validation;

import com.enrollment.domain.Schedule;

public interface ScheduleValidator {
    void validate(Schedule newSchedule);
}