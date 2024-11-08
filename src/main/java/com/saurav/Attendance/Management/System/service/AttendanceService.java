package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface AttendanceService {
    List<Attendance> getByEnroll(String enroll) throws Exception;
    Attendance updateAttendance(Long attendanceId, LocalDate date, boolean isPresent);
    void deleteAttendance(Long id);
    long countAttendance(String enroll);
    void markAttendance(Student student, boolean present);
    List<Attendance> listAllAttendanceByClass(String cname);
    //List<Attendance> listAllAttendanceFromUserBetweenDate(Student student, String startDate, String endDate);

}
