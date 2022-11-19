package com.blz.empwage;

import java.util.Random;

public class EmpWageProgram{
	
	public static void main(String[] args) {
		
		EmpWageProgram empwage = new EmpWageProgram();
		empwage.checkAttendance();
		empwage.getDailyWage();
		empwage.getMonthlyWage();
		
	}
	
	  final short EMP_WAGE_PER_HOUR = 20;
	  final byte FULL_TIME_HRS = 8;
	  final byte PART_TIME_HRS = 4;
	  final byte HRS_TO_WORK = 100;
	  final byte DAYS_TO_WORK = 20;

	  short monthlyWage;
	  short hrsWorked;


	  public String checkAttendance() {
	    Random random = new Random();
	    int randomNum = random.nextInt();

	    switch (randomNum) {
	      case 0:
	        return "absent";
	      case 1:
	        return "present full time";
	      case 2:
	        return "present part time";

	      default:
	        return "Invalid.";
	    }

	  }

	  public short getDailyWage() {
	    String attendaceStr = checkAttendance();

	    switch (attendaceStr) {
	      case "present part time":
	        hrsWorked = PART_TIME_HRS;
	        break;

	      case "present full time":
	        hrsWorked = FULL_TIME_HRS;
	        break;

	    }

	    short dailyWage = (short) (EMP_WAGE_PER_HOUR * hrsWorked);

	    return dailyWage;

	  }

	  public short getMonthlyWage() {
	    short hrsWorked = 0;
	    short daysWorked = 0;

	    System.out.print("Employee's daily wage: ");

	    do {
	      short dailyWage = getDailyWage(); //getting employee's daily wage for each day
	      System.out.print(dailyWage + " ");
	      monthlyWage += dailyWage;

	      String str = (dailyWage == 0) ? "absent" : dailyWage / EMP_WAGE_PER_HOUR == FULL_TIME_HRS ? "full time" : "part time";

	      switch (str) {
	        case "full time":
	          hrsWorked += 8;
	          daysWorked++;
	          break;
	        case "part time":
	          hrsWorked += 4;
	          daysWorked++;
	          break;
	      }

	    } while (daysWorked < DAYS_TO_WORK && hrsWorked < HRS_TO_WORK);

	    System.out.println("\nEmployee has worked " + hrsWorked + " hours in " + daysWorked + " days this month.");

	    return monthlyWage;
    }
}
