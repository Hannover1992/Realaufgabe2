import java.util.*;

public interface IShip 
{
	public void addIObserver(IObserver o);
	public void removeIObserver(IObserver o);
	public void notifyIObserver();
//	public void update(int state){
//
//	}
//	private final List<IObserver> observerList = new ArrayList<IObserver>();
//
//	public void register(IObserver newObserver){
//		observerList.add(newObserver);
//	}
//
//	public void unregister(IObserver newObserver){
//		observerList.remove(newObserver);
//	}
//
//	public void notifyObservers(int state){
//		for (IObserver observer : observerList) {
//		    observer.update(state);
//		}
//	}
}
