package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    Optional<Teacher> findByEmail(String email);
}
