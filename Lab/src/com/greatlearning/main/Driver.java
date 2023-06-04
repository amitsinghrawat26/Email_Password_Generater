package com.greatlearning.main;
import com.greatlearning.model.Employee;
import java.util.Scanner;
import com.greatlearning.services.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		Employee emp =new Employee("Amit","Rawat");
		Scanner sc = new Scanner(System.in);
		CredentialsService cs= new CredentialsService();
		
		System.out.print("Enter the department from the following: \n1. Technical \n2. Admin \n3. Human resource \n4. Legal  \nChoice : ");
		int choice= sc.nextInt();
		String department=null;
		
		switch(choice) {
			case 1 : department="tech";
			 break;
			case 2 : department="admin";
			 break;
			case 3 : department="hr";
			 break;
			case 4 : department="legal";
			 break;
			default : System.out.println("Incorrect Choice");
		}
		//cs.generateEmailAddress(emp, department);
		//System.out.println("Employee Email : "+cs.generateEmailAddress(emp, department));
		
		cs.showCredentials(emp, department);
	}

}
