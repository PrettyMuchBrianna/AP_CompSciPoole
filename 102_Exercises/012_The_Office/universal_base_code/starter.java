/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight= new Employee (1987,"Dwight", "Schrute", 4416.66);
		dwight.getAnnualSalary(4416.66);
		dwight.raiseSalary(4);
		dwight.employeeToString();
		Employee jim= new Employee (2474,"Jim", "Halpert", 4416.66);
		jim.getAnnualSalary(4416.66);
		jim.raiseSalary(4);
		jim.employeeToString();
		Employee pam= new Employee (2011,"Pam", "Beesly", 2250.0);
		pam.getAnnualSalary(2250.0);
		pam.raiseSalary(4);
		pam.employeeToString();
		Employee bri= new Employee (1111,"Bri", "Bri", 900000.0);
		bri.getAnnualSalary(900000.0);
		bri.raiseSalary(100);
		bri.employeeToString();
		
	}
}
