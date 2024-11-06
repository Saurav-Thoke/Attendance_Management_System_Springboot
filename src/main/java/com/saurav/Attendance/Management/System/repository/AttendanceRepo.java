package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo extends JpaRepository<Attendance,Long> {
}
