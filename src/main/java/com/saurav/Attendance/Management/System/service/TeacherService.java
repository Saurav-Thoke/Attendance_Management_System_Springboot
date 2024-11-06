package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    Teacher findByEmail(String email);
    List<Teacher> getAllTeachers();
    void deleteTeacher(Long id);
    void updateStudent(Long id,Teacher teacher);
}
