package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttendanceService {
    List<Attendance> listAllAttendance(Student student);

    Attendance getById(long id) throws Exception;
    void updateAttendance(long id, Attendance attendance);
    void deleteAttendance(long id);
    long countAttendance(Student enroll);
    List<Attendance> listAllAttendanceFromUserBetweenDate(Student student, String startDate, String endDate);
}
