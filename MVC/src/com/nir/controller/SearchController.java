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

public class SearchController extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
   int studentId=Integer.parseInt(req.getParameter("sid"));
   
   StudentDaoImpl sdao=new StudentDaoImpl();
   
    PrintWriter pw=resp.getWriter();
   
     try {
		ArrayList<Student> s=sdao.searchById(studentId);
           HttpSession hs=req.getSession();
           hs.setAttribute("list",s);
          resp.sendRedirect("studentdisplay2.jsp");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

	
	
}
