package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Teacher;
import com.saurav.Attendance.Management.System.repository.TeacherRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;
    @Override
    public Teacher findByEmail(String email) throws Exception{
        Teacher teacher=teacherRepo.findByEmail(email);
        if(teacher==null)
        {
            throw new Exception("Teacher not found with this email");
        }
        return teacher;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepo.findById(id).get();
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepo.findAll();
    }

    @Override
    public void deleteTeacher(Long id) throws Exception {
        Teacher teacher=teacherRepo.findById(id).orElseThrow(()->new Exception("Teacher not found"));
        teacherRepo.delete(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);

    }
}
