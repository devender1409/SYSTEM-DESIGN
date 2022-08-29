package observorDesignPattern;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		CricketData cd = new CricketData();
		cd.setData(50, 1, 10);
		
		ScoreCardDisplay scd = new ScoreCardDisplay();
		NetRunRateDisplay nrrd = new NetRunRateDisplay();
		FinalScorePredictionDisplay fspd = new FinalScorePredictionDisplay();
		
		cd.registerObservor(scd);
		cd.registerObservor(nrrd);
		cd.registerObservor(fspd);
		
		
		cd.setData(100, 2, 20);
		
		cd.unRegisterObservor(fspd);
		cd.setData(150, 3, 24);
	}

}
