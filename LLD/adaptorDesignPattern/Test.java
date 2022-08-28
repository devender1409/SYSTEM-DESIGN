package adaptorDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails empDS = new EmployeeDetails();
		Adaptor adaptor = new Adaptor(empDS);
		Intranet intra = new Intranet(adaptor);
		intra.printPhoneNumbers();
	}

}
