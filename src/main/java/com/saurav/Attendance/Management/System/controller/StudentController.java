package com.saurav.Attendance.Management.System.controller;

import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.repository.StudentRepo;
import com.saurav.Attendance.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @PostMapping("/student/add")
    public Student addStudent(@RequestBody Student student)
    {
        Student student1=new Student();
        student1.setFullName(student.getFullName());
        student1.setEmail(student.getEmail());
        student1.setEnroll(student.getEnroll());
        student1.setMobile(student.getMobile());
        student1.setCourse(student.getCourse());
        student1.setClassName(student.getClassName());
        student1.setAddress(student.getAddress());
        student1.setGender(student.getGender());

        return studentService.addStudent(student1);

    }

    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }

    @GetMapping("/student/enroll/{enroll}")
    public Student getById(@PathVariable String enroll) throws Exception {
        return studentService.getStudentById(enroll);
    }

    @DeleteMapping("/student/delete/{enroll}")
    public void deleteStudent(@PathVariable String enroll)
    {
        studentService.deleteStudent(enroll);
    }
}
