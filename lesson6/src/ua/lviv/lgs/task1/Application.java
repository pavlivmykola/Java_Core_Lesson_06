package ua.lviv.lgs.task1;

public class Application {
public static void main(String[] args) {
	EmployeeHourlySallery employee1 = new EmployeeHourlySallery(22,8,7);
	EmployeeFixedSallery employee2 = new EmployeeFixedSallery();
	employee1.sallery(employee1.getWorkingDays()*employee1.getWorkingHours()*15+employee1.getOvertime()*2*15);
	employee2.sallery(2000);
	
}
}
