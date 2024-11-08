package com.saurav.Attendance.Management.System.controller;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    @GetMapping("/attendance/{enroll}")
    public List<Attendance> getAttendanceByEnroll(@PathVariable String enroll) throws Exception {
        return attendanceService.getByEnroll(enroll);
    }

    @DeleteMapping("/attendance/delete/{id}")
    public void deleteAttendance(@PathVariable Long id)
    {
        attendanceService.deleteAttendance(id);
    }

}
