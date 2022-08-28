package adaptorDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Data Provider
public class EmployeeDetails {
	public List<String> getEmployees(){
		List<String> emps = new ArrayList<>();
		emps.add("1-ABC-SDE1-9958638092");
		emps.add("2-DEF-SDE2-9650724642");
		emps.add("3-GHI-TL-9205392468");
		emps.add("4-JKL-SDE1-8287777478");
		emps.add("5-MNO-HR-9268883560");
		
		return emps;
		
	}
}
