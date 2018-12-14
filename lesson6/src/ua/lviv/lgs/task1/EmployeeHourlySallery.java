package ua.lviv.lgs.task1;

public class EmployeeHourlySallery implements Sallery{

	@Override
	public void sallery(int amount) {
		System.out.println("Зарплата працівника з поргодинною ставкою становить : "+amount*10);
		
	}

}
