package codeOfResponsiblity_DP;

public class RealHandler2 extends Handler {

	public RealHandler2(Handler next) {
		super(next);
	}

	@Override
	void handleRequest(Request obj) {
		if(obj.state==0) {
			//logic to handle
			System.out.println("all object with state zero are handled here");
		}else if(next!=null){
			System.out.println("Non zero state hence delegating request");
			next.handleRequest(obj);
		}
	}
	
}