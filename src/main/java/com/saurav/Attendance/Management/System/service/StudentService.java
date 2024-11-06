package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student findByEmail(String email);
    List<Student> getAllStudents();
    void deleteStudent(String enroll);
    void updateStudent(String enroll,Student student);
}
