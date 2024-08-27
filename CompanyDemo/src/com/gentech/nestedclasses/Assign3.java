package com.gentech.nestedclasses;

class Library
{
	private int libId;
	private String staffName;
	private int staffid;
	
	
	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

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
	
	private class Staff
	{
		private int staffAge;

		public int getStaffAge() 
		{
			return staffAge;
		}

		public void setStaffAge(int staffAge) 
		{
			this.staffAge = staffAge;
		}
		
		
	}
	
	
	public void getDeptDetails()
	{
		Department d=new Department();
		d.setDeptName("CSE");
		String s=d.getDeptName();
		System.out.println("Dept Name: "+s);	
		
	}
	
	public void getStaffDetails()
	{
        Staff t=new Staff();
		t.setStaffAge(28);	
		int age=t.getStaffAge();		
		System.out.println("Staff Age: "+age);
	}
}
public class Assign3 
{

	public static void main(String[] args) 
	{
		Library l=new Library();
		l.setLibId(01);
		l.setStaffName("Raman");
		l.setStaffid(02);
		
		int lid=l.getLibId();
		System.out.println("Libraray ID: "+lid);
		
		String name=l.getStaffName();
		System.out.println("Staff Name: "+name);
		
		int sid=l.getStaffid();
		System.out.println("Staff ID: "+sid);
		
		l.getDeptDetails();
		l.getStaffDetails();
			
	}
} 




