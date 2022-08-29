package observorDesignPattern;

public class CricketData extends Subject {
	private int runs;
	private int wickets;
	private int overs;
		
	public int getRuns() {
		return runs;
	}

	private void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	private void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getOvers() {
		return overs;
	}

	private void setOvers(int overs) {
		this.overs = overs;
	}

	public void setData(int runs,int wickets,int overs) {
		setRuns(runs);
		setWickets(wickets);
		setOvers(overs);
		super.notifyObservors();
	}
}
