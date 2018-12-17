import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Ship implements IShip
{
	//in den UML steht 0..1 als 0 bis 1 container somit Tilt abstrackt 
	private	Container container;
	Ship(Container container){
		this.container = container;
	}

	Container getContainer(){
		return this.container;
	}

	void setContainer(Container container){
		this.container = container;
		notifyObserver();
	}

	int getWeight(){
		return this.getContainer().getWeight();
	}

	private ArrayList<Observer> users = new ArrayList<Observer>();	
	
	public void addObserver(Observer o){
		users.add(o);
	}

	public void notifyObserver(){
		for(Observer user :users){
			user.update();
		}
	}

	public void update(){

	}

}
