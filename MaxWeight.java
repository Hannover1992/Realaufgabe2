import java.util.*;

public class MaxWeight implements IObserver {
	int MAX = 10000;


	private IObserver iObserver= null;

	public void User(IObserver iObserver){
		this.iObserver = iObserver;
	}

	@Override
	public void update(int state){
		if(state > MAX){
			System.out.println("The Load ist to heavy of:"+(state-MAX));
		} else {
			System.out.println("Load left:"+(MAX - state));
		}
	}

}
