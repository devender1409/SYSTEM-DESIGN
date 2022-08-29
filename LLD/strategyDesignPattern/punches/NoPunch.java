package strategyDesignPattern.punches;

public class NoPunch implements IPunchingBehaviour {

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		System.out.println("Doesn't Punch");
	}

}
