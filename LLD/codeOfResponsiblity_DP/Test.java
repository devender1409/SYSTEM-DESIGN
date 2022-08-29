 package codeOfResponsiblity_DP;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler o1 = new RealHandler1(null);
		Handler o2 = new RealHandler2(o1);
		Handler o3 = new RealHandler3(o2);
		
		Request request = new Request();
		request.state = -2;
		
		o3.handleRequest(request);

	}

}
