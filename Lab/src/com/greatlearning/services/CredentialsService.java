package com.greatlearning.services;

import com.greatlearning.interfaces.ICredential;
import com.greatlearning.model.Employee;
import java.util.Random;
public class CredentialsService implements ICredential {

	@Override
	public void showCredentials(Employee employee,String department) {
		System.out.println("\nEmployee Name : "+ employee.getFname()+" "+employee.getLname());
		System.out.println("Employee Email : "+generateEmailAddress(employee,department));
		System.out.println("Employee Password : "+genratePassword());
		System.out.println("Employee Degignation : "+department);
	}

	@Override
	public String genratePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChar = "!@#$%^&*()_";
		String str = upper + lower + numbers + specialChar;
		
		int length=8;
		char[] password= new char[length];
		
		Random rd = new Random();
		
		for(int i=0; i < length; i++)
		{
			password[i] = str.charAt(rd.nextInt(str.length()));
		}
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return (employee.getFname()+employee.getLname()+"@"+department+"gl.com");
		
	}
	
}
