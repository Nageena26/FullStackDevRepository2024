package com.gentech.nestedclasses;

/* In static inner class there's no need to create an object for outer class
   we can execute it even without outer object,just by using the outer class name  
 */
class Employee
{
	static class EmpDepartment
	{
		
		void showDept(String deptName)
		{
			System.out.println(deptName);
		}	
		
	}
	
	void showEmp(int empId,String empName)
	{
		
		System.out.println(empId);
		System.out.println(empName);
	}
	
	
}
public class Assign2
{

	public static void main(String[] args) 
	{
		Employee outer=new Employee();
		outer.showEmp(123,"Sahana");
		
		Employee.EmpDepartment inner=new Employee.EmpDepartment();
		inner.showDept("CSE"); //here we are not using the outer object
				
	}
}


/*
  NON static Approach
  1) we HAVE to create an object for the outer class and 
  use that object while creating an inner class object.
  
  package com.gentech.nestedclasses;
 

class Employee
{
	class EmpDepartment
	{
		
		public String deptName;

		void showDept()
		{
			deptName="CSE";	
			System.out.println(deptName);
		}	
		
	}
	
	void showEmp(int empId,String empName)
	{
		
		System.out.println(empId);
		System.out.println(empName);
	}
	
	
}
public class Assign2
{

	public static void main(String[] args) 
	{
		Employee outer=new Employee();
		outer.showEmp(123,"Sahana");
		
		Employee.EmpDepartment inner=outer.new EmpDepartment();
		inner.showDept();			
	}
}
*/


