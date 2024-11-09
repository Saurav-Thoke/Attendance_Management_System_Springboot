package com.saurav.Attendance.Management.System.controller;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @PostMapping("/attendance/mark")
    public void markAttendance(@RequestParam String enroll, @RequestParam boolean isPresent) {
        attendanceService.markAttendance(enroll, isPresent);
    }

    @GetMapping("attendance/{className}")
    public List<Attendance> showClassAttendance(@PathVariable String cname) {
        return attendanceService.listAllAttendanceByClass(cname);

    }
    @PutMapping("/attendance/update")
    public ResponseEntity<String> updateAttendance(@RequestParam Long attendanceId,@RequestParam LocalDate date,@RequestParam boolean isPresent)
    {
        attendanceService.updateAttendance(attendanceId,date,isPresent);
        return ResponseEntity.ok("Attendance Updated Successfully");
    }

    @GetMapping("/count/{enroll}")
    public long countAttendance(@PathVariable String enroll) {
        return attendanceService.countAttendance(enroll);
    }

}
