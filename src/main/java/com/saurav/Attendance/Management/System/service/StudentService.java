package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    Student getStudentById(String enroll) throws Exception;
    Student addStudent(Student student);
    Student findByEmail(String email);
    List<Student> getAllStudents();
    void deleteStudent(String enroll);
    Student updateStudent(Student student);
}
