package strategyDesignPattern;

import strategyDesignPattern.kicks.*;
import strategyDesignPattern.punches.*;
import strategyDesignPattern.wrestles.*;

public class Fighter {
	IkickingBehaviour kb;
	IPunchingBehaviour pb;
	IWrestlingBehaviour wb;
	
	public void kick() {
		kb.kick();
	}
	
	public void punch() {
		pb.punch();
	}
	
	public void wrestle() {
		wb.wrestle();
	}
}
