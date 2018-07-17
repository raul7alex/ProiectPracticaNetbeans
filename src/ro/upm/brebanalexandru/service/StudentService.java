/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upm.brebanalexandru.service;

import java.util.List;
import ro.upm.brebanalexandru.pojo.StudentPojo;

/**
 *
 * @author Practicant
 */
public interface StudentService {

    public List<StudentPojo> getStudentByName();

    public List<StudentPojo> getAllStudents();

    public StudentPojo createStudent(StudentPojo student);

    public StudentPojo findById(Integer Id);

    public void deleteById(Integer studentId);

    public void updateStudent(StudentPojo studentDetails);

}
