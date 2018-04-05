package pack;

public class EmpBusinessLogic {
public double calculateYearlySalary(EmployeeDetails details) {
	double YearlySalary=details.getMonthlySalary()*12;
	return YearlySalary;
}
public double appraisal(EmployeeDetails details) {
	double appraisal=0.0;
	if(details.getMonthlySalary()<10000) {
		appraisal=500.0;
	}
	else {
		appraisal=1000.0;
	
	}
	return appraisal;
	
}
}
