package com.gentech.program;

class Employee 
{
	String firstName;
	int ssn;
	int deptNo;
}

class Department 
{
	String deptName;
	int deptNo;
}

class Insurance
{
	String insuranceName;
	int insureId;
	int ssn;
}

public class DemoMain {

	public static void main(String[] args) {
		Employee jack= new Employee();
		jack.firstName="Will Jacks";
		jack.ssn= 1;
		System.out.println("First Name: "+jack.firstName);
		System.out.println("SSN       : "+jack.ssn);
		System.out.println("Dnumber   : "+jack.ssn);
		System.out.println("-------------------------");
		
		
		Employee ab= new Employee();
		ab.firstName="AB Devilliers";
		ab.ssn= 2;
		System.out.println(" ");
		System.out.println("First Name : "+ab.firstName);
		System.out.println("SSN        : "+ab.ssn);
		System.out.println("Dnumber    : "+ab.ssn);
		System.out.println("-------------------------");
		
		

		Department dname= new Department();
		dname.deptName="Computer Science";
		dname.deptNo= 1;
		System.out.println("Dept Name: "+dname.deptName);
		System.out.println("Dnumber  : "+dname.deptNo);
		System.out.println("-------------------------");
	
		Department dname2= new Department();
		dname2.deptName="Information Science";
		dname2.deptNo= 2;
		System.out.println("Dept Name: "+dname2.deptName);
		System.out.println("Dnumber  : "+dname2.deptNo);
		System.out.println("-------------------------");
		
		
		Insurance iname= new Insurance();
		iname.insuranceName="Health";
		iname.insureId=1;
		System.out.println("Insurance Name: "+iname.insuranceName);
		System.out.println("Dnumber       : "+iname.insureId);
		System.out.println("-------------------------");
					
	}

}
