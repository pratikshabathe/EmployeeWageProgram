package com.blz.empwage;

import java.util.Random;

public class EmpWageProgram {
	
	public static void main(String[] args) {
		System.out.println("--Welcome to Employee Wage Computation Program--\n");
		
	   String attendanceString =  EmpWageProgram.checkAttendance();
	    System.out.println(attendanceString);
	    checkAttendance() ;

	}

	  private static String checkAttendance() {
	    Random random = new Random();
	    boolean randomBool = random.nextBoolean();

	    if (randomBool) return "Employee is present.";
	    
	    else return "Employee is absent.";

	}
	
}
