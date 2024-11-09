package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student,String> {
    Optional<Student> findByEmail(String email);

    List<Student> findByClassName(String className);
}
