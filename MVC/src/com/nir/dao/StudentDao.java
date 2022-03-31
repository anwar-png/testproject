package com.nir.dao;

import java.util.ArrayList;

public interface StudentDao 
{
public ArrayList<Student> getStudentData() throws Exception;
public int insertStudent(Student s) throws Exception;
}
