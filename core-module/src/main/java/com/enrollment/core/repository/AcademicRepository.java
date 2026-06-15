package com.enrollment.core.repository;

import com.enrollment.domain.Course;
import com.enrollment.domain.Faculty;
import com.enrollment.domain.Room;
import com.enrollment.domain.Schedule;
import com.enrollment.domain.Section;
import com.enrollment.domain.Student;

import java.util.List;

public interface AcademicRepository {

    void addStudent(Student student);

    void addCourse(Course course);

    void addSection(Section section);

    void addFaculty(Faculty faculty);

    void addRoom(Room room);

    void addSchedule(Schedule schedule);

    List<Student> getStudents();

    List<Course> getCourses();

    List<Section> getSections();

    List<Faculty> getFaculties();

    List<Room> getRooms();

    List<Schedule> getSchedules();

    Student findStudentById(String studentId);

    Course findCourseByCode(String courseCode);

    Section findSectionById(String sectionId);
}