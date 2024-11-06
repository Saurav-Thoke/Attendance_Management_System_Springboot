package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AttendanceRepo extends JpaRepository<Attendance,Long> {

    @Query(value = "SELECT COUNT(a) FROM Attendance a WHERE a.user IN :userId")
    public long countAttendance(@Param("userId") Student student);
}
