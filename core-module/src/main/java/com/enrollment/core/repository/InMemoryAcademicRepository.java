package com.enrollment.core.repository;

import com.enrollment.domain.Course;
import com.enrollment.domain.Faculty;
import com.enrollment.domain.Room;
import com.enrollment.domain.Schedule;
import com.enrollment.domain.Section;
import com.enrollment.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAcademicRepository implements AcademicRepository {

    private final List<Student> students = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();
    private final List<Section> sections = new ArrayList<>();
    private final List<Faculty> faculties = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Schedule> schedules = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void addSection(Section section) {
        sections.add(section);
    }

    @Override
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public List<Section> getSections() {
        return sections;
    }

    @Override
    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public List<Schedule> getSchedules() {
        return schedules;
    }

    @Override
    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Section findSectionById(String sectionId) {
        for (Section section : sections) {
            if (section.getSectionId().equals(sectionId)) {
                return section;
            }
        }
        return null;
    }
}