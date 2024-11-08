package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeacherService {
    Teacher findByEmail(String email) throws Exception;
    Teacher addTeacher(Teacher teacher);
    Teacher getTeacherById(Long id);
    List<Teacher> getAllTeachers();
    void deleteTeacher(Long id) throws Exception;
    Teacher updateTeacher(Teacher teacher);
}
