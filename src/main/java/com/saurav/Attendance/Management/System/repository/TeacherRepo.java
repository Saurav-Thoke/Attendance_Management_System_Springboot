package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    Teacher findByEmail(String email);
}
