package observorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	List<Observor> observors;
	
	
	public Subject() {
		super();
		this.observors = new ArrayList<Observor>();
	}

	public void registerObservor(Observor o) {
		observors.add(o);
	}
	
	public void unRegisterObservor(Observor o) {
		observors.remove(o);
	}
	
	public void notifyObservors() {
		for(Observor o : observors) {
			o.update(this);
		}
	}
}
