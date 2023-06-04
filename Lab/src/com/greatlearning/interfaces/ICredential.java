package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

public interface ICredential {
	public void showCredentials(Employee employee,String department);
	public String genratePassword();
	public String generateEmailAddress(Employee employee, String department);
}
