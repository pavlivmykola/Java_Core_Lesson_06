package ua.lviv.lgs.task1;

public class EmployeeHourlySallery implements Sallery{
	private int workingDays;
	private int workingHours;
	private int overtime;
	

	@Override
	public void sallery(int amount) {
		System.out.println("Зарплата працівника з поргодинною ставкою становить : "+amount);
		
	}


	public EmployeeHourlySallery(int workingDays, int workingHours, int overtime) {
		super();
		this.workingDays = workingDays;
		this.workingHours = workingHours;
		this.overtime = overtime;
	}


	public int getWorkingDays() {
		return workingDays;
	}


	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}


	public int getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}


	public int getOvertime() {
		return overtime;
	}


	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

}
