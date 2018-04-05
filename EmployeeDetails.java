package pack;

public class EmployeeDetails {
private String name;
private int age;
private double MonthlySalary;

public void SetName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
	
}
public int getAge() {
	return age;
}
public void setMonthlySalary(double MonthlySalary) {
	this.MonthlySalary=MonthlySalary;
	
}
public double getMonthlySalary() {

	return MonthlySalary;
}
}
