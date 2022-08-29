//Design pattern 4
package strategyDesignPattern;

import strategyDesignPattern.kicks.*;
import strategyDesignPattern.punches.*;
import strategyDesignPattern.wrestles.*;

public class Test {
	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		
		fighter.kb = new JumpingKick();
		fighter.pb = new Hook();
		fighter.wb = new Choke();
		
		fighter.kick();
		fighter.punch();
		fighter.wrestle();

		//
	}
}
