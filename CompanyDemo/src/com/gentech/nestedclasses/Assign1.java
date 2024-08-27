package com.gentech.nestedclasses;

class Student
{
	private int studentId;
	private String studentName;
	
	public int getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
		
	}
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	//inner class
		private class Department
		{
			private String deptName;
		
			public String getDeptName() 
			{
				return deptName;
			}
			public void setDeptName(String deptName) 
			{
				this.deptName = deptName;
			}
		
		}
	
	public void getDeptDetails()
	{
		Department d=new Department();
		d.setDeptName("CSE");
		String s=d.getDeptName();
		System.out.println("Stdent Department: "+s);
	}
	
	public void getStuDeatails()
	{
		setStudentId(13);
		setStudentName("Nameera");
		
		int usn=getStudentId();
		String name=getStudentName();
		
		System.out.println("Name of the student: "+name);
		System.out.println("Stdent Id: "+usn);
	}
}


public class Assign1 
{

	public static void main(String[] args) 
	{
		Student c=new Student();
		c.getStuDeatails();
		c.getDeptDetails();
			
	}
}




