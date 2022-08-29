package codeOfResponsiblity_DP;


public abstract class Handler {
	protected Handler next;

	public Handler(Handler next) {
		super();
		this.next = next;
	}
	
	abstract void handleRequest(Request obj);
}
