/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upm.brebanalexandru.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import ro.upm.brebanalexandru.api.BaseApiService;
import ro.upm.brebanalexandru.pojo.StudentPojo;

/**
 *
 * @author Practicant
 */
public class StudentServiceImpl extends BaseApiService implements StudentService{

    @Override
    public List<StudentPojo> getStudentByName() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentPojo> getAllStudents() {
        String studentStr = doGet("student");
        return gson.fromJson(studentStr, new TypeToken<List<StudentPojo>>(){}.getType());
    }

    @Override
    public StudentPojo createStudent(StudentPojo student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentPojo findById(Integer Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Integer studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudent(StudentPojo studentDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
