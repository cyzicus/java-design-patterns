package com.cyzicus.mvc.controller;

import com.cyzicus.mvc.model.Student;
import com.cyzicus.mvc.view.StudentView;

public class StudentController {

    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void printStudentInfo() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
