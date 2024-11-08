package com.saurav.Attendance.Management.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "Student_Details")
public class Student {
    @Id
    private String enroll;
    private String email;
    private String fullName;
    private String mobile;
    private String gender;
    private String address;
    private String course;
    private String className;
}
