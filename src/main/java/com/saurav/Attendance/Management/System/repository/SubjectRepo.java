package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepo extends JpaRepository<Subject,Long> {
    Subject findByName(String name);
}
