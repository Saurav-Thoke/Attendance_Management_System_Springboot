package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student getStudentById(String enroll) throws Exception{
        Student student=studentRepo.findById(enroll).get();
        if(student==null)
        {
            throw new Exception("Student not found with this enrollment number");
        }
        return student;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteStudent(String enroll) {
        studentRepo.deleteById(enroll);

    }

    @Override
    public Student updateStudent( Student student) {
        return studentRepo.save(student);
    }
}
