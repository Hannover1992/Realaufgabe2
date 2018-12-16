public class Suitcase extends Load{
	private int weight;

	public Suitcase (int weight){
		this.weight = weight;
	}

	public void add(Suitcase suitcase){
	//Not for this class
	}

	public void remove(Load load){
	//Not for this class
	}

	public void add(Load load){
	//Not for this class
	}

	public void remove(Suitcase suitcase){
	//Not for this class
	}

	public Suitcase getChild(int i){
	//Not for this class
	return null;
	}

	public int getWeight(){
		return this.weight;
	}

	public void print(){
		System.out.println("-----------");
		System.out.println("Suitcase Weight="+this.weight);
		System.out.println("-----------");
	}
}
