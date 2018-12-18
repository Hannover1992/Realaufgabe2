import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Ship implements IShip
{
	//in den UML steht 0..1 als 0 bis 1 container somit Tilt abstrackt 
	private	Container container;

	Container getContainer(){
		return this.container;
	}

	void setContainer(Container container){
		this.container = container;
		this.notifyIObserver();
	}
	private int state;


	public int getState() {
		return state;
	} 

	int getWeight(){
		return this.getContainer().getWeight();
	}

	private ArrayList<IObserver> users = new ArrayList<IObserver>();	
	
	public void addIObserver(IObserver o){
		users.add(o);
	}

	@Override 
	public void removeIObserver(IObserver o){
		users.remove(o);
	}

	public void notifyIObserver(){
		for(IObserver user :users){
			user.update(this.getContainer().getWeight());
		}
	}


}
