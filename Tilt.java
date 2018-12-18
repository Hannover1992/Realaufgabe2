import java.util.*;

public class Tilt implements IObserver{
// because we have only 1 Container on shif only Abstract implements
	private IObserver iObserver= null;

	public void User(IObserver iObserver){
		this.iObserver = iObserver;
	}

	@Override
	public void update(int state){
	}
}
