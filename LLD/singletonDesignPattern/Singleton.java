package singletonDesignPattern;

public class Singleton {
	private static Singleton inst;
	
	private Singleton() {
		}
	
	//the synchroized keyword used here is for preventing the block from multithreading which further leads to create multiple instances of same class by using n numbers of threads
	public synchronized static Singleton getSingleInstance() {
//		if(inst==null) {
//			synchronized (Singleton.class) {
				if(inst==null) {
					inst =  new Singleton();
				}
//			}
//		}
		
		return inst;
	}

}
