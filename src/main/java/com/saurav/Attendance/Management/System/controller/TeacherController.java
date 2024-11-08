package com.saurav.Attendance.Management.System.controller;

import com.saurav.Attendance.Management.System.model.Teacher;
import com.saurav.Attendance.Management.System.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("/teacher/add")
    public void addTeacher(@RequestBody Teacher teacher)
    {
            teacherService.addTeacher(teacher);
    }

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers()
    {
        return teacherService.getAllTeachers();
    }

    @DeleteMapping("/teacher/delete/{id}")
    public void deleteTeacher(@PathVariable Long id) throws Exception {
        teacherService.deleteTeacher(id);
    }

    @PutMapping("/teacher/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.updateTeacher(teacher);
    }

    @GetMapping("/teacher/get/{id}")
    public Teacher getById(@PathVariable Long id)
    {
        return teacherService.getTeacherById(id);
    }
}
