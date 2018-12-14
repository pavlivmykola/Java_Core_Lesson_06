package ua.lviv.lgs.task1;

public class EmployeeFixedSallery implements Sallery{
	
	@Override
	public void sallery(int amount) {
		System.out.println("Зарплата працівника з фіксованою ставкою становить : "+amount);
		
	}

}
