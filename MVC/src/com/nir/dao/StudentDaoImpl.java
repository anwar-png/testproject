package com.nir.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao
{
    String URL="jdbc:oracle:thin:@localhost:1521:xe";
    String USERNAME="system";
    String PASSWORD="system123";
    
    static Student s;
    
	@Override
	public ArrayList<Student> getStudentData() throws Exception {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
  Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
  
    Statement stmt=con.createStatement();
    
    String sql="select * from student";
    
     ResultSet rs=stmt.executeQuery(sql); 
     
     ArrayList<Student> al=new ArrayList<Student>();
   
      while(rs.next())
      {
    	  int id=rs.getInt(1);
    	  String name=rs.getString(2);
    	  int marks=rs.getInt(3); 
    	  Student s=new Student(id,name,marks);
 		  al.add(s);     
      }

		return al;
	}
	@Override
 public int insertStudent(Student s) throws Exception
	{
		
Class.forName("oracle.jdbc.driver.OracleDriver");
		
Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);

 String sql="insert into student values(?,?,?)";

  PreparedStatement pstmt=con.prepareStatement(sql);
  
   pstmt.setInt(1,s.getId());
   pstmt.setString(2,s.getName());
   pstmt.setInt(3,s.getMarks());
   
   int i=pstmt.executeUpdate();
		
		return i;
	}
	
	public Student searchById(int sid) throws Exception
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		  Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		  
		    Statement stmt=con.createStatement();
		    
	String sql="select * from student where id='"+sid+"'";
		    
		     ResultSet rs=stmt.executeQuery(sql);
		     
		      while(rs.next())
		      {
		    	 int id=rs.getInt(1);
		    	 String name=rs.getString(2);
		    	 int marks=rs.getInt(3);
		    	  s=new Student(id,name,marks); 
		      }

				
		  return s;
		
		
		
		
	}
	

}
