package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.repository.AttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttendanceServiceImpl implements AttendanceService{
    @Autowired
    private AttendanceRepo attendanceRepo;
    @Override
    public List<Attendance> listAllAttendance(Student student) {
        return null;
    }

    @Override
    public Attendance getById(long id) throws Exception {
        return attendanceRepo.findById(id).orElseThrow(()->new Exception("Attendance not found"));
    }

    @Override
    public void updateAttendance(long id, Attendance attendance) {

    }

    @Override
    public void deleteAttendance(long id) {
        attendanceRepo.deleteById(id);

    }

    @Override
    public long countAttendance(Student enroll) {
        return 0;
    }

    @Override
    public List<Attendance> listAllAttendanceFromUserBetweenDate(Student student, String startDate, String endDate) {
        return null;
    }
}
