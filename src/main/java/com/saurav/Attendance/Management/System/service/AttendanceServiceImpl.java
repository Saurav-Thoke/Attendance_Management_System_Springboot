package com.saurav.Attendance.Management.System.service;

import com.saurav.Attendance.Management.System.model.Attendance;
import com.saurav.Attendance.Management.System.model.Student;
import com.saurav.Attendance.Management.System.repository.AttendanceRepo;
import com.saurav.Attendance.Management.System.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService{
    @Autowired
    private AttendanceRepo attendanceRepo;

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Attendance> listAllAttendanceByClass(String cname) {

        return attendanceRepo.listAllAttendanceByClass(cname);
    }

    @Override
    public List<Attendance> getByEnroll(String enroll) throws Exception {
        return attendanceRepo.findByEnroll(enroll);
    }

    @Override
    public Attendance updateAttendance(Long attendanceId, LocalDate attendanceDate, boolean isPresent) {
        Attendance atd=attendanceRepo.findById(attendanceId).get();
        String enroll=atd.getStudent().getEnroll();
        Attendance attendanceOptional = attendanceRepo.findByStudentIdAndDate(enroll,attendanceDate);

        if (attendanceOptional!=null) {
            Attendance attendance = attendanceOptional;
            attendance.setIsPresent(isPresent);
            return attendanceRepo.save(attendance);
        }
//        else {
//            Attendance attendance = new Attendance();
//            attendance.setEnroll(studentId);
//            attendance.setAttendanceDate(date);
//            attendance.setIsPresent(isPresent);
//            return attendanceRepo.save(attendance);
//        }
        return new Attendance();
    }
    @Override
    public void deleteAttendance(Long id) {
        attendanceRepo.deleteById(id);

    }


    @Override
    public long countAttendance(String enroll) {

        return attendanceRepo.countAttendance(enroll);
    }

//    @Override
//    public List<Attendance> listAllAttendanceFromUserBetweenDate(Student student, String startDate, String endDate) {
//        return null;
//    }


    @Override
    public void markAttendance(String enroll, boolean present) {

        Attendance attendance = new Attendance();
        Student student=studentRepo.findById(enroll).get();
        attendance.setStudent(student);
        attendance.setAttendanceDate(LocalDate.now());
        attendance.setIsPresent(present);
        attendanceRepo.save(attendance);
    }
}
