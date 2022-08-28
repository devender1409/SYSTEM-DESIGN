package adaptorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Adaptor implements IPhoneListSource{
	private EmployeeDetails empDS;//employee data soure
	
	

	public Adaptor(EmployeeDetails empDS) {
		super();
		this.empDS = empDS;
	}



	public List<String> getPhoneNumbers() {
		List<String> allEmployees = empDS.getEmployees();
		List<String> phones = new ArrayList<>();
		for(String emp : allEmployees ) {
			String[] parts = emp.split("-");
			phones.add(parts[3]);
		}
		return phones;
	}

}
