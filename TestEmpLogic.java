package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmpLogic {
	EmployeeDetails details=new EmployeeDetails();
	EmpBusinessLogic logic=new EmpBusinessLogic();
	@Test
	public void testYearlySalary() {
		details.SetName("Anni");
		details.setMonthlySalary(30000.0);
		details.setAge(30);
		double yearlySalary=logic.calculateYearlySalary(details);
		Assert.assertEquals(yearlySalary, 360000.0);
		
	}
	@Test
	public void testLessThanTenThosand() {
		details.SetName("ruth");
		details.setMonthlySalary(7000.0);
		details.setAge(21);
		double appraisal=logic.appraisal(details);
		Assert.assertEquals(appraisal, 500.0);
		
	}
	@Test
	public void testMoreThanTenThosand() {
		details.SetName("juth");
		details.setMonthlySalary(17000.0);
		details.setAge(21);
		double appraisal=logic.appraisal(details);
		Assert.assertEquals(appraisal, 1000.0);
	}
}
