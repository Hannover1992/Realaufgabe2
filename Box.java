import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box extends Load{
	private int weight;
	public Box(int weight){
		this.weight = weight;
	}

	List<Load> load = new ArrayList<Load>();
	public void add(Load load){
		load.add(load);
		this.weight += load.getWeight();
	}
	
	public Load getChild(int i){
		return load.get(i);
	}

	public int getWeight(){
		return this.weight;
	}

	public void print(){
		System.out.println("-----------");
		System.out.println("Weight="+getWeight());
		System.out.println("-----------");

		Iterator<Load> loadIterator = load.iterator();
		while(loadIterator.hasNext()){
			Load load = loadIterator.next();
			load.print();
		}
	}

	public void remove (Load load){
		load.remove(load);
		this.weight -= load.getWeight();
	}
}
