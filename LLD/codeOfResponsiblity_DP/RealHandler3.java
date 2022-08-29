package codeOfResponsiblity_DP;

public class RealHandler3 extends Handler {

	public RealHandler3(Handler next) {
		super(next);
	}

	@Override
	void handleRequest(Request obj) {
		if(obj.state<0) {
			//logic to handle
			System.out.println("all object with negatiive states are handled here");
		}else if(next!=null){
			System.out.println("not negative hence delegating request");
			next.handleRequest(obj);
		}
	}
	
}