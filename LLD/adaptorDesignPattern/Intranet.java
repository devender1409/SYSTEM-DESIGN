package adaptorDesignPattern;

import java.util.List;

//data consumer
public class Intranet {
	IPhoneListSource source;
	
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	
	public void printPhoneNumbers() {
		List<String> phones = this.source.getPhoneNumbers();
		System.out.println(phones);
	}
}
