package codeOfResponsiblity_DP;

public class RealHandler1 extends Handler {

	public RealHandler1(Handler next) {
		super(next);
	}

	@Override
	void handleRequest(Request obj) {
		if(obj.state>0) {
			//logic to handle
			System.out.println("all object with +ve states are handled here");
		}else if(next!=null){
			System.out.println("not postive hence delegating request");
			next.handleRequest(obj);
		}
	}
	
}
