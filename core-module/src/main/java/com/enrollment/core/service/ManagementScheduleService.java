package com.enrollment.core.service;

import com.enrollment.core.repository.AcademicRepository;
import com.enrollment.core.validation.ScheduleValidator;
import com.enrollment.domain.Schedule;
import com.enrollment.dto.ScheduleAssignmentDTO;

import java.util.List;
import java.util.UUID;

public class ManagementScheduleService implements ScheduleService {
    private final AcademicRepository repository;
    private final List<ScheduleValidator> validators;

    public ManagementScheduleService(AcademicRepository repository, List<ScheduleValidator> validators) {
        this.repository = repository;
        this.validators = validators;
    }

    @Override
    public void createSchedule(ScheduleAssignmentDTO dto) {
        Schedule newSchedule = new Schedule(
            UUID.randomUUID().toString(),
            dto.getSectionId(),
            dto.getRoomId(),
            dto.getFacultyId(),
            dto.getSubjectId(),
            dto.getDay(),
            dto.getTime()
        );

        
        for (ScheduleValidator validator : validators) {
            validator.validate(newSchedule);
        }

        repository.saveSchedule(newSchedule);
    }
}