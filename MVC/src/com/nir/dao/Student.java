package com.nir.dao;

public class Student
{
	 int id;
	 String name;
	 int marks;
	 
	 public Student(int id,String name,int marks)
	 {
		 this.id=id;
		 this.name=name;
		 this.marks=marks;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public void setMarks(int marks)
	 {
		 this.marks=marks;
	 }
	 public int getId()
	 {
		 return this.id;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	 public int getMarks()
	 {
		 return this.marks;
	 }
	 public String toString()
	 {
		 return this.id+""+this.name+""+this.marks;
	 }
	
}
