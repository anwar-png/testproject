package com.nir.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nir.dao.Student;
import com.nir.dao.StudentDaoImpl;

public class ReadStudentServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter pw=resp.getWriter();
		StudentDaoImpl dao=new StudentDaoImpl();
		 /* int id=Integer.parseInt(req.getParameter("sid"));
		  String name=req.getParameter("sname");
		  int marks=Integer.parseInt(req.getParameter("smarks"));
		Student s=new Student(id,name,marks);
		 try {
			int i=dao.insertStudent(s);
			HttpSession hs=req.getSession();
			 hs.setAttribute("message","data saved sucessfully");
			  resp.sendRedirect("insertstudent.jsp");
			 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		try {
	
	ArrayList<Student> al=dao.getStudentData();
	
	 HttpSession hs=req.getSession();
	  
	   hs.setAttribute("studentlist",al);
		
      RequestDispatcher rd=req.getRequestDispatcher("studentdisplay.jsp");

      rd.forward(req,resp);	
			
		} catch (Exception e) {
			pw.println(e);
		}
		 
	     
		 
		 
		
		
		
		
		
		
	}

}
