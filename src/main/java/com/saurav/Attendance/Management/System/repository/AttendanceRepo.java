package com.saurav.Attendance.Management.System.repository;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepo extends JpaRepository<Attendance,Long> {
    @Query(value = "SELECT a from Attendance a WHERE a.student.enroll = :enroll")
    List<Attendance> findByEnroll(String enroll);

    @Query(value = "SELECT a from Attendance a WHERE a.student.enroll = :enroll AND a.attendanceDate =:attendanceDate")
    Attendance findByStudentIdAndDate(@Param("enroll") String enroll,@Param("attendanceDate") LocalDate attendanceDate);

    @Query(value = "SELECT COUNT(a) FROM Attendance a WHERE a.student.enroll =:enroll AND a.isPresent=true")
    long countAttendance(@Param("enroll") String enroll);

    @Query(value = "SELECT a from Attendance a WHERE a.className =:cname")
    List<Attendance> listAllAttendanceByClass(@Param("cname") String cname);
}
